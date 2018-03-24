package me.dellta.helloworld;

import org.bukkit.plugin.java.JavaPlugin;

import me.dellta.helloworld.commands.HelloCommand;

public class main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		new HelloCommand(this);
	}
	
}
