package dev.morx.minetest;

import dev.morx.minetest.command.PermissionCommand;
import dev.morx.minetest.config.MinetestConfiguration;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class MinetestPlugin extends JavaPlugin {

    public static final Logger logger = Logger.getLogger("Minetest");
    @Getter
    private static MinetestPlugin instance;
    @Getter
    private String prefix;

    @Getter
    private MinetestConfiguration config;

    @Override
    public void onEnable() {

        getCommand("permission").setExecutor(new PermissionCommand());
        super.onEnable();
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
