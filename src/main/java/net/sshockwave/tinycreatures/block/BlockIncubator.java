package net.sshockwave.tinycreatures.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.sshockwave.tinycreatures.TinyCreatures;
import net.sshockwave.tinycreatures.init.GuiElements;
import net.sshockwave.tinycreatures.tileentity.TEIncubator;

import javax.annotation.Nullable;

/**
 * Created by lenovo on 2017/1/4.
 */
public class BlockIncubator extends BlockContainer{
//    public static final MapColor blockMapColorIn = new MapColor();
    public static final Material blockMaterialIn = Material.WOOD;

    public BlockIncubator() {
        super(blockMaterialIn);
        this.setRegistryName("incubator");
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.setHardness(0.5f);
        this.setUnlocalizedName("incubator");
        System.out.println("a incubator instance has been created.");
    }

//    @Override
//    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ){
//        playerIn.openGui(TinyCreatures.proxy, GuiElements.GUI_INCUBATOR,worldIn,pos.getX(),pos.getY(),pos.getZ());
//        return true;
//    }

    @Nullable
    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TEIncubator();
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state) {
        return EnumBlockRenderType.MODEL;
    }
}
