package com.github.angelcometfish.guibackpackverrain;


import org.bukkit.*;
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
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2CraftGuiを開きました"));
        rgui(p);
        return false;
    }


    @Override
    public void onEnable() {
        System.out.println("Guiプラグインが読み込まれました");
        Bukkit.getPluginManager().registerEvents(this, this);
        // Plugin startup logic

    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


    public void rgui(Player p) {
        Inventory inv = Bukkit.createInventory(null, 54, "§2CraftGui");
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
        ItemStack list3 = new ItemStack(Material.PAPER);
        ItemStack list4 = new ItemStack(Material.PAPER);
        ItemStack list5 = new ItemStack(Material.PAPER);
        ItemStack list6 = new ItemStack(Material.PAPER);
        ItemStack wheat = new ItemStack(Material.WHEAT);
        ItemStack seed = new ItemStack(Material.WHEAT_SEEDS);
        ItemStack carrot = new ItemStack(Material.CARROT);
        ItemStack potato = new ItemStack(Material.POTATO);
        ItemStack peal = new ItemStack(Material.ENDER_PEARL);
        ItemStack zombief = new ItemStack(Material.ROTTEN_FLESH);
        ItemStack born = new ItemStack(Material.BONE);
        ItemStack gunpowder = new ItemStack(Material.GUNPOWDER);
        ItemStack spiderito = new ItemStack(Material.STRING);
        ItemStack oak = new ItemStack(Material.OAK_LOG);
        ItemStack spruce = new ItemStack(Material.SPRUCE_LOG);
        ItemStack birch = new ItemStack(Material.BIRCH_LOG);
        ItemStack jungle = new ItemStack(Material.JUNGLE_LOG);
        ItemStack acacia = new ItemStack(Material.ACACIA_LOG);
        ItemStack dark = new ItemStack(Material.DARK_OAK_LOG);
        ItemStack lapis = new ItemStack(Material.LAPIS_LAZULI);
        ItemStack iron = new ItemStack(Material.IRON_INGOT);
        ItemStack gold = new ItemStack(Material.GOLD_INGOT);
        ItemStack diamond = new ItemStack(Material.DIAMOND);
        ItemStack emerald = new ItemStack(Material.EMERALD);
        ItemStack coalB = new ItemStack(Material.COAL_BLOCK);
        ItemStack redstoneB = new ItemStack(Material.REDSTONE_BLOCK);
        ItemStack lapisB = new ItemStack(Material.LAPIS_BLOCK);
        ItemStack ironB = new ItemStack(Material.IRON_BLOCK);
        ItemStack goldB = new ItemStack(Material.GOLD_BLOCK);
        ItemStack diamondB = new ItemStack(Material.DIAMOND_BLOCK);


        ItemMeta list1meta1 = close.getItemMeta();
        assert list1meta1 != null;
        list1meta1.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&l採掘"));
        list1.setItemMeta(list1meta1);

        ItemMeta listmeta2 = close.getItemMeta();
        listmeta2.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&l農業"));
        list2.setItemMeta(listmeta2);

        ItemMeta listmeta3 = close.getItemMeta();
        listmeta3.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&l素材"));
        list3.setItemMeta(listmeta3);

        ItemMeta listmeta4 = close.getItemMeta();
        listmeta4.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&l原木"));
        list4.setItemMeta(listmeta4);

        ItemMeta listmeta5 = close.getItemMeta();
        listmeta5.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&l鉱石、インゴット"));
        list5.setItemMeta(listmeta5);

        ItemMeta listmeta6 = close.getItemMeta();
        listmeta6.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&l鉱石ブロック"));
        list6.setItemMeta(listmeta6);

        ItemMeta nonemeta = close.getItemMeta();
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
        inv.setItem(5, endstone);
        inv.setItem(6, nether);
        inv.setItem(9, list2);
        inv.setItem(10, wheat);
        inv.setItem(11, seed);
        inv.setItem(12, carrot);
        inv.setItem(13, potato);
        inv.setItem(18, list3);
        inv.setItem(19, peal);
        inv.setItem(20, zombief);
        inv.setItem(21, born);
        inv.setItem(22, gunpowder);
        inv.setItem(23, spiderito);
        inv.setItem(27, list4);
        inv.setItem(28, oak);
        inv.setItem(29, spruce);
        inv.setItem(30, birch);
        inv.setItem(31, jungle);
        inv.setItem(32, acacia);
        inv.setItem(33, dark);
        inv.setItem(36, list5);
        inv.setItem(37, coal);
        inv.setItem(38, redstone);
        inv.setItem(39, lapis);
        inv.setItem(40, iron);
        inv.setItem(41, gold);
        inv.setItem(42, diamond);
        inv.setItem(43, emerald);
        inv.setItem(45, list6);
        inv.setItem(46, coalB);
        inv.setItem(47, redstoneB);
        inv.setItem(48, lapisB);
        inv.setItem(49, ironB);
        inv.setItem(50, goldB);
        inv.setItem(51, diamondB);
        inv.setItem(53, close);

        p.openInventory(inv);
    }

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        Player player = (Player) e.getView().getPlayer();
        ItemStack slot = e.getCurrentItem();
        if (slot == null) return;
        if (e.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', "&2CraftGui"))) {
            //   cancel event
            e.setCancelled(true);
            //  player inventory
            Inventory inv = player.getInventory();
            //  player location
            Location loc = player.getLocation();

            if (slot.getType() == STONE) {
                if (inv.contains(new ItemStack(Material.STONE, 64))) {
                    player.playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6変換しました"));
                    int count = inv.first(new ItemStack(Material.STONE, 64));
                    while (count > -1) {
                        inv.clear(count);
                        getServer().dispatchCommand(getServer().getConsoleSender(), "mlg " + player.getName() + " assyukustone 1 1");
                        count = inv.first(new ItemStack(Material.STONE, 64));
                    }

                } else {
                    player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6石を持っていません"));
                }

            } else if (slot.getType() == Material.COBBLESTONE) {
                if (inv.contains(new ItemStack(Material.COBBLESTONE, 64))) {
                    player.playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6変換しました"));
                    int count = inv.first(new ItemStack(Material.COBBLESTONE, 64));
                    while (count > -1) {
                        inv.clear(count);
                        getServer().dispatchCommand(getServer().getConsoleSender(), "mlg " + player.getName() + " isi_ticket 1 1");
                        count = inv.first(new ItemStack(Material.COBBLESTONE, 64));
                    }

                } else {
                    player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6丸石を持っていません"));
                }
            } else if (slot.getType() == Material.COAL) {
                if (inv.contains(new ItemStack(Material.COAL, 64))) {
                    if (inv.firstEmpty() == -1) {
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6空きがないので変換できません"));
                        player.closeInventory();
                        return;
                    }
                    player.playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6変換しました"));
                    int count = inv.first(new ItemStack(Material.COAL, 64));
                    while (count > -1) {
                        inv.clear(count);
                        inv.addItem(new ItemStack(Material.COAL_BLOCK, 7));
                        inv.addItem(new ItemStack(Material.COAL, 1));
                        count = inv.first(new ItemStack(Material.COAL, 64));
                    }

                } else {
                    player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6石炭を持っていません"));
                }
            } else if (slot.getType() == Material.REDSTONE) {
                if (inv.contains(new ItemStack(Material.REDSTONE, 64))) {
                    if (inv.firstEmpty() == -1) {
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6空きがないので変換できません"));
                        player.closeInventory();
                        return;
                    }
                    player.playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6変換しました"));
                    int count = inv.first(new ItemStack(Material.REDSTONE, 64));
                    while (count > -1) {
                        inv.clear(count);
                        inv.addItem(new ItemStack(Material.REDSTONE_BLOCK, 7));
                        inv.addItem(new ItemStack(Material.REDSTONE, 1));
                        count = inv.first(new ItemStack(Material.REDSTONE, 64));
                    }

                } else {
                    player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6赤石を持っていません"));
                }
            } else if (slot.getType() == Material.END_STONE) {
                if (inv.contains(new ItemStack(Material.END_STONE, 64))) {
                    player.playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6変換しました"));
                    int count = inv.first(new ItemStack(Material.END_STONE, 64));
                    while (count > -1) {
                        inv.clear(count);
                        getServer().dispatchCommand(getServer().getConsoleSender(), "mlg " + player.getName() + " assyukuend 1 1");
                        count = inv.first(new ItemStack(Material.END_STONE, 64));
                    }

                } else {
                    player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6エンドストーンを持っていません"));
                }
            } else if (slot.getType() == Material.NETHERRACK) {
                if (inv.contains(new ItemStack(Material.NETHERRACK, 64))) {
                    player.playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6変換しました"));
                    int count = inv.first(new ItemStack(Material.NETHERRACK, 64));
                    while (count > -1) {
                        inv.clear(count);
                        getServer().dispatchCommand(getServer().getConsoleSender(), "mlg " + player.getName() + " assyukunether 1 1");
                        count = inv.first(new ItemStack(Material.NETHERRACK, 64));
                    }

                } else {
                    player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6ネザーラックを持っていません"));
                }
            } else if (slot.getType() == Material.WHEAT) {
                if (inv.contains(new ItemStack(Material.WHEAT, 64))) {
                    player.playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6変換しました"));
                    int count = inv.first(new ItemStack(Material.WHEAT, 64));
                    while (count > -1) {
                        inv.clear(count);
                        getServer().dispatchCommand(getServer().getConsoleSender(), "mlg " + player.getName() + " assyukuwheat 1 1");
                        count = inv.first(new ItemStack(Material.WHEAT, 64));
                    }

                } else {
                    player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6小麦を持っていません"));
                }
            } else if (slot.getType() == Material.WHEAT_SEEDS) {
                if (inv.contains(new ItemStack(Material.WHEAT_SEEDS, 64))) {
                    player.playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6変換しました"));
                    int count = inv.first(new ItemStack(Material.WHEAT_SEEDS, 64));
                    while (count > -1) {
                        inv.clear(count);
                        getServer().dispatchCommand(getServer().getConsoleSender(), "mlg " + player.getName() + " komugi_ticket 1 1");
                        count = inv.first(new ItemStack(Material.WHEAT_SEEDS, 64));
                    }

                } else {
                    player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6小麦の種を持っていません"));
                }
            } else if (slot.getType() == Material.POTATO) {
                if (inv.contains(new ItemStack(Material.POTATO, 64))) {
                    player.playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6変換しました"));
                    int count = inv.first(new ItemStack(Material.POTATO, 64));
                    while (count > -1) {
                        inv.clear(count);
                        getServer().dispatchCommand(getServer().getConsoleSender(), "mlg " + player.getName() + " assyukupotato 1 1");
                        count = inv.first(new ItemStack(Material.POTATO, 64));
                    }

                } else {
                    player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6ジャガイモを持っていません"));
                }
            } else if (slot.getType() == Material.CARROT) {
                if (inv.contains(new ItemStack(Material.CARROT, 64))) {
                    player.playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6変換しました"));
                    int count = inv.first(new ItemStack(Material.CARROT, 64));
                    while (count > -1) {
                        inv.clear(count);
                        getServer().dispatchCommand(getServer().getConsoleSender(), "mlg " + player.getName() + " assyukucarrot 1 1");
                        count = inv.first(new ItemStack(Material.CARROT, 64));
                    }

                } else {
                    player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6人参を持っていません"));
                }
            } else if (slot.getType() == Material.BARRIER) {
                //  close inventory
                player.closeInventory();
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6GUIを閉じます"));
            } else if (slot.getType() == Material.ENDER_PEARL) {
                if (inv.contains(new ItemStack(Material.ENDER_PEARL, 16))) {
                    Inventory enderinv = Bukkit.createInventory(null, 54, "§2enderinvmk1");
                    int count = inv.first(new ItemStack(Material.ENDER_PEARL, 16));
                    while (count > -1) {
                        inv.clear(count);
                        enderinv.addItem(new ItemStack(Material.ENDER_PEARL, 16));
                        count = inv.first(new ItemStack(Material.ENDER_PEARL, 16));
                    }

                    int enderPearlCount = 0;
                    for (int i = 0, size = enderinv.getSize(); i < size; ++i) {
                        ItemStack item = enderinv.getItem(i);
                        // アイテムが無いか、エンダーパールではない場合continue
                        if (item == null || item.getType() != Material.ENDER_PEARL) {
                            continue;
                        }

                        enderPearlCount = enderPearlCount + item.getAmount(); // enderPearlCount += item.getAmount(); でも可
                    }


                    int addItemAmount = enderPearlCount / 32;
                    int amari = enderPearlCount % 32;

                    if (addItemAmount != 0) {
                        player.playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 2, 1);
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6変換しました"));
                        getServer().dispatchCommand(getServer().getConsoleSender(), "mm i give " + player.getName() + " pearl1 " + addItemAmount);
                    } else {
                        player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6エンダーパールが足りません"));
                    }
                    inv.addItem(new ItemStack(Material.ENDER_PEARL, amari));

                } else {
                    player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6エンパを持っていません"));
                }
            } else if (slot.getType() == Material.ROTTEN_FLESH) {
                if (inv.contains(new ItemStack(Material.ROTTEN_FLESH, 64))) {
                    player.playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6変換しました"));
                    int count = inv.first(new ItemStack(Material.ROTTEN_FLESH, 64));
                    while (count > -1) {
                        inv.clear(count);
                        getServer().dispatchCommand(getServer().getConsoleSender(), "mlg " + player.getName() + " rotten_flesh 1 1");
                        count = inv.first(new ItemStack(Material.ROTTEN_FLESH, 64));
                    }

                } else {
                    player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6ゾンビ肉を持っていません"));
                }
            } else if (slot.getType() == Material.GUNPOWDER) {
                if (inv.contains(new ItemStack(Material.GUNPOWDER, 64))) {
                    player.playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6変換しました"));
                    int count = inv.first(new ItemStack(Material.GUNPOWDER, 64));
                    while (count > -1) {
                        inv.clear(count);
                        getServer().dispatchCommand(getServer().getConsoleSender(), "mlg " + player.getName() + " gunpowder 1 1");
                        count = inv.first(new ItemStack(Material.GUNPOWDER, 64));
                    }

                } else {
                    player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6火薬を持っていません"));
                }
            } else if (slot.getType() == Material.STRING) {
                if (inv.contains(new ItemStack(Material.STRING, 64))) {
                    player.playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6変換しました"));
                    int count = inv.first(new ItemStack(Material.STRING, 64));
                    while (count > -1) {
                        inv.clear(count);
                        getServer().dispatchCommand(getServer().getConsoleSender(), "mlg " + player.getName() + " cobweb_dust 1 1");
                        count = inv.first(new ItemStack(Material.STRING, 64));
                    }

                } else {
                    player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6蜘蛛の糸を持っていません"));
                }
            } else if (slot.getType() == Material.BONE) {
                if (inv.contains(new ItemStack(Material.BONE, 64))) {
                    player.playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6変換しました"));
                    int count = inv.first(new ItemStack(Material.BONE, 64));
                    while (count > -1) {
                        inv.clear(count);
                        getServer().dispatchCommand(getServer().getConsoleSender(), "mlg " + player.getName() + " bone_break 1 1");
                        count = inv.first(new ItemStack(Material.BONE, 64));
                    }

                } else {
                    player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6骨を持っていません"));
                }
            } else if (slot.getType() == Material.OAK_LOG) {
                if (inv.contains(new ItemStack(Material.OAK_LOG, 64))) {
                    player.playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6変換しました"));
                    int count = inv.first(new ItemStack(Material.OAK_LOG, 64));
                    while (count > -1) {
                        inv.clear(count);
                        getServer().dispatchCommand(getServer().getConsoleSender(), "mlg " + player.getName() + " compressed_oak 1 1");
                        count = inv.first(new ItemStack(Material.OAK_LOG, 64));
                    }

                } else {
                    player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6オークの原木を持っていません"));
                }
            } else if (slot.getType() == Material.SPRUCE_LOG) {
                if (inv.contains(new ItemStack(Material.SPRUCE_LOG, 64))) {
                    player.playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6変換しました"));
                    int count = inv.first(new ItemStack(Material.SPRUCE_LOG, 64));
                    while (count > -1) {
                        inv.clear(count);
                        getServer().dispatchCommand(getServer().getConsoleSender(), "mlg " + player.getName() + " assyukuspruce 1 1");
                        count = inv.first(new ItemStack(Material.SPRUCE_LOG, 64));
                    }

                } else {
                    player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6マツの原木を持っていません"));
                }
            } else if (slot.getType() == Material.BIRCH_LOG) {
                if (inv.contains(new ItemStack(Material.BIRCH_LOG, 64))) {
                    player.playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6変換しました"));
                    int count = inv.first(new ItemStack(Material.BIRCH_LOG, 64));
                    while (count > -1) {
                        inv.clear(count);
                        getServer().dispatchCommand(getServer().getConsoleSender(), "mlg " + player.getName() + " compressed_birch 1 1");
                        count = inv.first(new ItemStack(Material.BIRCH_LOG, 64));
                    }

                } else {
                    player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6白樺の原木を持っていません"));
                }
            } else if (slot.getType() == Material.JUNGLE_LOG) {
                if (inv.contains(new ItemStack(Material.JUNGLE_LOG, 64))) {
                    player.playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6変換しました"));
                    int count = inv.first(new ItemStack(Material.JUNGLE_LOG, 64));
                    while (count > -1) {
                        inv.clear(count);
                        getServer().dispatchCommand(getServer().getConsoleSender(), "mlg " + player.getName() + " compressed_jungl 1 1");
                        count = inv.first(new ItemStack(Material.JUNGLE_LOG, 64));
                    }

                } else {
                    player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6ジャングルの原木を持っていません"));
                }
            } else if (slot.getType() == Material.ACACIA_LOG) {
                if (inv.contains(new ItemStack(Material.ACACIA_LOG, 64))) {
                    player.playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6変換しました"));
                    int count = inv.first(new ItemStack(Material.ACACIA_LOG, 64));
                    while (count > -1) {
                        inv.clear(count);
                        getServer().dispatchCommand(getServer().getConsoleSender(), "mlg " + player.getName() + " compressed_acacia 1 1");
                        count = inv.first(new ItemStack(Material.ACACIA_LOG, 64));
                    }

                } else {
                    player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6アカシアの原木を持っていません"));
                }
            } else if (slot.getType() == Material.DARK_OAK_LOG) {
                if (inv.contains(new ItemStack(Material.DARK_OAK_LOG, 64))) {
                    player.playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6変換しました"));
                    int count = inv.first(new ItemStack(Material.DARK_OAK_LOG, 64));
                    while (count > -1) {
                        inv.clear(count);
                        getServer().dispatchCommand(getServer().getConsoleSender(), "mlg " + player.getName() + " compressed_dark 1 1");
                        count = inv.first(new ItemStack(Material.DARK_OAK_LOG, 64));
                    }

                } else {
                    player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6ダークオークの原木を持っていません"));
                }
            } else if (slot.getType() == Material.LAPIS_LAZULI) {
                if (inv.contains(new ItemStack(Material.LAPIS_LAZULI, 64))) {
                    if (inv.firstEmpty() == -1) {
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6空きがないので変換できません"));
                        player.closeInventory();
                        return;
                    }
                    player.playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6変換しました"));
                    int count = inv.first(new ItemStack(Material.LAPIS_LAZULI, 64));
                    while (count > -1) {
                        inv.clear(count);
                        inv.addItem(new ItemStack(Material.LAPIS_BLOCK, 7));
                        inv.addItem(new ItemStack(Material.LAPIS_LAZULI, 1));
                        count = inv.first(new ItemStack(Material.LAPIS_LAZULI, 64));
                    }
                } else {
                    player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6ラピスラズリを持っていません"));
                }
            } else if (slot.getType() == Material.IRON_INGOT) {
                if (inv.contains(new ItemStack(Material.IRON_INGOT, 64))) {
                    if (inv.firstEmpty() == -1) {
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6空きがないので変換できません"));
                        player.closeInventory();
                        return;
                    }
                    player.playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6変換しました"));
                    int count = inv.first(new ItemStack(Material.IRON_INGOT, 64));
                    while (count > -1) {
                        inv.clear(count);
                        inv.addItem(new ItemStack(Material.IRON_BLOCK, 7));
                        inv.addItem(new ItemStack(Material.IRON_INGOT, 1));
                        count = inv.first(new ItemStack(Material.IRON_INGOT, 64));
                    }
                } else {
                    player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6鉄インゴットを持っていません"));
                }
            } else if (slot.getType() == Material.GOLD_INGOT) {
                if (inv.contains(new ItemStack(Material.GOLD_INGOT, 64))) {
                    if (inv.firstEmpty() == -1) {
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6空きがないので変換できません"));
                        player.closeInventory();
                        return;
                    }
                    player.playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6変換しました"));
                    int count = inv.first(new ItemStack(Material.GOLD_INGOT, 64));
                    while (count > -1) {
                        inv.clear(count);
                        inv.addItem(new ItemStack(Material.GOLD_BLOCK, 7));
                        inv.addItem(new ItemStack(Material.GOLD_INGOT, 1));
                        count = inv.first(new ItemStack(Material.GOLD_INGOT, 64));
                    }
                } else {
                    player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6金インゴットを持っていません"));
                }
            } else if (slot.getType() == Material.DIAMOND) {
                if (inv.contains(new ItemStack(Material.DIAMOND, 64))) {
                    if (inv.firstEmpty() == -1) {
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6空きがないので変換できません"));
                        player.closeInventory();
                        return;
                    }
                    player.playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6変換しました"));
                    int count = inv.first(new ItemStack(Material.DIAMOND, 64));
                    while (count > -1) {
                        inv.clear(count);
                        inv.addItem(new ItemStack(Material.DIAMOND_BLOCK, 7));
                        inv.addItem(new ItemStack(Material.DIAMOND, 1));
                        count = inv.first(new ItemStack(Material.DIAMOND, 64));
                    }
                } else {
                    player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6ダイヤモンドを持っていません"));
                }
            } else if (slot.getType() == Material.EMERALD) {
                if (inv.contains(new ItemStack(Material.EMERALD, 64))) {
                    if (inv.firstEmpty() == -1) {
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6空きがないので変換できません"));
                        player.closeInventory();
                        return;
                    }
                    player.playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6変換しました"));
                    int count = inv.first(new ItemStack(Material.EMERALD, 64));
                    while (count > -1) {
                        inv.clear(count);
                        inv.addItem(new ItemStack(Material.EMERALD_BLOCK, 7));
                        inv.addItem(new ItemStack(Material.EMERALD, 1));
                        count = inv.first(new ItemStack(Material.EMERALD, 64));
                    }
                } else {
                    player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6エメラルドを持っていません"));
                }
            } else if (slot.getType() == Material.COAL_BLOCK) {
                if (inv.contains(new ItemStack(Material.COAL_BLOCK, 64))) {
                    if (inv.firstEmpty() == -1) {
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6空きがないので変換できません"));
                        player.closeInventory();
                        return;
                    }
                    player.playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6変換しました"));
                    int count = inv.first(new ItemStack(Material.COAL_BLOCK, 64));
                    while (count > -1) {
                        inv.clear(count);
                        getServer().dispatchCommand(getServer().getConsoleSender(), "mlg " + player.getName() + " Compressed_coal_block 7 1");
                        inv.addItem(new ItemStack(Material.COAL_BLOCK, 1));
                        count = inv.first(new ItemStack(Material.COAL_BLOCK, 64));
                    }
                } else {
                    player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6石炭ブロックを持っていません"));
                }
            } else if (slot.getType() == Material.REDSTONE_BLOCK) {
                if (inv.contains(new ItemStack(Material.REDSTONE_BLOCK, 64))) {
                    if (inv.firstEmpty() == -1) {
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6空きがないので変換できません"));
                        player.closeInventory();
                        return;
                    }
                    player.playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6変換しました"));
                    int count = inv.first(new ItemStack(Material.REDSTONE_BLOCK, 64));
                    while (count > -1) {
                        inv.clear(count);
                        getServer().dispatchCommand(getServer().getConsoleSender(), "mlg " + player.getName() + " Compressed_redstone_block 7 1");
                        inv.addItem(new ItemStack(Material.REDSTONE_BLOCK, 1));
                        count = inv.first(new ItemStack(Material.REDSTONE_BLOCK, 64));
                    }

                } else {
                    player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6赤石ブロックを持っていません"));
                }
            } else if (slot.getType() == Material.LAPIS_BLOCK) {
                if (inv.contains(new ItemStack(Material.LAPIS_BLOCK, 64))) {
                    if (inv.firstEmpty() == -1) {
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6空きがないので変換できません"));
                        player.closeInventory();
                        return;
                    }
                    player.playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6変換しました"));
                    int count = inv.first(new ItemStack(Material.LAPIS_BLOCK, 64));
                    while (count > -1) {
                        inv.clear(count);
                        getServer().dispatchCommand(getServer().getConsoleSender(), "mlg " + player.getName() + " compressed_lapis_block 7 1");
                        inv.addItem(new ItemStack(Material.LAPIS_BLOCK, 1));
                        count = inv.first(new ItemStack(Material.LAPIS_BLOCK, 64));
                    }

                } else {
                    player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6ラピスラズリブロックを持っていません"));
                }
            } else if (slot.getType() == Material.IRON_BLOCK) {
                if (inv.contains(new ItemStack(Material.IRON_BLOCK, 64))) {
                    if (inv.firstEmpty() == -1) {
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6空きがないので変換できません"));
                        player.closeInventory();
                        return;
                    }
                    player.playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6変換しました"));
                    int count = inv.first(new ItemStack(Material.IRON_BLOCK, 64));
                    while (count > -1) {
                        inv.clear(count);
                        getServer().dispatchCommand(getServer().getConsoleSender(), "mlg " + player.getName() + " Compressed_iron_block 7 1");
                        inv.addItem(new ItemStack(Material.IRON_BLOCK, 1));
                        count = inv.first(new ItemStack(Material.IRON_BLOCK, 64));
                    }

                } else {
                    player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6鉄ブロックを持っていません"));
                }
            } else if (slot.getType() == Material.GOLD_BLOCK) {
                if (inv.contains(new ItemStack(Material.GOLD_BLOCK, 64))) {
                    if (inv.firstEmpty() == -1) {
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6空きがないので変換できません"));
                        player.closeInventory();
                        return;
                    }
                    player.playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6変換しました"));
                    int count = inv.first(new ItemStack(Material.GOLD_BLOCK, 64));
                    while (count > -1) {
                        inv.clear(count);
                        getServer().dispatchCommand(getServer().getConsoleSender(), "mlg " + player.getName() + " Compressed_gold_block 7 1");
                        inv.addItem(new ItemStack(Material.GOLD_BLOCK, 1));
                        count = inv.first(new ItemStack(Material.GOLD_BLOCK, 64));
                    }

                } else {
                    player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6金ブロックを持っていません"));
                }
            } else if (slot.getType() == Material.DIAMOND_BLOCK) {
                if (inv.contains(new ItemStack(Material.DIAMOND_BLOCK, 64))) {
                    if (inv.firstEmpty() == -1) {
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6空きがないので変換できません"));
                        player.closeInventory();
                        return;
                    }
                    player.playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6変換しました"));
                    int count = inv.first(new ItemStack(Material.DIAMOND_BLOCK, 64));
                    while (count > -1) {
                        inv.clear(count);
                        getServer().dispatchCommand(getServer().getConsoleSender(), "mlg " + player.getName() + " compressed_diamond_block 7 1");
                        inv.addItem(new ItemStack(Material.DIAMOND_BLOCK, 1));
                        count = inv.first(new ItemStack(Material.DIAMOND_BLOCK, 64));
                    }

                } else {
                    player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6ダイヤモンドブロックを持っていません"));
                }
            }
        }
    }
}

