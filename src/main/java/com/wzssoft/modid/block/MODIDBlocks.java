package com.wzssoft.modid.block;

import com.wzssoft.modid.MODIDMod;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MODIDBlocks {


    private static Block registerBlock(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(MODIDMod.MODID, name), block);
    }

    public static void registerModBlock() {
        //当执行这一行命令时，会自动执行一遍空参构造
    }
}
