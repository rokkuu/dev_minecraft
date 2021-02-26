package com.rokku.vahathedag.data;

import com.rokku.vahathedag.VahaTheDagMod;
import com.rokku.vahathedag.setup.ModBlocks;
import com.rokku.vahathedag.setup.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeBlockTagsProvider;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator gen, ExistingFileHelper existingFileHelper) {
        super(gen, VahaTheDagMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags(){
        getOrCreateBuilder(ModTags.Blocks.ORES_VAHA).add(ModBlocks.VAHA_ORE.get());
        getOrCreateBuilder(Tags.Blocks.ORES).addTag(ModTags.Blocks.ORES_VAHA);
        getOrCreateBuilder(Tags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_VAHA);
        getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_VAHA).add(ModBlocks.VAHA_BLOCK.get());
    }
}
