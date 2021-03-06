/*
 * Copyright (C) 2011-2016 lishid.  All rights reserved.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation,  version 3.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.lishid.openinv.internal;

// Volatile
import net.minecraft.server.v1_9_R1.*;

public class SilentContainerChest extends ContainerChest {

    public IInventory inv;

    public SilentContainerChest(IInventory i1, IInventory i2, EntityHuman human) {
        super(i1, i2, human);
        inv = i2;
        // Close signal
        inv.closeContainer(human);
    }

    @Override
    public void b(EntityHuman paramEntityHuman) {
        // Don't send close signal twice, might screw up
    }
}
