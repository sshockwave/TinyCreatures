package net.sshockwave.tinycreatures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import net.sshockwave.tinycreatures.proxy.IProxy;

import static net.sshockwave.tinycreatures.init.Registry.*;

/**
 * @author sshockwave
 */
@Mod(modid = TinyCreatures.MODID,name = TinyCreatures.NAME,version = TinyCreatures.VERSION)
public class TinyCreatures implements IProxy{

    public static final String MODID = "tinycreatures";
    public static final String NAME = "Tiny Creatures";
    public static final String VERSION = "0.0.0";

    @SidedProxy(clientSide = "net.sshockwave.tinycreatures.proxy.ClientProxy",serverSide = "net.sshockwave.tinycreatures.proxy.ServerProxy")
    public static IProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        registerBlocks();
        registerItems();
        registerCapabilities();
        registerFuelHandlers();
        registerTileEntities();
        registerWorldGenerators();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event){
        addShapedRecipes();
        addShapelessRecipes();
        addSmeltings();
        addSubstitutionAliases();
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }

}