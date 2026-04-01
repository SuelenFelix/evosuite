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

public class RiftPortalEvent_setText_13730842343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30184;

    public RiftPortalEvent_setText_13730842343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30240 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term30239 = ((Class) term30240).getDeclaredField((String) "SPACE_COMBAT");
        ((Field) term30239).setAccessible(true);
        Object enum75 = ((Field) term30239).get((Object) null);
        term30184 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.RiftPortalEvent"));
        Object term30185 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term30185, term30185.getClass(), "x", 282916351);
        setIntField(term30185, term30185.getClass(), "y", 880977281);
        setField(term30184, term30184.getClass(), "coordinate", term30185);
        setField(term30184, term30184.getClass(), "text", "QpYltHAdyY");
        setField(term30184, term30184.getClass(), "type", enum75);
        setByteField(term30184, term30184.getClass(), "playerIndex", (byte) -123);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.RiftPortalEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lbmSGBwIiV";
        callMethod(klass, "setText", argTypes, term30184, args);
    }

};


