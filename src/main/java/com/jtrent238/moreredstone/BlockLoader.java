package com.jtrent238.moreredstone;

import com.jtrent238.moreredstone.blocks.BlockRedstoneTorch_blue;
import com.jtrent238.moreredstone.blocks.BlockRedstoneWire_blue;
import cpw.mods.fml.common.registry.GameRegistry;
import javafx.scene.paint.Color;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockRedstoneLight;
import net.minecraft.block.BlockRedstoneTorch;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;

public class BlockLoader {

	public static Block BlockRedstoneWire_blue;
	public static Block BlockRedstoneTorch_blue;
	public static Block redstone_torch_blue;
	public static Block BlockRedstoneTorch_blue_unlit;


	
	/**
	 * Load Blocks.
	 */
	public static void loadBlocks() {
		
		BlockRedstoneWire_blue = new BlockRedstoneWire_blue().setBlockName("BlockRedstoneWire_blue").setBlockTextureName("moreredstone:BlockRedstoneWire_blue").setHardness(0F).setStepSound(Block.soundTypeStone).setCreativeTab(MoreRedstoneMod.MoreRedstoneMod);
		BlockRedstoneTorch_blue = new BlockRedstoneTorch_blue(true).setBlockName("BlockRedstoneTorch_blue").setBlockTextureName("moreredstone:BlockRedstoneTorch_blue").setHardness(0F).setCreativeTab(MoreRedstoneMod.MoreRedstoneMod);
		BlockRedstoneTorch_blue_unlit = new BlockRedstoneTorch_blue(false).setBlockName("BlockRedstoneTorch_blue_unlit").setBlockTextureName("moreredstone:BlockRedstoneTorch_blue_unlit").setHardness(0F).setCreativeTab(MoreRedstoneMod.MoreRedstoneMod);
		
		//redstone_torch_blue = new redstone_torch_blue().setBlockName("redstone_torch_blue").setBlockTextureName("moreredstone:redstone_torch_blue").setHardness(0F).setCreativeTab(MoreRedstoneMod.MoreRedstoneMod);
		
		
		
		registerBlocks();
	}

	/**
	 * Register Blocks.
	 */
	private static void registerBlocks(){
		
		GameRegistry.registerBlock(BlockRedstoneWire_blue, "BlockRedstoneWire_blue");
		GameRegistry.registerBlock(BlockRedstoneTorch_blue, "BlockRedstoneTorch_blue");
		GameRegistry.registerBlock(BlockRedstoneTorch_blue_unlit, "BlockRedstoneTorch_blue_unlit");
		//GameRegistry.registerBlock(redstone_torch_blue, "redstone_torch_blue");
		  
		
	}
	
	
}
