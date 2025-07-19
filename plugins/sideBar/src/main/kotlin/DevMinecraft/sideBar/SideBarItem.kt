package DevMinecraft.sideBar

import net.kyori.adventure.text.Component
import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.scoreboard.Criteria
import org.bukkit.scoreboard.DisplaySlot

class SideBarItem : Listener {
    init {
        println("SideBarItem has been enabled!")
    }

    @EventHandler
    fun onPlayerJoin(event: PlayerJoinEvent) {
        val scoreboard = Bukkit.getScoreboardManager().newScoreboard
        val objective = scoreboard.registerNewObjective(
            "info",
            Criteria.DUMMY,
            Component.text("Server info")
        )
        objective.displaySlot = DisplaySlot.SIDEBAR

        objective.getScore("§a–".repeat(15)).score = 5
        objective.getScore("Server Name: " + "§c" + event.player.server.name).score = 4
        objective.getScore("").score = 3
        objective.getScore("Server IP: " + "§c" + event.player.server.ip).score = 2
        objective.getScore("").score = 1
        objective.getScore("Bon jeu !").score = 0

        event.player.scoreboard = scoreboard
    }
}