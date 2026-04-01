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

public class CombatEvent_setPlanetName_12752442913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40052;

    public CombatEvent_setPlanetName_12752442913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term40129 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term40128 = ((Class) term40129).getDeclaredField((String) "RIFT_PORTAL");
        ((Field) term40128).setAccessible(true);
        Object enum102 = ((Field) term40128).get((Object) null);
        term40052 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.CombatEvent"));
        Object term40053 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term40053, term40053.getClass(), "x", -1533843432);
        setIntField(term40053, term40053.getClass(), "y", -123338791);
        setField(term40052, term40052.getClass(), "coordinate", term40053);
        setField(term40052, term40052.getClass(), "planetName", "ZbHJVEqcoa");
        setField(term40052, term40052.getClass(), "text", "awDQVEVIKi");
        setField(term40052, term40052.getClass(), "type", enum102);
        setByteField(term40052, term40052.getClass(), "playerIndex", (byte) -101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.CombatEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HJwNgUzZZR";
        callMethod(klass, "setPlanetName", argTypes, term40052, args);
    }

};


