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

public class EventOnPlanet_createEventOnPlanet_10926447226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33205;

    public EventOnPlanet_createEventOnPlanet_10926447226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33205 = (byte[]) newByteArray(6);
        setByteElement(term33205, 0, (byte) -92);
        setByteElement(term33205, 1, (byte) -42);
        setByteElement(term33205, 2, (byte) 116);
        setByteElement(term33205, 3, (byte) -81);
        setByteElement(term33205, 4, (byte) 102);
        setByteElement(term33205, 5, (byte) -118);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.EventOnPlanet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term33205;
        callMethod(klass, "createEventOnPlanet", argTypes, null, args);
    }

};


