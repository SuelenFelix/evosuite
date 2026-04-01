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

public class PixelsToMapCoordinate_init_15274556837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term574;
     Object term576;
     Object term578;
     Object term580;
     Object term582;
     Object term584;
     Object term586;
     Object term588;

    public PixelsToMapCoordinate_init_15274556837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term574 = new Integer(0);
        term576 = new Integer(0);
        term578 = new Integer(0);
        term580 = new Integer(0);
        term582 = new Integer(0);
        term584 = new Integer(0);
        term586 = new Boolean(false);
        term588 = new Integer(0);
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
        args[0] = null;
        args[1] = term574;
        args[2] = term576;
        args[3] = term578;
        args[4] = term580;
        args[5] = term582;
        args[6] = term584;
        args[7] = term586;
        args[8] = term588;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


