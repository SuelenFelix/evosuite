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

public class EventOnPlanet_getName_10237941042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31647;

    public EventOnPlanet_getName_10237941042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31713 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term31712 = ((Class) term31713).getDeclaredField((String) "LEADER_EVENT");
        ((Field) term31712).setAccessible(true);
        Object enum79 = ((Field) term31712).get((Object) null);
        term31647 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.EventOnPlanet"));
        Object term31648 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term31648, term31648.getClass(), "x", -860131894);
        setIntField(term31648, term31648.getClass(), "y", -1022990421);
        setField(term31647, term31647.getClass(), "coordinate", term31648);
        setField(term31647, term31647.getClass(), "name", "CgleElJNje");
        setField(term31647, term31647.getClass(), "text", "ZrchvNGMtd");
        setField(term31647, term31647.getClass(), "type", enum79);
        setByteField(term31647, term31647.getClass(), "playerIndex", (byte) -103);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.EventOnPlanet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term31647, args);
    }

};


