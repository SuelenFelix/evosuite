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

public class DiplomaticEvent_getPlanetName_852564832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37418;

    public DiplomaticEvent_getPlanetName_852564832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37484 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term37483 = ((Class) term37484).getDeclaredField((String) "PLAYER_START");
        ((Field) term37483).setAccessible(true);
        Object enum95 = ((Field) term37483).get((Object) null);
        term37418 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.DiplomaticEvent"));
        Object term37419 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term37419, term37419.getClass(), "x", 1743683601);
        setIntField(term37419, term37419.getClass(), "y", -945116798);
        setField(term37418, term37418.getClass(), "coordinate", term37419);
        setField(term37418, term37418.getClass(), "planetName", "ZwjARhAtHC");
        setField(term37418, term37418.getClass(), "text", "XXvscsYBWv");
        setField(term37418, term37418.getClass(), "type", enum95);
        setByteField(term37418, term37418.getClass(), "playerIndex", (byte) 44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.DiplomaticEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlanetName", argTypes, term37418, args);
    }

};


