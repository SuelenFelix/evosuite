package org.openRealmOfStars.mapTiles.anomaly;

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
import static org.openRealmOfStars.mapTiles.anomaly.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class SpaceAnomaly_init_15245935370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum2;
     Object term787;

    public SpaceAnomaly_init_15245935370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term790 = Class.forName((String) "org.openRealmOfStars.mapTiles.anomaly.AnomalyType");
        Field term789 = ((Class) term790).getDeclaredField((String) "MAP");
        ((Field) term789).setAccessible(true);
        enum2 = ((Field) term789).get((Object) null);
        term787 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.anomaly.SpaceAnomaly");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.mapTiles.anomaly.AnomalyType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = enum2;
        args[1] = term787;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


