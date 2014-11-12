package com.PatrikWWDC.nanotech.handler;

import com.PatrikWWDC.nanotech.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import java.io.File;

public class ConfigurationHandler {

    public static Configuration configuration;

    public static void init(File configFile) {

        if(configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }

    }

    @SubscribeEvent
    public void configurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
            loadConfiguration();
        }
    }

    public static void loadConfiguration() {
        try {
            configuration.load();
        } catch (Exception e) {

        } finally {
            if (configuration.hasChanged()) {
                configuration.save();
            }
        }
    }
}
