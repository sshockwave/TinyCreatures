package net.sshockwave.tinycreatures.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by lenovo on 2017/1/4.
 */
public class BlockIncubator extends Block{
//    public static final MapColor blockMapColorIn = new MapColor();
    public static final Material blockMaterialIn = Material.WOOD;

    public BlockIncubator() {
        super(blockMaterialIn);
        this.setRegistryName("incubator");
    }
}
