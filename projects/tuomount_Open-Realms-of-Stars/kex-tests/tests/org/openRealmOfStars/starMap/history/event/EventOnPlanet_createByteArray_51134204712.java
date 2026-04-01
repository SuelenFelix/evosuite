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

public class EventOnPlanet_createByteArray_51134204712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33228;

    public EventOnPlanet_createByteArray_51134204712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33228 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.EventOnPlanet"));
        setField(term33228, term33228.getClass(), "coordinate", null);
        setField(term33228, term33228.getClass(), "name", null);
        setField(term33228, term33228.getClass(), "text", null);
        setField(term33228, term33228.getClass(), "type", null);
        setByteField(term33228, term33228.getClass(), "playerIndex", (byte) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.EventOnPlanet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createByteArray", argTypes, term33228, args);
    }

};


