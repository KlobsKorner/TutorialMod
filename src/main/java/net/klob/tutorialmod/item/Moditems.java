package net.klob.tutorialmod.item;

import net.klob.tutorialmod.TutorialMod;
import net.klob.tutorialmod.base.ModArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    /// Ore
    public static final RegistryObject<Item> BLACK_OPAL = ITEMS.register("black_opal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_BLACK_OPAL = ITEMS.register("raw_black_opal",
            () -> new Item(new Item.Properties()));

    /// Tools Weapons

    public static final RegistryObject<SwordItem> OPAL_CRYSTAL_SWORD = ITEMS.register("opal_crystal_sword",
            () -> new SwordItem(Tiers.DIAMOND,10,4.5f, new Item.Properties()));


    public static final RegistryObject<PickaxeItem> OPAL_CRYSTAL_PICKAXE = ITEMS.register("opal_crystal_pickaxe",
            () -> new PickaxeItem(Tiers.DIAMOND,10, 3,new Item.Properties()));




    public static final RegistryObject<SwordItem> LAPO_CRYSTAL_SWORD = ITEMS.register("lapo_crystal_sword",
            () -> new SwordItem(Tiers.DIAMOND,9999,4.5f, new Item.Properties()));


    /// Armor
    public static final RegistryObject<ArmorItem> OPAL_CRYSTAL_HELMET = ITEMS.register("opal_crystal_helmet",
            () -> new ArmorItem(ArmorTiers.EXAMPLE, EquipmentSlot.HEAD, new Item.Properties()));

    public static final RegistryObject<ArmorItem> OPAL_CRYSTAL_CHEST = ITEMS.register("opal_crystal_chest",
            () -> new ArmorItem(ArmorTiers.EXAMPLE, EquipmentSlot.CHEST, new Item.Properties()));

    public static final RegistryObject<ArmorItem> OPAL_CRYSTAL_BOOTS = ITEMS.register("opal_crystal_boots",
            () -> new ArmorItem(ArmorTiers.EXAMPLE, EquipmentSlot.FEET, new Item.Properties()));

    public static final RegistryObject<ArmorItem> OPAL_CRYSTAL_LEGGINGS = ITEMS.register("opal_crystal_leggings",
            () -> new ArmorItem(ArmorTiers.EXAMPLE, EquipmentSlot.LEGS, new Item.Properties()));





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }



     ////Tiers

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

    public static class ToolTiers{
        public static final Tier EXAMPLE = new ForgeTier(4,
                1200,
                2.2f,
                4,
                1200,
                null,
                () -> Ingredient.of(Moditems.BLACK_OPAL.get()));

    }
}
