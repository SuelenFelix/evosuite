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

public class Route_setStartX_27605538326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156271;
     Object term1156284;

    public Route_setStartX_27605538326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1156278 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156278, term1156278.getClass(), "x", 2102498454);
        setIntField(term1156278, term1156278.getClass(), "y", -454828067);
        ArrayList term1156276 = new ArrayList();
        ((ArrayList) term1156276).add(term1156278);
        term1156271 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1156271, term1156271.getClass(), "startX", 0.11613622644165744);
        setDoubleField(term1156271, term1156271.getClass(), "startY", 0.7906598722688312);
        setDoubleField(term1156271, term1156271.getClass(), "endX", 0.18313324415093823);
        setDoubleField(term1156271, term1156271.getClass(), "endY", 0.1744575635121215);
        setField(term1156271, term1156271.getClass(), "nextPoints", term1156276);
        setIntField(term1156271, term1156271.getClass(), "ftlSpeed", -1076486189);
        term1156284 = new Double(0.7997126520436173);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term1156284;
        callMethod(klass, "setStartX", argTypes, term1156271, args);
    }

};


