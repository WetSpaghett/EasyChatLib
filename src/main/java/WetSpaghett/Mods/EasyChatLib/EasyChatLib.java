package WetSpaghett.Mods.EasyChatLib;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod.EventBusSubscriber(modid=EasyChatLib.MODID)
@Mod(EasyChatLib.MODID)
public class EasyChatLib {
    public static final String MODID = "easychatlib";
    public static final String NAME = "Easy Chat Lib";
    public static final String VERSION = "v0.1.2";
    public static MinecraftServer server;

    public EasyChatLib() {
        // Register methods

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void getServer(FMLServerStartingEvent event) {
        server = event.getServer();
    }
}
