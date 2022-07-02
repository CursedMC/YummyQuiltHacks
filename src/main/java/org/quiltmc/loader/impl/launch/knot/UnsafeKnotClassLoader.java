package org.quiltmc.loader.impl.launch.knot;

import net.fabricmc.api.EnvType;
import org.quiltmc.loader.impl.game.GameProvider;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.CodeSource;
import java.util.Enumeration;

/**
 * mainly exposes methods from KnotClassLoader
 */
public class UnsafeKnotClassLoader extends KnotClassLoader {
	public static final ClassLoader appLoader = UnsafeKnotClassLoader.class.getClassLoader();
	public static final UnsafeKnotClassLoader knotLoader = (UnsafeKnotClassLoader) Thread.currentThread().getContextClassLoader();
	public static final URLClassLoader urlLoader = (URLClassLoader) knotLoader.getParent();
	
	UnsafeKnotClassLoader(boolean isDevelopment, EnvType envType, GameProvider provider) {
		super(isDevelopment, envType, provider);
	}
	
	@Override
	public KnotClassDelegate getDelegate() {
		return super.getDelegate();
	}
	
	@Override
	public boolean isClassLoaded(String name) {
		return super.isClassLoaded(name);
	}
	
	@Override
	public URL getResource(String name) {
		return super.getResource(name);
	}
	
	@Override
	public URL findResource(String name) {
		return super.findResource(name);
	}
	
	@Override
	public InputStream getResourceAsStream(String name) {
		return super.getResourceAsStream(name);
	}
	
	@Override
	public Enumeration<URL> getResources(String name) throws IOException {
		return super.getResources(name);
	}
	
	@Override
	protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
		return super.loadClass(name, resolve);
	}
	
	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		return super.findClass(name);
	}
	
	@Override
	public Class<?> loadIntoTarget(String name) throws ClassNotFoundException {
		return super.loadIntoTarget(name);
	}
	
	@Override
	public void addURL(URL url) {
		super.addURL(url);
	}
	
	@Override
	public InputStream getResourceAsStream(String classFile, boolean allowFromParent) throws IOException {
		return super.getResourceAsStream(classFile, allowFromParent);
	}
	
	@Override
	public Package getPackage(String name) {
		return super.getPackage(name);
	}
	
	@Override
	public Package definePackage(String name, String specTitle, String specVersion, String specVendor, String implTitle, String implVersion, String implVendor, URL sealBase) throws IllegalArgumentException {
		return super.definePackage(name, specTitle, specVersion, specVendor, implTitle, implVersion, implVendor, sealBase);
	}
}
