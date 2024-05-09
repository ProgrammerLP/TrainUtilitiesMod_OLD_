package net.adeptstack.trainutilities.Init.Blocks.Entities;

import com.tterrag.registrate.util.entry.BlockEntityEntry;
import net.adeptstack.trainutilities.Init.BlockInit;
import net.adeptstack.trainutilities.Init.Blocks.Doors.TrainSlidingDoorBlockBaseEntity;
import net.adeptstack.trainutilities.Init.Blocks.Doors.TrainSlidingDoorBlockBaseRenderer;

import static net.adeptstack.trainutilities.Main.REGISTRATE;


public class BlockEntityInit {

    public static final BlockEntityEntry<TrainSlidingDoorBlockBaseEntity> TU_SLIDING_DOOR =
            REGISTRATE.blockEntity("tu_sliding_door", TrainSlidingDoorBlockBaseEntity::new)
                    .renderer(() -> TrainSlidingDoorBlockBaseRenderer::new)
                    .validBlocks(BlockInit.DOOR_ICE)
                    .register();

    public static void register() {}
}
