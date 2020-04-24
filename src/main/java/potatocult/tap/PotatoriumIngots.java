package potatocult.tap;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraftforge.common.ToolType;
import snownee.kiwi.AbstractModule;
import snownee.kiwi.KiwiModule;
import snownee.kiwi.block.ModBlock;
import snownee.kiwi.item.ModItem;

@KiwiModule
@KiwiModule.Group
public class PotatoriumIngots extends AbstractModule {

    public static final Item REFINED_POTATORIUM = new ModItem(new Item.Properties().rarity(Rarity.RARE));
    public static final Item MYSTICAL_POTATO = new ModItem(new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item POTATORIUM = new ModItem(new Item.Properties());

    public static final Block REFINED_POTATORIUM_BLOCK =
            new ModBlock(Block.Properties.create(Material.IRON)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(5.0F, 6.0F)
                    .sound(SoundType.CROP));

    //I don't need a BlockItem because Kiwi automatically does that.
}
