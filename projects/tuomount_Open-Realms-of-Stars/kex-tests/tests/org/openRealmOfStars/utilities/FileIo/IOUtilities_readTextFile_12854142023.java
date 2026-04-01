package org.openRealmOfStars.utilities.FileIo;

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
import static org.openRealmOfStars.utilities.FileIo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class IOUtilities_readTextFile_12854142023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term471;

    public IOUtilities_readTextFile_12854142023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term471 = newInstance(Class.forName("java.io.DataInputStream"));
        byte[] term472 = (byte[]) newByteArray(5);
        char[] term478 = (char[]) newCharArray(4);
        byte[] term483 = (byte[]) newByteArray(3);
        char[] term487 = (char[]) newCharArray(4);
        setByteElement(term472, 0, (byte) 47);
        setByteElement(term472, 1, (byte) 48);
        setByteElement(term472, 2, (byte) 89);
        setByteElement(term472, 3, (byte) 75);
        setByteElement(term472, 4, (byte) 18);
        setField(term471, term471.getClass(), "bytearr", term472);
        setCharElement(term478, 0, 'P');
        setCharElement(term478, 1, 'A');
        setCharElement(term478, 2, 'E');
        setCharElement(term478, 3, 'B');
        setField(term471, term471.getClass(), "chararr", term478);
        setByteElement(term483, 0, (byte) -58);
        setByteElement(term483, 1, (byte) -29);
        setByteElement(term483, 2, (byte) -54);
        setField(term471, term471.getClass(), "readBuffer", term483);
        setCharElement(term487, 0, 't');
        setCharElement(term487, 1, 'n');
        setCharElement(term487, 2, 'Z');
        setCharElement(term487, 3, 't');
        setField(term471, term471.getClass(), "lineBuffer", term487);
        setField(term471, term471.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.FileIo.IOUtilities");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataInputStream");
        Object[] args = new Object[1];
        args[0] = term471;
        callMethod(klass, "readTextFile", argTypes, null, args);
    }

};


