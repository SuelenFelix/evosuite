package org.openRealmOfStars.utilities;

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
import static org.openRealmOfStars.utilities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;

public class PixelsToMapCoordinate_init_15274556830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term471;
     Object term474;
     Object term476;
     Object term478;
     Object term480;
     Object term482;
     Object term484;
     Object term486;
     Object term488;

    public PixelsToMapCoordinate_init_15274556830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term471 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term471, term471.getClass(), "x", 1162663216);
        setIntField(term471, term471.getClass(), "y", 1484323161);
        term474 = new Integer(-1922583790);
        term476 = new Integer(-616727354);
        term478 = new Integer(-1955890973);
        term480 = new Integer(-2038273078);
        term482 = new Integer(1227103734);
        term484 = new Integer(-1339778481);
        term486 = new Boolean(false);
        term488 = new Integer(1725571209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.PixelsToMapCoordinate");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = boolean.class;
        argTypes[8] = int.class;
        Object[] args = new Object[9];
        args[0] = term471;
        args[1] = term474;
        args[2] = term476;
        args[3] = term478;
        args[4] = term480;
        args[5] = term482;
        args[6] = term484;
        args[7] = term486;
        args[8] = term488;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


