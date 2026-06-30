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

public class MinecraftRconService_safeClose_12188634456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term874;

    public MinecraftRconService_safeClose_12188634456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term874 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.MinecraftRconService"));
        Object term875 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.RconDetails"));
        Object term901 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.ConnectOptions"));
        Object term903 = newInstance(Class.forName("java.time.Duration"));
        Object term906 = newInstance(Class.forName("java.time.Duration"));
        Object term909 = newInstance(Class.forName("io.graversen.minecraft.rcon.MinecraftRcon"));
        Object term913 = newInstance(Class.forName("java.util.concurrent.CountDownLatch"));
        Object term914 = newInstance(Class.forName("java.util.concurrent.CountDownLatch$Sync"));
        Object term915 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$Node"));
        Object term917 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$Node"));
        setField(term875, term875.getClass(), "hostname", "TEParAifyi");
        setIntField(term875, term875.getClass(), "port", -226514366);
        setField(term875, term875.getClass(), "password", "OWDIEULEFu");
        setField(term874, term874.getClass(), "rconDetails", term875);
        setIntField(term901, term901.getClass(), "maxRetries", 1193880199);
        setLongField(term903, term903.getClass(), "seconds", 39600L);
        setIntField(term903, term903.getClass(), "nanos", 0);
        setField(term901, term901.getClass(), "timeBetweenRetries", term903);
        setLongField(term906, term906.getClass(), "seconds", 133200L);
        setIntField(term906, term906.getClass(), "nanos", 0);
        setField(term901, term901.getClass(), "connectionWatcherInterval", term906);
        setField(term874, term874.getClass(), "connectOptions", term901);
        setField(term874, term874.getClass(), "executorService", null);
        setField(term874, term874.getClass(), "minecraftClient", null);
        setField(term909, term909.getClass(), "rconClient", null);
        setField(term874, term874.getClass(), "minecraftRcon", term909);
        setBooleanField(term874, term874.getClass(), "shouldClose", false);
        setBooleanField(term874, term874.getClass(), "shouldConnect", true);
        setBooleanField(term874, term874.getClass(), "isConnected", true);
        setIntField(term915, term915.getClass(), "waitStatus", 0);
        setField(term915, term915.getClass(), "prev", null);
        setField(term915, term915.getClass(), "next", null);
        setField(term915, term915.getClass(), "thread", null);
        setField(term915, term915.getClass(), "nextWaiter", null);
        setField(term914, term914.getClass(), "head", term915);
        setIntField(term917, term917.getClass(), "waitStatus", 0);
        setField(term917, term917.getClass(), "prev", null);
        setField(term917, term917.getClass(), "next", null);
        setField(term917, term917.getClass(), "thread", null);
        setField(term917, term917.getClass(), "nextWaiter", null);
        setField(term914, term914.getClass(), "tail", term917);
        setIntField(term914, term914.getClass(), "state", -1087774327);
        setField(term914, term914.getClass(), "exclusiveOwnerThread", null);
        setField(term913, term913.getClass(), "sync", term914);
        setField(term874, term874.getClass(), "connectionLatch", term913);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.service.MinecraftRconService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dWRymuLBtr";
        callMethod(klass, "safeClose", argTypes, term874, args);
    }

};


