package net.sshockwave.tinycreatures.init;

import net.minecraft.item.ItemStack;
import static net.minecraftforge.fml.common.registry.GameRegistry.*;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameData;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author sshockwave
 */
public class Registry {

    public static void registerBlocks(){

    }

    public static void registerItems(){
        register(Items.INJECTION_ARROW);
    }

    public static void registerWorldGenerators(){

    }

    public static void addSubstitutionAliases(){

    }

    public static void addShapedRecipes(){

    }

    public static void addShapelessRecipes(){
        addShapelessRecipe(new ItemStack(Items.INJECTION_ARROW), Items.GLASS_BOTTLE, Items.ARROW);
    }

    public static void addSmeltings(){

    }

    public static void registerTileEntities(){

    }


    public static void registerFuelHandlers(){

    }

    @SideOnly(Side.CLIENT)
    public static void registerRenders(){
        RegistryHelper.registerRender(Items.INJECTION_ARROW);
    }


}

class RegistryHelper{

    @SuppressWarnings("deprecation")
    @SideOnly(Side.CLIENT)
    public static void registerRender(Item item)
    {
        String name = GameData.getItemRegistry().getNameForObject(item).toString();
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(name, "inventory"));
    }

    @SuppressWarnings("deprecation")
    @SideOnly(Side.CLIENT)
    public static void registerRender(Block block)
    {
        Item item = Item.getItemFromBlock(block);
        String name = GameData.getBlockRegistry().getNameForObject(block).toString();
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(name, "inventory"));
    }

}
