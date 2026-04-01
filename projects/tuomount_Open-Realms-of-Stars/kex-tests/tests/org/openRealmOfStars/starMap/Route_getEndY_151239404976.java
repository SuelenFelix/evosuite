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

public class Route_getEndY_151239404976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156881;

    public Route_getEndY_151239404976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1156881 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1156881, term1156881.getClass(), "startX", 0.0);
        setDoubleField(term1156881, term1156881.getClass(), "startY", 0.0);
        setDoubleField(term1156881, term1156881.getClass(), "endX", 0.0);
        setDoubleField(term1156881, term1156881.getClass(), "endY", 0.0);
        setField(term1156881, term1156881.getClass(), "nextPoints", null);
        setIntField(term1156881, term1156881.getClass(), "ftlSpeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndY", argTypes, term1156881, args);
    }

};


