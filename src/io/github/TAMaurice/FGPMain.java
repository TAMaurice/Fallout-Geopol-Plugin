package io.github.TAMaurice;

// Imports:
import org.bukkit.plugin.java.JavaPlugin;
import io.github.TAMaurice.Events.onConsume;
import org.bukkit.ChatColor;


public class FGPMain extends JavaPlugin {
	// Activation
	public void onEnable() {
		System.out.println("Hello!");
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "\n\nTutorial has been Enabled\n\n");
		getServer().getPluginManager().registerEvents(new onConsume(), this);
	}
	 
	// Deactivation
	public void onDisable() {
		System.out.println("Bye Bye!");
		
	}
	
}
