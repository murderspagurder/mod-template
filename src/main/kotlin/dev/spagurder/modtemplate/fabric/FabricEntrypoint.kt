package dev.spagurder.modtemplate.fabric

//? fabric {
import dev.spagurder.modtemplate.ExampleEventHandler // sample_content
import dev.spagurder.modtemplate.ModTemplate
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents // sample_content
import net.minecraft.server.level.ServerPlayer // sample_content
import net.minecraft.world.entity.LivingEntity // sample_content

object FabricEntrypoint : ModInitializer {

    override fun onInitialize() {
        ModTemplate.init()
        // sample_content
        ServerLivingEntityEvents.AFTER_DAMAGE.register { entity: LivingEntity, source, baseDamage, damageTaken, blocked -> // sample_content
            if (entity is ServerPlayer && damageTaken > 0) { // sample_content
                ExampleEventHandler.onPlayerHurt(entity) // sample_content
            } // sample_content
        } // sample_content
    }

}
//?}