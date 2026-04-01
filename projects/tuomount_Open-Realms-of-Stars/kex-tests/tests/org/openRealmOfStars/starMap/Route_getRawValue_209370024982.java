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

public class Route_getRawValue_209370024982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156923;

    public Route_getRawValue_209370024982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1156923 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1156923, term1156923.getClass(), "startX", 0.0);
        setDoubleField(term1156923, term1156923.getClass(), "startY", 0.0);
        setDoubleField(term1156923, term1156923.getClass(), "endX", 0.0);
        setDoubleField(term1156923, term1156923.getClass(), "endY", 0.0);
        setField(term1156923, term1156923.getClass(), "nextPoints", null);
        setIntField(term1156923, term1156923.getClass(), "ftlSpeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRawValue", argTypes, term1156923, args);
    }

};


