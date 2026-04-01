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

public class PlayerStartEvent_getName_17380173042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33661;

    public PlayerStartEvent_getName_17380173042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33719 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term33718 = ((Class) term33719).getDeclaredField((String) "DIPLOMATIC_RELATION_CHANGE");
        ((Field) term33718).setAccessible(true);
        Object enum84 = ((Field) term33718).get((Object) null);
        term33661 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.PlayerStartEvent"));
        Object term33662 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term33662, term33662.getClass(), "x", 842904495);
        setIntField(term33662, term33662.getClass(), "y", 1008080511);
        setField(term33661, term33661.getClass(), "coordinate", term33662);
        setField(term33661, term33661.getClass(), "name", "XMHwbfiHRl");
        setField(term33661, term33661.getClass(), "type", enum84);
        setByteField(term33661, term33661.getClass(), "playerIndex", (byte) -91);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.PlayerStartEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term33661, args);
    }

};


