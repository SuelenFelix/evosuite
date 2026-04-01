package org.openRealmOfStars.starMap.planet.enums;

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
import static org.openRealmOfStars.starMap.planet.enums.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class PlanetaryEvent_getByIndex_6484783418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum12;
     Object term4211;

    public PlanetaryEvent_getByIndex_6484783418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4214 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.PlanetaryEvent");
        Field term4213 = ((Class) term4214).getDeclaredField((String) "ANCIENT_LAB");
        ((Field) term4213).setAccessible(true);
        enum12 = ((Field) term4213).get((Object) null);
        term4211 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.enums.PlanetaryEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4211;
        callMethod(klass, "getByIndex", argTypes, enum12, args);
    }

};


