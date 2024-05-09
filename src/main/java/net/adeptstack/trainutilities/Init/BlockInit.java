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

import static net.adeptstack.trainutilities.Main.MODID;
import static net.adeptstack.trainutilities.Main.REGISTRATE;

public class BlockInit {
    // Create a Deferred Register to hold Blocks which will all be registered under the "trainutilities" namespace
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    // Creates a new Block with the id "trainutilities:example_block", combining the namespace and path
    public static final RegistryObject<Block> PLATFORM1_BLOCK = BLOCKS.register("platform1_block", () -> new PlatformBlockBase(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)));

    public static final RegistryObject<Block> FRAMELESS_GLASS = BLOCKS.register("frameless_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.GLASS)));
//    public static final RegistryObject<Block> DOOR_ICE = BLOCKS.register("door_ice", () ->
//            new TrainSlidingDoorBlockBase(, false));


    public static final BlockEntry<TrainSlidingDoorBlockBase> DOOR_ICE =
            REGISTRATE.block("door_ice", p -> new TrainSlidingDoorBlockBase(p, false))
                    .transform(TUBuilderTransformers.slidingDoor("ice"))
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_CYAN)
                            .sound(SoundType.COPPER)
                            .noOcclusion())
                    .register();

    public static void register() { }
}
