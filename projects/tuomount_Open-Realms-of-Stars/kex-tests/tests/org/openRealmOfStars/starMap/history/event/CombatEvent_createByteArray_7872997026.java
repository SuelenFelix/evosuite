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

public class CombatEvent_createByteArray_7872997026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41212;

    public CombatEvent_createByteArray_7872997026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term41282 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term41281 = ((Class) term41282).getDeclaredField((String) "PLANET_CONQUERED");
        ((Field) term41281).setAccessible(true);
        Object enum105 = ((Field) term41281).get((Object) null);
        term41212 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.CombatEvent"));
        Object term41213 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term41213, term41213.getClass(), "x", 1768204942);
        setIntField(term41213, term41213.getClass(), "y", 1252951645);
        setField(term41212, term41212.getClass(), "coordinate", term41213);
        setField(term41212, term41212.getClass(), "planetName", "CVZnTiJucs");
        setField(term41212, term41212.getClass(), "text", "ecHEQufXoq");
        setField(term41212, term41212.getClass(), "type", enum105);
        setByteField(term41212, term41212.getClass(), "playerIndex", (byte) 123);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.CombatEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createByteArray", argTypes, term41212, args);
    }

};


