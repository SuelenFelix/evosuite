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

public class MinecraftRconService_minecraftRcon_17142539425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term808;

    public MinecraftRconService_minecraftRcon_17142539425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term808 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.MinecraftRconService"));
        Object term809 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.RconDetails"));
        Object term835 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.ConnectOptions"));
        Object term837 = newInstance(Class.forName("java.time.Duration"));
        Object term840 = newInstance(Class.forName("java.time.Duration"));
        Object term843 = newInstance(Class.forName("io.graversen.minecraft.rcon.MinecraftRcon"));
        Object term847 = newInstance(Class.forName("java.util.concurrent.CountDownLatch"));
        Object term848 = newInstance(Class.forName("java.util.concurrent.CountDownLatch$Sync"));
        Object term849 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$Node"));
        Object term851 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$Node"));
        setField(term809, term809.getClass(), "hostname", "OclPbYPkcH");
        setIntField(term809, term809.getClass(), "port", -203030934);
        setField(term809, term809.getClass(), "password", "IoAlmYsBwc");
        setField(term808, term808.getClass(), "rconDetails", term809);
        setIntField(term835, term835.getClass(), "maxRetries", -1179120542);
        setLongField(term837, term837.getClass(), "seconds", 270000L);
        setIntField(term837, term837.getClass(), "nanos", 0);
        setField(term835, term835.getClass(), "timeBetweenRetries", term837);
        setLongField(term840, term840.getClass(), "seconds", 36000L);
        setIntField(term840, term840.getClass(), "nanos", 0);
        setField(term835, term835.getClass(), "connectionWatcherInterval", term840);
        setField(term808, term808.getClass(), "connectOptions", term835);
        setField(term808, term808.getClass(), "executorService", null);
        setField(term808, term808.getClass(), "minecraftClient", null);
        setField(term843, term843.getClass(), "rconClient", null);
        setField(term808, term808.getClass(), "minecraftRcon", term843);
        setBooleanField(term808, term808.getClass(), "shouldClose", false);
        setBooleanField(term808, term808.getClass(), "shouldConnect", true);
        setBooleanField(term808, term808.getClass(), "isConnected", false);
        setIntField(term849, term849.getClass(), "waitStatus", 0);
        setField(term849, term849.getClass(), "prev", null);
        setField(term849, term849.getClass(), "next", null);
        setField(term849, term849.getClass(), "thread", null);
        setField(term849, term849.getClass(), "nextWaiter", null);
        setField(term848, term848.getClass(), "head", term849);
        setIntField(term851, term851.getClass(), "waitStatus", 0);
        setField(term851, term851.getClass(), "prev", null);
        setField(term851, term851.getClass(), "next", null);
        setField(term851, term851.getClass(), "thread", null);
        setField(term851, term851.getClass(), "nextWaiter", null);
        setField(term848, term848.getClass(), "tail", term851);
        setIntField(term848, term848.getClass(), "state", -73683645);
        setField(term848, term848.getClass(), "exclusiveOwnerThread", null);
        setField(term847, term847.getClass(), "sync", term848);
        setField(term808, term808.getClass(), "connectionLatch", term847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.service.MinecraftRconService");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "minecraftRcon", argTypes, term808, args);
    }

};


