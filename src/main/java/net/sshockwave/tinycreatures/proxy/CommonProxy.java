package net.sshockwave.tinycreatures.proxy;

import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import static net.sshockwave.tinycreatures.init.Registry.*;

/**
 * @author sshockwave
 */
public class CommonProxy {

    @SidedProxy(clientSide = "net.sshockwave.tinycreatures.proxy.ClientProxy",serverSide = "net.sshockwave.tinycreatures.proxy.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        proxy.preInit(event);
        registerBlocks();
        registerItems();
        registerFuelHandlers();
        registerTileEntities();
        registerWorldGenerators();
    }

    @EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init(event);
        addShapedRecipes();
        addShapelessRecipes();
        addSmeltings();
        addSubstitutionAliases();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);

    }
}
