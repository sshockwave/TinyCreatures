package net.sshockwave.tinycreatures.init;

import net.minecraft.block.Block;
import net.minecraft.block.BlockIce;
import net.sshockwave.tinycreatures.Blocks.BlockIncubator;

/**
 * @author sshockwave
 */
public class Blocks extends net.minecraft.init.Blocks{

    private Blocks(){

    }

    public final static Block INCUBATOR = new BlockIncubator();
}