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
        Inventory inv = getServer().createInventory(null, 18, "§2GuiBack");
        ItemStack stone = new ItemStack(Material.STONE);
        ItemStack cobblestone = new ItemStack(Material.COBBLESTONE);
        ItemStack coal = new ItemStack(Material.COAL);
        ItemStack redstone = new ItemStack(Material.REDSTONE);
        ItemStack endstone = new ItemStack(Material.END_STONE);
        ItemStack nether = new ItemStack(Material.NETHERRACK);
        ItemStack none = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemStack close = new ItemStack(Material.BARRIER);
        ItemStack list1 = new ItemStack(Material.PAPER);
        ItemStack list2 = new ItemStack(Material.PAPER);
        ItemStack wheat = new ItemStack(Material.WHEAT);
        ItemStack seed = new ItemStack(Material.WHEAT_SEEDS);
        ItemStack carrot = new ItemStack(Material.CARROT);
        ItemStack potato = new ItemStack(Material.POTATO);

        ItemMeta list1meta1= close.getItemMeta();
        list1meta1.setDisplayName("§e§l採掘");
        list1.setItemMeta(list1meta1);

        ItemMeta listmeta2= close.getItemMeta();
        listmeta2.setDisplayName("§e§l農業");
        list2.setItemMeta(listmeta2);

        ItemMeta nonemeta= close.getItemMeta();
        nonemeta.setDisplayName("§7空欄");
        none.setItemMeta(nonemeta);

        ItemMeta meta = close.getItemMeta();
        meta.setDisplayName("§4§l閉じる");
        List<String> lores = new ArrayList<String>();
        lores.add("§7クリックで閉じる");

        meta.setLore(lores);
        close.setItemMeta(meta);

        inv.setItem(0, list1);
        inv.setItem(1, stone);
        inv.setItem(2, cobblestone);
        inv.setItem(3, coal);
        inv.setItem(4, redstone);
        inv.setItem(5, endstone);
        inv.setItem(6, nether);
        inv.setItem(7, none);
        inv.setItem(8, none);
        inv.setItem(9, list2);
        inv.setItem(10, wheat);
        inv.setItem(11, seed);
        inv.setItem(12, carrot);
        inv.setItem(13, potato);
        inv.setItem(14, none);
        inv.setItem(15, none);
        inv.setItem(16, none);
        inv.setItem(17, close);

        p.openInventory(inv);
    }
}
