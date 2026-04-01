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

public class PlayerStartEvent_createByteArray_10218138413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34063;

    public PlayerStartEvent_createByteArray_10218138413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34111 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term34110 = ((Class) term34111).getDeclaredField((String) "PLANET_COLONIZED");
        ((Field) term34110).setAccessible(true);
        Object enum85 = ((Field) term34110).get((Object) null);
        term34063 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.PlayerStartEvent"));
        Object term34064 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term34064, term34064.getClass(), "x", 1507074215);
        setIntField(term34064, term34064.getClass(), "y", -282881827);
        setField(term34063, term34063.getClass(), "coordinate", term34064);
        setField(term34063, term34063.getClass(), "name", "bucTnYicnp");
        setField(term34063, term34063.getClass(), "type", enum85);
        setByteField(term34063, term34063.getClass(), "playerIndex", (byte) -104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.PlayerStartEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createByteArray", argTypes, term34063, args);
    }

};


