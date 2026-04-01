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

public class IOUtilities_readString_9331317905 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term548;

    public IOUtilities_readString_9331317905() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term548 = newInstance(Class.forName("java.io.DataInputStream"));
        byte[] term549 = (byte[]) newByteArray(1);
        char[] term551 = (char[]) newCharArray(6);
        byte[] term558 = (byte[]) newByteArray(2);
        char[] term561 = (char[]) newCharArray(6);
        setByteElement(term549, 0, (byte) -10);
        setField(term548, term548.getClass(), "bytearr", term549);
        setCharElement(term551, 0, 'T');
        setCharElement(term551, 1, 'D');
        setCharElement(term551, 2, 's');
        setCharElement(term551, 3, 'j');
        setCharElement(term551, 4, 'l');
        setCharElement(term551, 5, 'J');
        setField(term548, term548.getClass(), "chararr", term551);
        setByteElement(term558, 0, (byte) 79);
        setByteElement(term558, 1, (byte) -119);
        setField(term548, term548.getClass(), "readBuffer", term558);
        setCharElement(term561, 0, 'A');
        setCharElement(term561, 1, 'E');
        setCharElement(term561, 2, 't');
        setCharElement(term561, 3, 'R');
        setCharElement(term561, 4, 'r');
        setCharElement(term561, 5, 'b');
        setField(term548, term548.getClass(), "lineBuffer", term561);
        setField(term548, term548.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.FileIo.IOUtilities");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataInputStream");
        Object[] args = new Object[1];
        args[0] = term548;
        callMethod(klass, "readString", argTypes, null, args);
    }

};


