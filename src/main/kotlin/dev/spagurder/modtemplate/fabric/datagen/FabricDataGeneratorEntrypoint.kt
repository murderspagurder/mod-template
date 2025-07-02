package dev.spagurder.modtemplate.fabric.datagen

//? fabric {
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput

object FabricDataGeneratorEntrypoint : DataGeneratorEntrypoint {

    override fun onInitializeDataGenerator(generator: FabricDataGenerator) {
        val pack: FabricDataGenerator.Pack = generator.createPack()
        pack.addProvider { output: FabricDataOutput -> // sample_content
            ModRecipeProvider(output, generator.registries) // sample_content
        } // sample_content
    }

}
//?}