package potatocult.tap.item;


import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import snownee.kiwi.item.ModItem;

import java.util.List;

public class ItemWithDescription extends ModItem {
    String Desc;

    public ItemWithDescription(Properties properties, String desc) {
        super(properties);
        this.Desc = desc;
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new TranslationTextComponent(Desc));
    }
}

