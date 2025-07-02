package dev.spagurder.modtemplate.fabric

//? fabric {
import dev.spagurder.modtemplate.Platform
import net.fabricmc.loader.api.FabricLoader

class FabricPlatformImpl : Platform {

    override fun isModLoaded(id: String): Boolean = FabricLoader.getInstance().isModLoaded(id)
    override fun loader(): String = "fabric"

}
//?}