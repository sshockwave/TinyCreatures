package net.sshockwave.tinycreatures;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.sshockwave.tinycreatures.item.*;
import net.sshockwave.tinycreatures.block.*;
import static net.minecraftforge.fml.common.registry.GameRegistry.*;

/**
 * @author sshockwave
 */
public class Registry {

    public static void registerBlocks(){

    }

    public static void registerItems(){
        register(ItemInjectionArrow.getInstance());
    }

    public static void registerWorldGenerators(){

    }

    public static void addSubstitutionAliases(){

    }

    public static void addShapedRecipes(){

    }

    public static void addShapelessRecipes(){
        addShapelessRecipe(new ItemStack(ItemInjectionArrow.getInstance()), Items.GLASS_BOTTLE, ItemInjectionArrow.getInstance());
    }

    public static void addSmeltings(){

    }

    public static void registerTileEntities(){

    }


    public static void registerFuelHandlers(){

    }
}
