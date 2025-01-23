package net.doctorcool.apparare.item;

import net.doctorcool.apparare.Apparare;
import net.doctorcool.apparare.item.custom.FuelItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Apparare.MOD_ID); //Puts mod items into list then registers them when forge loads the items

    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item",
            () -> new Item(new Item.Properties())); //Creates a new item

    public static final RegistryObject<Item> RAW_URANIUM = ITEMS.register("raw_uranium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COKE = ITEMS.register("coke",
            () -> new FuelItem(new Item.Properties(), 46400));

    public static final RegistryObject<Item> MUDCLAY_BALL = ITEMS.register("mudclay_ball",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus); //Registers the DeferredRegister
    }
}
