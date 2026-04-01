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

public class StarMapGenerator_reserverStartFromSpace_5546259243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1152273;
     Object term1152276;
     Object term1152278;
     Object term1152280;

    public StarMapGenerator_reserverStartFromSpace_5546259243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1152273 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMapGenerator"));
        setField(term1152273, term1152273.getClass(), "nameGenerator", null);
        setBooleanField(term1152273, term1152273.getClass(), "solHasAdded", false);
        setBooleanField(term1152273, term1152273.getClass(), "destroyedPlanetStartAdded", false);
        setField(term1152273, term1152273.getClass(), "solarSystem", null);
        setField(term1152273, term1152273.getClass(), "starMap", null);
        term1152276 = new Integer(0);
        term1152278 = new Integer(0);
        term1152280 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMapGenerator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("org.openRealmOfStars.starMap.GalaxyConfig");
        Object[] args = new Object[4];
        args[0] = term1152276;
        args[1] = term1152278;
        args[2] = term1152280;
        args[3] = null;
        callMethod(klass, "reserverStartFromSpace", argTypes, term1152273, args);
    }

};


