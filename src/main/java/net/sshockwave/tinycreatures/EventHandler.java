package net.sshockwave.tinycreatures;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * @author sshockwave
 */
public class EventHandler {

    public EventHandler() {
        MinecraftForge.EVENT_BUS.register(this);
    }

}