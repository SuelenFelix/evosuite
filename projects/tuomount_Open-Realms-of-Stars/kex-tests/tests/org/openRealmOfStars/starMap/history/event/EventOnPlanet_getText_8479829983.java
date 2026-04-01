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

public class EventOnPlanet_getText_8479829983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32015;

    public EventOnPlanet_getText_8479829983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32083 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term32082 = ((Class) term32083).getDeclaredField((String) "CULTURE_CHANGE");
        ((Field) term32082).setAccessible(true);
        Object enum80 = ((Field) term32082).get((Object) null);
        term32015 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.EventOnPlanet"));
        Object term32016 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term32016, term32016.getClass(), "x", -1122880881);
        setIntField(term32016, term32016.getClass(), "y", -542712742);
        setField(term32015, term32015.getClass(), "coordinate", term32016);
        setField(term32015, term32015.getClass(), "name", "WaEcyVlcIx");
        setField(term32015, term32015.getClass(), "text", "ONcbPCQnHd");
        setField(term32015, term32015.getClass(), "type", enum80);
        setByteField(term32015, term32015.getClass(), "playerIndex", (byte) 98);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.EventOnPlanet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getText", argTypes, term32015, args);
    }

};


