package net.sshockwave.tinycreatures.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.sshockwave.tinycreatures.TinyCreatures;
import net.sshockwave.tinycreatures.inventory.GuiElementLoader;

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

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ){
        playerIn.openGui(TinyCreatures.proxy, GuiElementLoader.GUI_INCUBATOR,worldIn,pos.getX(),pos.getY(),pos.getZ());
        return true;
    }

}
