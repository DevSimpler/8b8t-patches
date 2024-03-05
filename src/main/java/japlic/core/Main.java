package japlic.core;
import japlic.core.listeners.BowExploitPatchListener;
import japlic.core.listeners.BookBan;
import japlic.core.listeners.Witherlag;
import japlic.core.listeners.dispensor;
import japlic.core.listeners.JoinListener;
import org.bukkit.plugin.java.JavaPlugin;
public final class Main extends JavaPlugin {


    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new BowExploitPatchListener(), this);
        getServer().getPluginManager().registerEvents(new BookBan(), this);
        getServer().getPluginManager().registerEvents(new Witherlag(), this);
        getServer().getPluginManager().registerEvents(new dispensor(), this);
        getServer().getPluginManager().registerEvents(new JoinListener(), this);

        getLogger().info("8b8t-patches loaded");
getLogger().info("Patches loaded");
getLogger().info("ignore the errors");

    }

    @Override
    public void onDisable() {
        getLogger().info("8b8t-patches unloading");
        getLogger().info("8b8t-patches all listeners are now unloaded");
    }
}
