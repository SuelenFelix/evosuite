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

public class StarMap_init_78041193315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3779371;

    public StarMap_init_78041193315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3779371 = newInstance(Class.forName("java.io.DataInputStream"));
        byte[] term3779372 = (byte[]) newByteArray(8);
        char[] term3779381 = (char[]) newCharArray(5);
        byte[] term3779387 = (byte[]) newByteArray(8);
        char[] term3779396 = (char[]) newCharArray(3);
        setByteElement(term3779372, 0, (byte) -8);
        setByteElement(term3779372, 1, (byte) 30);
        setByteElement(term3779372, 2, (byte) -9);
        setByteElement(term3779372, 3, (byte) 33);
        setByteElement(term3779372, 4, (byte) -110);
        setByteElement(term3779372, 5, (byte) -86);
        setByteElement(term3779372, 6, (byte) 2);
        setByteElement(term3779372, 7, (byte) 115);
        setField(term3779371, term3779371.getClass(), "bytearr", term3779372);
        setCharElement(term3779381, 0, 'G');
        setCharElement(term3779381, 1, 't');
        setCharElement(term3779381, 2, 'D');
        setCharElement(term3779381, 3, 'I');
        setCharElement(term3779381, 4, 'R');
        setField(term3779371, term3779371.getClass(), "chararr", term3779381);
        setByteElement(term3779387, 0, (byte) -27);
        setByteElement(term3779387, 1, (byte) 54);
        setByteElement(term3779387, 2, (byte) 88);
        setByteElement(term3779387, 3, (byte) -15);
        setByteElement(term3779387, 4, (byte) 79);
        setByteElement(term3779387, 5, (byte) -55);
        setByteElement(term3779387, 6, (byte) -103);
        setByteElement(term3779387, 7, (byte) -22);
        setField(term3779371, term3779371.getClass(), "readBuffer", term3779387);
        setCharElement(term3779396, 0, 'b');
        setCharElement(term3779396, 1, 'S');
        setCharElement(term3779396, 2, 'S');
        setField(term3779371, term3779371.getClass(), "lineBuffer", term3779396);
        setField(term3779371, term3779371.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataInputStream");
        Object[] args = new Object[1];
        args[0] = term3779371;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


