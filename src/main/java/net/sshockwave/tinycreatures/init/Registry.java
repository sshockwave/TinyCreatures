package net.sshockwave.tinycreatures.init;

import net.minecraft.item.ItemStack;
import static net.minecraftforge.fml.common.registry.GameRegistry.*;

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
        addShapelessRecipe(new ItemStack(Items.INJECTION_ARROW), Items.GLASS_BOTTLE, Items.INJECTION_ARROW);
    }

    public static void addSmeltings(){

    }

    public static void registerTileEntities(){

    }


    public static void registerFuelHandlers(){

    }
}
