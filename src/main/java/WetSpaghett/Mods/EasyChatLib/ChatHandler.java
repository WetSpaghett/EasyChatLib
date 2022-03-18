package WetSpaghett.Mods.EasyChatLib;

import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.server.management.PlayerList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

import java.util.List;

public class ChatHandler {
    /** Sends a message to all players on the server.
     * Run serverside. */
    public static void chatMessage(String message) {
        PlayerList pl = EasyChatLib.server.getPlayerList();
        List<ServerPlayerEntity> players = pl.getPlayers();
        for (ServerPlayerEntity player:players) {
            player.sendMessage(new StringTextComponent(message), player.getUUID());
        }
    }


    /** Sends a message to a specific player.*/
    public static void clientChatMessage(String message, PlayerEntity pl) {
        ITextComponent msg = new StringTextComponent(message);
        pl.sendMessage(msg, pl.getUUID());
    }

    /** Makes player send a message. Can make players run commands.
     * Will crash the game if run serverside. */
    public static void playerSendChatMessage(String message, ClientPlayerEntity pl) {
        pl.chat(message);
    }
}
