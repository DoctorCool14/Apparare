package net.doctorcool.apparare.tags;

import net.doctorcool.apparare.Apparare;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        //public static final TagKey<Block> EXAMPLE_TAG = tag("example_tag"); //Example Tag

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Apparare.MOD_ID, name));
        }
    }

    public static class Items {

    }
}
