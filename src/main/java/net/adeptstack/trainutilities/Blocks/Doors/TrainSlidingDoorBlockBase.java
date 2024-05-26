package net.adeptstack.trainutilities.Blocks.Doors;

import com.simibubi.create.content.decoration.slidingDoor.SlidingDoorBlock;
import net.adeptstack.trainutilities.Init.BlockEntityInit;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class TrainSlidingDoorBlockBase extends SlidingDoorBlock {
    public TrainSlidingDoorBlockBase(Properties properties) {
        super(properties, GLASS_SET_TYPE.get(), false);
    }

    @Override
    public BlockEntityType<? extends TrainSlidingDoorBlockBaseEntity> getBlockEntityType() {
        return BlockEntityInit.SLIDING_DOOR.get();
    }
}
