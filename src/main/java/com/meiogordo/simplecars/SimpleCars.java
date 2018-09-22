package com.meiogordo.simplecars;

import com.meiogordo.simplecars.proxy.IProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "simplecarsmod", useMetadata = true)
public class SimpleCars {

    @Mod.Instance
    public static SimpleCars instance;

    @SidedProxy(clientSide = "com.meiogordo.simplecars.proxy.ClientProxy", serverSide = "com.meiogordo.simplecars.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public static void PostInit(FMLPostInitializationEvent event) {

    }
}
