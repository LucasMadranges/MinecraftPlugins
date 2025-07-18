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
            Component.text("Ma Sidebar stylée")
        )
        objective.displaySlot = DisplaySlot.SIDEBAR

        // Très important : affecter le scoreboard créé au joueur !
        event.player.scoreboard = scoreboard
    }
}