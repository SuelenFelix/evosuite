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

public class MinecraftRconService_connect_3802098792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term610;

    public MinecraftRconService_connect_3802098792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term610 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.MinecraftRconService"));
        Object term611 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.RconDetails"));
        Object term637 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.ConnectOptions"));
        Object term639 = newInstance(Class.forName("java.time.Duration"));
        Object term642 = newInstance(Class.forName("java.time.Duration"));
        Object term645 = newInstance(Class.forName("io.graversen.minecraft.rcon.MinecraftRcon"));
        Object term649 = newInstance(Class.forName("java.util.concurrent.CountDownLatch"));
        Object term650 = newInstance(Class.forName("java.util.concurrent.CountDownLatch$Sync"));
        Object term651 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$Node"));
        Object term653 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$Node"));
        setField(term611, term611.getClass(), "hostname", "RkybSrpybU");
        setIntField(term611, term611.getClass(), "port", -6029667);
        setField(term611, term611.getClass(), "password", "xOEqzGAmDU");
        setField(term610, term610.getClass(), "rconDetails", term611);
        setIntField(term637, term637.getClass(), "maxRetries", -2068769794);
        setLongField(term639, term639.getClass(), "seconds", 306000L);
        setIntField(term639, term639.getClass(), "nanos", 0);
        setField(term637, term637.getClass(), "timeBetweenRetries", term639);
        setLongField(term642, term642.getClass(), "seconds", 154800L);
        setIntField(term642, term642.getClass(), "nanos", 0);
        setField(term637, term637.getClass(), "connectionWatcherInterval", term642);
        setField(term610, term610.getClass(), "connectOptions", term637);
        setField(term610, term610.getClass(), "executorService", null);
        setField(term610, term610.getClass(), "minecraftClient", null);
        setField(term645, term645.getClass(), "rconClient", null);
        setField(term610, term610.getClass(), "minecraftRcon", term645);
        setBooleanField(term610, term610.getClass(), "shouldClose", false);
        setBooleanField(term610, term610.getClass(), "shouldConnect", true);
        setBooleanField(term610, term610.getClass(), "isConnected", true);
        setIntField(term651, term651.getClass(), "waitStatus", 0);
        setField(term651, term651.getClass(), "prev", null);
        setField(term651, term651.getClass(), "next", null);
        setField(term651, term651.getClass(), "thread", null);
        setField(term651, term651.getClass(), "nextWaiter", null);
        setField(term650, term650.getClass(), "head", term651);
        setIntField(term653, term653.getClass(), "waitStatus", 0);
        setField(term653, term653.getClass(), "prev", null);
        setField(term653, term653.getClass(), "next", null);
        setField(term653, term653.getClass(), "thread", null);
        setField(term653, term653.getClass(), "nextWaiter", null);
        setField(term650, term650.getClass(), "tail", term653);
        setIntField(term650, term650.getClass(), "state", -117576464);
        setField(term650, term650.getClass(), "exclusiveOwnerThread", null);
        setField(term649, term649.getClass(), "sync", term650);
        setField(term610, term610.getClass(), "connectionLatch", term649);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.service.MinecraftRconService");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "connect", argTypes, term610, args);
    }

};


