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

public class PingResult_isSuccess_14193740535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1233;

    public PingResult_isSuccess_14193740535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1233 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.PingResult"));
        setField(term1233, term1233.getClass(), "latency", null);
        setBooleanField(term1233, term1233.getClass(), "success", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.service.PingResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSuccess", argTypes, term1233, args);
    }

};


