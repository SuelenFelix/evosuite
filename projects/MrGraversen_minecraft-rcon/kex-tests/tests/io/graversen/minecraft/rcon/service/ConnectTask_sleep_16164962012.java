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

public class ConnectTask_sleep_16164962012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term430;

    public ConnectTask_sleep_16164962012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term430 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.ConnectTask"));
        Object term431 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.ConnectOptions"));
        Object term433 = newInstance(Class.forName("java.time.Duration"));
        Object term436 = newInstance(Class.forName("java.time.Duration"));
        Object term439 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.RconDetails"));
        setIntField(term431, term431.getClass(), "maxRetries", 1585847225);
        setLongField(term433, term433.getClass(), "seconds", 252000L);
        setIntField(term433, term433.getClass(), "nanos", 0);
        setField(term431, term431.getClass(), "timeBetweenRetries", term433);
        setLongField(term436, term436.getClass(), "seconds", 342000L);
        setIntField(term436, term436.getClass(), "nanos", 0);
        setField(term431, term431.getClass(), "connectionWatcherInterval", term436);
        setField(term430, term430.getClass(), "connectOptions", term431);
        setField(term439, term439.getClass(), "hostname", "aJlieCFVtF");
        setIntField(term439, term439.getClass(), "port", 597278769);
        setField(term439, term439.getClass(), "password", "ZiaGIbnzTs");
        setField(term430, term430.getClass(), "rconDetails", term439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.service.ConnectTask");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "sleep", argTypes, term430, args);
    }

};


