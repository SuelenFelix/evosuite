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

public class Route_getNextPoints_6631822053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1152421;

    public Route_getNextPoints_6631822053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1152428 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1152428, term1152428.getClass(), "x", 876275925);
        setIntField(term1152428, term1152428.getClass(), "y", -268523026);
        ArrayList term1152426 = new ArrayList();
        ((ArrayList) term1152426).add(term1152428);
        term1152421 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1152421, term1152421.getClass(), "startX", 0.22284027236090087);
        setDoubleField(term1152421, term1152421.getClass(), "startY", 0.6079591296036908);
        setDoubleField(term1152421, term1152421.getClass(), "endX", 0.19363089985015014);
        setDoubleField(term1152421, term1152421.getClass(), "endY", 0.8233117016694336);
        setField(term1152421, term1152421.getClass(), "nextPoints", term1152426);
        setIntField(term1152421, term1152421.getClass(), "ftlSpeed", 507674646);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNextPoints", argTypes, term1152421, args);
    }

};


