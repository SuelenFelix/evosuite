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

public class AppliedStatus_load_17907091824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term764;

    public AppliedStatus_load_17907091824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term764 = newInstance(Class.forName("java.io.DataInputStream"));
        byte[] term765 = (byte[]) newByteArray(2);
        char[] term768 = (char[]) newCharArray(6);
        byte[] term775 = (byte[]) newByteArray(7);
        char[] term783 = (char[]) newCharArray(1);
        setByteElement(term765, 0, (byte) -54);
        setByteElement(term765, 1, (byte) -10);
        setField(term764, term764.getClass(), "bytearr", term765);
        setCharElement(term768, 0, 'P');
        setCharElement(term768, 1, 'A');
        setCharElement(term768, 2, 'E');
        setCharElement(term768, 3, 'B');
        setCharElement(term768, 4, 't');
        setCharElement(term768, 5, 'n');
        setField(term764, term764.getClass(), "chararr", term768);
        setByteElement(term775, 0, (byte) 79);
        setByteElement(term775, 1, (byte) -119);
        setByteElement(term775, 2, (byte) -66);
        setByteElement(term775, 3, (byte) 83);
        setByteElement(term775, 4, (byte) 74);
        setByteElement(term775, 5, (byte) -71);
        setByteElement(term775, 6, (byte) 49);
        setField(term764, term764.getClass(), "readBuffer", term775);
        setCharElement(term783, 0, 'Z');
        setField(term764, term764.getClass(), "lineBuffer", term783);
        setField(term764, term764.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.AppliedStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataInputStream");
        Object[] args = new Object[1];
        args[0] = term764;
        callMethod(klass, "load", argTypes, null, args);
    }

};


