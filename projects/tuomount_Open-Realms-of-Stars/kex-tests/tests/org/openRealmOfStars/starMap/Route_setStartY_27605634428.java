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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Double;

public class Route_setStartY_27605634428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156296;
     Object term1156324;

    public Route_setStartY_27605634428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1156303 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156303, term1156303.getClass(), "x", 1177083988);
        setIntField(term1156303, term1156303.getClass(), "y", -1392664303);
        Object term1156306 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156306, term1156306.getClass(), "x", 1650723361);
        setIntField(term1156306, term1156306.getClass(), "y", 1331058209);
        Object term1156309 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156309, term1156309.getClass(), "x", 1017701527);
        setIntField(term1156309, term1156309.getClass(), "y", -1213205729);
        Object term1156312 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156312, term1156312.getClass(), "x", -76709137);
        setIntField(term1156312, term1156312.getClass(), "y", -186610265);
        Object term1156315 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156315, term1156315.getClass(), "x", 678790575);
        setIntField(term1156315, term1156315.getClass(), "y", 407787733);
        Object term1156318 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156318, term1156318.getClass(), "x", 1397730240);
        setIntField(term1156318, term1156318.getClass(), "y", 1226832778);
        ArrayList term1156301 = new ArrayList();
        ((ArrayList) term1156301).add(term1156303);
        ((ArrayList) term1156301).add(term1156306);
        ((ArrayList) term1156301).add(term1156309);
        ((ArrayList) term1156301).add(term1156312);
        ((ArrayList) term1156301).add(term1156315);
        ((ArrayList) term1156301).add(term1156318);
        term1156296 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1156296, term1156296.getClass(), "startX", 0.8391459612166138);
        setDoubleField(term1156296, term1156296.getClass(), "startY", 0.16703018107140954);
        setDoubleField(term1156296, term1156296.getClass(), "endX", 0.4586817610515208);
        setDoubleField(term1156296, term1156296.getClass(), "endY", 0.4514428416311852);
        setField(term1156296, term1156296.getClass(), "nextPoints", term1156301);
        setIntField(term1156296, term1156296.getClass(), "ftlSpeed", 688012554);
        term1156324 = new Double(0.05035312439979578);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term1156324;
        callMethod(klass, "setStartY", argTypes, term1156296, args);
    }

};


