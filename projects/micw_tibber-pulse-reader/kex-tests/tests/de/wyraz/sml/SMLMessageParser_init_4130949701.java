package de.wyraz.sml;

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
import static de.wyraz.sml.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SMLMessageParser_init_4130949701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6829;

    public SMLMessageParser_init_4130949701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6829 = (byte[]) newByteArray(8);
        setByteElement(term6829, 0, (byte) 60);
        setByteElement(term6829, 1, (byte) -128);
        setByteElement(term6829, 2, (byte) -55);
        setByteElement(term6829, 3, (byte) -83);
        setByteElement(term6829, 4, (byte) -48);
        setByteElement(term6829, 5, (byte) -113);
        setByteElement(term6829, 6, (byte) 15);
        setByteElement(term6829, 7, (byte) 38);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLMessageParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term6829;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


