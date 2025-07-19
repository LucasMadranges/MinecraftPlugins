package DevMinecraft.homeTeleport

import DevMinecraft.homeTeleport.Args.Help
import DevMinecraft.homeTeleport.Args.Sethome
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.command.TabCompleter
import org.bukkit.entity.Player

class HomeTeleportCommand : CommandExecutor, TabCompleter {
    override fun onCommand(
        sender: CommandSender,
        command: Command,
        label: String,
        args: Array<out String>
    ): Boolean {
        if (sender is Player && sender.isOp) {
            if (args.isEmpty()) {
                // /home
            } else when (args[0].lowercase()) {
                "help" -> {
                    Help(sender.player).sendHelp()
                }

                "sethome" -> {
                    Sethome(sender.player).setHome()
                }
            }

        } else {
            sender.sendMessage("§cCette commande ne peut être utilisée que par un opérateur.")
        }
        return true
    }

    override fun onTabComplete(
        sender: CommandSender,
        command: Command,
        alias: String,
        args: Array<out String>
    ): List<String> {
        if (args.size == 1) {
            return listOf("home", "sethome", "help")
        }
        return emptyList()
    }

}