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

public class StarMapUtilities_getEscapeCoordinates_174846506115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3593267;
     Object term3593270;

    public StarMapUtilities_getEscapeCoordinates_174846506115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3593267 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term3593267, term3593267.getClass(), "x", -1584533793);
        setIntField(term3593267, term3593267.getClass(), "y", 653896963);
        term3593270 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term3593270, term3593270.getClass(), "x", -1809064792);
        setIntField(term3593270, term3593270.getClass(), "y", 334420153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMapUtilities");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        Object[] args = new Object[2];
        args[0] = term3593267;
        args[1] = term3593270;
        callMethod(klass, "getEscapeCoordinates", argTypes, null, args);
    }

};


