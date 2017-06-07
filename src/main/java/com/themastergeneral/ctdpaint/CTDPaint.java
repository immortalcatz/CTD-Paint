package com.themastergeneral.ctdpaint;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

import com.themastergeneral.ctdpaint.proxy.CommonProxy;

@Mod(modid = CTDPaint.MODID, name = CTDPaint.MODNAME, version = CTDPaint.VERSION, acceptedMinecraftVersions = CTDPaint.acceptedMinecraftVersions, updateJSON = CTDPaint.updateJSON, dependencies = CTDPaint.DEPENDENCIES)
public class CTDPaint 
{
	public static final String MODID = "ctdpaint";
    public static final String MODNAME = "CTD Paint";
    public static final String VERSION = "1.1.6";
    public static final String acceptedMinecraftVersions = "1.10.2";
	public static final String updateJSON = "https://raw.githubusercontent.com/MasterGeneral156/Version/master/CTD-Paint.json";
	public static final String DEPENDENCIES = "required-after:ctdcore@[1.0.3,];after:moglowstone@[1.2.4,];";
    
    @Instance
    public static CTDPaint instance = new CTDPaint();
    
    public static Logger logger;
    
    @SidedProxy(clientSide="com.themastergeneral.ctdpaint.proxy.ClientProxy", serverSide="com.themastergeneral.ctdpaint.proxy.ServerProxy")
    public static CommonProxy proxy;
	public static VersionChecker versionChecker;
	public static boolean haveWarnedVersionOutOfDate;
	public static boolean moglowstoneloaded = Loader.isModLoaded("moglowstone");
	
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) 
    {
    	proxy.preInit(e);
    }
    @EventHandler
    public void init(FMLInitializationEvent e) 
    {
    	proxy.init(e);
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) 
    {
    	proxy.postInit(e);
    }
}