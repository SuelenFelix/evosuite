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

public class StarMapGenerator_createSolarSystem_174981410844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1152282;
     Object term1152285;
     Object term1152287;
     Object term1152289;
     Object term1152291;
     Object term1152293;

    public StarMapGenerator_createSolarSystem_174981410844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1152282 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMapGenerator"));
        setField(term1152282, term1152282.getClass(), "nameGenerator", null);
        setBooleanField(term1152282, term1152282.getClass(), "solHasAdded", false);
        setBooleanField(term1152282, term1152282.getClass(), "destroyedPlanetStartAdded", false);
        setField(term1152282, term1152282.getClass(), "solarSystem", null);
        setField(term1152282, term1152282.getClass(), "starMap", null);
        term1152285 = new Integer(0);
        term1152287 = new Integer(0);
        term1152289 = new Integer(0);
        term1152291 = new Integer(0);
        term1152293 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMapGenerator");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = Class.forName("org.openRealmOfStars.starMap.GalaxyConfig");
        Object[] args = new Object[6];
        args[0] = term1152285;
        args[1] = term1152287;
        args[2] = term1152289;
        args[3] = term1152291;
        args[4] = term1152293;
        args[5] = null;
        callMethod(klass, "createSolarSystem", argTypes, term1152282, args);
    }

};


