package dev.spagurder.modtemplate

//? fabric {
import java.util.ServiceLoader
import dev.spagurder.modtemplate.fabric.FabricPlatformImpl as PlatformImpl
//?}
//? neoforge {
/*import dev.spagurder.modtemplate.neoforge.NeoforgePlatformImpl as PlatformImpl
*///?}

interface Platform {

    fun isModLoaded(id: String): Boolean
    fun loader(): String

    companion object {
        val INSTANCE: Platform = PlatformImpl()
    }

}