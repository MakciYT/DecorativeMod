package makciyt.decorativemod.tileentity;

import makciyt.decorativemod.DecorativeMod;
import makciyt.decorativemod.block.ModBlocks;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntities {

    public static DeferredRegister<TileEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, DecorativeMod.MOD_ID);

    public static RegistryObject<TileEntityType<WardrobeTile>> WARDROBE_TILE = TILE_ENTITIES.register("wardrobe_tile",
            () -> TileEntityType.Builder.create(WardrobeTile::new, ModBlocks.WARDROBE.get()).build(null));
			
	public static RegistryObject<TileEntityType<FridgeTile>> FRIDGE_TILE = TILE_ENTITIES.register("fridge_tile",
            () -> TileEntityType.Builder.create(FridgeTile::new, ModBlocks.FRIDGE.get()).build(null));

    public static void register(IEventBus eventBus) {
        TILE_ENTITIES.register(eventBus);
    }
}