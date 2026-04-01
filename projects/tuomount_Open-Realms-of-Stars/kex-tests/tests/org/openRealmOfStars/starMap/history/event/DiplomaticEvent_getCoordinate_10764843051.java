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

public class DiplomaticEvent_getCoordinate_10764843051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37034;

    public DiplomaticEvent_getCoordinate_10764843051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37104 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term37103 = ((Class) term37104).getDeclaredField((String) "PLANET_CONQUERED");
        ((Field) term37103).setAccessible(true);
        Object enum94 = ((Field) term37103).get((Object) null);
        term37034 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.DiplomaticEvent"));
        Object term37035 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term37035, term37035.getClass(), "x", 147209682);
        setIntField(term37035, term37035.getClass(), "y", 34470066);
        setField(term37034, term37034.getClass(), "coordinate", term37035);
        setField(term37034, term37034.getClass(), "planetName", "fbnKvthhOz");
        setField(term37034, term37034.getClass(), "text", "PGfCDJTBek");
        setField(term37034, term37034.getClass(), "type", enum94);
        setByteField(term37034, term37034.getClass(), "playerIndex", (byte) 13);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.DiplomaticEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCoordinate", argTypes, term37034, args);
    }

};


