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

public class RiftPortalEvent_getText_3467923342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29838;

    public RiftPortalEvent_getText_3467923342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29882 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term29881 = ((Class) term29882).getDeclaredField((String) "PLAYER_START");
        ((Field) term29881).setAccessible(true);
        Object enum74 = ((Field) term29881).get((Object) null);
        term29838 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.RiftPortalEvent"));
        Object term29839 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term29839, term29839.getClass(), "x", 937859191);
        setIntField(term29839, term29839.getClass(), "y", -916584829);
        setField(term29838, term29838.getClass(), "coordinate", term29839);
        setField(term29838, term29838.getClass(), "text", "UqKUbMyPMJ");
        setField(term29838, term29838.getClass(), "type", enum74);
        setByteField(term29838, term29838.getClass(), "playerIndex", (byte) -74);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.RiftPortalEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getText", argTypes, term29838, args);
    }

};


