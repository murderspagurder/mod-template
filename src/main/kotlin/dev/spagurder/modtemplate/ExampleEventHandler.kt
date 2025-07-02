package dev.spagurder.modtemplate

import net.minecraft.server.level.ServerPlayer

object ExampleEventHandler {

    fun onPlayerHurt(player: ServerPlayer) {
        // MinecraftServer.pvp is private... only here to test ATs/AWs
        if (player.server?.pvp == true) {
            ModTemplate.log.info("${player.displayName?.string} took damage. PVP is allowed.")
        } else {
            ModTemplate.log.info("${player.displayName?.string} took damage. PVP is disallowed.")
        }
    }

}