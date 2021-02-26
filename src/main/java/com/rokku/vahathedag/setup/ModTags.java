package com.rokku.vahathedag.setup;

import com.rokku.vahathedag.VahaTheDagMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

import java.awt.geom.RectangularShape;

public class ModTags {
    public static final class Blocks{
        public static final ITag.INamedTag<Block> ORES_VAHA = forge("ores/vaha");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_VAHA = forge("storage_blocks/vaha");

        private static ITag.INamedTag<Block> forge(String path){
            return BlockTags.makeWrapperTag(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Block> mod(String path){
            return BlockTags.makeWrapperTag(new ResourceLocation(VahaTheDagMod.MOD_ID, path).toString());
        }
    }
    public static final class Items{
        public static final ITag.INamedTag<Item> ORES_VAHA = forge("ores/vaha");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_VAHA = forge("storage_blocks/vaha");
        public static final ITag.INamedTag<Item> IGNOTS_VAHA = forge("ignots/vaha");
        private static ITag.INamedTag<Item> forge(String path){
            return ItemTags.makeWrapperTag(new ResourceLocation("forge", path).toString());
        }
        private static ITag.INamedTag<Item> mod(String path){
            return ItemTags.makeWrapperTag(new ResourceLocation(VahaTheDagMod.MOD_ID, path).toString());
        }
    }
}
