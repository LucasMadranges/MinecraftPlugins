package DevMinecraft.sideBar

import org.bukkit.plugin.java.JavaPlugin

class SideBar : JavaPlugin() {
    private lateinit var sideBarItem: SideBarItem

    override fun onEnable() {
        sideBarItem = SideBarItem()
        server.pluginManager.registerEvents(sideBarItem, this)
    }
}
