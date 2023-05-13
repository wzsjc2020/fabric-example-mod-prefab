package com.wzssoft.modid;

import com.wzssoft.modid.registry.*;
import com.wzssoft.modid.utils.MODIDConstant;
import com.wzssoft.modid.utils.MODIDLootTableModifier;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MODIDMod implements ModInitializer {

    public static final String MODID = "modid";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize() {

        MODIDBlockEntityType.registerModBlockEntityType();
        MODIDItems.registerModItem();
        MODIDBlocks.registerModBlock();
        MODIDBlockItems.registerModBlockItems();
        MODIDItemTags.registerModItemTags();
        MODIDLootTableModifier.registerModModifyLootTable();
        MODIDConstant.initConstant();
    }
}
