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

public class CombatEvent_getPlanetName_15700018772 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39688;

    public CombatEvent_getPlanetName_15700018772() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39753 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term39752 = ((Class) term39753).getDeclaredField((String) "RIFT_PORTAL");
        ((Field) term39752).setAccessible(true);
        Object enum101 = ((Field) term39752).get((Object) null);
        term39688 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.CombatEvent"));
        Object term39689 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term39689, term39689.getClass(), "x", -916335264);
        setIntField(term39689, term39689.getClass(), "y", -919416536);
        setField(term39688, term39688.getClass(), "coordinate", term39689);
        setField(term39688, term39688.getClass(), "planetName", "vgdwrCZczl");
        setField(term39688, term39688.getClass(), "text", "gKMNrpKBpu");
        setField(term39688, term39688.getClass(), "type", enum101);
        setByteField(term39688, term39688.getClass(), "playerIndex", (byte) 14);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.CombatEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlanetName", argTypes, term39688, args);
    }

};


