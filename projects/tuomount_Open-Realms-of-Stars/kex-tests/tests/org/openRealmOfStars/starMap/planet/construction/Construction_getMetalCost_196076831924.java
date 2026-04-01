package org.openRealmOfStars.starMap.planet.construction;

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
import static org.openRealmOfStars.starMap.planet.construction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Construction_getMetalCost_196076831924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1052;

    public Construction_getMetalCost_196076831924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1052 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Construction"));
        setField(term1052, term1052.getClass(), "name", null);
        setField(term1052, term1052.getClass(), "iconId", null);
        setField(term1052, term1052.getClass(), "description", null);
        setIntField(term1052, term1052.getClass(), "prodCost", 0);
        setIntField(term1052, term1052.getClass(), "metalCost", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Construction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMetalCost", argTypes, term1052, args);
    }

};


