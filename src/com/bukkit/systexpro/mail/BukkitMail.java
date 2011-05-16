package com.bukkit.systexpro.mail;

import java.util.logging.Logger;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class BukkitMail extends JavaPlugin {

	public Logger log = Logger.getLogger("Minecraft");
	@Override
	public void onDisable() {
		log.info("[BukkitMail] Unloading BukkitMail from Bukkit");
	}

	@Override
	public void onEnable() {
		log.info("[BukkitMail] Loading BukkitMail into Bukkit");	
	}

	/**
	 * Command Handler
	 */
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if(cmd.getName().equals("mail") || cmd.getName().equalsIgnoreCase("m")) {
			if (args.length >= 1 && sender instanceof Player) {
				return mainCommand(sender,args);
			} else {
				return false;
			}

		} 
		return super.onCommand(sender, cmd, commandLabel, args);






	}

	private boolean mainCommand(CommandSender sender, String[] args) {
		return false;

	}
}
