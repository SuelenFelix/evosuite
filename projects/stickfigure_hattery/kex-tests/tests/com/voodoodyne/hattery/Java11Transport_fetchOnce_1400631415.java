package com.voodoodyne.hattery;

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
import static com.voodoodyne.hattery.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Java11Transport_fetchOnce_1400631415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9185;

    public Java11Transport_fetchOnce_1400631415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9185 = newInstance(Class.forName("com.voodoodyne.hattery.Java11Transport"));
        setField(term9185, term9185.getClass(), "normalFollow", null);
        setField(term9185, term9185.getClass(), "neverFollow", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.voodoodyne.hattery.Java11Transport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.voodoodyne.hattery.HttpRequest");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "fetchOnce", argTypes, term9185, args);
    }

};


