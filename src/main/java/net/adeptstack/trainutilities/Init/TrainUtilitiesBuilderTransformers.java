package net.adeptstack.trainutilities.Init;

import com.simibubi.create.AllBlocks;
import com.simibubi.create.AllCreativeModeTabs;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.builders.BlockBuilder;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.util.nullness.NonNullUnaryOperator;
import net.adeptstack.trainutilities.Blocks.Behaviour.TrainSlidingDoorMovementBehaviour;
import net.adeptstack.trainutilities.Blocks.Behaviour.TrainSlidingDoorMovingInteraction;
import net.adeptstack.trainutilities.Blocks.Doors.TrainSlidingDoorBlockBase;
import net.adeptstack.trainutilities.Main;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;

import static com.simibubi.create.AllInteractionBehaviours.interactionBehaviour;
import static com.simibubi.create.AllMovementBehaviours.movementBehaviour;

@SuppressWarnings({"unused","removal"})
public class TrainUtilitiesBuilderTransformers {
    private static final CreateRegistrate REGISTRATE = Main.REGISTRATE.setCreativeTab(ModTabs.TRAINUTILS_TAB);

    public static <B extends TrainSlidingDoorBlockBase, P> NonNullUnaryOperator<BlockBuilder<B, P>> slidingDoor(String type) {
        return b -> b.initialProperties(() -> Blocks.OAK_DOOR) // for villager AI..
                .properties(p -> p.strength(3.0F, 6.0F))
                .addLayer(() -> RenderType::translucent)
                .onRegister(interactionBehaviour(new TrainSlidingDoorMovingInteraction()))
                .onRegister(movementBehaviour(new TrainSlidingDoorMovementBehaviour()))
                .item()
                .tab(ModTabs.TRAINUTILS_TAB.getKey())
                .build();
    }

    public static BlockEntry<TrainSlidingDoorBlockBase> TrainSlidingDoor(String type, MapColor colour) {
        return REGISTRATE.block("door_" + type, TrainSlidingDoorBlockBase::new)
                .initialProperties(AllBlocks.FRAMED_GLASS_DOOR)
                .properties(p -> p.sound(SoundType.GLASS).mapColor(colour))
                .transform(TrainUtilitiesBuilderTransformers.slidingDoor(type))
                .properties(BlockBehaviour.Properties::noOcclusion)
                .register();
    }

    private static boolean never(BlockState p_235436_0_, BlockGetter p_235436_1_, BlockPos p_235436_2_) {
        return false;
    }

    private static Boolean never(BlockState p_235427_0_, BlockGetter p_235427_1_, BlockPos p_235427_2_,
                                 EntityType<?> p_235427_3_) {
        return false;
    }
}
