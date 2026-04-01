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

public class Route_getY_183302765117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156234;

    public Route_getY_183302765117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1156241 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156241, term1156241.getClass(), "x", 1439976115);
        setIntField(term1156241, term1156241.getClass(), "y", 164162675);
        ArrayList term1156239 = new ArrayList();
        ((ArrayList) term1156239).add(term1156241);
        term1156234 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1156234, term1156234.getClass(), "startX", 0.9812989520568652);
        setDoubleField(term1156234, term1156234.getClass(), "startY", 0.5260401729085636);
        setDoubleField(term1156234, term1156234.getClass(), "endX", 0.1966416537238288);
        setDoubleField(term1156234, term1156234.getClass(), "endY", 0.5507226770539227);
        setField(term1156234, term1156234.getClass(), "nextPoints", term1156239);
        setIntField(term1156234, term1156234.getClass(), "ftlSpeed", -1744585818);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getY", argTypes, term1156234, args);
    }

};


