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

public class LeaderEvent_getCoordinate_11358339723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26488;

    public LeaderEvent_getCoordinate_11358339723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26806 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term26805 = ((Class) term26806).getDeclaredField((String) "PLANET_CONQUERED");
        ((Field) term26805).setAccessible(true);
        Object enum66 = ((Field) term26805).get((Object) null);
        term26488 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.LeaderEvent"));
        Object term26489 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term26489, term26489.getClass(), "x", -1504890659);
        setIntField(term26489, term26489.getClass(), "y", 1358829571);
        setField(term26488, term26488.getClass(), "coordinate", term26489);
        setField(term26488, term26488.getClass(), "planetName", "qnYaYSpDwO");
        setIntField(term26488, term26488.getClass(), "leaderIndex", -506958186);
        setField(term26488, term26488.getClass(), "text", "dgbFDCdHtj");
        setField(term26488, term26488.getClass(), "type", enum66);
        setByteField(term26488, term26488.getClass(), "playerIndex", (byte) -119);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.LeaderEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCoordinate", argTypes, term26488, args);
    }

};


