package io.axoniq.demo.bikerental.bikerental.history;

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
import static io.axoniq.demo.bikerental.bikerental.history.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BikeHistory_init_13246333871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;

    public BikeHistory_init_13246333871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term13, term13.getClass(), "seconds", 1345871412L);
        setIntField(term13, term13.getClass(), "nanos", 244000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.axoniq.demo.bikerental.bikerental.history.BikeHistory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.time.Instant");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = "PAEBtnZtTD";
        args[1] = term13;
        args[2] = "sjlJAEtRrb";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


