package com.wzssoft.modid.registry;

import com.wzssoft.modid.MODIDMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class MODIDItemGroups {

    public static final ItemGroup TAB = FabricItemGroup.builder(new Identifier(MODIDMod.MODID, "tab"))
            .displayName(Text.translatable("itemGroup.modid.tab"))
            .icon(() -> new ItemStack(MODIDBlockItems.POWER_STONE_BLOCK_ITEM))
            .entries((displayContext, entries) -> {

//                entries.add(MODIDBlockItems.COPPER_KILN_BLOC_ITEM);

            })
            .build();

    public static void registerModItemGroup() {
        //当执行这一行命令时，会自动执行一遍空参构造
    }
}
