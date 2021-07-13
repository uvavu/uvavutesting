package me.jensen.uvavu.utils.client;

import me.jensen.uvavu.utils.Util;
import org.reflections.Reflections;

import java.util.Set;

public class ReflectionUtils implements Util {

	public static Set<Class<?>> findClasses(String pkg, Class subType) {
		Reflections reflections = new Reflections(pkg);
		return reflections.getSubTypesOf(subType);
	}

}
