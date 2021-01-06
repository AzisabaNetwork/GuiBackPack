package com.github.angelcometfish.guibackpackverrain;



import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public final class GuiBackPackverRain extends JavaPlugin {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        Player p = (Player) sender;
        p.sendMessage("§2GuiBackを開きます");
        rgui(p);
        return false;
    }


    @Override
    public void onEnable() {
        System.out.println("Guiプラグインが読み込まれました");
        // Plugin startup logic

    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


    public void rgui(Player p){
        Inventory inv = getServer().createInventory(null, 9, "§2GuiBack");
        ItemStack stone = new ItemStack(Material.STONE);
        ItemStack close = new ItemStack(Material.BARRIER);

        ItemMeta meta = close.getItemMeta();
        meta.setDisplayName("§4§l閉じる");
        List<String> lores = new ArrayList<String>();
        lores.add("§7クリックで閉じる");

        meta.setLore(lores);
        close.setItemMeta(meta);

        inv.setItem(0, stone);
        inv.setItem(1, stone);
        inv.setItem(2, stone);
        inv.setItem(3, stone);
        inv.setItem(4, stone);
        inv.setItem(5, stone);
        inv.setItem(6, stone);
        inv.setItem(7, stone);
        inv.setItem(8, close);
        p.openInventory(inv);
    }
}
