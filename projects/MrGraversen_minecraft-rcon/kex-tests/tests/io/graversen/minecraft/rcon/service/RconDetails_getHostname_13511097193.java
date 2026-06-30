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

public class RconDetails_getHostname_13511097193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69;

    public RconDetails_getHostname_13511097193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.RconDetails"));
        setField(term69, term69.getClass(), "hostname", "xxtlPwDYFs");
        setIntField(term69, term69.getClass(), "port", 1162663216);
        setField(term69, term69.getClass(), "password", "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.service.RconDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHostname", argTypes, term69, args);
    }

};


