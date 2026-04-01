package org.openRealmOfStars.mapTiles;

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
import static org.openRealmOfStars.mapTiles.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Tiles_getSunTile_13593336675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum2;

    public Tiles_getSunTile_13593336675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3237 = Class.forName((String) "org.openRealmOfStars.starMap.SunType");
        Field term3236 = ((Class) term3237).getDeclaredField((String) "BLUE_STAR");
        ((Field) term3236).setAccessible(true);
        enum2 = ((Field) term3236).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.Tiles");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.SunType");
        Object[] args = new Object[2];
        args[0] = "OWKQODBLzb";
        args[1] = enum2;
        callMethod(klass, "getSunTile", argTypes, null, args);
    }

};


