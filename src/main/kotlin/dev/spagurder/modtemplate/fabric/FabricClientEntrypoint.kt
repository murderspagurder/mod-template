package dev.spagurder.modtemplate.fabric

//? fabric {
import dev.spagurder.modtemplate.ModTemplate
import net.fabricmc.api.ClientModInitializer

object FabricClientEntrypoint : ClientModInitializer {

    override fun onInitializeClient() {
        ModTemplate.log.info("Initializing ${ModTemplate.MOD_ID} Client")
    }

}
//?}