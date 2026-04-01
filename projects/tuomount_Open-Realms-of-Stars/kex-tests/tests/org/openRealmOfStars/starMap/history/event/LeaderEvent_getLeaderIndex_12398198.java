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

public class LeaderEvent_getLeaderIndex_12398198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28720;

    public LeaderEvent_getLeaderIndex_12398198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28789 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term28788 = ((Class) term28789).getDeclaredField((String) "CULTURE_CHANGE");
        ((Field) term28788).setAccessible(true);
        Object enum71 = ((Field) term28788).get((Object) null);
        term28720 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.LeaderEvent"));
        Object term28721 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term28721, term28721.getClass(), "x", 1102721075);
        setIntField(term28721, term28721.getClass(), "y", -426764678);
        setField(term28720, term28720.getClass(), "coordinate", term28721);
        setField(term28720, term28720.getClass(), "planetName", "nrQjODRMLD");
        setIntField(term28720, term28720.getClass(), "leaderIndex", -1870495012);
        setField(term28720, term28720.getClass(), "text", "PNoWXrsFic");
        setField(term28720, term28720.getClass(), "type", enum71);
        setByteField(term28720, term28720.getClass(), "playerIndex", (byte) 111);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.LeaderEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLeaderIndex", argTypes, term28720, args);
    }

};


