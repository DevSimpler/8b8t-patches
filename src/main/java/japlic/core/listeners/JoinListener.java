package japlic.core.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;


public class JoinListener implements Listener{

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        e.setJoinMessage("§l§7[§a+§l§a§7]§3 " + p.getDisplayName());
       // Scoreboard board = Bukkit.getScoreboardManager().getNewScoreboard();
       /// @SuppressWarnings("deprecation")
       // Objective objective = board.registerNewObjective("abcd", "abcd");
       // objective.setDisplaySlot(DisplaySlot.SIDEBAR);
       // objective.setDisplayName("§18b8t.me");
      //  objective.getScore("§l§9=-=-=-=-=-=-=-=-=-=-=").setScore(10);
      //  objective.getScore(" ").setScore(9);
      //  objective.getScore("§aHello §6§l" + p.getDisplayName() + "§a!").setScore(8);
      //  objective.getScore(" ").setScore(7);
       // objective.getScore("§7players Online: §9§l" + Bukkit.getOnlinePlayers().size() + "§9§l/" + Bukkit.getMaxPlayers()).setScore(6);
       // objective.getScore("§7§lDiscord: disc.gg/8b8t").setScore(5);
       // objective.getScore(" ").setScore(4);
       // objective.getScore("§1§l/help to see commands").setScore(3);
        //objective.getScore("§1§lHave a fun time!").setScore(2);
        //objective.getScore("§l§9=-=-=-=-=-=-=-=-=-=-=").setScore(1);
       // p.setScoreboard(board);


    }
}





