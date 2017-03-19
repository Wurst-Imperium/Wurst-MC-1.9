/*
 * Copyright � 2014 - 2016 | Wurst-Imperium | All rights reserved.
 * 
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package net.wurstclient.features.mods;

import net.wurstclient.features.mods.Mod.Bypasses;

@Mod.Info(category = Mod.Category.BLOCKS,
	description = "Allows you to interact with liquid blocks.",
	name = "Liquids",
	help = "Mods/Liquids")
@Bypasses(ghostMode = false, latestNCP = false, olderNCP = false)
public class LiquidsMod extends Mod
{
	
}
