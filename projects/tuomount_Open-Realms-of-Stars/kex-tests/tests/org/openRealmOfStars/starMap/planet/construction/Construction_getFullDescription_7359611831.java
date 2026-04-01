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

public class Construction_getFullDescription_7359611831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122;

    public Construction_getFullDescription_7359611831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Construction"));
        setField(term122, term122.getClass(), "name", "EGtDIRbSSb");
        setField(term122, term122.getClass(), "iconId", "SzjVpOQTyS");
        setField(term122, term122.getClass(), "description", "MjGYSRKTNF");
        setIntField(term122, term122.getClass(), "prodCost", 1484323161);
        setIntField(term122, term122.getClass(), "metalCost", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Construction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFullDescription", argTypes, term122, args);
    }

};


