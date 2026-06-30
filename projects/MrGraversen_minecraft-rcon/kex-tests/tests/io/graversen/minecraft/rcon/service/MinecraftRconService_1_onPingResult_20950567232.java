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

public class MinecraftRconService_1_onPingResult_20950567232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1302;
     Object term1303;

    public MinecraftRconService_1_onPingResult_20950567232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1302 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.MinecraftRconService$1"));
        setField(term1302, term1302.getClass(), "this$0", null);
        term1303 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.PingResult"));
        Object term1304 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term1304, term1304.getClass(), "seconds", 234000L);
        setIntField(term1304, term1304.getClass(), "nanos", 0);
        setField(term1303, term1303.getClass(), "latency", term1304);
        setBooleanField(term1303, term1303.getClass(), "success", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.service.MinecraftRconService$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.service.PingResult");
        Object[] args = new Object[1];
        args[0] = term1303;
        callMethod(klass, "onPingResult", argTypes, term1302, args);
    }

};


