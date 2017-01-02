package net.sshockwave.tinycreatures.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * @author ssshockwave
 */
public class EntityInjectionArrow extends EntityArrow{

    public EntityInjectionArrow(World worldIn)
    {
        super(worldIn);
    }

    public EntityInjectionArrow(World worldIn, EntityLivingBase shooter)
    {
        super(worldIn, shooter);
    }

    public EntityInjectionArrow(World worldIn, double x, double y, double z)
    {
        super(worldIn, x, y, z);
    }

    @Override
    protected ItemStack getArrowStack() {
        return null;
    }


}
