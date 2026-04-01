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

public class DiplomaticEvent_setPlanetName_13644646453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37786;

    public DiplomaticEvent_setPlanetName_13644646453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37864 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term37863 = ((Class) term37864).getDeclaredField((String) "SPACE_COMBAT");
        ((Field) term37863).setAccessible(true);
        Object enum96 = ((Field) term37863).get((Object) null);
        term37786 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.DiplomaticEvent"));
        Object term37787 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term37787, term37787.getClass(), "x", 515182546);
        setIntField(term37787, term37787.getClass(), "y", -936895502);
        setField(term37786, term37786.getClass(), "coordinate", term37787);
        setField(term37786, term37786.getClass(), "planetName", "uePedtiAfL");
        setField(term37786, term37786.getClass(), "text", "AdSHvysxQB");
        setField(term37786, term37786.getClass(), "type", enum96);
        setByteField(term37786, term37786.getClass(), "playerIndex", (byte) -63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.DiplomaticEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jlraKkBWFA";
        callMethod(klass, "setPlanetName", argTypes, term37786, args);
    }

};


