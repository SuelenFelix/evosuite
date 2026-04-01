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

public class LeaderEvent_getText_5507160546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27944;

    public LeaderEvent_getText_5507160546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28015 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term28014 = ((Class) term28015).getDeclaredField((String) "PLANET_COLONIZED");
        ((Field) term28014).setAccessible(true);
        Object enum69 = ((Field) term28014).get((Object) null);
        term27944 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.LeaderEvent"));
        Object term27945 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term27945, term27945.getClass(), "x", -1899301124);
        setIntField(term27945, term27945.getClass(), "y", -1882480155);
        setField(term27944, term27944.getClass(), "coordinate", term27945);
        setField(term27944, term27944.getClass(), "planetName", "vMsWjuPTnO");
        setIntField(term27944, term27944.getClass(), "leaderIndex", 389427431);
        setField(term27944, term27944.getClass(), "text", "zHvfKaOstO");
        setField(term27944, term27944.getClass(), "type", enum69);
        setByteField(term27944, term27944.getClass(), "playerIndex", (byte) 42);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.LeaderEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getText", argTypes, term27944, args);
    }

};


