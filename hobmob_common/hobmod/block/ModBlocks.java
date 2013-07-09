package hobmod.block;

import hobmod.lib.BlockIds;
import hobmod.lib.Refrence;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModBlocks {
	
	public static Block carbonizerBlock;
	public static Block catBakerBlock;	
	public static Block catBakerActiveBlock;
	public static void Startup(){ 
	
	catBakerBlock = new BlockCatBaker(BlockIds.CATBAKER, Material.rock, false).setUnlocalizedName("catBakerBlock");
    GameRegistry.registerBlock(catBakerBlock, Refrence.MOD_ID +catBakerBlock.getUnlocalizedName());
    LanguageRegistry.addName(catBakerBlock, "Cat Baker");
    
    GameRegistry.addRecipe(new ItemStack(catBakerBlock), new Object[]{
        " X ",
        " X ",
        " X ",
        'X', Block.furnaceIdle });
    
	catBakerActiveBlock = new BlockCatBaker(BlockIds.CATBAKERACTIVE, Material.rock, true).setUnlocalizedName("catBakerActiveBlock");
    GameRegistry.registerBlock(catBakerActiveBlock, Refrence.MOD_ID +catBakerActiveBlock.getUnlocalizedName());
    LanguageRegistry.addName(catBakerActiveBlock, "Cat Baker Active");
    
    carbonizerBlock = new BlockCarbonizer(BlockIds.CARBONIZER, Material.rock).setUnlocalizedName("carbonizerBlock");
    GameRegistry.registerBlock(carbonizerBlock, Refrence.MOD_ID +carbonizerBlock.getUnlocalizedName());
    LanguageRegistry.addName(carbonizerBlock, "Carbonizer");
    
    GameRegistry.addRecipe(new ItemStack(carbonizerBlock), new Object[]{
        "XXX",
        "XXX",
        "XXX",
        'X', Block.furnaceIdle });
    
	}
	
	
}
