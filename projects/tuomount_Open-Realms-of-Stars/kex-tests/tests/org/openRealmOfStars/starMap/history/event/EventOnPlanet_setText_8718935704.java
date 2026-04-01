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
import java.lang.Object;
import java.lang.String;

public class EventOnPlanet_setText_8718935704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32391;

    public EventOnPlanet_setText_8718935704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32483 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term32482 = ((Class) term32483).getDeclaredField((String) "DIPLOMATIC_RELATION_CHANGE");
        ((Field) term32482).setAccessible(true);
        Object enum81 = ((Field) term32482).get((Object) null);
        term32391 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.EventOnPlanet"));
        Object term32392 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term32392, term32392.getClass(), "x", -1111249833);
        setIntField(term32392, term32392.getClass(), "y", -1692331299);
        setField(term32391, term32391.getClass(), "coordinate", term32392);
        setField(term32391, term32391.getClass(), "name", "AobDaplFLl");
        setField(term32391, term32391.getClass(), "text", "pDkMNnAGgv");
        setField(term32391, term32391.getClass(), "type", enum81);
        setByteField(term32391, term32391.getClass(), "playerIndex", (byte) 79);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.EventOnPlanet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PaCpFXGzdX";
        callMethod(klass, "setText", argTypes, term32391, args);
    }

};


