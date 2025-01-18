package net.doctorcool.apparare.item;

import net.doctorcool.apparare.Apparare;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Apparare.MOD_ID); //Puts mod items into list then registers them when forge loads the items

    public static final RegistryObject<Item> TESTITEM = ITEMS.register("testitem",
            () -> new Item(new Item.Properties())); //Creates a new item

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus); //Registers the DeferredRegister
    }
}
