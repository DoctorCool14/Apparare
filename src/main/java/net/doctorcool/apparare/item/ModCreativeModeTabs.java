package net.doctorcool.apparare.item;

import net.doctorcool.apparare.Apparare;
import net.doctorcool.apparare.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Apparare.MOD_ID);

    public static final RegistryObject<CreativeModeTab> APPARARE_ITEMS_TAB = CREATIVE_MODE_TABS.register("apparare_items_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TESTITEM.get()))
            .title(Component.translatable("creativetab.apparare_items_tab"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModItems.TESTITEM.get());
            })
            .build());

    public static final RegistryObject<CreativeModeTab> APPARARE_BLOCKS_TAB = CREATIVE_MODE_TABS.register("apparare_blocks_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TESTITEM.get()))
            .title(Component.translatable("creativetab.apparare_blocks_tab"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModBlocks.TEST_BLOCK.get());
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
