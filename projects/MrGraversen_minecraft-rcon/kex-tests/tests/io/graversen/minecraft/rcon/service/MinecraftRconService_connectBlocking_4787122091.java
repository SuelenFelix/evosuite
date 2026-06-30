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

public class MinecraftRconService_connectBlocking_4787122091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term541;
     Object term587;

    public MinecraftRconService_connectBlocking_4787122091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term541 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.MinecraftRconService"));
        Object term542 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.RconDetails"));
        Object term568 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.ConnectOptions"));
        Object term570 = newInstance(Class.forName("java.time.Duration"));
        Object term573 = newInstance(Class.forName("java.time.Duration"));
        Object term576 = newInstance(Class.forName("io.graversen.minecraft.rcon.MinecraftRcon"));
        Object term580 = newInstance(Class.forName("java.util.concurrent.CountDownLatch"));
        Object term581 = newInstance(Class.forName("java.util.concurrent.CountDownLatch$Sync"));
        Object term582 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$Node"));
        Object term584 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$Node"));
        setField(term542, term542.getClass(), "hostname", "pCTimMblYc");
        setIntField(term542, term542.getClass(), "port", 1622346318);
        setField(term542, term542.getClass(), "password", "hNxWaHcfhY");
        setField(term541, term541.getClass(), "rconDetails", term542);
        setIntField(term568, term568.getClass(), "maxRetries", 1048535127);
        setLongField(term570, term570.getClass(), "seconds", 230400L);
        setIntField(term570, term570.getClass(), "nanos", 0);
        setField(term568, term568.getClass(), "timeBetweenRetries", term570);
        setLongField(term573, term573.getClass(), "seconds", 262800L);
        setIntField(term573, term573.getClass(), "nanos", 0);
        setField(term568, term568.getClass(), "connectionWatcherInterval", term573);
        setField(term541, term541.getClass(), "connectOptions", term568);
        setField(term541, term541.getClass(), "executorService", null);
        setField(term541, term541.getClass(), "minecraftClient", null);
        setField(term576, term576.getClass(), "rconClient", null);
        setField(term541, term541.getClass(), "minecraftRcon", term576);
        setBooleanField(term541, term541.getClass(), "shouldClose", false);
        setBooleanField(term541, term541.getClass(), "shouldConnect", false);
        setBooleanField(term541, term541.getClass(), "isConnected", false);
        setIntField(term582, term582.getClass(), "waitStatus", 0);
        setField(term582, term582.getClass(), "prev", null);
        setField(term582, term582.getClass(), "next", null);
        setField(term582, term582.getClass(), "thread", null);
        setField(term582, term582.getClass(), "nextWaiter", null);
        setField(term581, term581.getClass(), "head", term582);
        setIntField(term584, term584.getClass(), "waitStatus", 0);
        setField(term584, term584.getClass(), "prev", null);
        setField(term584, term584.getClass(), "next", null);
        setField(term584, term584.getClass(), "thread", null);
        setField(term584, term584.getClass(), "nextWaiter", null);
        setField(term581, term581.getClass(), "tail", term584);
        setIntField(term581, term581.getClass(), "state", -655067527);
        setField(term581, term581.getClass(), "exclusiveOwnerThread", null);
        setField(term580, term580.getClass(), "sync", term581);
        setField(term541, term541.getClass(), "connectionLatch", term580);
        term587 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term587, term587.getClass(), "seconds", 162000L);
        setIntField(term587, term587.getClass(), "nanos", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.service.MinecraftRconService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Duration");
        Object[] args = new Object[1];
        args[0] = term587;
        callMethod(klass, "connectBlocking", argTypes, term541, args);
    }

};


