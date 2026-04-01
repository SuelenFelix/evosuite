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
import java.lang.Integer;

public class Construction_setMetalCost_56609002725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1055;
     Object term1058;

    public Construction_setMetalCost_56609002725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1055 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Construction"));
        setField(term1055, term1055.getClass(), "name", null);
        setField(term1055, term1055.getClass(), "iconId", null);
        setField(term1055, term1055.getClass(), "description", null);
        setIntField(term1055, term1055.getClass(), "prodCost", 0);
        setIntField(term1055, term1055.getClass(), "metalCost", 0);
        term1058 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Construction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1058;
        callMethod(klass, "setMetalCost", argTypes, term1055, args);
    }

};


