package net.sshockwave.tinycreatures.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.sshockwave.tinycreatures.TinyCreatures;

import javax.annotation.Nullable;

/**
 * Created by lenovo on 2017/1/4.
 */
public class GuiElementLoader implements IGuiHandler {
    public static final int GUI_INCUBATOR = 50;

    public GuiElementLoader() {
        NetworkRegistry.INSTANCE.registerGuiHandler(TinyCreatures.proxy,this);
    }

    @Nullable
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }

    @Nullable
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }
}
