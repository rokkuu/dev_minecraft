package com.rokku.vahathedag.data;

import com.rokku.vahathedag.VahaTheDagMod;
import com.rokku.vahathedag.setup.ModItems;
import com.rokku.vahathedag.setup.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nullable;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider,@Nullable ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagProvider, VahaTheDagMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags(){
        copy(ModTags.Blocks.ORES_VAHA, ModTags.Items.ORES_VAHA);
        copy(ModTags.Blocks.STORAGE_BLOCKS_VAHA, ModTags.Items.STORAGE_BLOCKS_VAHA);
        copy(Tags.Blocks.ORES, ModTags.Items.STORAGE_BLOCKS_VAHA);
        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);
        getOrCreateBuilder(ModTags.Items.IGNOTS_VAHA).add(ModItems.VAHA_INGOT.get());
        getOrCreateBuilder(Tags.Items.INGOTS).addTag(ModTags.Items.IGNOTS_VAHA);

    }
}
