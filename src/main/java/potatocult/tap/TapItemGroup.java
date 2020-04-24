package potatocult.tap;


import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class TapItemGroup extends ItemGroup {
    TapItemGroup(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(PotatoriumIngots.REFINED_POTATORIUM_BLOCK);
    }
}
