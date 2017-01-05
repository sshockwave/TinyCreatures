package net.sshockwave.tinycreatures.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.sshockwave.tinycreatures.init.Registry;

/**
 * @author sshockwave
 */
public class ClientProxy implements IProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event){
        Registry.registerRenders();
    }

    @Override
    public void init(FMLInitializationEvent event) {

    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

    }

}