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

public class StarMapGenerator_createTwoCirclesStartingSystems_131877199741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1152267;

    public StarMapGenerator_createTwoCirclesStartingSystems_131877199741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1152267 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMapGenerator"));
        setField(term1152267, term1152267.getClass(), "nameGenerator", null);
        setBooleanField(term1152267, term1152267.getClass(), "solHasAdded", false);
        setBooleanField(term1152267, term1152267.getClass(), "destroyedPlanetStartAdded", false);
        setField(term1152267, term1152267.getClass(), "solarSystem", null);
        setField(term1152267, term1152267.getClass(), "starMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMapGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.GalaxyConfig");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createTwoCirclesStartingSystems", argTypes, term1152267, args);
    }

};


