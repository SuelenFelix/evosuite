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
import java.lang.Object;

public class PingResult_getLatency_1103715331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1219;

    public PingResult_getLatency_1103715331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1219 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.PingResult"));
        Object term1220 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term1220, term1220.getClass(), "seconds", 187200L);
        setIntField(term1220, term1220.getClass(), "nanos", 0);
        setField(term1219, term1219.getClass(), "latency", term1220);
        setBooleanField(term1219, term1219.getClass(), "success", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.service.PingResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLatency", argTypes, term1219, args);
    }

};


