package DevMinecraft.homeTeleport

import org.bukkit.plugin.java.JavaPlugin

class HomeTeleport : JavaPlugin() {

    override fun onEnable() {
        dbHelper(this).onStart()

        val homeCommand = HomeTeleportCommand()
        getCommand("home")?.setExecutor(homeCommand)
        getCommand("home")?.tabCompleter = homeCommand
    }
}
