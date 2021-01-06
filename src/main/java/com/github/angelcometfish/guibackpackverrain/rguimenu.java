package com.github.angelcometfish.guibackpackverrain;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class rguimenu {
    public void displayGUI(){
        Inventory inv = Bukkit.createInventory(null, 18,"GUIName");
        ItemStack food = new ItemStack(Material.APPLE);

        inv.setItem(4, food);
    }
}
