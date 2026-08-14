package net.obvj.performetrics;

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
import static net.obvj.performetrics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Counter_init_3347406721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum775;
     Object enum776;

    public Counter_init_3347406721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term215139 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term215138 = ((Class) term215139).getDeclaredField((String) "CPU_TIME");
        ((Field) term215138).setAccessible(true);
        enum775 = ((Field) term215138).get((Object) null);
        Class<? extends Object> term215345 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term215344 = ((Class) term215345).getDeclaredField((String) "FAST");
        ((Field) term215344).setAccessible(true);
        enum776 = ((Field) term215344).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.Counter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("net.obvj.performetrics.Counter$Type");
        argTypes[1] = Class.forName("net.obvj.performetrics.ConversionMode");
        Object[] args = new Object[2];
        args[0] = enum775;
        args[1] = enum776;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


