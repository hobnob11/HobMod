package hobmod.hobmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;
import hobmod.block.BlockCarbonizer;
import hobmod.block.ModBlocks;
import hobmod.lib.BlockIds;
import hobmod.lib.Refrence;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Refrence.MOD_ID, name = Refrence.MOD_NAME, version = Refrence.VERSION)
public class HobMod {
    
    
    
    
	@EventHandler
    public void preInit(FMLPreInitializationEvent event){
    
		ModBlocks.Startup();
		MinecraftForge.EVENT_BUS.register(new HobMod_EventSounds());
    }
	@EventHandler
    public void init(FMLInitializationEvent event){
        
    }
	@EventHandler
    public void postInit(FMLPostInitializationEvent event){
        
    }
    

}
