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

public class EventOnPlanet_getCoordinate_14331009161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31263;

    public EventOnPlanet_getCoordinate_14331009161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31333 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term31332 = ((Class) term31333).getDeclaredField((String) "ASCENSION_PORTAL");
        ((Field) term31332).setAccessible(true);
        Object enum78 = ((Field) term31332).get((Object) null);
        term31263 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.EventOnPlanet"));
        Object term31264 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term31264, term31264.getClass(), "x", -1476644457);
        setIntField(term31264, term31264.getClass(), "y", 1270666529);
        setField(term31263, term31263.getClass(), "coordinate", term31264);
        setField(term31263, term31263.getClass(), "name", "wrikqJwXvL");
        setField(term31263, term31263.getClass(), "text", "UiWhvbypdr");
        setField(term31263, term31263.getClass(), "type", enum78);
        setByteField(term31263, term31263.getClass(), "playerIndex", (byte) -57);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.EventOnPlanet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCoordinate", argTypes, term31263, args);
    }

};


