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

public class BulgarianModel_init_18929671260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34;

    public BulgarianModel_init_18929671260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34 = (short[]) newShortArray(4);
        setShortElement(term34, 0, (short) 31942);
        setShortElement(term34, 1, (short) 30947);
        setShortElement(term34, 2, (short) 27594);
        setShortElement(term34, 3, (short) 7670);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.sequence.BulgarianModel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(short.class, 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term34;
        args[1] = "sjlJAEtRrb";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


