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

public class EventOnPlanet_createByteArray_5113420475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32837;

    public EventOnPlanet_createByteArray_5113420475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32903 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term32902 = ((Class) term32903).getDeclaredField((String) "PLAYER_START");
        ((Field) term32902).setAccessible(true);
        Object enum82 = ((Field) term32902).get((Object) null);
        term32837 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.EventOnPlanet"));
        Object term32838 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term32838, term32838.getClass(), "x", 1320570890);
        setIntField(term32838, term32838.getClass(), "y", -130649791);
        setField(term32837, term32837.getClass(), "coordinate", term32838);
        setField(term32837, term32837.getClass(), "name", "FftYCNbnks");
        setField(term32837, term32837.getClass(), "text", "lJoltmsadS");
        setField(term32837, term32837.getClass(), "type", enum82);
        setByteField(term32837, term32837.getClass(), "playerIndex", (byte) 61);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.EventOnPlanet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createByteArray", argTypes, term32837, args);
    }

};


