package com.wzssoft.modid.registry;

import com.wzssoft.modid.MODIDMod;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class MODIDItemTags {

    //public static final TagKey<Item> BARREL_PACKING_BLACKLIST = MODIDItemTags.of("barrel_packing_blacklist");

    private static TagKey<Item> of(String name) {
        return TagKey.of(RegistryKeys.ITEM,new Identifier(MODIDMod.MODID, name));
    }

    public static void registerModItemTags() {
        //当执行这一行命令时，会自动执行一遍空参构造
    }
}
