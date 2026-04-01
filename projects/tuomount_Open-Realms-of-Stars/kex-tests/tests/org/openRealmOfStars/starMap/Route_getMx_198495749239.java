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

public class Route_getMx_198495749239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156559;

    public Route_getMx_198495749239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1156564 = new ArrayList();
        term1156559 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1156559, term1156559.getClass(), "startX", 0.0015033902879237893);
        setDoubleField(term1156559, term1156559.getClass(), "startY", 0.9477686563600426);
        setDoubleField(term1156559, term1156559.getClass(), "endX", 0.530126080388379);
        setDoubleField(term1156559, term1156559.getClass(), "endY", 0.44773981891873893);
        setField(term1156559, term1156559.getClass(), "nextPoints", term1156564);
        setIntField(term1156559, term1156559.getClass(), "ftlSpeed", -297343325);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMx", argTypes, term1156559, args);
    }

};


