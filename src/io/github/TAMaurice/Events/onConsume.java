package io.github.TAMaurice.Events;

// Imports
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;

// Class
public class onConsume implements Listener {

	@EventHandler
	public void onConsume(PlayerItemConsumeEvent e) {
		Player p = e.getPlayer();
	    ItemStack i = e.getItem();

	    if (i.getType().equals(Material.APPLE)) {
	    	p.sendMessage(ChatColor.GREEN + "You ate an Apple");
	    }
	    
	}
}
