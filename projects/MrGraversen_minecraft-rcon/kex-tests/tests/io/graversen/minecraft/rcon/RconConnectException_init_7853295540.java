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

public class RconConnectException_init_7853295540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49307;

    public RconConnectException_init_7853295540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49307 = (Object[]) newArray("java.lang.Object", 9);
        Object term49308 = newInstance(Class.forName("java.lang.Object"));
        Object term49309 = newInstance(Class.forName("java.lang.Object"));
        Object term49310 = newInstance(Class.forName("java.lang.Object"));
        Object term49311 = newInstance(Class.forName("java.lang.Object"));
        Object term49312 = newInstance(Class.forName("java.lang.Object"));
        Object term49313 = newInstance(Class.forName("java.lang.Object"));
        Object term49314 = newInstance(Class.forName("java.lang.Object"));
        Object term49315 = newInstance(Class.forName("java.lang.Object"));
        Object term49316 = newInstance(Class.forName("java.lang.Object"));
        setElement(term49307, 0, term49308);
        setElement(term49307, 1, term49309);
        setElement(term49307, 2, term49310);
        setElement(term49307, 3, term49311);
        setElement(term49307, 4, term49312);
        setElement(term49307, 5, term49313);
        setElement(term49307, 6, term49314);
        setElement(term49307, 7, term49315);
        setElement(term49307, 8, term49316);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.RconConnectException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = "oTGxFdiaIW";
        args[1] = term49307;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


