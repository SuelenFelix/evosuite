package org.openRealmOfStars.starMap.vote;

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
import static org.openRealmOfStars.starMap.vote.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Vote_init_1005631984 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3728;
     Object term3749;

    public Vote_init_1005631984() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3728 = newInstance(Class.forName("java.io.DataInputStream"));
        byte[] term3729 = (byte[]) newByteArray(2);
        char[] term3732 = (char[]) newCharArray(6);
        byte[] term3739 = (byte[]) newByteArray(7);
        char[] term3747 = (char[]) newCharArray(1);
        setByteElement(term3729, 0, (byte) 47);
        setByteElement(term3729, 1, (byte) 48);
        setField(term3728, term3728.getClass(), "bytearr", term3729);
        setCharElement(term3732, 0, 'P');
        setCharElement(term3732, 1, 'A');
        setCharElement(term3732, 2, 'E');
        setCharElement(term3732, 3, 'B');
        setCharElement(term3732, 4, 't');
        setCharElement(term3732, 5, 'n');
        setField(term3728, term3728.getClass(), "chararr", term3732);
        setByteElement(term3739, 0, (byte) 89);
        setByteElement(term3739, 1, (byte) 75);
        setByteElement(term3739, 2, (byte) 18);
        setByteElement(term3739, 3, (byte) -58);
        setByteElement(term3739, 4, (byte) -29);
        setByteElement(term3739, 5, (byte) -54);
        setByteElement(term3739, 6, (byte) -10);
        setField(term3728, term3728.getClass(), "readBuffer", term3739);
        setCharElement(term3747, 0, 'Z');
        setField(term3728, term3728.getClass(), "lineBuffer", term3747);
        setField(term3728, term3728.getClass(), "in", null);
        term3749 = new Integer(590364439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataInputStream");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term3728;
        args[1] = term3749;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


