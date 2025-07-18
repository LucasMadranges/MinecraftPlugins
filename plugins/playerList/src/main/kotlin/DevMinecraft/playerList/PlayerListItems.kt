package DevMinecraft.playerList

import net.kyori.adventure.text.Component
import org.bukkit.Server
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import kotlin.math.roundToInt

class PlayerListItems : Listener {
    init {
        println("PlayerList has been enabled!")
    }

    @EventHandler
    fun onPlayerJoin(event: PlayerJoinEvent) {
        var server: Server = event.player.server

        event.player.sendPlayerListHeaderAndFooter(
            Component.text(
                "§aBienvenue sur le serveur !\n" +
                        " \n" +
                        "§8${"-".repeat(25)}[§c${server.onlinePlayers.size}§8/§c${server.maxPlayers}§8]${"-".repeat(25)}\n" +
                        " \n"
            ),
            Component.text(
                " \n" +
                        "§8${"-".repeat(55)}" +
                        " \n" +
                        "§7TPS: §b${server.tps[0].roundToInt()} §8| §7Ping: §a1${event.player.ping}"
            )
        )
    }
}