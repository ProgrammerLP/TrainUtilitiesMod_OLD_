package net.adeptstack.trainutilities.Init;

import com.tterrag.registrate.util.entry.BlockEntityEntry;
import net.adeptstack.trainutilities.Blocks.Doors.TrainSlidingDoorBlockBaseEntity;
import net.adeptstack.trainutilities.Blocks.Doors.TrainSlidingDoorBlockBaseRenderer;

import static net.adeptstack.trainutilities.Main.REGISTRATE;


public class BlockEntityInit {

    public static final BlockEntityEntry<TrainSlidingDoorBlockBaseEntity> SLIDING_DOOR =
            REGISTRATE.blockEntity("sliding_door", TrainSlidingDoorBlockBaseEntity::new)
                    .renderer(() -> TrainSlidingDoorBlockBaseRenderer::new)
                    .validBlocks(BlockInit.DOOR_ICE, BlockInit.DOOR_IC2, BlockInit.DOOR_RRX, BlockInit.DOOR_FLIRT)
                    .register();

    public static void register() {}
}
