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

public class CultureEvent_createCultureEvent_16090820153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44830;

    public CultureEvent_createCultureEvent_16090820153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44830 = (byte[]) newByteArray(9);
        setByteElement(term44830, 0, (byte) 84);
        setByteElement(term44830, 1, (byte) 85);
        setByteElement(term44830, 2, (byte) -17);
        setByteElement(term44830, 3, (byte) -83);
        setByteElement(term44830, 4, (byte) 48);
        setByteElement(term44830, 5, (byte) -128);
        setByteElement(term44830, 6, (byte) 70);
        setByteElement(term44830, 7, (byte) -28);
        setByteElement(term44830, 8, (byte) 115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.CultureEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term44830;
        callMethod(klass, "createCultureEvent", argTypes, null, args);
    }

};


