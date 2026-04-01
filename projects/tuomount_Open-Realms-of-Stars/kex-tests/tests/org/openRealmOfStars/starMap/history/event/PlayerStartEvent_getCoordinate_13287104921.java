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

public class PlayerStartEvent_getCoordinate_13287104921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33259;

    public PlayerStartEvent_getCoordinate_13287104921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33317 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term33316 = ((Class) term33317).getDeclaredField((String) "DIPLOMATIC_RELATION_CHANGE");
        ((Field) term33316).setAccessible(true);
        Object enum83 = ((Field) term33316).get((Object) null);
        term33259 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.PlayerStartEvent"));
        Object term33260 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term33260, term33260.getClass(), "x", 57189932);
        setIntField(term33260, term33260.getClass(), "y", 1460722225);
        setField(term33259, term33259.getClass(), "coordinate", term33260);
        setField(term33259, term33259.getClass(), "name", "bvSgmFUDOU");
        setField(term33259, term33259.getClass(), "type", enum83);
        setByteField(term33259, term33259.getClass(), "playerIndex", (byte) -126);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.PlayerStartEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCoordinate", argTypes, term33259, args);
    }

};


