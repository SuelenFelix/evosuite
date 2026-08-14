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

public class GreekModel_init_1189558270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public GreekModel_init_1189558270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = (short[]) newShortArray(5);
        setShortElement(term1, 0, (short) 9519);
        setShortElement(term1, 1, (short) -10960);
        setShortElement(term1, 2, (short) -1703);
        setShortElement(term1, 3, (short) 23627);
        setShortElement(term1, 4, (short) -19694);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.sequence.GreekModel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(short.class, 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


