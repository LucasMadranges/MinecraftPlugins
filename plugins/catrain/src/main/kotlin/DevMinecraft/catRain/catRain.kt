package DevMinecraft.catRain

import org.bukkit.plugin.java.JavaPlugin

class catRain : JavaPlugin() {
    override fun onEnable() {
        getCommand("rtp")?.setExecutor(catRainCommand())
    }
}
