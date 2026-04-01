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
import java.lang.String;
import java.lang.Object;

public class Building_init_4348376170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum0;

    public Building_init_4348376170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1194 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term1193 = ((Class) term1194).getDeclaredField((String) "FARM");
        ((Field) term1193).setAccessible(true);
        enum0 = ((Field) term1193).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Object[] args = new Object[3];
        args[0] = "BndsHwAFMv";
        args[1] = "GzFkzHGYFt";
        args[2] = enum0;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


