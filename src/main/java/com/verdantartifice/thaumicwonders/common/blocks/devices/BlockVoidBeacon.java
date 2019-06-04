package com.verdantartifice.thaumicwonders.common.blocks.devices;

import com.verdantartifice.thaumicwonders.common.blocks.base.BlockDeviceTW;
import com.verdantartifice.thaumicwonders.common.tiles.devices.TileVoidBeacon;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockVoidBeacon extends BlockDeviceTW<TileVoidBeacon> {
    public BlockVoidBeacon() {
        super(Material.GLASS, TileVoidBeacon.class, "void_beacon");
    }
    
    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT;
    }
}
