package net.geforcemods.poggers;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RenderGameOverlayEvent.Chat;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class PoggersEventHandler {

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void renderChatMessage(Chat event) {
		if(event.getType() == ElementType.CHAT) {
			System.out.println("rendering " + event.getPosX() + " | " + event.getPosY());
		}
	}

}
