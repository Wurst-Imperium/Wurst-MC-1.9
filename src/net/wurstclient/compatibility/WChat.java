/*
 * Copyright � 2014 - 2018 | Wurst-Imperium | All rights reserved.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package net.wurstclient.compatibility;

import net.minecraft.client.Minecraft;

public final class WChat
{
	public static void clearMessages()
	{
		Minecraft.getMinecraft().ingameGUI.getChatGUI().clearChatMessages();
	}
}
