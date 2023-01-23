package com.wzssoft.modid.item;

import com.wzssoft.modid.MODIDMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MODIDItems {


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MODIDMod.MODID, name), item);
    }

    public static void registerModItem() {
        //当执行这一行命令时，会自动执行一遍空参构造
    }
}
