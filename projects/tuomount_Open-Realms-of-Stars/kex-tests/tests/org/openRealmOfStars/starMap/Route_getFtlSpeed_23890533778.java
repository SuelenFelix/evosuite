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

public class Route_getFtlSpeed_23890533778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156895;

    public Route_getFtlSpeed_23890533778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1156895 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1156895, term1156895.getClass(), "startX", 0.0);
        setDoubleField(term1156895, term1156895.getClass(), "startY", 0.0);
        setDoubleField(term1156895, term1156895.getClass(), "endX", 0.0);
        setDoubleField(term1156895, term1156895.getClass(), "endY", 0.0);
        setField(term1156895, term1156895.getClass(), "nextPoints", null);
        setIntField(term1156895, term1156895.getClass(), "ftlSpeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFtlSpeed", argTypes, term1156895, args);
    }

};


