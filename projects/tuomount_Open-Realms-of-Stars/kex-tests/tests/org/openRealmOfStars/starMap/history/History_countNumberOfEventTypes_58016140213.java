package org.openRealmOfStars.starMap.history;

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
import static org.openRealmOfStars.starMap.history.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class History_countNumberOfEventTypes_58016140213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45791;
     Object enum116;

    public History_countNumberOfEventTypes_58016140213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term45792 = new ArrayList();
        term45791 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.History"));
        setField(term45791, term45791.getClass(), "listOfTurns", term45792);
        Class<? extends Object> term45814 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term45813 = ((Class) term45814).getDeclaredField((String) "GALACTIC_NEWS");
        ((Field) term45813).setAccessible(true);
        enum116 = ((Field) term45813).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.History");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.history.event.EventType");
        Object[] args = new Object[1];
        args[0] = enum116;
        callMethod(klass, "countNumberOfEventTypes", argTypes, term45791, args);
    }

};


