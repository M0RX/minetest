package dev.morx.minetest.command;

import dev.morx.minetest.MinetestPlugin;
import dev.morx.minetest.localization.Messages;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PermissionCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if (args.length == 0) {
            commandSender.sendMessage(MinetestPlugin.getInstance().getPrefix() + Messages.getString("help"));
        }
        if(commandSender instanceof Player) {
            Player player = (Player) commandSender;
        }
        return true;
    }
}
