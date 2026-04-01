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

public class CombatEvent_getCoordinate_15632246311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39336;

    public CombatEvent_getCoordinate_15632246311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39398 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term39397 = ((Class) term39398).getDeclaredField((String) "ASCENDED");
        ((Field) term39397).setAccessible(true);
        Object enum100 = ((Field) term39397).get((Object) null);
        term39336 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.CombatEvent"));
        Object term39337 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term39337, term39337.getClass(), "x", 1870727665);
        setIntField(term39337, term39337.getClass(), "y", -519881101);
        setField(term39336, term39336.getClass(), "coordinate", term39337);
        setField(term39336, term39336.getClass(), "planetName", "mnHyQbMyld");
        setField(term39336, term39336.getClass(), "text", "KHtaDOIcJZ");
        setField(term39336, term39336.getClass(), "type", enum100);
        setByteField(term39336, term39336.getClass(), "playerIndex", (byte) 77);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.CombatEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCoordinate", argTypes, term39336, args);
    }

};


