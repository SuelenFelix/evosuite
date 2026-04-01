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

public class DiplomaticEvent_setText_12285101815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38556;

    public DiplomaticEvent_setText_12285101815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38634 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term38633 = ((Class) term38634).getDeclaredField((String) "PLAYER_START");
        ((Field) term38633).setAccessible(true);
        Object enum98 = ((Field) term38633).get((Object) null);
        term38556 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.DiplomaticEvent"));
        Object term38557 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term38557, term38557.getClass(), "x", 306847454);
        setIntField(term38557, term38557.getClass(), "y", 1745276158);
        setField(term38556, term38556.getClass(), "coordinate", term38557);
        setField(term38556, term38556.getClass(), "planetName", "EEYmuwyVDP");
        setField(term38556, term38556.getClass(), "text", "EWFbEDAVrE");
        setField(term38556, term38556.getClass(), "type", enum98);
        setByteField(term38556, term38556.getClass(), "playerIndex", (byte) 45);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.DiplomaticEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EMiMtYgfvr";
        callMethod(klass, "setText", argTypes, term38556, args);
    }

};


