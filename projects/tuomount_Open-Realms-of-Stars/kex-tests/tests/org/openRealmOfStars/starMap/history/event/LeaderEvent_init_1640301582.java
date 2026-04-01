package org.openRealmOfStars.starMap.history.event;

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
import static org.openRealmOfStars.starMap.history.event.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class LeaderEvent_init_1640301582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26481;
     Object term26483;
     Object term26485;

    public LeaderEvent_init_1640301582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26481 = new Integer(-2066804303);
        term26483 = new Integer(-1731761810);
        term26485 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term26485, term26485.getClass(), "x", 197109649);
        setIntField(term26485, term26485.getClass(), "y", -1239406390);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.LeaderEvent");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        Object[] args = new Object[3];
        args[0] = term26481;
        args[1] = term26483;
        args[2] = term26485;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


