package org.openRealmOfStars.starMap.event.ascensionEvents;

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
import static org.openRealmOfStars.starMap.event.ascensionEvents.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AscensionEvents_init_12672651571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public AscensionEvents_init_12672651571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("java.io.DataInputStream"));
        byte[] term2 = (byte[]) newByteArray(5);
        char[] term8 = (char[]) newCharArray(4);
        byte[] term13 = (byte[]) newByteArray(3);
        char[] term17 = (char[]) newCharArray(4);
        setByteElement(term2, 0, (byte) 47);
        setByteElement(term2, 1, (byte) 48);
        setByteElement(term2, 2, (byte) 89);
        setByteElement(term2, 3, (byte) 75);
        setByteElement(term2, 4, (byte) 18);
        setField(term1, term1.getClass(), "bytearr", term2);
        setCharElement(term8, 0, 'P');
        setCharElement(term8, 1, 'A');
        setCharElement(term8, 2, 'E');
        setCharElement(term8, 3, 'B');
        setField(term1, term1.getClass(), "chararr", term8);
        setByteElement(term13, 0, (byte) -58);
        setByteElement(term13, 1, (byte) -29);
        setByteElement(term13, 2, (byte) -54);
        setField(term1, term1.getClass(), "readBuffer", term13);
        setCharElement(term17, 0, 't');
        setCharElement(term17, 1, 'n');
        setCharElement(term17, 2, 'Z');
        setCharElement(term17, 3, 't');
        setField(term1, term1.getClass(), "lineBuffer", term17);
        setField(term1, term1.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.event.ascensionEvents.AscensionEvents");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataInputStream");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


