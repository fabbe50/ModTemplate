package com.exampledev.examplemod.core.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/*	This is the ClientProxy class, it used for:
 * 		
 * 	Registering:
 * 		particles
 * 		guis
 * 		block models and textures
 * 		item models and textures
 * 
 */
public class ClientProxy extends CommonProxy {
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
	}
	
    public void init(FMLInitializationEvent event) {
    	super.init(event);
    }
    
    public void postInit(FMLPostInitializationEvent event) {
    	super.postInit(event);
    }
}