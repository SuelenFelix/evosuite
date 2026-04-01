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

public class RiftPortalEvent_createByteArray_10125327114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30552;

    public RiftPortalEvent_createByteArray_10125327114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30597 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term30596 = ((Class) term30597).getDeclaredField((String) "GALACTIC_NEWS");
        ((Field) term30596).setAccessible(true);
        Object enum76 = ((Field) term30596).get((Object) null);
        term30552 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.RiftPortalEvent"));
        Object term30553 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term30553, term30553.getClass(), "x", 982388293);
        setIntField(term30553, term30553.getClass(), "y", -159494544);
        setField(term30552, term30552.getClass(), "coordinate", term30553);
        setField(term30552, term30552.getClass(), "text", "DAxyHoTLzZ");
        setField(term30552, term30552.getClass(), "type", enum76);
        setByteField(term30552, term30552.getClass(), "playerIndex", (byte) -23);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.RiftPortalEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createByteArray", argTypes, term30552, args);
    }

};


