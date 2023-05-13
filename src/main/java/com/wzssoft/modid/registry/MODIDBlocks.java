package com.wzssoft.modid.registry;

import com.wzssoft.modid.MODIDMod;
import net.minecraft.block.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MODIDBlocks {
//    public static final Block POWER_STONE_BLOCK = registerBlock("power_stone",
//            new PowerStoneBlock(FabricBlockSettings.of(Material.METAL, MapColor.LIGHT_BLUE).requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.METAL).solidBlock(AbstractBlock.AbstractBlockState::isTransparent)));

    private static Block registerBlock(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(MODIDMod.MODID, name), block);
    }

    public static void registerModBlock() {
        //当执行这一行命令时，会自动执行一遍空参构造
    }
}
