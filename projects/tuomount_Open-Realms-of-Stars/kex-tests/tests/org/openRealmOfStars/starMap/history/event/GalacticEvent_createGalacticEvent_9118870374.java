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

public class GalacticEvent_createGalacticEvent_9118870374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42718;

    public GalacticEvent_createGalacticEvent_9118870374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42718 = (byte[]) newByteArray(6);
        setByteElement(term42718, 0, (byte) 81);
        setByteElement(term42718, 1, (byte) 65);
        setByteElement(term42718, 2, (byte) -44);
        setByteElement(term42718, 3, (byte) 33);
        setByteElement(term42718, 4, (byte) -74);
        setByteElement(term42718, 5, (byte) -84);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.GalacticEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term42718;
        callMethod(klass, "createGalacticEvent", argTypes, null, args);
    }

};


