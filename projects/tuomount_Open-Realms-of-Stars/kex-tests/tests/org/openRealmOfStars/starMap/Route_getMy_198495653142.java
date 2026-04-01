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

public class Route_getMy_198495653142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156605;

    public Route_getMy_198495653142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1156612 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156612, term1156612.getClass(), "x", -1727289406);
        setIntField(term1156612, term1156612.getClass(), "y", -219177201);
        Object term1156615 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156615, term1156615.getClass(), "x", 791111126);
        setIntField(term1156615, term1156615.getClass(), "y", -861509354);
        Object term1156618 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156618, term1156618.getClass(), "x", -80996546);
        setIntField(term1156618, term1156618.getClass(), "y", -723344903);
        ArrayList term1156610 = new ArrayList();
        ((ArrayList) term1156610).add(term1156612);
        ((ArrayList) term1156610).add(term1156615);
        ((ArrayList) term1156610).add(term1156618);
        term1156605 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1156605, term1156605.getClass(), "startX", 0.8896348979317397);
        setDoubleField(term1156605, term1156605.getClass(), "startY", 0.26895104127686764);
        setDoubleField(term1156605, term1156605.getClass(), "endX", 0.44147348766746497);
        setDoubleField(term1156605, term1156605.getClass(), "endY", 0.20785767731652216);
        setField(term1156605, term1156605.getClass(), "nextPoints", term1156610);
        setIntField(term1156605, term1156605.getClass(), "ftlSpeed", -1583996581);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMy", argTypes, term1156605, args);
    }

};


