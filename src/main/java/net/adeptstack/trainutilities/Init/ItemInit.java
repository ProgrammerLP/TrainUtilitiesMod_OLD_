package net.adeptstack.trainutilities.Init;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.adeptstack.trainutilities.Init.BlockInit.FRAMELESS_GLASS;
import static net.adeptstack.trainutilities.Init.BlockInit.PLATFORM1_BLOCK;
import static net.adeptstack.trainutilities.Main.MODID;

public class ItemInit {
    // Create a Deferred Register to hold Items which will all be registered under the "trainutilities" namespace
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    // ===Items===
    // Creates a new food item with the id "examplemod:example_id", nutrition 1 and saturation 2
    //public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
    //        .alwaysEat().nutrition(1).saturationMod(2f).build())));

    //===Block Items===
    // Creates a new BlockItem with the id "trainutilities:example_block", combining the namespace and path
    public static final RegistryObject<Item> PLAT1_BLOCK_ITEM = ITEMS.register("platform1_block", () -> new BlockItem(PLATFORM1_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> FRAMELESS_GLASS_BLOCK_ITEM = ITEMS.register("frameless_glass", () -> new BlockItem(FRAMELESS_GLASS.get(), new Item.Properties()));
}
