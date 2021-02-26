package com.rokku.vahathedag.data.client;

import com.rokku.vahathedag.VahaTheDagMod;
import com.rokku.vahathedag.setup.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen,ExistingFileHelper exFileHelper) {
        super(gen, VahaTheDagMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.VAHA_BLOCK.get());
        simpleBlock(ModBlocks.VAHA_ORE.get());

    }
}
