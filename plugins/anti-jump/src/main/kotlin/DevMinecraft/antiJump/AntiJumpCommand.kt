package DevMinecraft.antiJump

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class AntiJumpCommand(private val plugin: AntiJump) : CommandExecutor {
    override fun onCommand(
        sender: CommandSender,
        command: Command,
        label: String,
        args: Array<out String>
    ): Boolean {
        if (sender is Player && sender.isOp) {
            if (plugin.isAntiJumpEnabled) {
                plugin.isAntiJumpEnabled = false
                sender.sendMessage("§aAnti-jump désactivé.")
            } else {
                plugin.isAntiJumpEnabled = true
                sender.sendMessage("§aAnti-jump activé.")
            }
            return true
        } else {
            sender.sendMessage("§cCette commande ne peut être utilisée que par un opérateur.")
            return true
        }
    }
}