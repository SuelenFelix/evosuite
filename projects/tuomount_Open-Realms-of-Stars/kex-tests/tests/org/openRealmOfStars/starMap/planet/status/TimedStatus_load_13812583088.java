package org.openRealmOfStars.starMap.planet.status;

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
import static org.openRealmOfStars.starMap.planet.status.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TimedStatus_load_13812583088 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4729;

    public TimedStatus_load_13812583088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4729 = newInstance(Class.forName("java.io.DataInputStream"));
        byte[] term4730 = (byte[]) newByteArray(6);
        char[] term4737 = (char[]) newCharArray(2);
        byte[] term4740 = (byte[]) newByteArray(1);
        char[] term4742 = (char[]) newCharArray(9);
        setByteElement(term4730, 0, (byte) 23);
        setByteElement(term4730, 1, (byte) -15);
        setByteElement(term4730, 2, (byte) 36);
        setByteElement(term4730, 3, (byte) 118);
        setByteElement(term4730, 4, (byte) 106);
        setByteElement(term4730, 5, (byte) 98);
        setField(term4729, term4729.getClass(), "bytearr", term4730);
        setCharElement(term4737, 0, 't');
        setCharElement(term4737, 1, 'T');
        setField(term4729, term4729.getClass(), "chararr", term4737);
        setByteElement(term4740, 0, (byte) 67);
        setField(term4729, term4729.getClass(), "readBuffer", term4740);
        setCharElement(term4742, 0, 'D');
        setCharElement(term4742, 1, 's');
        setCharElement(term4742, 2, 'j');
        setCharElement(term4742, 3, 'l');
        setCharElement(term4742, 4, 'J');
        setCharElement(term4742, 5, 'A');
        setCharElement(term4742, 6, 'E');
        setCharElement(term4742, 7, 't');
        setCharElement(term4742, 8, 'R');
        setField(term4729, term4729.getClass(), "lineBuffer", term4742);
        setField(term4729, term4729.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.TimedStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataInputStream");
        Object[] args = new Object[1];
        args[0] = term4729;
        callMethod(klass, "load", argTypes, null, args);
    }

};


