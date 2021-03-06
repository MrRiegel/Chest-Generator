package mrriegel.chegen;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {

	public static Configuration config;

	public static boolean debugOutput;

	public static void refreshConfig(File file) {
		config = new Configuration(file);
		config.load();

		debugOutput = config.get(Configuration.CATEGORY_GENERAL, "debugOutput", false).getBoolean();

		if (config.hasChanged()) {
			config.save();
		}
	}

}
