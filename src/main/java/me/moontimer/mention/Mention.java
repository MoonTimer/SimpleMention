package me.moontimer.mention;

import me.moontimer.mention.listener.ChatListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Mention extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(new ChatListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
