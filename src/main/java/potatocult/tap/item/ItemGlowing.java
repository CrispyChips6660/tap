package potatocult.tap.item;

import net.minecraft.item.ItemStack;
import snownee.kiwi.item.ModItem;

public class ItemGlowing extends ModItem {

    public ItemGlowing(Properties properties) {
        super(properties);
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }

}
