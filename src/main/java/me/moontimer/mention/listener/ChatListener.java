package me.moontimer.mention.listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        String message = event.getMessage();
        for (Player players : Bukkit.getOnlinePlayers()) {
            if (message.contains(players.getName())) {
                message = message.replace(players.getName() , "§b@" + players.getName() + "§f");
            }
        }
        event.setMessage(message);
    }
}
