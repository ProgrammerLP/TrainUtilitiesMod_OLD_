package net.adeptstack.trainutilities.Init;

import com.tterrag.registrate.util.entry.BlockEntry;
import net.adeptstack.trainutilities.Blocks.PlatformBlockBase;
import net.adeptstack.trainutilities.Blocks.Doors.TrainSlidingDoorBlockBase;
import net.adeptstack.trainutilities.Blocks.RedLineBlockBase;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.material.MapColor;

import static net.adeptstack.trainutilities.Init.ModTabs.TRAINUTILS_TAB;
import static net.adeptstack.trainutilities.Main.REGISTRATE;

public class BlockInit {

    //===PLATFORM BLOCKS===
    public static final BlockEntry<PlatformBlockBase> PLATFORM1_BLOCK = REGISTRATE
            .block("platform1_block", PlatformBlockBase::new) 
            .initialProperties(() -> Blocks.IRON_BARS) 
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL))
            .item() 
            .tab(TRAINUTILS_TAB.getKey()) 
            .build() 
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM2_BLOCK = REGISTRATE
            .block("platform2_block", PlatformBlockBase::new) 
            .initialProperties(() -> Blocks.IRON_BARS) 
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL))
            .item() 
            .tab(TRAINUTILS_TAB.getKey()) 
            .build() 
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM3_BLOCK = REGISTRATE
            .block("platform3_block", PlatformBlockBase::new) 
            .initialProperties(() -> Blocks.IRON_BARS) 
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL))
            .item() 
            .tab(TRAINUTILS_TAB.getKey()) 
            .build() 
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM4_BLOCK = REGISTRATE
            .block("platform4_block", PlatformBlockBase::new) 
            .initialProperties(() -> Blocks.IRON_BARS) 
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL))
            .item() 
            .tab(TRAINUTILS_TAB.getKey()) 
            .build() 
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM5_BLOCK = REGISTRATE
            .block("platform5_block", PlatformBlockBase::new) 
            .initialProperties(() -> Blocks.IRON_BARS) 
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL))
            .item() 
            .tab(TRAINUTILS_TAB.getKey()) 
            .build() 
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM6_BLOCK = REGISTRATE
            .block("platform6_block", PlatformBlockBase::new) 
            .initialProperties(() -> Blocks.IRON_BARS) 
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL))
            .item() 
            .tab(TRAINUTILS_TAB.getKey()) 
            .build() 
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM7_BLOCK = REGISTRATE
            .block("platform7_block", PlatformBlockBase::new) 
            .initialProperties(() -> Blocks.IRON_BARS) 
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL))
            .item() 
            .tab(TRAINUTILS_TAB.getKey()) 
            .build() 
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM8_BLOCK = REGISTRATE
            .block("platform8_block", PlatformBlockBase::new) 
            .initialProperties(() -> Blocks.IRON_BARS) 
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL))
            .item() 
            .tab(TRAINUTILS_TAB.getKey()) 
            .build() 
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM9_BLOCK = REGISTRATE
            .block("platform9_block", PlatformBlockBase::new) 
            .initialProperties(() -> Blocks.IRON_BARS) 
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL))
            .item() 
            .tab(TRAINUTILS_TAB.getKey()) 
            .build() 
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM10_BLOCK = REGISTRATE
            .block("platform10_block", PlatformBlockBase::new) 
            .initialProperties(() -> Blocks.IRON_BARS) 
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL))
            .item() 
            .tab(TRAINUTILS_TAB.getKey()) 
            .build() 
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM11_BLOCK = REGISTRATE
            .block("platform11_block", PlatformBlockBase::new) 
            .initialProperties(() -> Blocks.IRON_BARS) 
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL))
            .item() 
            .tab(TRAINUTILS_TAB.getKey()) 
            .build() 
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM12_BLOCK = REGISTRATE
            .block("platform12_block", PlatformBlockBase::new) 
            .initialProperties(() -> Blocks.IRON_BARS) 
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL))
            .item() 
            .tab(TRAINUTILS_TAB.getKey()) 
            .build() 
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM13_BLOCK = REGISTRATE
            .block("platform13_block", PlatformBlockBase::new) 
            .initialProperties(() -> Blocks.IRON_BARS) 
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL))
            .item() 
            .tab(TRAINUTILS_TAB.getKey()) 
            .build() 
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM14_BLOCK = REGISTRATE
            .block("platform14_block", PlatformBlockBase::new) 
            .initialProperties(() -> Blocks.IRON_BARS) 
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL))
            .item() 
            .tab(TRAINUTILS_TAB.getKey()) 
            .build() 
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM15_BLOCK = REGISTRATE
            .block("platform15_block", PlatformBlockBase::new) 
            .initialProperties(() -> Blocks.IRON_BARS) 
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL))
            .item() 
            .tab(TRAINUTILS_TAB.getKey()) 
            .build() 
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM16_BLOCK = REGISTRATE
            .block("platform16_block", PlatformBlockBase::new) 
            .initialProperties(() -> Blocks.IRON_BARS) 
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL))
            .item() 
            .tab(TRAINUTILS_TAB.getKey()) 
            .build() 
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM_A_BLOCK = REGISTRATE
            .block("platform_a_block", PlatformBlockBase::new) 
            .initialProperties(() -> Blocks.IRON_BARS) 
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL))
            .item() 
            .tab(TRAINUTILS_TAB.getKey()) 
            .build() 
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM_B_BLOCK = REGISTRATE
            .block("platform_b_block", PlatformBlockBase::new) 
            .initialProperties(() -> Blocks.IRON_BARS) 
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL))
            .item() 
            .tab(TRAINUTILS_TAB.getKey()) 
            .build() 
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM_C_BLOCK = REGISTRATE
            .block("platform_c_block", PlatformBlockBase::new) 
            .initialProperties(() -> Blocks.IRON_BARS) 
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL))
            .item() 
            .tab(TRAINUTILS_TAB.getKey()) 
            .build() 
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM_D_BLOCK = REGISTRATE
            .block("platform_d_block", PlatformBlockBase::new) 
            .initialProperties(() -> Blocks.IRON_BARS) 
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL))
            .item() 
            .tab(TRAINUTILS_TAB.getKey()) 
            .build() 
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM_E_BLOCK = REGISTRATE
            .block("platform_e_block", PlatformBlockBase::new) 
            .initialProperties(() -> Blocks.IRON_BARS) 
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL))
            .item() 
            .tab(TRAINUTILS_TAB.getKey()) 
            .build() 
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM_F_BLOCK = REGISTRATE
            .block("platform_f_block", PlatformBlockBase::new) 
            .initialProperties(() -> Blocks.IRON_BARS) 
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL))
            .item() 
            .tab(TRAINUTILS_TAB.getKey()) 
            .build() 
            .register();

    public static final BlockEntry<PlatformBlockBase> PLATFORM_TO_BLOCK = REGISTRATE
            .block("platform_to_block", PlatformBlockBase::new) 
            .initialProperties(() -> Blocks.IRON_BARS) 
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL))
            .item() 
            .tab(TRAINUTILS_TAB.getKey()) 
            .build() 
            .register();

    public static final BlockEntry<PlatformBlockBase> EMPTY_PLATFORM_BLOCK = REGISTRATE
            .block("empty_platform_block", PlatformBlockBase::new)
            .initialProperties(() -> Blocks.IRON_BARS)
            .properties(p -> p.mapColor(MapColor.NONE)
                    .sound(SoundType.METAL))
            .item()
            .tab(TRAINUTILS_TAB.getKey())
            .build()
            .register();

    //===BUILDING BLOCKS===
    public static final BlockEntry<GlassBlock> FRAMELESS_GLASS = REGISTRATE
            .block("frameless_glass", GlassBlock::new) 
            .initialProperties(() -> Blocks.GLASS) 
            .properties(p -> p.sound(SoundType.GLASS))
            .item() 
            .tab(TRAINUTILS_TAB.getKey()) 
            .build() 
            .register();

    public static final BlockEntry<RedLineBlockBase> TOP_REDLINE_BLOCK = REGISTRATE
            .block("top_redline_block", RedLineBlockBase::new)
            .initialProperties(() -> Blocks.WHITE_CONCRETE)
            .properties(p -> p.mapColor(MapColor.TERRACOTTA_WHITE))
            .item()
            .tab(TRAINUTILS_TAB.getKey())
            .build()
            .register();

    public static final BlockEntry<RedLineBlockBase> BOTTOM_REDLINE_BLOCK = REGISTRATE
            .block("bottom_redline_block", RedLineBlockBase::new)
            .initialProperties(() -> Blocks.WHITE_CONCRETE)
            .properties(p -> p.mapColor(MapColor.TERRACOTTA_WHITE))
            .item()
            .tab(TRAINUTILS_TAB.getKey())
            .build()
            .register();

    public static final BlockEntry<RedLineBlockBase> LEFTSLOPED_REDLINE_BLOCK = REGISTRATE
            .block("leftsloped_redline_block", RedLineBlockBase::new)
            .initialProperties(() -> Blocks.WHITE_CONCRETE)
            .properties(p -> p.mapColor(MapColor.TERRACOTTA_WHITE))
            .item()
            .tab(TRAINUTILS_TAB.getKey())
            .build()
            .register();

    public static final BlockEntry<RedLineBlockBase> RIGHTSLOPED_REDLINE_BLOCK = REGISTRATE
            .block("rightsloped_redline_block", RedLineBlockBase::new)
            .initialProperties(() -> Blocks.WHITE_CONCRETE)
            .properties(p -> p.mapColor(MapColor.TERRACOTTA_WHITE))
            .item()
            .tab(TRAINUTILS_TAB.getKey())
            .build()
            .register();

    //===DOORS===
    public static final BlockEntry<TrainSlidingDoorBlockBase> DOOR_ICE =
            TrainUtilitiesBuilderTransformers.TrainSlidingDoor("ice", MapColor.TERRACOTTA_WHITE);

    public static final BlockEntry<TrainSlidingDoorBlockBase> DOOR_IC2 =
            TrainUtilitiesBuilderTransformers.TrainSlidingDoor("ic2", MapColor.TERRACOTTA_WHITE);

    public static final BlockEntry<TrainSlidingDoorBlockBase> DOOR_RRX =
            TrainUtilitiesBuilderTransformers.TrainSlidingDoor("rrx", MapColor.TERRACOTTA_GRAY);

    public static final BlockEntry<TrainSlidingDoorBlockBase> DOOR_FLIRT =
            TrainUtilitiesBuilderTransformers.TrainSlidingDoor("flirt", MapColor.TERRACOTTA_GREEN);

    public static void register() { }
}
