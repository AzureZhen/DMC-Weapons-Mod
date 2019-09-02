package mod.azure.dmcweapons.items.defaultweapons;

import mod.azure.dmcweapons.DMCWeaponsMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;

public class ItemBaseSword extends ItemSword {

	public ItemBaseSword(String name, int damage) {
		super(EnumHelper.addToolMaterial(name, 1, 1561, 4F, damage, 4));
		this.setTranslationKey(name);
		this.setRegistryName(new ResourceLocation(DMCWeaponsMod.modid, name));
		this.setCreativeTab(DMCWeaponsMod.tab);
		this.setHasSubtypes(true);
	}
	
	public String getTranslationKey(ItemStack stack) {
		return super.getTranslationKey();
	}
}