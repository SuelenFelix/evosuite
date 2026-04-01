package org.openRealmOfStars.starMap;

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
import static org.openRealmOfStars.starMap.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SquareInfo_init_8376224522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4203705;

    public SquareInfo_init_8376224522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4203705 = newInstance(Class.forName("java.io.DataInputStream"));
        byte[] term4203706 = (byte[]) newByteArray(8);
        char[] term4203715 = (char[]) newCharArray(1);
        byte[] term4203717 = (byte[]) newByteArray(4);
        char[] term4203722 = (char[]) newCharArray(0);
        setByteElement(term4203706, 0, (byte) 16);
        setByteElement(term4203706, 1, (byte) -31);
        setByteElement(term4203706, 2, (byte) 42);
        setByteElement(term4203706, 3, (byte) -6);
        setByteElement(term4203706, 4, (byte) 32);
        setByteElement(term4203706, 5, (byte) 121);
        setByteElement(term4203706, 6, (byte) 71);
        setByteElement(term4203706, 7, (byte) -108);
        setField(term4203705, term4203705.getClass(), "bytearr", term4203706);
        setCharElement(term4203715, 0, 'b');
        setField(term4203705, term4203705.getClass(), "chararr", term4203715);
        setByteElement(term4203717, 0, (byte) 80);
        setByteElement(term4203717, 1, (byte) 33);
        setByteElement(term4203717, 2, (byte) 35);
        setByteElement(term4203717, 3, (byte) -119);
        setField(term4203705, term4203705.getClass(), "readBuffer", term4203717);
        setField(term4203705, term4203705.getClass(), "lineBuffer", term4203722);
        setField(term4203705, term4203705.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.SquareInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataInputStream");
        Object[] args = new Object[1];
        args[0] = term4203705;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


