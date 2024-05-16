package net.adeptstack.trainutilities.Init;

import java.util.ArrayList;
import java.util.List;

import net.adeptstack.trainutilities.Core.Contraptions.Behaviour.DoorMovingInteraction;
import net.adeptstack.trainutilities.Core.Contraptions.Behaviour.MovingInteractionBehaviour;
import org.jetbrains.annotations.Nullable;

import com.simibubi.create.foundation.utility.AttachedRegistry;
import com.tterrag.registrate.util.nullness.NonNullConsumer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.ForgeRegistries;

public class InteractionBehaviourInit {
    private static final AttachedRegistry<Block, MovingInteractionBehaviour> BLOCK_BEHAVIOURS = new AttachedRegistry<>(ForgeRegistries.BLOCKS);
    private static final List<BehaviourProvider> GLOBAL_BEHAVIOURS = new ArrayList<>();

    public static void registerBehaviour(ResourceLocation block, MovingInteractionBehaviour provider) {
        BLOCK_BEHAVIOURS.register(block, provider);
    }

    public static void registerBehaviour(Block block, MovingInteractionBehaviour provider) {
        BLOCK_BEHAVIOURS.register(block, provider);
    }

    public static void registerBehaviourProvider(BehaviourProvider provider) {
        GLOBAL_BEHAVIOURS.add(provider);
    }

    @Nullable
    public static MovingInteractionBehaviour getBehaviour(BlockState state) {
        MovingInteractionBehaviour behaviour = BLOCK_BEHAVIOURS.get(state.getBlock());
        if (behaviour != null) {
            return behaviour;
        }

        for (BehaviourProvider provider : GLOBAL_BEHAVIOURS) {
            behaviour = provider.getBehaviour(state);
            if (behaviour != null) {
                return behaviour;
            }
        }

        return null;
    }

    public static <B extends Block> NonNullConsumer<? super B> interactionBehaviour(
            MovingInteractionBehaviour behaviour) {
        return b -> registerBehaviour(b, behaviour);
    }

    public static void registerDefaults() {
        DoorMovingInteraction doorBehaviour = new DoorMovingInteraction();
        registerBehaviourProvider(state -> {
            if (state.is(BlockTags.WOODEN_DOORS)) {
                return doorBehaviour;
            }
            return null;
        });
    }

    public interface BehaviourProvider {
        @Nullable
        MovingInteractionBehaviour getBehaviour(BlockState state);
    }
}