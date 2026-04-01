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

public class CultureEvent_getCoordinate_1553027291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44182;

    public CultureEvent_getCoordinate_1553027291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term44208 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term44207 = ((Class) term44208).getDeclaredField((String) "PLANET_CONQUERED");
        ((Field) term44207).setAccessible(true);
        Object enum113 = ((Field) term44207).get((Object) null);
        term44182 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.CultureEvent"));
        Object term44183 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term44183, term44183.getClass(), "x", -1351605385);
        setIntField(term44183, term44183.getClass(), "y", 278355793);
        setField(term44182, term44182.getClass(), "coordinate", term44183);
        setField(term44182, term44182.getClass(), "type", enum113);
        setByteField(term44182, term44182.getClass(), "playerIndex", (byte) -2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.CultureEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCoordinate", argTypes, term44182, args);
    }

};


