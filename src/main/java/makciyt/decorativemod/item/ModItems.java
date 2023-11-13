package makciyt.decorativemod.item;

import makciyt.decorativemod.DecorativeMod;
import makciyt.decorativemod.block.ModBlocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DecorativeMod.MOD_ID);

    public static final RegistryObject<BlockItem> WARDROBE = ITEMS.register("wardrobe", () -> new BlockItem(ModBlocks.WARDROBE.get(),
            new Item.Properties().group(ModItemGroup.DECORATIVE_MOD_GROUP)));
			
	public static final RegistryObject<BlockItem> FRIDGE = ITEMS.register("fridge", () -> new BlockItem(ModBlocks.FRIDGE.get(),
            new Item.Properties().group(ModItemGroup.DECORATIVE_MOD_GROUP)));
}
