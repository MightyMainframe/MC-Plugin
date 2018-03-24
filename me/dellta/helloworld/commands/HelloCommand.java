package me.dellta.helloworld.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.Main;
import org.bukkit.entity.Player;

import me.dellta.helloworld.main;

public class HelloCommand implements CommandExecutor {
	
	//@SuppressWarnings("unused")
	private main plugin;
	
	public HelloCommand(main main) {
		this.plugin = main;
		main.getCommand("hello").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) { //checks to see if this is a player or console executing this command
			sender.sendMessage("Only players may execute this command!");
			return true;
		}
		//needed only if using multiple commands
		
		/*if (cmd.getName().equalsIgnoreCase("hello")) { 
			
		}*/ 
		Player p = (Player) sender; // "p" stands for the player, it can be whatever the coder wants. IE "plr" "player"
		
		if (p.hasPermission("hello.use")) { //check if player has proper permissions 
			p.sendMessage("Hi! o/"); //if they do then say hi!
			
			return true;
		}else { //Anything else say F you.
			p.sendMessage("You do not have permission to execute this command.");
		}
		return false;
	}

}
