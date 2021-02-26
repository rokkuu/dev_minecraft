package com.rokku.vahathedag.data.client;

import com.rokku.vahathedag.VahaTheDagMod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator,ExistingFileHelper existingFileHelper) {
        super(generator, VahaTheDagMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
       //withExistingParent("vaha_block", modLoc("blocks/vaha_block"));
       //withExistingParent("vaha_ore", modLoc("blocks/vaha_ore"));

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
        builder(itemGenerated, "vaha_ingot");
    }

    private void builder(ModelFile itemGenerated, String name) {
        getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
