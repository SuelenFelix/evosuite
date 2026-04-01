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

public class RiftPortalEvent_getCoordinate_9319102521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29492;

    public RiftPortalEvent_getCoordinate_9319102521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29536 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term29535 = ((Class) term29536).getDeclaredField((String) "PLAYER_START");
        ((Field) term29535).setAccessible(true);
        Object enum73 = ((Field) term29535).get((Object) null);
        term29492 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.RiftPortalEvent"));
        Object term29493 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term29493, term29493.getClass(), "x", 548228925);
        setIntField(term29493, term29493.getClass(), "y", -749861210);
        setField(term29492, term29492.getClass(), "coordinate", term29493);
        setField(term29492, term29492.getClass(), "text", "MlzTkzKMCX");
        setField(term29492, term29492.getClass(), "type", enum73);
        setByteField(term29492, term29492.getClass(), "playerIndex", (byte) 69);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.RiftPortalEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCoordinate", argTypes, term29492, args);
    }

};


