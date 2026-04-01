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

public class TemperatureType_getByIndex_183219388211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum36;
     Object term12045;

    public TemperatureType_getByIndex_183219388211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12048 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.TemperatureType");
        Field term12047 = ((Class) term12048).getDeclaredField((String) "VOLCANIC");
        ((Field) term12047).setAccessible(true);
        enum36 = ((Field) term12047).get((Object) null);
        term12045 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.enums.TemperatureType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term12045;
        callMethod(klass, "getByIndex", argTypes, enum36, args);
    }

};


