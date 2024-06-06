package net.adeptstack.trainutilities.Init;

import com.simibubi.create.AllSoundEvents;
import net.adeptstack.trainutilities.Main;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.adeptstack.trainutilities.Main.REGISTRATE;

public class SoundInit {

    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Main.MODID);

    public static final RegistryObject<SoundEvent> DOOR_ICE_OPEN = registerSoundEvents("door_ice_open");
    public static final RegistryObject<SoundEvent> DOOR_ICE_CLOSE = registerSoundEvents("door_ice_close");
    public static final RegistryObject<SoundEvent> DOOR_IC2_OPEN = registerSoundEvents("door_ic2_open");
    public static final RegistryObject<SoundEvent> DOOR_IC2_CLOSE = registerSoundEvents("door_ic2_close");
    public static final RegistryObject<SoundEvent> DOOR_RRX_OPEN = registerSoundEvents("door_rrx_open");
    public static final RegistryObject<SoundEvent> DOOR_RRX_CLOSE = registerSoundEvents("door_rrx_close");
    public static final RegistryObject<SoundEvent> DOOR_FLIRT_OPEN = registerSoundEvents("door_flirt_open");
    public static final RegistryObject<SoundEvent> DOOR_FLIRT_CLOSE = registerSoundEvents("door_flirt_close");

    //Own SoundType
//    public static final ForgeSoundType DOOR_BLOCK_SOUNDS = new ForgeSoundType(1f ,1f,
//            <breakSound>, <stepSound>, <placeSound>, <hitSound>, <fallSound>);

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(Main.MODID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
        BlockInit.register();
        BlockEntityInit.register();
    }
}
