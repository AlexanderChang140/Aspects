package me.cat.aspects;

import me.cat.aspects.item.AspectsItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Aspects.MODID)
public class Aspects {
    public static final String MODID = "aspects";

    public Aspects() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        AspectsItems.register(modEventBus);
    }
}
