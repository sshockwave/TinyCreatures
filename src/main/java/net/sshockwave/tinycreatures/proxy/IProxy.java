package net.sshockwave.tinycreatures.proxy;

import net.minecraftforge.fml.common.event.*;

/**
 * @author sshockwave
 */
public interface IProxy {

    void preInit(FMLPreInitializationEvent event);

    void init(FMLInitializationEvent event);

    void postInit(FMLPostInitializationEvent event);

}