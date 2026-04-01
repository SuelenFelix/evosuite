package org.openRealmOfStars.starMap.event.karmaEvents;

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
import static org.openRealmOfStars.starMap.event.karmaEvents.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class KarmaEvents_init_18436857531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288230;

    public KarmaEvents_init_18436857531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288230 = newInstance(Class.forName("java.io.DataInputStream"));
        byte[] term288231 = (byte[]) newByteArray(0);
        char[] term288232 = (char[]) newCharArray(8);
        byte[] term288241 = (byte[]) newByteArray(6);
        char[] term288248 = (char[]) newCharArray(0);
        setField(term288230, term288230.getClass(), "bytearr", term288231);
        setCharElement(term288232, 0, 'P');
        setCharElement(term288232, 1, 'A');
        setCharElement(term288232, 2, 'E');
        setCharElement(term288232, 3, 'B');
        setCharElement(term288232, 4, 't');
        setCharElement(term288232, 5, 'n');
        setCharElement(term288232, 6, 'Z');
        setCharElement(term288232, 7, 't');
        setField(term288230, term288230.getClass(), "chararr", term288232);
        setByteElement(term288241, 0, (byte) -57);
        setByteElement(term288241, 1, (byte) 94);
        setByteElement(term288241, 2, (byte) -29);
        setByteElement(term288241, 3, (byte) -4);
        setByteElement(term288241, 4, (byte) -9);
        setByteElement(term288241, 5, (byte) 119);
        setField(term288230, term288230.getClass(), "readBuffer", term288241);
        setField(term288230, term288230.getClass(), "lineBuffer", term288248);
        setField(term288230, term288230.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.event.karmaEvents.KarmaEvents");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataInputStream");
        Object[] args = new Object[1];
        args[0] = term288230;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


