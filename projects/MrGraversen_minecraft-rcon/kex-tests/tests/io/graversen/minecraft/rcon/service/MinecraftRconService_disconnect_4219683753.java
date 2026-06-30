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

public class MinecraftRconService_disconnect_4219683753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term676;

    public MinecraftRconService_disconnect_4219683753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term676 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.MinecraftRconService"));
        Object term677 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.RconDetails"));
        Object term703 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.ConnectOptions"));
        Object term705 = newInstance(Class.forName("java.time.Duration"));
        Object term708 = newInstance(Class.forName("java.time.Duration"));
        Object term711 = newInstance(Class.forName("io.graversen.minecraft.rcon.MinecraftRcon"));
        Object term715 = newInstance(Class.forName("java.util.concurrent.CountDownLatch"));
        Object term716 = newInstance(Class.forName("java.util.concurrent.CountDownLatch$Sync"));
        Object term717 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$Node"));
        Object term719 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$Node"));
        setField(term677, term677.getClass(), "hostname", "eZFUvlxvGV");
        setIntField(term677, term677.getClass(), "port", -1007160944);
        setField(term677, term677.getClass(), "password", "BYqFIqCKAV");
        setField(term676, term676.getClass(), "rconDetails", term677);
        setIntField(term703, term703.getClass(), "maxRetries", 1135664017);
        setLongField(term705, term705.getClass(), "seconds", 273600L);
        setIntField(term705, term705.getClass(), "nanos", 0);
        setField(term703, term703.getClass(), "timeBetweenRetries", term705);
        setLongField(term708, term708.getClass(), "seconds", 46800L);
        setIntField(term708, term708.getClass(), "nanos", 0);
        setField(term703, term703.getClass(), "connectionWatcherInterval", term708);
        setField(term676, term676.getClass(), "connectOptions", term703);
        setField(term676, term676.getClass(), "executorService", null);
        setField(term676, term676.getClass(), "minecraftClient", null);
        setField(term711, term711.getClass(), "rconClient", null);
        setField(term676, term676.getClass(), "minecraftRcon", term711);
        setBooleanField(term676, term676.getClass(), "shouldClose", true);
        setBooleanField(term676, term676.getClass(), "shouldConnect", true);
        setBooleanField(term676, term676.getClass(), "isConnected", false);
        setIntField(term717, term717.getClass(), "waitStatus", 0);
        setField(term717, term717.getClass(), "prev", null);
        setField(term717, term717.getClass(), "next", null);
        setField(term717, term717.getClass(), "thread", null);
        setField(term717, term717.getClass(), "nextWaiter", null);
        setField(term716, term716.getClass(), "head", term717);
        setIntField(term719, term719.getClass(), "waitStatus", 0);
        setField(term719, term719.getClass(), "prev", null);
        setField(term719, term719.getClass(), "next", null);
        setField(term719, term719.getClass(), "thread", null);
        setField(term719, term719.getClass(), "nextWaiter", null);
        setField(term716, term716.getClass(), "tail", term719);
        setIntField(term716, term716.getClass(), "state", 590364439);
        setField(term716, term716.getClass(), "exclusiveOwnerThread", null);
        setField(term715, term715.getClass(), "sync", term716);
        setField(term676, term676.getClass(), "connectionLatch", term715);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.service.MinecraftRconService");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "disconnect", argTypes, term676, args);
    }

};


