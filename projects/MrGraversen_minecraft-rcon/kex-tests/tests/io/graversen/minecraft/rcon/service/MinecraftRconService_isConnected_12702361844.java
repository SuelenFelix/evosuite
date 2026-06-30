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

public class MinecraftRconService_isConnected_12702361844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term742;

    public MinecraftRconService_isConnected_12702361844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term742 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.MinecraftRconService"));
        Object term743 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.RconDetails"));
        Object term769 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.ConnectOptions"));
        Object term771 = newInstance(Class.forName("java.time.Duration"));
        Object term774 = newInstance(Class.forName("java.time.Duration"));
        Object term777 = newInstance(Class.forName("io.graversen.minecraft.rcon.MinecraftRcon"));
        Object term781 = newInstance(Class.forName("java.util.concurrent.CountDownLatch"));
        Object term782 = newInstance(Class.forName("java.util.concurrent.CountDownLatch$Sync"));
        Object term783 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$Node"));
        Object term785 = newInstance(Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$Node"));
        setField(term743, term743.getClass(), "hostname", "vrQLuWIDJX");
        setIntField(term743, term743.getClass(), "port", 865208305);
        setField(term743, term743.getClass(), "password", "flxyYxBRtu");
        setField(term742, term742.getClass(), "rconDetails", term743);
        setIntField(term769, term769.getClass(), "maxRetries", -1275173084);
        setLongField(term771, term771.getClass(), "seconds", 136800L);
        setIntField(term771, term771.getClass(), "nanos", 0);
        setField(term769, term769.getClass(), "timeBetweenRetries", term771);
        setLongField(term774, term774.getClass(), "seconds", 208800L);
        setIntField(term774, term774.getClass(), "nanos", 0);
        setField(term769, term769.getClass(), "connectionWatcherInterval", term774);
        setField(term742, term742.getClass(), "connectOptions", term769);
        setField(term742, term742.getClass(), "executorService", null);
        setField(term742, term742.getClass(), "minecraftClient", null);
        setField(term777, term777.getClass(), "rconClient", null);
        setField(term742, term742.getClass(), "minecraftRcon", term777);
        setBooleanField(term742, term742.getClass(), "shouldClose", true);
        setBooleanField(term742, term742.getClass(), "shouldConnect", false);
        setBooleanField(term742, term742.getClass(), "isConnected", true);
        setIntField(term783, term783.getClass(), "waitStatus", 0);
        setField(term783, term783.getClass(), "prev", null);
        setField(term783, term783.getClass(), "next", null);
        setField(term783, term783.getClass(), "thread", null);
        setField(term783, term783.getClass(), "nextWaiter", null);
        setField(term782, term782.getClass(), "head", term783);
        setIntField(term785, term785.getClass(), "waitStatus", 0);
        setField(term785, term785.getClass(), "prev", null);
        setField(term785, term785.getClass(), "next", null);
        setField(term785, term785.getClass(), "thread", null);
        setField(term785, term785.getClass(), "nextWaiter", null);
        setField(term782, term782.getClass(), "tail", term785);
        setIntField(term782, term782.getClass(), "state", -244121226);
        setField(term782, term782.getClass(), "exclusiveOwnerThread", null);
        setField(term781, term781.getClass(), "sync", term782);
        setField(term742, term742.getClass(), "connectionLatch", term781);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.service.MinecraftRconService");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isConnected", argTypes, term742, args);
    }

};


