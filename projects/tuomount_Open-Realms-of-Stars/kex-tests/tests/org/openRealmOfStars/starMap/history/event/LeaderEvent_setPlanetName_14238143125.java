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

public class LeaderEvent_setPlanetName_14238143125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27497;

    public LeaderEvent_setPlanetName_14238143125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27590 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term27589 = ((Class) term27590).getDeclaredField((String) "DIPLOMATIC_RELATION_CHANGE");
        ((Field) term27589).setAccessible(true);
        Object enum68 = ((Field) term27589).get((Object) null);
        term27497 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.LeaderEvent"));
        Object term27498 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term27498, term27498.getClass(), "x", 114754804);
        setIntField(term27498, term27498.getClass(), "y", 1687361082);
        setField(term27497, term27497.getClass(), "coordinate", term27498);
        setField(term27497, term27497.getClass(), "planetName", "bEmHScVZaQ");
        setIntField(term27497, term27497.getClass(), "leaderIndex", 497269071);
        setField(term27497, term27497.getClass(), "text", "TcuXODkzBV");
        setField(term27497, term27497.getClass(), "type", enum68);
        setByteField(term27497, term27497.getClass(), "playerIndex", (byte) 80);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.LeaderEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "coJPjrBZNe";
        callMethod(klass, "setPlanetName", argTypes, term27497, args);
    }

};


