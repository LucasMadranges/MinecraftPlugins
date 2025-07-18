package DevMinecraft.welcomeMessage

import net.kyori.adventure.text.Component
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

class RandomMessage : Listener {
    private var message: Array<String> = arrayOf(
        "« Tu as signé pour casser des blocs, pas des cœurs. »",
        "« Rappelle-toi : la lave, c’est pas une piscine. »",
        "« Un poulet t’observe… Il sait. »",
        "« Tu viens d’entrer. Ton inventaire ne survivra pas. »",
        "« Bienvenue, noble dompteur de cochons. »",
        "« Les moutons t’ont élu comme nouveau berger. »",
        "« Poisson pêché : joueur naïf. Bienvenue ! »",
        "« Essaie de ne pas tout faire exploser. Surtout toi. »",
        "« Ce n’est pas un hôtel ici. Trouve-toi un lit ! »",
        "« N’oublie pas : les creepers aiment les câlins. »",
        "« Astuce du jour : les fours ne sont pas des micro-ondes. »",
        "« Un squelette a parié 3 flèches que tu ne survivras pas à ta première nuit. »",
        "« Si tu entends \"Hhhsss\", cours. Pas de questions. »",
        "« Tu es chez toi ici. Enfin… jusqu’à ce que tu casses ma porte. »",
        "« Cat > Blocks > Chirp. On ne discute pas. »",
        "« Ta mission : survivre. Ton équipement : un bâton. Bonne chance. »",
        "« Aucun villageois n’a été maltraité… pour l’instant. »",
        "« Watermelon gang t’accueille à bras ouverts. »",
        "« Conseil : casser la glace ne fonctionne pas avec les zombies. »",
        "« Mode Hardcore émotionnel activé. Ne t’attache à rien. »",
    )

    @EventHandler
    fun onPlayerJoin(event: PlayerJoinEvent) {
        val player = event.player
        player.sendMessage(Component.text(message.random()))
    }
}