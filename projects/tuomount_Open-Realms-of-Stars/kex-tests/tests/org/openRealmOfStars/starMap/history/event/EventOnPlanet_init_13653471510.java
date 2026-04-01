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
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class EventOnPlanet_init_13653471510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum77;
     Object term30933;
     Object term30948;

    public EventOnPlanet_init_13653471510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30951 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term30950 = ((Class) term30951).getDeclaredField((String) "LEADER_EVENT");
        ((Field) term30950).setAccessible(true);
        enum77 = ((Field) term30950).get((Object) null);
        term30933 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term30933, term30933.getClass(), "x", -1618206977);
        setIntField(term30933, term30933.getClass(), "y", -1747406163);
        term30948 = new Integer(1684998508);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.EventOnPlanet");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.history.event.EventType");
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = enum77;
        args[1] = term30933;
        args[2] = "fhZgTouhCC";
        args[3] = term30948;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


