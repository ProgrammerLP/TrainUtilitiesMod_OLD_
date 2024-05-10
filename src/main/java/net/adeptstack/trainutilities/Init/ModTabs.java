package net.adeptstack.trainutilities.Init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static net.adeptstack.trainutilities.Init.ItemInit.*;
import static net.adeptstack.trainutilities.Main.MODID;

public class ModTabs {
    // Create a Deferred Register to hold CreativeModeTabs which will all be registered under the "examplemod" namespace
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    // Creates a creative tab with the id "examplemod:example_tab" for the example item, that is placed after the combat tab
    public static final RegistryObject<CreativeModeTab> TRAINUTILS_TAB = CREATIVE_MODE_TABS.register("trainutils_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .title(Component.translatable("itemGroup." + MODID + ".trainutils_tab"))
            //.icon(() -> PLAT1_BLOCK_ITEM.get().getDefaultInstance())
            .build());
}
