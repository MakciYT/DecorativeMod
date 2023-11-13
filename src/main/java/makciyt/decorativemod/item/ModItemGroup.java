package makciyt.decorativemod.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {
    public static final ItemGroup DECORATIVE_MOD_GROUP = new ItemGroup("decorativeModTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.WARDROBE.get());
        }
    };
}