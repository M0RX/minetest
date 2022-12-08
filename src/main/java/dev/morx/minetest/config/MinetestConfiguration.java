package dev.morx.minetest.config;

import dev.morx.minetest.MinetestPlugin;

import java.io.*;
import java.nio.file.Files;
import java.util.logging.Level;

public class MinetestConfiguration {

    private final MinetestPlugin instance;
    private String prefix;
    private String jdbcConnect;
    private String language;

    public MinetestConfiguration(MinetestPlugin instance) {
        this.instance = instance;
        prefix = "§aMinetest -> §e";
        jdbcConnect = "";
        language = "english";
    }

    public void load() {
        if (!instance.getDataFolder().exists()) {
            instance.getDataFolder().mkdirs();
        }

        File yamlConfig = new File(instance.getDataFolder(), "config.yml");
        if (!yamlConfig.exists()) {
            try {
                InputStream in = instance.getResource("config.yml");
                OutputStream out = Files.newOutputStream(yamlConfig.toPath());

                // Transfer bytes from in to out
                byte[] buf = new byte[1024];
                int len;
                while ((len = in.read(buf)) > 0) {
                    out.write(buf, 0, len);
                }
                out.close();
                in.close();

            } catch (IOException e) {
                MinetestPlugin.logger.log(Level.WARNING, "Could not create default config.yml");
            }
        }
    }
}
