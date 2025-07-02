package dev.spagurder.modtemplate.neoforge

//? neoforge {
/*import dev.spagurder.modtemplate.ExampleEventHandler // sample_content
import dev.spagurder.modtemplate.ModTemplate
import net.minecraft.server.level.ServerPlayer // sample_content
import net.neoforged.api.distmarker.Dist
import net.neoforged.bus.api.SubscribeEvent // sample_content
import net.neoforged.fml.common.EventBusSubscriber // sample_content
import net.neoforged.fml.common.Mod
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent
import net.neoforged.neoforge.event.entity.living.LivingDamageEvent // sample_content
import thedarkcolour.kotlinforforge.neoforge.forge.MOD_BUS
import thedarkcolour.kotlinforforge.neoforge.forge.runWhenOn

@Mod(ModTemplate.MOD_ID)
@EventBusSubscriber // sample_content
object NeoforgeEntrypoint {

    init {
        ModTemplate.init()
        runWhenOn(Dist.CLIENT) {
            MOD_BUS.addListener(::onClientSetup)
        }
    }

    private fun onClientSetup(event: FMLClientSetupEvent) {
        ModTemplate.log.info("Initializing ${ModTemplate.MOD_ID} Client")
    }

    @SubscribeEvent // sample_content
    fun onPlayerDamage(event: LivingDamageEvent.Post) { // sample_content
        if (event.entity is ServerPlayer && event.newDamage > 0) { // sample_content
            ExampleEventHandler.onPlayerHurt(event.entity as ServerPlayer) // sample_content
        } // sample_content
    } // sample_content
    // sample_content
}
*///?}