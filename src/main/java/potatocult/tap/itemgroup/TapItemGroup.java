package potatocult.tap.itemgroup;


import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import potatocult.tap.MainModule;

public class TapItemGroup extends ItemGroup {
    public TapItemGroup(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(MainModule.REFINED_POTATORIUM_BLOCK);
    }

}
