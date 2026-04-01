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

public class StarMapGenerator_createRandomStartSystems_98830865339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1152261;

    public StarMapGenerator_createRandomStartSystems_98830865339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1152261 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMapGenerator"));
        setField(term1152261, term1152261.getClass(), "nameGenerator", null);
        setBooleanField(term1152261, term1152261.getClass(), "solHasAdded", false);
        setBooleanField(term1152261, term1152261.getClass(), "destroyedPlanetStartAdded", false);
        setField(term1152261, term1152261.getClass(), "solarSystem", null);
        setField(term1152261, term1152261.getClass(), "starMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMapGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.GalaxyConfig");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createRandomStartSystems", argTypes, term1152261, args);
    }

};


