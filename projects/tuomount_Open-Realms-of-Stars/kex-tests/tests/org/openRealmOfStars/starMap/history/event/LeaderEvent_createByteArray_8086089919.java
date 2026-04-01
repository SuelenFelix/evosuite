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

public class LeaderEvent_createByteArray_8086089919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29097;

    public LeaderEvent_createByteArray_8086089919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29160 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term29159 = ((Class) term29160).getDeclaredField((String) "ASCENDED");
        ((Field) term29159).setAccessible(true);
        Object enum72 = ((Field) term29159).get((Object) null);
        term29097 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.LeaderEvent"));
        Object term29098 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term29098, term29098.getClass(), "x", -1310015129);
        setIntField(term29098, term29098.getClass(), "y", -2104981311);
        setField(term29097, term29097.getClass(), "coordinate", term29098);
        setField(term29097, term29097.getClass(), "planetName", "QZBHZqZope");
        setIntField(term29097, term29097.getClass(), "leaderIndex", 318591690);
        setField(term29097, term29097.getClass(), "text", "VBUahCvyxC");
        setField(term29097, term29097.getClass(), "type", enum72);
        setByteField(term29097, term29097.getClass(), "playerIndex", (byte) 99);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.LeaderEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createByteArray", argTypes, term29097, args);
    }

};


