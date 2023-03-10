package net.ayham.tutorialmod.item;


import net.ayham.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static  final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);
    public static final RegistryObject<Item> MONEY = ITEMS.register("money",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STACK_OF_MONEY = ITEMS.register("stack_of_money",
            () -> new Item(new Item.Properties()));

    public static void  register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}