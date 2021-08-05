package oresAboveDiamonds.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class BlackOpalBlock extends Block {

	public BlackOpalBlock() {
		super(Properties
				.of(Material.METAL, MaterialColor.METAL)
				.strength(25f, 100f)
				.requiresCorrectToolForDrops()
				.sound(SoundType.METAL)
			 );
	}
	
	/*
	
	@Nullable
	@Override
	public ToolType getHarvestTool(BlockState state) {
		return ToolType.PICKAXE;
		
	}
	
	@Override
	public int getHarvestLevel(BlockState state) {
		return 4;
	}
	
	*/
}