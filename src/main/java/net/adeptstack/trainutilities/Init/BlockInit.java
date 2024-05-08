package net.adeptstack.trainutilities.Init;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.adeptstack.trainutilities.Main.MODID;

public class BlockInit {
    // Create a Deferred Register to hold Blocks which will all be registered under the "trainutilities" namespace
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    // Creates a new Block with the id "trainutilities:example_block", combining the namespace and path
    public static final RegistryObject<Block> PLATFORM1_BLOCK = BLOCKS.register("platform1_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));

    public static final RegistryObject<Block> FRAMELESS_GLASS = BLOCKS.register("frameless_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.GLASS)));
}
