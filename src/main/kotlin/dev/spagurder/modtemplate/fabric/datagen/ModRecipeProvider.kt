package dev.spagurder.modtemplate.fabric.datagen

//? fabric {
import dev.spagurder.modtemplate.ModTemplate
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.core.HolderLookup
import net.minecraft.core.registries.Registries
import net.minecraft.data.recipes.RecipeCategory
import net.minecraft.data.recipes.RecipeOutput
import net.minecraft.data.recipes.RecipeProvider
import net.minecraft.data.recipes.ShapelessRecipeBuilder
import net.minecraft.world.item.Items
import java.util.concurrent.CompletableFuture

class ModRecipeProvider(output: FabricDataOutput, registriesFuture: CompletableFuture<HolderLookup.Provider>) : FabricRecipeProvider(output, registriesFuture) {
    override fun createRecipeProvider(
        registryLookup: HolderLookup.Provider,
        exporter: RecipeOutput
    ): RecipeProvider {
        return object : RecipeProvider(registryLookup, exporter) {
            override fun buildRecipes() {
                val itemLookup = registryLookup.lookupOrThrow(Registries.ITEM)
                ShapelessRecipeBuilder
                    .shapeless(itemLookup, RecipeCategory.FOOD, Items.COOKED_CHICKEN)
                    .requires(Items.LAVA_BUCKET)
                    .requires(Items.CHICKEN)
                    .unlockedBy("has_lava_bucket", has(Items.LAVA_BUCKET))
                    .unlockedBy("has_chicken", has(Items.CHICKEN))
                    .save(exporter, "lava_chicken_recipe")
            }
        }
    }

    override fun getName(): String = "${ModTemplate.MOD_ID}_recipe_provider"

}
//?}