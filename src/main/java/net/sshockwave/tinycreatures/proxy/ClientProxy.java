package net.sshockwave.tinycreatures.proxy;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.sshockwave.tinycreatures.init.Registry;

/**
 * @author sshockwave
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event){
        Registry.registerRenders();
    }

}