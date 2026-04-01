package org.openRealmOfStars.starMap;

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
import static org.openRealmOfStars.starMap.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Byte;
import java.lang.Integer;

public class SquareInfo_init_20566905309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4203758;
     Object term4203760;

    public SquareInfo_init_20566905309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4203758 = new Byte((byte) 0);
        term4203760 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.SquareInfo");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = byte.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4203758;
        args[1] = term4203760;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


