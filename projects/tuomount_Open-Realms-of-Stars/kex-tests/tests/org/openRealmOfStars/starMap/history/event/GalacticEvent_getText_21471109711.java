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
import java.lang.String;
import java.lang.Object;

public class GalacticEvent_getText_21471109711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41651;

    public GalacticEvent_getText_21471109711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term41692 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term41691 = ((Class) term41692).getDeclaredField((String) "LEADER_EVENT");
        ((Field) term41691).setAccessible(true);
        Object enum106 = ((Field) term41691).get((Object) null);
        term41651 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.GalacticEvent"));
        setField(term41651, term41651.getClass(), "text", "JdOMfNWgLP");
        setField(term41651, term41651.getClass(), "type", enum106);
        setByteField(term41651, term41651.getClass(), "playerIndex", (byte) -128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.GalacticEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getText", argTypes, term41651, args);
    }

};


