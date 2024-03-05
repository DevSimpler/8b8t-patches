package japlic.core.listeners;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDispenseEvent;
import japlic.core.Main;
public class dispensor implements Listener {
    public dispensor() {
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void dispense (BlockDispenseEvent event) {
        if (event.getBlock().getY() > 254) {
            event.setCancelled(true);
        }
        if (event.getBlock().getY() < 2) {
            event.setCancelled(true);
        }
    }
}