package com.skyryll.meingreftmod.init;

import com.skyryll.meingreftmod.References;
import com.skyryll.meingreftmod.block.BlockBasic;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid= References.MODID)
public class ModBlocks {

    static Block tutorialBlock;

    public static void init() {
        tutorialBlock = new BlockBasic("tutorialBlock", Material.ROCK).setHardness(1.5f).setCreativeTab(CreativeTabs.BUILDING_BLOCKS).setLightLevel(1.0f);
        tutorialBlock.setHarvestLevel("pickaxe", 2);
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(tutorialBlock);
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(new ItemBlock(tutorialBlock).setRegistryName(tutorialBlock.getRegistryName()));
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        registerRender(Item.getItemFromBlock(tutorialBlock));
    }

    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
    }
}
