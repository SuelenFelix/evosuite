package io.graversen.minecraft.rcon;

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
import static io.graversen.minecraft.rcon.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RconCommandException_init_5073501290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28533;

    public RconCommandException_init_5073501290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28533 = (Object[]) newArray("java.lang.Object", 6);
        Object term28534 = newInstance(Class.forName("java.lang.Object"));
        Object term28535 = newInstance(Class.forName("java.lang.Object"));
        Object term28536 = newInstance(Class.forName("java.lang.Object"));
        Object term28537 = newInstance(Class.forName("java.lang.Object"));
        Object term28538 = newInstance(Class.forName("java.lang.Object"));
        Object term28539 = newInstance(Class.forName("java.lang.Object"));
        setElement(term28533, 0, term28534);
        setElement(term28533, 1, term28535);
        setElement(term28533, 2, term28536);
        setElement(term28533, 3, term28537);
        setElement(term28533, 4, term28538);
        setElement(term28533, 5, term28539);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.RconCommandException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = "fRujHWvXjJ";
        args[1] = term28533;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


