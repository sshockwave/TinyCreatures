package net.sshockwave.tinycreatures.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.sshockwave.tinycreatures.entity.EntityInjectionArrow;

/**
 * @author sshockwave
 */
public class ItemInjectionArrow extends ItemArrow{

    @Override
    public EntityArrow createArrow(World worldIn, ItemStack stack, EntityLivingBase shooter)
    {
        return new EntityInjectionArrow(worldIn,shooter);
    }

}
