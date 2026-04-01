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

public class AscendedEvent_createByteArray_6979670394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43810;

    public AscendedEvent_createByteArray_6979670394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term43854 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term43853 = ((Class) term43854).getDeclaredField((String) "LEADER_EVENT");
        ((Field) term43853).setAccessible(true);
        Object enum112 = ((Field) term43853).get((Object) null);
        term43810 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.AscendedEvent"));
        Object term43811 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term43811, term43811.getClass(), "x", -2013924238);
        setIntField(term43811, term43811.getClass(), "y", 579006268);
        setField(term43810, term43810.getClass(), "coordinate", term43811);
        setField(term43810, term43810.getClass(), "text", "YfkhviKZwl");
        setField(term43810, term43810.getClass(), "type", enum112);
        setByteField(term43810, term43810.getClass(), "playerIndex", (byte) -89);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.AscendedEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createByteArray", argTypes, term43810, args);
    }

};


