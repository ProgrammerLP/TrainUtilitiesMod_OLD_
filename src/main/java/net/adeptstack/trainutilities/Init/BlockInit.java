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

    //===PLATFORM BLOCKS===
    public static final BlockEntry<PlatformBlockBase> PLATFORM1_BLOCK = REGISTRATE
            .block("platform1_block", PlatformBlockBase::new) // Erstellt einen neuen Block
            .initialProperties(() -> Blocks.IRON_BARS) // Kopiert die Eigenschaften des übergebenen Blocks (weglassen, wenn du keine Eigenschaften kopieren willst)
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL)) // Für diesen Block optional, da GlassBlock schon den Glass-Sound hat, aber hier kannst du deine Block Properties definieren (Nutze dafür einfach "p")
            .item() // Erstellt ein BlockItem
            .tab(TRAINUTILS_TAB.getKey()) // Fügt deinen Block dem CreativeTab hinzu.
            .build() // Erstellt das Item
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM2_BLOCK = REGISTRATE
            .block("platform2_block", PlatformBlockBase::new) // Erstellt einen neuen Block
            .initialProperties(() -> Blocks.IRON_BARS) // Kopiert die Eigenschaften des übergebenen Blocks (weglassen, wenn du keine Eigenschaften kopieren willst)
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL)) // Für diesen Block optional, da GlassBlock schon den Glass-Sound hat, aber hier kannst du deine Block Properties definieren (Nutze dafür einfach "p")
            .item() // Erstellt ein BlockItem
            .tab(TRAINUTILS_TAB.getKey()) // Fügt deinen Block dem CreativeTab hinzu.
            .build() // Erstellt das Item
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM3_BLOCK = REGISTRATE
            .block("platform3_block", PlatformBlockBase::new) // Erstellt einen neuen Block
            .initialProperties(() -> Blocks.IRON_BARS) // Kopiert die Eigenschaften des übergebenen Blocks (weglassen, wenn du keine Eigenschaften kopieren willst)
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL)) // Für diesen Block optional, da GlassBlock schon den Glass-Sound hat, aber hier kannst du deine Block Properties definieren (Nutze dafür einfach "p")
            .item() // Erstellt ein BlockItem
            .tab(TRAINUTILS_TAB.getKey()) // Fügt deinen Block dem CreativeTab hinzu.
            .build() // Erstellt das Item
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM4_BLOCK = REGISTRATE
            .block("platform4_block", PlatformBlockBase::new) // Erstellt einen neuen Block
            .initialProperties(() -> Blocks.IRON_BARS) // Kopiert die Eigenschaften des übergebenen Blocks (weglassen, wenn du keine Eigenschaften kopieren willst)
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL)) // Für diesen Block optional, da GlassBlock schon den Glass-Sound hat, aber hier kannst du deine Block Properties definieren (Nutze dafür einfach "p")
            .item() // Erstellt ein BlockItem
            .tab(TRAINUTILS_TAB.getKey()) // Fügt deinen Block dem CreativeTab hinzu.
            .build() // Erstellt das Item
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM5_BLOCK = REGISTRATE
            .block("platform5_block", PlatformBlockBase::new) // Erstellt einen neuen Block
            .initialProperties(() -> Blocks.IRON_BARS) // Kopiert die Eigenschaften des übergebenen Blocks (weglassen, wenn du keine Eigenschaften kopieren willst)
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL)) // Für diesen Block optional, da GlassBlock schon den Glass-Sound hat, aber hier kannst du deine Block Properties definieren (Nutze dafür einfach "p")
            .item() // Erstellt ein BlockItem
            .tab(TRAINUTILS_TAB.getKey()) // Fügt deinen Block dem CreativeTab hinzu.
            .build() // Erstellt das Item
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM6_BLOCK = REGISTRATE
            .block("platform6_block", PlatformBlockBase::new) // Erstellt einen neuen Block
            .initialProperties(() -> Blocks.IRON_BARS) // Kopiert die Eigenschaften des übergebenen Blocks (weglassen, wenn du keine Eigenschaften kopieren willst)
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL)) // Für diesen Block optional, da GlassBlock schon den Glass-Sound hat, aber hier kannst du deine Block Properties definieren (Nutze dafür einfach "p")
            .item() // Erstellt ein BlockItem
            .tab(TRAINUTILS_TAB.getKey()) // Fügt deinen Block dem CreativeTab hinzu.
            .build() // Erstellt das Item
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM7_BLOCK = REGISTRATE
            .block("platform7_block", PlatformBlockBase::new) // Erstellt einen neuen Block
            .initialProperties(() -> Blocks.IRON_BARS) // Kopiert die Eigenschaften des übergebenen Blocks (weglassen, wenn du keine Eigenschaften kopieren willst)
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL)) // Für diesen Block optional, da GlassBlock schon den Glass-Sound hat, aber hier kannst du deine Block Properties definieren (Nutze dafür einfach "p")
            .item() // Erstellt ein BlockItem
            .tab(TRAINUTILS_TAB.getKey()) // Fügt deinen Block dem CreativeTab hinzu.
            .build() // Erstellt das Item
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM8_BLOCK = REGISTRATE
            .block("platform8_block", PlatformBlockBase::new) // Erstellt einen neuen Block
            .initialProperties(() -> Blocks.IRON_BARS) // Kopiert die Eigenschaften des übergebenen Blocks (weglassen, wenn du keine Eigenschaften kopieren willst)
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL)) // Für diesen Block optional, da GlassBlock schon den Glass-Sound hat, aber hier kannst du deine Block Properties definieren (Nutze dafür einfach "p")
            .item() // Erstellt ein BlockItem
            .tab(TRAINUTILS_TAB.getKey()) // Fügt deinen Block dem CreativeTab hinzu.
            .build() // Erstellt das Item
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM9_BLOCK = REGISTRATE
            .block("platform9_block", PlatformBlockBase::new) // Erstellt einen neuen Block
            .initialProperties(() -> Blocks.IRON_BARS) // Kopiert die Eigenschaften des übergebenen Blocks (weglassen, wenn du keine Eigenschaften kopieren willst)
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL)) // Für diesen Block optional, da GlassBlock schon den Glass-Sound hat, aber hier kannst du deine Block Properties definieren (Nutze dafür einfach "p")
            .item() // Erstellt ein BlockItem
            .tab(TRAINUTILS_TAB.getKey()) // Fügt deinen Block dem CreativeTab hinzu.
            .build() // Erstellt das Item
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM10_BLOCK = REGISTRATE
            .block("platform10_block", PlatformBlockBase::new) // Erstellt einen neuen Block
            .initialProperties(() -> Blocks.IRON_BARS) // Kopiert die Eigenschaften des übergebenen Blocks (weglassen, wenn du keine Eigenschaften kopieren willst)
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL)) // Für diesen Block optional, da GlassBlock schon den Glass-Sound hat, aber hier kannst du deine Block Properties definieren (Nutze dafür einfach "p")
            .item() // Erstellt ein BlockItem
            .tab(TRAINUTILS_TAB.getKey()) // Fügt deinen Block dem CreativeTab hinzu.
            .build() // Erstellt das Item
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM11_BLOCK = REGISTRATE
            .block("platform11_block", PlatformBlockBase::new) // Erstellt einen neuen Block
            .initialProperties(() -> Blocks.IRON_BARS) // Kopiert die Eigenschaften des übergebenen Blocks (weglassen, wenn du keine Eigenschaften kopieren willst)
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL)) // Für diesen Block optional, da GlassBlock schon den Glass-Sound hat, aber hier kannst du deine Block Properties definieren (Nutze dafür einfach "p")
            .item() // Erstellt ein BlockItem
            .tab(TRAINUTILS_TAB.getKey()) // Fügt deinen Block dem CreativeTab hinzu.
            .build() // Erstellt das Item
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM12_BLOCK = REGISTRATE
            .block("platform12_block", PlatformBlockBase::new) // Erstellt einen neuen Block
            .initialProperties(() -> Blocks.IRON_BARS) // Kopiert die Eigenschaften des übergebenen Blocks (weglassen, wenn du keine Eigenschaften kopieren willst)
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL)) // Für diesen Block optional, da GlassBlock schon den Glass-Sound hat, aber hier kannst du deine Block Properties definieren (Nutze dafür einfach "p")
            .item() // Erstellt ein BlockItem
            .tab(TRAINUTILS_TAB.getKey()) // Fügt deinen Block dem CreativeTab hinzu.
            .build() // Erstellt das Item
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM13_BLOCK = REGISTRATE
            .block("platform13_block", PlatformBlockBase::new) // Erstellt einen neuen Block
            .initialProperties(() -> Blocks.IRON_BARS) // Kopiert die Eigenschaften des übergebenen Blocks (weglassen, wenn du keine Eigenschaften kopieren willst)
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL)) // Für diesen Block optional, da GlassBlock schon den Glass-Sound hat, aber hier kannst du deine Block Properties definieren (Nutze dafür einfach "p")
            .item() // Erstellt ein BlockItem
            .tab(TRAINUTILS_TAB.getKey()) // Fügt deinen Block dem CreativeTab hinzu.
            .build() // Erstellt das Item
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM14_BLOCK = REGISTRATE
            .block("platform14_block", PlatformBlockBase::new) // Erstellt einen neuen Block
            .initialProperties(() -> Blocks.IRON_BARS) // Kopiert die Eigenschaften des übergebenen Blocks (weglassen, wenn du keine Eigenschaften kopieren willst)
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL)) // Für diesen Block optional, da GlassBlock schon den Glass-Sound hat, aber hier kannst du deine Block Properties definieren (Nutze dafür einfach "p")
            .item() // Erstellt ein BlockItem
            .tab(TRAINUTILS_TAB.getKey()) // Fügt deinen Block dem CreativeTab hinzu.
            .build() // Erstellt das Item
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM15_BLOCK = REGISTRATE
            .block("platform15_block", PlatformBlockBase::new) // Erstellt einen neuen Block
            .initialProperties(() -> Blocks.IRON_BARS) // Kopiert die Eigenschaften des übergebenen Blocks (weglassen, wenn du keine Eigenschaften kopieren willst)
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL)) // Für diesen Block optional, da GlassBlock schon den Glass-Sound hat, aber hier kannst du deine Block Properties definieren (Nutze dafür einfach "p")
            .item() // Erstellt ein BlockItem
            .tab(TRAINUTILS_TAB.getKey()) // Fügt deinen Block dem CreativeTab hinzu.
            .build() // Erstellt das Item
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM16_BLOCK = REGISTRATE
            .block("platform16_block", PlatformBlockBase::new) // Erstellt einen neuen Block
            .initialProperties(() -> Blocks.IRON_BARS) // Kopiert die Eigenschaften des übergebenen Blocks (weglassen, wenn du keine Eigenschaften kopieren willst)
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL)) // Für diesen Block optional, da GlassBlock schon den Glass-Sound hat, aber hier kannst du deine Block Properties definieren (Nutze dafür einfach "p")
            .item() // Erstellt ein BlockItem
            .tab(TRAINUTILS_TAB.getKey()) // Fügt deinen Block dem CreativeTab hinzu.
            .build() // Erstellt das Item
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM_A_BLOCK = REGISTRATE
            .block("platform_a_block", PlatformBlockBase::new) // Erstellt einen neuen Block
            .initialProperties(() -> Blocks.IRON_BARS) // Kopiert die Eigenschaften des übergebenen Blocks (weglassen, wenn du keine Eigenschaften kopieren willst)
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL)) // Für diesen Block optional, da GlassBlock schon den Glass-Sound hat, aber hier kannst du deine Block Properties definieren (Nutze dafür einfach "p")
            .item() // Erstellt ein BlockItem
            .tab(TRAINUTILS_TAB.getKey()) // Fügt deinen Block dem CreativeTab hinzu.
            .build() // Erstellt das Item
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM_B_BLOCK = REGISTRATE
            .block("platform_b_block", PlatformBlockBase::new) // Erstellt einen neuen Block
            .initialProperties(() -> Blocks.IRON_BARS) // Kopiert die Eigenschaften des übergebenen Blocks (weglassen, wenn du keine Eigenschaften kopieren willst)
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL)) // Für diesen Block optional, da GlassBlock schon den Glass-Sound hat, aber hier kannst du deine Block Properties definieren (Nutze dafür einfach "p")
            .item() // Erstellt ein BlockItem
            .tab(TRAINUTILS_TAB.getKey()) // Fügt deinen Block dem CreativeTab hinzu.
            .build() // Erstellt das Item
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM_C_BLOCK = REGISTRATE
            .block("platform_c_block", PlatformBlockBase::new) // Erstellt einen neuen Block
            .initialProperties(() -> Blocks.IRON_BARS) // Kopiert die Eigenschaften des übergebenen Blocks (weglassen, wenn du keine Eigenschaften kopieren willst)
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL)) // Für diesen Block optional, da GlassBlock schon den Glass-Sound hat, aber hier kannst du deine Block Properties definieren (Nutze dafür einfach "p")
            .item() // Erstellt ein BlockItem
            .tab(TRAINUTILS_TAB.getKey()) // Fügt deinen Block dem CreativeTab hinzu.
            .build() // Erstellt das Item
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM_D_BLOCK = REGISTRATE
            .block("platform_d_block", PlatformBlockBase::new) // Erstellt einen neuen Block
            .initialProperties(() -> Blocks.IRON_BARS) // Kopiert die Eigenschaften des übergebenen Blocks (weglassen, wenn du keine Eigenschaften kopieren willst)
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL)) // Für diesen Block optional, da GlassBlock schon den Glass-Sound hat, aber hier kannst du deine Block Properties definieren (Nutze dafür einfach "p")
            .item() // Erstellt ein BlockItem
            .tab(TRAINUTILS_TAB.getKey()) // Fügt deinen Block dem CreativeTab hinzu.
            .build() // Erstellt das Item
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM_E_BLOCK = REGISTRATE
            .block("platform_e_block", PlatformBlockBase::new) // Erstellt einen neuen Block
            .initialProperties(() -> Blocks.IRON_BARS) // Kopiert die Eigenschaften des übergebenen Blocks (weglassen, wenn du keine Eigenschaften kopieren willst)
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL)) // Für diesen Block optional, da GlassBlock schon den Glass-Sound hat, aber hier kannst du deine Block Properties definieren (Nutze dafür einfach "p")
            .item() // Erstellt ein BlockItem
            .tab(TRAINUTILS_TAB.getKey()) // Fügt deinen Block dem CreativeTab hinzu.
            .build() // Erstellt das Item
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM_F_BLOCK = REGISTRATE
            .block("platform_f_block", PlatformBlockBase::new) // Erstellt einen neuen Block
            .initialProperties(() -> Blocks.IRON_BARS) // Kopiert die Eigenschaften des übergebenen Blocks (weglassen, wenn du keine Eigenschaften kopieren willst)
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL)) // Für diesen Block optional, da GlassBlock schon den Glass-Sound hat, aber hier kannst du deine Block Properties definieren (Nutze dafür einfach "p")
            .item() // Erstellt ein BlockItem
            .tab(TRAINUTILS_TAB.getKey()) // Fügt deinen Block dem CreativeTab hinzu.
            .build() // Erstellt das Item
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM_TO_BLOCK = REGISTRATE
            .block("platform_to_block", PlatformBlockBase::new) // Erstellt einen neuen Block
            .initialProperties(() -> Blocks.IRON_BARS) // Kopiert die Eigenschaften des übergebenen Blocks (weglassen, wenn du keine Eigenschaften kopieren willst)
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL)) // Für diesen Block optional, da GlassBlock schon den Glass-Sound hat, aber hier kannst du deine Block Properties definieren (Nutze dafür einfach "p")
            .item() // Erstellt ein BlockItem
            .tab(TRAINUTILS_TAB.getKey()) // Fügt deinen Block dem CreativeTab hinzu.
            .build() // Erstellt das Item
            .register();

    //===BUILDING BLOCKS===
    public static final BlockEntry<GlassBlock> FRAMELESS_GLASS = REGISTRATE
            .block("frameless_glass", GlassBlock::new) // Erstellt einen neuen Block
            .initialProperties(() -> Blocks.GLASS) // Kopiert die Eigenschaften des übergebenen Blocks (weglassen, wenn du keine Eigenschaften kopieren willst)
            .properties(p -> p.sound(SoundType.GLASS)) // Für diesen Block optional, da GlassBlock schon den Glass-Sound hat, aber hier kannst du deine Block Properties definieren (Nutze dafür einfach "p")
            .item() // Erstellt ein BlockItem
            .tab(TRAINUTILS_TAB.getKey()) // Fügt deinen Block dem CreativeTab hinzu.
            .build() // Erstellt das Item
            .register();

    //===DOORS===
    public static final BlockEntry<TrainSlidingDoorBlockBase> DOOR_ICE =
            REGISTRATE.block("door_ice", p -> new TrainSlidingDoorBlockBase(p, false))
                    .transform(TUBuilderTransformers.slidingDoor("ice"))
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_CYAN)
                            .sound(SoundType.COPPER)
                            .noOcclusion())
                    .register();

    public static void register() { }
}
