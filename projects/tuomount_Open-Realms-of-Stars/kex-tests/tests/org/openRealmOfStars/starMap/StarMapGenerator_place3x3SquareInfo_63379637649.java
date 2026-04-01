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

public class StarMapGenerator_place3x3SquareInfo_63379637649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1152325;
     Object term1152328;
     Object term1152330;

    public StarMapGenerator_place3x3SquareInfo_63379637649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1152325 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMapGenerator"));
        setField(term1152325, term1152325.getClass(), "nameGenerator", null);
        setBooleanField(term1152325, term1152325.getClass(), "solHasAdded", false);
        setBooleanField(term1152325, term1152325.getClass(), "destroyedPlanetStartAdded", false);
        setField(term1152325, term1152325.getClass(), "solarSystem", null);
        setField(term1152325, term1152325.getClass(), "starMap", null);
        term1152328 = new Integer(0);
        term1152330 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMapGenerator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.openRealmOfStars.starMap.SquareInfo");
        argTypes[3] = Class.forName("org.openRealmOfStars.starMap.SquareInfo");
        Object[] args = new Object[4];
        args[0] = term1152328;
        args[1] = term1152330;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "place3x3SquareInfo", argTypes, term1152325, args);
    }

};


