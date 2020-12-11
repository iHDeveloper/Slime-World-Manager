package me.ihdeveloper.swm.test;

import com.grinderwolf.swm.api.SlimePlugin;
import com.grinderwolf.swm.api.exceptions.CorruptedWorldException;
import com.grinderwolf.swm.api.exceptions.NewerFormatException;
import com.grinderwolf.swm.api.exceptions.UnknownWorldException;
import com.grinderwolf.swm.api.exceptions.WorldInUseException;
import com.grinderwolf.swm.api.world.SlimeWorld;
import com.grinderwolf.swm.api.world.properties.SlimePropertyMap;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        SlimePlugin slimePlugin = getSlimePlugin();

        getServer().getConsoleSender().sendMessage("§3Slime World Manager §6Test §eis loading the world");
        try {
            SlimeWorld world = slimePlugin.hd().loadWorld(slimePlugin.getLoader("file"), "test_world", "test_world2", true, new SlimePropertyMap());

            getServer().getConsoleSender().sendMessage("§3Slime World Manager §6Test §eis generating the world");
            slimePlugin.generateWorld(world);

            getServer().getConsoleSender().sendMessage("§3Slime World Manager §6Test§a is successfully done!");
        } catch (UnknownWorldException | IOException | CorruptedWorldException | NewerFormatException | WorldInUseException e) {
            getServer().getConsoleSender().sendMessage("§3Slime World Manager §6Test§c failed!&e with the reason: &f" + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public void onDisable() {
    }

    private SlimePlugin getSlimePlugin() {
        return (SlimePlugin) getServer().getPluginManager().getPlugin("SlimeWorldManager-HDFork");
    }
}
