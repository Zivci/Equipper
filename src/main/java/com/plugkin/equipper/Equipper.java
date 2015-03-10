package com.plugkin.equipper;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class Equipper extends JavaPlugin {

    // Executed when plugin is first enabled (server startup)
    @Override
    public void onEnable() {

    }

    // Handling of plugin command (/equip)
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("equip")) {
            // Check if an argument (for Player name) is supplied
            if(args.length == 0) {
                // No argument supplied, returning false with a message
                return false;
            } else {
                // Argument supplied, proceeding.
                Player target = (Bukkit.getServer().getPlayer(args[0]));
                // Checking if a matching playername (in command args[0]) is online
                if (target == null) {
                    // No match, sending error.
                    sender.sendMessage("Player §c" + args[0] + " §ris not online");
                    // Returning false.
                    return true;
                } else {
                    // Player found, executing.

                    //
                    // Execute actions here, equip player with items.
                    //

                    sender.sendMessage("Player §a" + args[0] + " §requipped");
                    // Success, returning true.
                    return true;
                }
            }
        }
        // Command was not matched, returning false.
        return false;
    }


    // Executed when plugin is disabled
    @Override
    public void onDisable() {

    }

}
