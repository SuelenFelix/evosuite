package org.mozilla.universalchardet.prober.sequence;

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
import static org.mozilla.universalchardet.prober.sequence.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CyrillicModel_init_20847279020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73;

    public CyrillicModel_init_20847279020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73 = (short[]) newShortArray(3);
        setShortElement(term73, 0, (short) -26033);
        setShortElement(term73, 1, (short) 8329);
        setShortElement(term73, 2, (short) 31422);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.sequence.CyrillicModel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(short.class, 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term73;
        args[1] = "MuLcgQHgqz";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


