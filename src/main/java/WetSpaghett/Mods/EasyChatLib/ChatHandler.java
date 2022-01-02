package WetSpaghett.Mods.EasyChatLib;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.*;
import net.minecraft.server.management.PlayerList;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

@Mod.EventBusSubscriber(modid=EasyChatLib.MODID)
public class ChatHandler {
    public static World world = null;

    // Sends a message to all players on the server.
    // Run serverside.
    public static void chatMessage(String message) {
        MinecraftServer mcServer = FMLCommonHandler.instance().getMinecraftServerInstance();
        PlayerList pl = mcServer.getPlayerList();
        ITextComponent msg = new TextComponentTranslation(message);
        pl.sendMessage(msg, true);
    }

    // Sends a message to a specific player.
    // Run clientside.
    public static void clientChatMessage(String message, EntityPlayer pl) {
        ITextComponent msg = new TextComponentTranslation(message);
        pl.sendMessage(msg);
    }

    // Makes player send a message. Can make players run commands.
    // Can only be run clientside as it uses EntityPlayerSP
    public static void playerSendChatMessage(String message, EntityPlayerSP pl) {
        pl.sendChatMessage(message);
    }
}