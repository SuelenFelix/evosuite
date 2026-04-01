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

public class CombatEvent_createCombatEvent_11079039717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41596;

    public CombatEvent_createCombatEvent_11079039717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41596 = (byte[]) newByteArray(9);
        setByteElement(term41596, 0, (byte) -5);
        setByteElement(term41596, 1, (byte) 84);
        setByteElement(term41596, 2, (byte) -97);
        setByteElement(term41596, 3, (byte) -24);
        setByteElement(term41596, 4, (byte) 88);
        setByteElement(term41596, 5, (byte) 96);
        setByteElement(term41596, 6, (byte) 70);
        setByteElement(term41596, 7, (byte) 48);
        setByteElement(term41596, 8, (byte) -46);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.CombatEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term41596;
        callMethod(klass, "createCombatEvent", argTypes, null, args);
    }

};


