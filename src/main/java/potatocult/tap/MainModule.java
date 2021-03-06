package potatocult.tap;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.common.Mod;
import potatocult.tap.item.ItemGlowing;
import potatocult.tap.item.ItemWithAdvancedDescription;
import potatocult.tap.itemgroup.TapItemGroup;
import snownee.kiwi.AbstractModule;
import snownee.kiwi.KiwiModule;
import snownee.kiwi.block.ModBlock;
import snownee.kiwi.item.ModItem;

@KiwiModule
@KiwiModule.Group("tap")
@Mod(MainModule.MODID)
public class MainModule extends AbstractModule {

    public static final String MODID = "tap";

    public static final TapItemGroup instance = new TapItemGroup(ItemGroup.GROUPS.length, "tap");

    public static final Item REFINED_POTATORIUM = new ItemWithAdvancedDescription(new Item.Properties().rarity(Rarity.RARE),
            "tap.item.refined_potatorium.tooltip.noshift",
            "tap.item.refined_potatorium.tooltip.shift");

    public static final Item MYSTICAL_POTATO = new ItemGlowing(new Item.Properties().rarity(Rarity.UNCOMMON));

    public static final Item POTATORIUM = new ModItem(new Item.Properties().rarity(Rarity.UNCOMMON));

    public static final Block REFINED_POTATORIUM_BLOCK =
            new ModBlock(Block.Properties.create(Material.IRON)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(5.0F, 6.0F)
                    .sound(SoundType.CROP));

}
