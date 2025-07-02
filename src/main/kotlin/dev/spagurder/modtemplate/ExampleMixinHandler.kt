package dev.spagurder.modtemplate

object ExampleMixinHandler {

    fun afterLoadLevel() {
        ModTemplate.log.info("Level Loaded!")
    }

}