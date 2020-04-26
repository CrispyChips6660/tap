package potatocult.tap.item;


import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.util.InputMappings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import org.lwjgl.glfw.GLFW;

import java.util.List;

public class ItemWithAdvancedDescription extends Item {
    String NoShift;
    String Shift;

    public ItemWithAdvancedDescription(Properties properties, String noshift, String shift) {
        super(properties);
        this.NoShift = noshift;
        this.Shift = shift;
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if (InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), GLFW.GLFW_KEY_LEFT_SHIFT)) {
            tooltip.add(new TranslationTextComponent(NoShift));
        } else {
            tooltip.add(new TranslationTextComponent(Shift));
        }
    }
}

