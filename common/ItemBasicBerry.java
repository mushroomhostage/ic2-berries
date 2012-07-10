package net.minecraft.src;

public class ItemBerry extends Item {
    public ItemBerry(int data) {
        super(data);
        setHasSubtypes(true);
        setMaxDamage(0);
    }

    @Override
    public String getTextureFile() {
        return "/berries_crops.png";
    }

    /*
    public String getItemNameIS(ItemStack itemStack) {
        switch(itemStack.getItemDamage()) {
        }
    }
    */
}
