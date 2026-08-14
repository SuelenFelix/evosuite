package com.loomcom.symon.jterminal.vt100;

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
import static com.loomcom.symon.jterminal.vt100.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Character;
import java.lang.Object;

public class AnsiControlSequence_init_2587613280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1545;
     Object term1547;

    public AnsiControlSequence_init_2587613280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1545 = new Character('E');
        term1547 = (Object[]) newArray("java.lang.String", 6);
        setElement(term1547, 0, "MjGYSRKTNF");
        setElement(term1547, 1, "hRNSzYYIrc");
        setElement(term1547, 2, "RMFIsYGgne");
        setElement(term1547, 3, "NRdvgJlhkX");
        setElement(term1547, 4, "uuaPigETmJ");
        setElement(term1547, 5, "MxlszYVzRf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.vt100.AnsiControlSequence");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = char.class;
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1545;
        args[1] = term1547;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


