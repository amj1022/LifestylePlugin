package com.angela;

import com.angela.modules.ChatModule;
import com.angela.modules.FireworkModule;
import com.angela.modules.FlyModule;
import com.angela.modules.EggModule;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Lifestyle extends JavaPlugin {
    @Override
    public void onEnable() {
        saveDefaultConfig();
        ConsoleCommandSender console = Bukkit.getConsoleSender();
        console.sendMessage(ChatColor.LIGHT_PURPLE + "Lifestyle plugin loaded");

        FileConfiguration config = getConfig();

        //Commands
        if(config.getBoolean("modules.firework.enable",true)){
            console.sendMessage(ChatColor.GREEN + "Enabling FireworkModule");
            new FireworkModule(this);
        }

        if(config.getBoolean("modules.fly.enable", true)){
            console.sendMessage(ChatColor.GREEN + "Enabling FlyModule");
            new FlyModule(this);
        }

        if(config.getBoolean("modules.chat.enable", true)){
            console.sendMessage(ChatColor.GREEN + "Enabling ChatModule");
            new ChatModule(this);
        }

        if(config.getBoolean("modules.egg.enable", true)){
            console.sendMessage(ChatColor.GREEN + "Enabling EggModule");
            new EggModule(this);
        }


    }

    @Override
    public void onDisable() {

    }
}
