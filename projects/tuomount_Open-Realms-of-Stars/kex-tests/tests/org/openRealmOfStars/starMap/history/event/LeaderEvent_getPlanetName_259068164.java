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

public class LeaderEvent_getPlanetName_259068164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27120;

    public LeaderEvent_getPlanetName_259068164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27189 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term27188 = ((Class) term27189).getDeclaredField((String) "CULTURE_CHANGE");
        ((Field) term27188).setAccessible(true);
        Object enum67 = ((Field) term27188).get((Object) null);
        term27120 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.LeaderEvent"));
        Object term27121 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term27121, term27121.getClass(), "x", -507387516);
        setIntField(term27121, term27121.getClass(), "y", -1970452551);
        setField(term27120, term27120.getClass(), "coordinate", term27121);
        setField(term27120, term27120.getClass(), "planetName", "EKpdCBubDE");
        setIntField(term27120, term27120.getClass(), "leaderIndex", 729658803);
        setField(term27120, term27120.getClass(), "text", "zMsSLTfGhl");
        setField(term27120, term27120.getClass(), "type", enum67);
        setByteField(term27120, term27120.getClass(), "playerIndex", (byte) 71);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.LeaderEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlanetName", argTypes, term27120, args);
    }

};


