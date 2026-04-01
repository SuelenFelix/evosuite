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

public class Votes_init_1405161271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23016;
     Object term23038;

    public Votes_init_1405161271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23016 = newInstance(Class.forName("java.io.DataInputStream"));
        byte[] term23017 = (byte[]) newByteArray(5);
        char[] term23023 = (char[]) newCharArray(4);
        byte[] term23028 = (byte[]) newByteArray(8);
        char[] term23037 = (char[]) newCharArray(0);
        setByteElement(term23017, 0, (byte) 67);
        setByteElement(term23017, 1, (byte) 66);
        setByteElement(term23017, 2, (byte) -121);
        setByteElement(term23017, 3, (byte) -119);
        setByteElement(term23017, 4, (byte) 71);
        setField(term23016, term23016.getClass(), "bytearr", term23017);
        setCharElement(term23023, 0, 't');
        setCharElement(term23023, 1, 'T');
        setCharElement(term23023, 2, 'D');
        setCharElement(term23023, 3, 's');
        setField(term23016, term23016.getClass(), "chararr", term23023);
        setByteElement(term23028, 0, (byte) 80);
        setByteElement(term23028, 1, (byte) 42);
        setByteElement(term23028, 2, (byte) 72);
        setByteElement(term23028, 3, (byte) 111);
        setByteElement(term23028, 4, (byte) 99);
        setByteElement(term23028, 5, (byte) -12);
        setByteElement(term23028, 6, (byte) -61);
        setByteElement(term23028, 7, (byte) -85);
        setField(term23016, term23016.getClass(), "readBuffer", term23028);
        setField(term23016, term23016.getClass(), "lineBuffer", term23037);
        setField(term23016, term23016.getClass(), "in", null);
        term23038 = new Integer(1050765721);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.Votes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataInputStream");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term23016;
        args[1] = term23038;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


