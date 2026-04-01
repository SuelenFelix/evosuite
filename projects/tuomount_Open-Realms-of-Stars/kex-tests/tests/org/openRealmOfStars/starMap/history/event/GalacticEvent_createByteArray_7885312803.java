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

public class GalacticEvent_createByteArray_7885312803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42359;

    public GalacticEvent_createByteArray_7885312803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term42404 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term42403 = ((Class) term42404).getDeclaredField((String) "ASCENSION_PORTAL");
        ((Field) term42403).setAccessible(true);
        Object enum108 = ((Field) term42403).get((Object) null);
        term42359 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.GalacticEvent"));
        setField(term42359, term42359.getClass(), "text", "HqoTWlkbwF");
        setField(term42359, term42359.getClass(), "type", enum108);
        setByteField(term42359, term42359.getClass(), "playerIndex", (byte) -112);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.GalacticEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createByteArray", argTypes, term42359, args);
    }

};


