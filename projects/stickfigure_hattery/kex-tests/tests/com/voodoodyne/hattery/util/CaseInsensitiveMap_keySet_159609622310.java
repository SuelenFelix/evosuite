package com.voodoodyne.hattery.util;

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
import static com.voodoodyne.hattery.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;

public class CaseInsensitiveMap_keySet_159609622310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term653;

    public CaseInsensitiveMap_keySet_159609622310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term654 = new HashMap();
        HashMap term659 = new HashMap();
        term653 = newInstance(Class.forName("com.voodoodyne.hattery.util.CaseInsensitiveMap"));
        setField(term653, term653.getClass(), "base", term654);
        setField(term653, term653.getClass(), "normalized", term659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.voodoodyne.hattery.util.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "keySet", argTypes, term653, args);
    }

};


