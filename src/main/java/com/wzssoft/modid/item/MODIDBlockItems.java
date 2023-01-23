package com.wzssoft.modid.item;

import com.wzssoft.modid.MODIDMod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MODIDBlockItems {



    public static Item registerBlockItem(String name, BlockItem blockitem) {
        return Registry.register(Registry.ITEM, new Identifier(MODIDMod.MODID, name), blockitem);
    }


    public static void registerModBlockItems() {
        //当执行这一行命令时，会自动执行一遍空参构造
    }
}
