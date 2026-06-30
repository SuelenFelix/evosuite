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

public class ConnectTask_init_10846192620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term321;
     Object term329;

    public ConnectTask_init_10846192620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term321 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.ConnectOptions"));
        Object term323 = newInstance(Class.forName("java.time.Duration"));
        Object term326 = newInstance(Class.forName("java.time.Duration"));
        setIntField(term321, term321.getClass(), "maxRetries", 1725571209);
        setLongField(term323, term323.getClass(), "seconds", 302400L);
        setIntField(term323, term323.getClass(), "nanos", 0);
        setField(term321, term321.getClass(), "timeBetweenRetries", term323);
        setLongField(term326, term326.getClass(), "seconds", 183600L);
        setIntField(term326, term326.getClass(), "nanos", 0);
        setField(term321, term321.getClass(), "connectionWatcherInterval", term326);
        term329 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.RconDetails"));
        setField(term329, term329.getClass(), "hostname", "uuaPigETmJ");
        setIntField(term329, term329.getClass(), "port", -522618178);
        setField(term329, term329.getClass(), "password", "MxlszYVzRf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.service.ConnectTask");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.service.ConnectOptions");
        argTypes[1] = Class.forName("io.graversen.minecraft.rcon.service.RconDetails");
        Object[] args = new Object[2];
        args[0] = term321;
        args[1] = term329;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


