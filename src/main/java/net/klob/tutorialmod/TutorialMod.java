package net.klob.tutorialmod;

import com.mojang.logging.LogUtils;
import net.klob.tutorialmod.block.ModBlocks;
import net.klob.tutorialmod.item.ModCreativModeTabs;
import net.klob.tutorialmod.item.Moditems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TutorialMod.MOD_ID)
public class TutorialMod
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "tutorialmod";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public TutorialMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        Moditems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if(event.getTab() == CreativeModeTabs.INGREDIENTS) {
            event.accept(Moditems.BLACK_OPAL);
            event.accept(Moditems.RAW_BLACK_OPAL);
        }

        if(event.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.BLACK_OPAL_BLOCK);






        }
        if(event.getTab() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(ModBlocks.BLACK_OPAL_ORE);
            event.accept(ModBlocks.NETHERRACK_BLACK_OPAL_ORE);
            event.accept(ModBlocks.ENDSTONE_BLACK_OPAL_ORE);
            event.accept(ModBlocks.DEEPSLATE_BLACK_OPAL_ORE);





        }

        if(event.getTab() == ModCreativModeTabs.TUTORIAL_TAB) {
            event.accept(Moditems.BLACK_OPAL);
            event.accept(Moditems.RAW_BLACK_OPAL);
            event.accept(ModBlocks.BLACK_OPAL_BLOCK);
            event.accept(ModBlocks.BLACK_OPAL_ORE);
            event.accept(ModBlocks.NETHERRACK_BLACK_OPAL_ORE);
            event.accept(ModBlocks.ENDSTONE_BLACK_OPAL_ORE);
            event.accept(ModBlocks.DEEPSLATE_BLACK_OPAL_ORE);
        }

    }


    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
