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

public class MinecraftRconService_doConnect_15554614928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1028;

    public MinecraftRconService_doConnect_15554614928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1028 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.MinecraftRconService"));
        Object term1029 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.RconDetails"));
        Object term1055 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.ConnectOptions"));
        Object term1057 = newInstance(Class.forName("java.time.Duration"));
        Object term1060 = newInstance(Class.forName("java.time.Duration"));
        Object term1063 = newInstance(Class.forName("io.graversen.minecraft.rcon.MinecraftRcon"));
        Object term1067 = newInstance(Class.forName("java.util.concurrent.CountDownLatch"));
        Object term1068 = newInstance(Class.forName("java.util.concurrent.CountDownLatch$Sync"));
        Object term1069 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$Node"));
        Object term1071 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$Node"));
        setField(term1029, term1029.getClass(), "hostname", "kuTXqwMtDB");
        setIntField(term1029, term1029.getClass(), "port", 679763016);
        setField(term1029, term1029.getClass(), "password", "Ghbwtircqb");
        setField(term1028, term1028.getClass(), "rconDetails", term1029);
        setIntField(term1055, term1055.getClass(), "maxRetries", 1962444399);
        setLongField(term1057, term1057.getClass(), "seconds", 226800L);
        setIntField(term1057, term1057.getClass(), "nanos", 0);
        setField(term1055, term1055.getClass(), "timeBetweenRetries", term1057);
        setLongField(term1060, term1060.getClass(), "seconds", 349200L);
        setIntField(term1060, term1060.getClass(), "nanos", 0);
        setField(term1055, term1055.getClass(), "connectionWatcherInterval", term1060);
        setField(term1028, term1028.getClass(), "connectOptions", term1055);
        setField(term1028, term1028.getClass(), "executorService", null);
        setField(term1028, term1028.getClass(), "minecraftClient", null);
        setField(term1063, term1063.getClass(), "rconClient", null);
        setField(term1028, term1028.getClass(), "minecraftRcon", term1063);
        setBooleanField(term1028, term1028.getClass(), "shouldClose", true);
        setBooleanField(term1028, term1028.getClass(), "shouldConnect", true);
        setBooleanField(term1028, term1028.getClass(), "isConnected", true);
        setIntField(term1069, term1069.getClass(), "waitStatus", 0);
        setField(term1069, term1069.getClass(), "prev", null);
        setField(term1069, term1069.getClass(), "next", null);
        setField(term1069, term1069.getClass(), "thread", null);
        setField(term1069, term1069.getClass(), "nextWaiter", null);
        setField(term1068, term1068.getClass(), "head", term1069);
        setIntField(term1071, term1071.getClass(), "waitStatus", 0);
        setField(term1071, term1071.getClass(), "prev", null);
        setField(term1071, term1071.getClass(), "next", null);
        setField(term1071, term1071.getClass(), "thread", null);
        setField(term1071, term1071.getClass(), "nextWaiter", null);
        setField(term1068, term1068.getClass(), "tail", term1071);
        setIntField(term1068, term1068.getClass(), "state", 767834723);
        setField(term1068, term1068.getClass(), "exclusiveOwnerThread", null);
        setField(term1067, term1067.getClass(), "sync", term1068);
        setField(term1028, term1028.getClass(), "connectionLatch", term1067);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.service.MinecraftRconService");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "doConnect", argTypes, term1028, args);
    }

};


