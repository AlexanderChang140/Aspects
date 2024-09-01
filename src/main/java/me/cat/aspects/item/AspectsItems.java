package me.cat.aspects.item;

import me.cat.aspects.Aspects;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AspectsItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Aspects.MODID);

    public static final RegistryObject<Item> ANEMO_FEATHER = ITEMS.register("anemo_feather", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PYRO_FIRE = ITEMS.register("pyro_fire", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HYDRO_KELP = ITEMS.register("hydro_kelp", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GEO_DIAMOND = ITEMS.register("geo_diamond", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ORDO_STAR = ITEMS.register("ordo_star", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PERDITIO_BONE = ITEMS.register("perditio_bone", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
