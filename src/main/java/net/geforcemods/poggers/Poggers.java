package net.geforcemods.poggers;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod(value=Poggers.MOD_ID)
@EventBusSubscriber(bus=Bus.MOD)
public class Poggers {
	
	public static final String MOD_ID = "poggers";
	
	public static Poggers instance;
	
	public Poggers() {
		instance = this;
		MinecraftForge.EVENT_BUS.register(new PoggersEventHandler());
	}

}
