package net.sshockwave.tinycreatures.init;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.sshockwave.tinycreatures.TinyCreatures;
import net.sshockwave.tinycreatures.tileentity.TEIncubator;

/**
 * Created by lenovo on 2017/1/5.
 */
public class TileEntities {
    public static final TEIncubator TE_INCUBATOR = new TEIncubator();

    public TileEntities(FMLPreInitializationEvent event){    }
}
