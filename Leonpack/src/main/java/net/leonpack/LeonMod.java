package net.leonpack;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class LeonMod implements ModInitializer {
    // Звук
    public static final SoundEvent RELAX_GUITAR_SOUND = SoundEvent.of(Identifier.of("leonpack", "relax_guitar"));

    // Предметы
    public static final Item BLOODY_SWORD = new SwordItem(ToolMaterials.NETHERITE, new Item.Settings().attributeModifiersComponent(SwordItem.createAttributes(ToolMaterials.NETHERITE, 3, -2.4f)));
    public static final Item RELAX_GUITAR_DISC = new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(RELAX_GUITAR_SOUND));
    public static final Item LEON_ELYTRA = new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC).glider());

    @Override
    public void onInitialize() {
        Registry.register(Registries.SOUND_EVENT, Identifier.of("leonpack", "relax_guitar"), RELAX_GUITAR_SOUND);
        Registry.register(Registries.ITEM, Identifier.of("leonpack", "bloody_sword"), BLOODY_SWORD);
        Registry.register(Registries.ITEM, Identifier.of("leonpack", "relax_guitar"), RELAX_GUITAR_DISC);
        Registry.register(Registries.ITEM, Identifier.of("leonpack", "leon_elytra"), LEON_ELYTRA);
    }
}
