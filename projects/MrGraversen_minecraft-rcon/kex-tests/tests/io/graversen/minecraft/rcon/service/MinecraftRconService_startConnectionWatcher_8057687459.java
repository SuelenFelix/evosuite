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

public class MinecraftRconService_startConnectionWatcher_8057687459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1094;

    public MinecraftRconService_startConnectionWatcher_8057687459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1094 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.MinecraftRconService"));
        Object term1095 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.RconDetails"));
        Object term1121 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.ConnectOptions"));
        Object term1123 = newInstance(Class.forName("java.time.Duration"));
        Object term1126 = newInstance(Class.forName("java.time.Duration"));
        Object term1129 = newInstance(Class.forName("io.graversen.minecraft.rcon.MinecraftRcon"));
        Object term1133 = newInstance(Class.forName("java.util.concurrent.CountDownLatch"));
        Object term1134 = newInstance(Class.forName("java.util.concurrent.CountDownLatch$Sync"));
        Object term1135 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$Node"));
        Object term1137 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$Node"));
        setField(term1095, term1095.getClass(), "hostname", "xrwlQZdwCp");
        setIntField(term1095, term1095.getClass(), "port", -602026508);
        setField(term1095, term1095.getClass(), "password", "IDCWpPLRkE");
        setField(term1094, term1094.getClass(), "rconDetails", term1095);
        setIntField(term1121, term1121.getClass(), "maxRetries", -157887805);
        setLongField(term1123, term1123.getClass(), "seconds", 21600L);
        setIntField(term1123, term1123.getClass(), "nanos", 0);
        setField(term1121, term1121.getClass(), "timeBetweenRetries", term1123);
        setLongField(term1126, term1126.getClass(), "seconds", 126000L);
        setIntField(term1126, term1126.getClass(), "nanos", 0);
        setField(term1121, term1121.getClass(), "connectionWatcherInterval", term1126);
        setField(term1094, term1094.getClass(), "connectOptions", term1121);
        setField(term1094, term1094.getClass(), "executorService", null);
        setField(term1094, term1094.getClass(), "minecraftClient", null);
        setField(term1129, term1129.getClass(), "rconClient", null);
        setField(term1094, term1094.getClass(), "minecraftRcon", term1129);
        setBooleanField(term1094, term1094.getClass(), "shouldClose", true);
        setBooleanField(term1094, term1094.getClass(), "shouldConnect", false);
        setBooleanField(term1094, term1094.getClass(), "isConnected", false);
        setIntField(term1135, term1135.getClass(), "waitStatus", 0);
        setField(term1135, term1135.getClass(), "prev", null);
        setField(term1135, term1135.getClass(), "next", null);
        setField(term1135, term1135.getClass(), "thread", null);
        setField(term1135, term1135.getClass(), "nextWaiter", null);
        setField(term1134, term1134.getClass(), "head", term1135);
        setIntField(term1137, term1137.getClass(), "waitStatus", 0);
        setField(term1137, term1137.getClass(), "prev", null);
        setField(term1137, term1137.getClass(), "next", null);
        setField(term1137, term1137.getClass(), "thread", null);
        setField(term1137, term1137.getClass(), "nextWaiter", null);
        setField(term1134, term1134.getClass(), "tail", term1137);
        setIntField(term1134, term1134.getClass(), "state", 1876565163);
        setField(term1134, term1134.getClass(), "exclusiveOwnerThread", null);
        setField(term1133, term1133.getClass(), "sync", term1134);
        setField(term1094, term1094.getClass(), "connectionLatch", term1133);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.service.MinecraftRconService");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "startConnectionWatcher", argTypes, term1094, args);
    }

};


