package net.doctorcool.apparare.block;

import net.doctorcool.apparare.Apparare;
import net.doctorcool.apparare.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
                DeferredRegister.create(ForgeRegistries.BLOCKS, Apparare.MOD_ID);

    public static final RegistryObject<Block> TEST_BLOCK = registerBlock("test_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT))); //Creates a new block, copying the properties of bedrock (Can override properties by adding .sound(), etc.). Can replace copy with of to create unique properties such as sounds, map color, etc.

    public static final RegistryObject<Block> MUDCLAY_BLOCK = registerBlock("mudclay_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CLAY)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block); //registers block
        registerBlockItem(name, toReturn); //registers block item
        return toReturn; //return registered block
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties())); // Register item for block.
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
