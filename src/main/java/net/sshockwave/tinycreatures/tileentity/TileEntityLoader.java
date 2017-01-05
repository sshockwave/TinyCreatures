package net.sshockwave.tinycreatures.tileentity;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.sshockwave.tinycreatures.TinyCreatures;

/**
 * Created by lenovo on 2017/1/5.
 */
public class TileEntityLoader {
    public TileEntityLoader(FMLPreInitializationEvent event){
        registerTE(TEIncubator.class,"Incubator");
    }

    public void registerTE(Class<? extends TileEntity> tileEntityClass, String id){
        GameRegistry.registerTileEntity(tileEntityClass, TinyCreatures.MODID + ":" + id);
    }
}
