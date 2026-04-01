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

public class CultureEvent_createByteArray_20997456922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44522;

    public CultureEvent_createByteArray_20997456922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term44540 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term44539 = ((Class) term44540).getDeclaredField((String) "ASCENDED");
        ((Field) term44539).setAccessible(true);
        Object enum114 = ((Field) term44539).get((Object) null);
        term44522 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.CultureEvent"));
        Object term44523 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term44523, term44523.getClass(), "x", -648200466);
        setIntField(term44523, term44523.getClass(), "y", 2007134147);
        setField(term44522, term44522.getClass(), "coordinate", term44523);
        setField(term44522, term44522.getClass(), "type", enum114);
        setByteField(term44522, term44522.getClass(), "playerIndex", (byte) 28);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.CultureEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createByteArray", argTypes, term44522, args);
    }

};


