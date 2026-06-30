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

public class MinecraftRconService_1_init_4987332340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1235;

    public MinecraftRconService_1_init_4987332340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1235 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.MinecraftRconService"));
        Object term1236 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.RconDetails"));
        Object term1262 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.ConnectOptions"));
        Object term1264 = newInstance(Class.forName("java.time.Duration"));
        Object term1267 = newInstance(Class.forName("java.time.Duration"));
        Object term1270 = newInstance(Class.forName("io.graversen.minecraft.rcon.MinecraftRcon"));
        Object term1274 = newInstance(Class.forName("java.util.concurrent.CountDownLatch"));
        Object term1275 = newInstance(Class.forName("java.util.concurrent.CountDownLatch$Sync"));
        Object term1276 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$Node"));
        Object term1278 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$Node"));
        setField(term1236, term1236.getClass(), "hostname", "nyiiPDVjAc");
        setIntField(term1236, term1236.getClass(), "port", -817164822);
        setField(term1236, term1236.getClass(), "password", "aKnKipADSo");
        setField(term1235, term1235.getClass(), "rconDetails", term1236);
        setIntField(term1262, term1262.getClass(), "maxRetries", -1016503459);
        setLongField(term1264, term1264.getClass(), "seconds", 79200L);
        setIntField(term1264, term1264.getClass(), "nanos", 0);
        setField(term1262, term1262.getClass(), "timeBetweenRetries", term1264);
        setLongField(term1267, term1267.getClass(), "seconds", 316800L);
        setIntField(term1267, term1267.getClass(), "nanos", 0);
        setField(term1262, term1262.getClass(), "connectionWatcherInterval", term1267);
        setField(term1235, term1235.getClass(), "connectOptions", term1262);
        setField(term1235, term1235.getClass(), "executorService", null);
        setField(term1235, term1235.getClass(), "minecraftClient", null);
        setField(term1270, term1270.getClass(), "rconClient", null);
        setField(term1235, term1235.getClass(), "minecraftRcon", term1270);
        setBooleanField(term1235, term1235.getClass(), "shouldClose", true);
        setBooleanField(term1235, term1235.getClass(), "shouldConnect", true);
        setBooleanField(term1235, term1235.getClass(), "isConnected", true);
        setIntField(term1276, term1276.getClass(), "waitStatus", 0);
        setField(term1276, term1276.getClass(), "prev", null);
        setField(term1276, term1276.getClass(), "next", null);
        setField(term1276, term1276.getClass(), "thread", null);
        setField(term1276, term1276.getClass(), "nextWaiter", null);
        setField(term1275, term1275.getClass(), "head", term1276);
        setIntField(term1278, term1278.getClass(), "waitStatus", 0);
        setField(term1278, term1278.getClass(), "prev", null);
        setField(term1278, term1278.getClass(), "next", null);
        setField(term1278, term1278.getClass(), "thread", null);
        setField(term1278, term1278.getClass(), "nextWaiter", null);
        setField(term1275, term1275.getClass(), "tail", term1278);
        setIntField(term1275, term1275.getClass(), "state", -1968847291);
        setField(term1275, term1275.getClass(), "exclusiveOwnerThread", null);
        setField(term1274, term1274.getClass(), "sync", term1275);
        setField(term1235, term1235.getClass(), "connectionLatch", term1274);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.service.MinecraftRconService$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.service.MinecraftRconService");
        Object[] args = new Object[1];
        args[0] = term1235;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


