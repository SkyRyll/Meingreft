package com.skyryll.meingreftmod;

import com.skyryll.meingreftmod.init.ModBlocks;
import com.skyryll.meingreftmod.init.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MODID, name=References.MODNAME, version=References.VERSION, acceptedMinecraftVersions=References.ACCEPTED_MINECRAFT_VERSIONS)
public class MeingreftMod {

    @Instance
    public static MeingreftMod instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(References.MODID + ":preInit");
        ModItems.init();
        ModBlocks.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println(References.MODID + ":init");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println(References.MODID + ":postInit");
    }

}