package DevMinecraft.homeTeleport.Args

import org.bukkit.entity.Player

class Sethome(private val player: Player?) {
    fun setHome() {
        player?.location
    }
}