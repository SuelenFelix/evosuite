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

public class DiplomaticEvent_createByteArray_8679586586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38946;

    public DiplomaticEvent_createByteArray_8679586586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39012 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term39011 = ((Class) term39012).getDeclaredField((String) "SPACE_COMBAT");
        ((Field) term39011).setAccessible(true);
        Object enum99 = ((Field) term39011).get((Object) null);
        term38946 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.DiplomaticEvent"));
        Object term38947 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term38947, term38947.getClass(), "x", 2049577015);
        setIntField(term38947, term38947.getClass(), "y", 1236004505);
        setField(term38946, term38946.getClass(), "coordinate", term38947);
        setField(term38946, term38946.getClass(), "planetName", "OyYyYYnJuF");
        setField(term38946, term38946.getClass(), "text", "aYLvcxZohT");
        setField(term38946, term38946.getClass(), "type", enum99);
        setByteField(term38946, term38946.getClass(), "playerIndex", (byte) -39);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.DiplomaticEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createByteArray", argTypes, term38946, args);
    }

};


