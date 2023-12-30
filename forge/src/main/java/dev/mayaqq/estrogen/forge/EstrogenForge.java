package dev.mayaqq.estrogen.forge;

import dev.architectury.platform.forge.EventBuses;
import dev.mayaqq.estrogen.Estrogen;
import dev.mayaqq.estrogen.client.EstrogenClient;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Estrogen.MOD_ID)
public class EstrogenForge {
    public EstrogenForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Estrogen.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        Estrogen.init();
    }

    public void clientSetup(FMLClientSetupEvent event) {
        EstrogenClient.init();
    }
}