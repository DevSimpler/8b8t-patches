package japlic.core.listeners;
import japlic.core.Main;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.block.ShulkerBox;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.BlockStateMeta;
import org.bukkit.inventory.meta.BookMeta;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BookBan implements Listener {

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onJoin(PlayerJoinEvent event) {
        try {
            Player player = event.getPlayer();
            PlayerInventory inv = player.getInventory();
            for (ItemStack item : inv.getContents()) {
                if (item != null && item.getItemMeta() instanceof BlockStateMeta blockStateMeta) {
                    if (blockStateMeta.getBlockState() instanceof ShulkerBox shulker) {
                        for (ItemStack shulkerItem : shulker.getInventory().getContents()) {
                            if (shulkerItem != null) {
                                if (shulkerItem.getType() == Material.WRITTEN_BOOK) {
                                    BookMeta book = (BookMeta) shulkerItem.getItemMeta();
                                    if (isBanBook(book)) {
                                        player.getWorld().dropItem(player.getLocation(), shulkerItem);
                                        shulker.getInventory().remove(shulkerItem);
                                    }
                                }
                            }
                        }
                        blockStateMeta.setBlockState(shulker);
                        item.setItemMeta(blockStateMeta);
                    }
                }
            }
        } catch (Error | Exception ignored) {

        }
    }

    private boolean isBanBook(BookMeta book) {
        for (Component bookPages : book.pages()) {
            Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
            Matcher matcher = pattern.matcher((CharSequence) bookPages);
            return matcher.find();
        }
        return false;
    }
}