package net.klob.tutorialmod.item;

import net.klob.tutorialmod.TutorialMod;
import net.klob.tutorialmod.base.ModArmorMaterial;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> BLACK_OPAL = ITEMS.register("black_opal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_BLACK_OPAL = ITEMS.register("raw_black_opal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<SwordItem> OPAL_CRYSTAL_SWORD = ITEMS.register("opal_crystal_sword",
            () -> new SwordItem(Tiers.DIAMOND,10,4.5f, new Item.Properties()));


    public static final RegistryObject<SwordItem> LAPO_CRYSTAL_SWORD = ITEMS.register("lapo_crystal_sword",
            () -> new SwordItem(Tiers.DIAMOND,9999,4.5f, new Item.Properties()));



    public static final RegistryObject<ArmorItem> OPAL_CRYSTAL_HELMET = ITEMS.register("opal_crystal_helmet",
            () -> new ArmorItem(ArmorTiers.EXAMPLE, EquipmentSlot.HEAD, new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }





    public static class  ArmorTiers{
        public static final ArmorMaterial EXAMPLE = new ModArmorMaterial(
                "opal",
                500,
                new int[] { 20,40,50,10 },
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                0.0f,
                0.0f,
                () -> Ingredient.of(Moditems.BLACK_OPAL.get()));
    }
}
