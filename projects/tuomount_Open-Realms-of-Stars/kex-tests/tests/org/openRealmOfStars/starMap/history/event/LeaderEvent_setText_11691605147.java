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

public class LeaderEvent_setText_11691605147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28329;

    public LeaderEvent_setText_11691605147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28408 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term28407 = ((Class) term28408).getDeclaredField((String) "PLAYER_START");
        ((Field) term28407).setAccessible(true);
        Object enum70 = ((Field) term28407).get((Object) null);
        term28329 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.LeaderEvent"));
        Object term28330 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term28330, term28330.getClass(), "x", -1945706126);
        setIntField(term28330, term28330.getClass(), "y", 1152356969);
        setField(term28329, term28329.getClass(), "coordinate", term28330);
        setField(term28329, term28329.getClass(), "planetName", "tOszriqETr");
        setIntField(term28329, term28329.getClass(), "leaderIndex", -1214628358);
        setField(term28329, term28329.getClass(), "text", "ncSPTkhKjO");
        setField(term28329, term28329.getClass(), "type", enum70);
        setByteField(term28329, term28329.getClass(), "playerIndex", (byte) 72);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.LeaderEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jcWKHRWhyj";
        callMethod(klass, "setText", argTypes, term28329, args);
    }

};


