package net.adeptstack.trainutilities.Init;

import com.simibubi.create.foundation.data.BuilderTransformers;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.adeptstack.trainutilities.Core.TUBuilderTransformers;
import net.adeptstack.trainutilities.Init.Blocks.PlatformBlockBase;
import net.adeptstack.trainutilities.Init.Blocks.Doors.TrainSlidingDoorBlockBase;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.adeptstack.trainutilities.Init.ModTabs.TRAINUTILS_TAB;
import static net.adeptstack.trainutilities.Main.MODID;
import static net.adeptstack.trainutilities.Main.REGISTRATE;

public class BlockInit {
//    // Create a Deferred Register to hold Blocks which will all be registered under the "trainutilities" namespace
//    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
//
//    // Creates a new Block with the id "trainutilities:example_block", combining the namespace and path
//    public static final RegistryObject<Block> PLATFORM1_BLOCK = BLOCKS.register("platform1_block", () -> new PlatformBlockBase(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));

    public static final BlockEntry<PlatformBlockBase> PLATFORM1_BLOCK = REGISTRATE
            .block("platform1_block", PlatformBlockBase::new) // Erstellt einen neuen Block
            .initialProperties(() -> Blocks.IRON_BARS) // Kopiert die Eigenschaften des übergebenen Blocks (weglassen, wenn du keine Eigenschaften kopieren willst)
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL)) // Für diesen Block optional, da GlassBlock schon den Glass-Sound hat, aber hier kannst du deine Block Properties definieren (Nutze dafür einfach "p")
            .item() // Erstellt ein BlockItem
            .tab(TRAINUTILS_TAB.getKey()) // Fügt deinen Block dem CreativeTab hinzu.
            .build() // Erstellt das Item
            .register();

    public static final BlockEntry<GlassBlock> FRAMELESS_GLASS = REGISTRATE
            .block("frameless_glass", GlassBlock::new) // Erstellt einen neuen Block
            .initialProperties(() -> Blocks.GLASS) // Kopiert die Eigenschaften des übergebenen Blocks (weglassen, wenn du keine Eigenschaften kopieren willst)
            .properties(p -> p.sound(SoundType.GLASS)) // Für diesen Block optional, da GlassBlock schon den Glass-Sound hat, aber hier kannst du deine Block Properties definieren (Nutze dafür einfach "p")
            .item() // Erstellt ein BlockItem
            .tab(TRAINUTILS_TAB.getKey()) // Fügt deinen Block dem CreativeTab hinzu.
            .build() // Erstellt das Item
            .register();

    public static final BlockEntry<TrainSlidingDoorBlockBase> DOOR_ICE =
            REGISTRATE.block("door_ice", p -> new TrainSlidingDoorBlockBase(p, false))
                    .transform(TUBuilderTransformers.slidingDoor("ice"))
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_CYAN)
                            .sound(SoundType.COPPER)
                            .noOcclusion())
                    .register();

    public static void register() { }
}
