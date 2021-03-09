package com.github.angelcometfish.guibackpackverrain;



import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

import static org.bukkit.Material.STONE;

public final class GuiBackPackverRain extends JavaPlugin implements Listener {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        Player p = (Player) sender;
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2CraftGuiを開きます"));
        rgui(p);
        return false;
    }


    @Override
    public void onEnable() {
        System.out.println("Guiプラグインが読み込まれました");
        Bukkit.getPluginManager().registerEvents(this,this);
        // Plugin startup logic

    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


    public void rgui(Player p){
        Inventory inv = Bukkit.createInventory(null, 18, "§2CraftGui");
        ItemStack stone = new ItemStack(STONE);
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
        assert list1meta1 != null;
        list1meta1.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&l採掘"));
        list1.setItemMeta(list1meta1);

        ItemMeta listmeta2= close.getItemMeta();
        listmeta2.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&l農業"));
        list2.setItemMeta(listmeta2);

        ItemMeta nonemeta= close.getItemMeta();
        nonemeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7空欄"));
        none.setItemMeta(nonemeta);

        ItemMeta meta = close.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&4&l閉じる"));
        List<String> lores = new ArrayList<>();
        lores.add(ChatColor.translateAlternateColorCodes('&', "&7クリックで閉じる"));

        meta.setLore(lores);
        close.setItemMeta(meta);

        inv.setItem(0, list1);
        inv.setItem(1, stone);
        inv.setItem(2, cobblestone);
        inv.setItem(3, coal);
        inv.setItem(4, redstone);
        inv.setItem(5, endstone);
        inv.setItem(6, nether);
        inv.setItem(9, list2);
        inv.setItem(10, wheat);
        inv.setItem(11, seed);
        inv.setItem(12, carrot);
        inv.setItem(13, potato);
        inv.setItem(17, close);

        p.openInventory(inv);
    }

    @EventHandler
    public void onClick(InventoryClickEvent e){
        Player player = (Player) e.getView().getPlayer();
        ItemStack slot = e.getCurrentItem();
        if (slot == null) return;
        if (e.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', "&2CraftGui"))){
            if (slot.getType() == STONE) {
                e.setCancelled(true);
                Inventory stoneinv= player.getInventory();
                if(stoneinv.contains(new ItemStack(Material.STONE, 64))) {
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6変換しました"));
                    for (int i = 0, size = stoneinv.getSize(); i < size; ++i) {
                        int stonecount = stoneinv.first(new ItemStack(Material.STONE, 64));
                        stoneinv.clear(stonecount);
                        stoneinv.addItem(new ItemStack(Material.BARRIER, 1));
                    }

                }else{
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6石を持ってないため変換できません"));
                }

            }else if(slot.getType() == Material.COBBLESTONE){
                e.setCancelled(true);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2丸石です"));
            }else if(slot.getType() == Material.COAL){
                e.setCancelled(true);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2石炭です"));
            }else if(slot.getType() == Material.REDSTONE) {
                e.setCancelled(true);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2赤石です"));
            }else if(slot.getType() == Material.END_STONE) {
                e.setCancelled(true);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2エンドストーンです"));
            }else if(slot.getType() == Material.NETHERRACK) {
                e.setCancelled(true);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2ネザーラックです"));
            }else if(slot.getType() == Material.WHEAT) {
                e.setCancelled(true);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2小麦です"));
            }else if(slot.getType() == Material.WHEAT_SEEDS) {
                e.setCancelled(true);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2種です"));
            }else if(slot.getType() == Material.POTATO) {
                e.setCancelled(true);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2ジャガイモです"));
            }else if(slot.getType() == Material.CARROT) {
                e.setCancelled(true);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2人参です"));
            }else if(slot.getType() == Material.BARRIER) {
                e.setCancelled(true);
                player.closeInventory();
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6GUIを閉じます"));
            }else{
                e.setCancelled(true);
            }
    }
}
}


