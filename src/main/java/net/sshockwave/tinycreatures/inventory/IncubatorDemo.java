package net.sshockwave.tinycreatures.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.*;
import net.minecraft.item.ItemStack;

import java.awt.*;

/**
 * Created by lenovo on 2017/1/4.
 */
public class IncubatorDemo extends net.minecraft.inventory.Container {
    public IncubatorDemo(){
        super();
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn){
        return false;
    }
}
