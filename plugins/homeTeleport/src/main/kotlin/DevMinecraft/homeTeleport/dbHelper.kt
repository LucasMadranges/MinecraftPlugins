package DevMinecraft.homeTeleport

import org.bukkit.plugin.java.JavaPlugin
import java.io.File
import java.sql.Connection
import java.sql.DriverManager

class dbHelper(private val plugin: JavaPlugin) {
    lateinit var connection: Connection

    fun onStart() {
        val dbFile = File(plugin.dataFolder, "homes.db")
        plugin.logger.info("Chemin attendu pour la base SQLite : ${dbFile.absolutePath}")

        plugin.dataFolder.mkdirs()
        connection = DriverManager.getConnection("jdbc:sqlite:${dbFile.absolutePath}")

        val sql = """
            CREATE TABLE IF NOT EXISTS homes (
                uuid TEXT NOT NULL,
                name TEXT NOT NULL,
                world TEXT,
                x REAL,
                y REAL,
                z REAL,
                yaw REAL,
                pitch REAL,
                PRIMARY KEY(uuid, name)
            )
        """.trimIndent()
        connection.createStatement().use { it.execute(sql) }
        plugin.logger.info("Connexion SQLite prête !")
    }
}