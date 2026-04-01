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

public class Route_getExploredDot_167132010469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156831;
     Object term1156837;

    public Route_getExploredDot_167132010469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1156831 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1156831, term1156831.getClass(), "startX", 0.0);
        setDoubleField(term1156831, term1156831.getClass(), "startY", 0.0);
        setDoubleField(term1156831, term1156831.getClass(), "endX", 0.0);
        setDoubleField(term1156831, term1156831.getClass(), "endY", 0.0);
        setField(term1156831, term1156831.getClass(), "nextPoints", null);
        setIntField(term1156831, term1156831.getClass(), "ftlSpeed", 0);
        term1156837 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1156837;
        callMethod(klass, "getExploredDot", argTypes, term1156831, args);
    }

};


