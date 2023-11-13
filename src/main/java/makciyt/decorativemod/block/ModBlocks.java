package makciyt.decorativemod.block;

import makciyt.decorativemod.DecorativeMod;
import makciyt.decorativemod.block.custom.FridgeBlock;
import makciyt.decorativemod.block.custom.WardrobeBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DecorativeMod.MOD_ID);

    public static final RegistryObject<Block> WARDROBE = BLOCKS.register("wardrobe",
            () -> new WardrobeBlock(AbstractBlock.Properties.from(Blocks.OAK_PLANKS).notSolid()));
			
	public static final RegistryObject<Block> FRIDGE = BLOCKS.register("fridge",
            () -> new FridgeBlock(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.QUARTZ).notSolid()));
}
