package org.openRealmOfStars.starMap;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.openRealmOfStars.starMap.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class StarMapGenerator_createSolarSystem_94046748245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1152295;
     Object term1152298;
     Object term1152300;
     Object term1152302;
     Object term1152304;

    public StarMapGenerator_createSolarSystem_94046748245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1152295 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMapGenerator"));
        setField(term1152295, term1152295.getClass(), "nameGenerator", null);
        setBooleanField(term1152295, term1152295.getClass(), "solHasAdded", false);
        setBooleanField(term1152295, term1152295.getClass(), "destroyedPlanetStartAdded", false);
        setField(term1152295, term1152295.getClass(), "solarSystem", null);
        setField(term1152295, term1152295.getClass(), "starMap", null);
        term1152298 = new Integer(0);
        term1152300 = new Integer(0);
        term1152302 = new Integer(0);
        term1152304 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMapGenerator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("org.openRealmOfStars.starMap.GalaxyConfig");
        Object[] args = new Object[5];
        args[0] = term1152298;
        args[1] = term1152300;
        args[2] = term1152302;
        args[3] = term1152304;
        args[4] = null;
        callMethod(klass, "createSolarSystem", argTypes, term1152295, args);
    }

};


