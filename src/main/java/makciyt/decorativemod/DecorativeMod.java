package makciyt.decorativemod;

import makciyt.decorativemod.block.ModBlocks;
import makciyt.decorativemod.container.ModContainers;
import makciyt.decorativemod.container.WardrobeContainer;
import makciyt.decorativemod.container.FridgeContainer;
import makciyt.decorativemod.item.ModItems;
import makciyt.decorativemod.screen.WardrobeScreen;
import makciyt.decorativemod.screen.FridgeScreen;
import makciyt.decorativemod.tileentity.ModTileEntities;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(DecorativeMod.MOD_ID)
public class DecorativeMod {
    public static final String MOD_ID = "decorativemod";

    public DecorativeMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModBlocks.BLOCKS.register(bus);
        ModItems.ITEMS.register(bus);
        ModTileEntities.register(bus);
        ModContainers.register(bus);
        bus.addListener(this::setup);
        bus.addListener(this::doClientStuff);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            RenderTypeLookup.setRenderLayer(ModBlocks.WARDROBE.get(), RenderType.getCutout());
			RenderTypeLookup.setRenderLayer(ModBlocks.FRIDGE.get(), RenderType.getCutout());
            ScreenManager.registerFactory(ModContainers.WARDROBE_CONTAINER.get(),
                    WardrobeScreen::new);
            ScreenManager.registerFactory(ModContainers.FRIDGE_CONTAINER.get(),
                    FridgeScreen::new);
        });
    }
}