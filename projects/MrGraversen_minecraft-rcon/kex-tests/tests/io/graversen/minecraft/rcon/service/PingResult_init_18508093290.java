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
import java.lang.Boolean;

public class PingResult_init_18508093290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1214;
     Object term1217;

    public PingResult_init_18508093290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1214 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term1214, term1214.getClass(), "seconds", 25200L);
        setIntField(term1214, term1214.getClass(), "nanos", 0);
        term1217 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.service.PingResult");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.time.Duration");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1214;
        args[1] = term1217;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


