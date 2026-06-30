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

public class MinecraftRconService_connectionWatcher_18430823947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term962;

    public MinecraftRconService_connectionWatcher_18430823947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term962 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.MinecraftRconService"));
        Object term963 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.RconDetails"));
        Object term989 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.ConnectOptions"));
        Object term991 = newInstance(Class.forName("java.time.Duration"));
        Object term994 = newInstance(Class.forName("java.time.Duration"));
        Object term997 = newInstance(Class.forName("io.graversen.minecraft.rcon.MinecraftRcon"));
        Object term1001 = newInstance(Class.forName("java.util.concurrent.CountDownLatch"));
        Object term1002 = newInstance(Class.forName("java.util.concurrent.CountDownLatch$Sync"));
        Object term1003 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$Node"));
        Object term1005 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$Node"));
        setField(term963, term963.getClass(), "hostname", "AijpHYOFuy");
        setIntField(term963, term963.getClass(), "port", -1530420153);
        setField(term963, term963.getClass(), "password", "SbAoxhfrkn");
        setField(term962, term962.getClass(), "rconDetails", term963);
        setIntField(term989, term989.getClass(), "maxRetries", -469968304);
        setLongField(term991, term991.getClass(), "seconds", 244800L);
        setIntField(term991, term991.getClass(), "nanos", 0);
        setField(term989, term989.getClass(), "timeBetweenRetries", term991);
        setLongField(term994, term994.getClass(), "seconds", 100800L);
        setIntField(term994, term994.getClass(), "nanos", 0);
        setField(term989, term989.getClass(), "connectionWatcherInterval", term994);
        setField(term962, term962.getClass(), "connectOptions", term989);
        setField(term962, term962.getClass(), "executorService", null);
        setField(term962, term962.getClass(), "minecraftClient", null);
        setField(term997, term997.getClass(), "rconClient", null);
        setField(term962, term962.getClass(), "minecraftRcon", term997);
        setBooleanField(term962, term962.getClass(), "shouldClose", false);
        setBooleanField(term962, term962.getClass(), "shouldConnect", false);
        setBooleanField(term962, term962.getClass(), "isConnected", true);
        setIntField(term1003, term1003.getClass(), "waitStatus", 0);
        setField(term1003, term1003.getClass(), "prev", null);
        setField(term1003, term1003.getClass(), "next", null);
        setField(term1003, term1003.getClass(), "thread", null);
        setField(term1003, term1003.getClass(), "nextWaiter", null);
        setField(term1002, term1002.getClass(), "head", term1003);
        setIntField(term1005, term1005.getClass(), "waitStatus", 0);
        setField(term1005, term1005.getClass(), "prev", null);
        setField(term1005, term1005.getClass(), "next", null);
        setField(term1005, term1005.getClass(), "thread", null);
        setField(term1005, term1005.getClass(), "nextWaiter", null);
        setField(term1002, term1002.getClass(), "tail", term1005);
        setIntField(term1002, term1002.getClass(), "state", -1145578966);
        setField(term1002, term1002.getClass(), "exclusiveOwnerThread", null);
        setField(term1001, term1001.getClass(), "sync", term1002);
        setField(term962, term962.getClass(), "connectionLatch", term1001);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.service.MinecraftRconService");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "connectionWatcher", argTypes, term962, args);
    }

};


