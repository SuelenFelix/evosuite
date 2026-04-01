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

public class CombatEvent_getText_21466247474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40438;

    public CombatEvent_getText_21466247474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term40504 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term40503 = ((Class) term40504).getDeclaredField((String) "PLAYER_START");
        ((Field) term40503).setAccessible(true);
        Object enum103 = ((Field) term40503).get((Object) null);
        term40438 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.CombatEvent"));
        Object term40439 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term40439, term40439.getClass(), "x", 413548937);
        setIntField(term40439, term40439.getClass(), "y", 1901317214);
        setField(term40438, term40438.getClass(), "coordinate", term40439);
        setField(term40438, term40438.getClass(), "planetName", "FvUCZgTXhq");
        setField(term40438, term40438.getClass(), "text", "wWWidPCHzx");
        setField(term40438, term40438.getClass(), "type", enum103);
        setByteField(term40438, term40438.getClass(), "playerIndex", (byte) 35);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.CombatEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getText", argTypes, term40438, args);
    }

};


