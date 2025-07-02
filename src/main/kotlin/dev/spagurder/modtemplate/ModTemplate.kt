package dev.spagurder.modtemplate

import org.slf4j.Logger
import org.slf4j.LoggerFactory

object ModTemplate {

    const val MOD_ID = "modtemplate"
    val log: Logger = LoggerFactory.getLogger(MOD_ID)

    fun init() {
        // Logging / Platform "bridge" test // sample_content
        log.info("Initializing $MOD_ID on ${Platform.INSTANCE.loader()}")
        log.info("Fabric Language Kotlin " + // sample_content
                "${if (Platform.INSTANCE.isModLoaded("fabric-language-kotlin")) "IS" // sample_content
                else "is NOT"} loaded.") // sample_content
        log.info("Kotlin for Forge " + // sample_content
                "${if (Platform.INSTANCE.isModLoaded("kotlinforforge")) "IS" // sample_content
                else "is NOT"} loaded.") // sample_content
    }

}