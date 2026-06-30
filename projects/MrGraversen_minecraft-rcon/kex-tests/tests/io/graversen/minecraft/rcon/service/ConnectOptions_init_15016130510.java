package io.graversen.minecraft.rcon.service;

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
import static io.graversen.minecraft.rcon.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ConnectOptions_init_15016130510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267;
     Object term269;
     Object term272;

    public ConnectOptions_init_15016130510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term267 = new Integer(-616727354);
        term269 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term269, term269.getClass(), "seconds", 46800L);
        setIntField(term269, term269.getClass(), "nanos", 0);
        term272 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term272, term272.getClass(), "seconds", 122400L);
        setIntField(term272, term272.getClass(), "nanos", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.service.ConnectOptions");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.time.Duration");
        argTypes[2] = Class.forName("java.time.Duration");
        Object[] args = new Object[3];
        args[0] = term267;
        args[1] = term269;
        args[2] = term272;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


