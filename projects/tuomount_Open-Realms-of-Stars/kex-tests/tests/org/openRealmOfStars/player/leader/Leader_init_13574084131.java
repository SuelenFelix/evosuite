package org.openRealmOfStars.player.leader;

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
import static org.openRealmOfStars.player.leader.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Leader_init_13574084131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term638107;

    public Leader_init_13574084131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term638107 = newInstance(Class.forName("java.io.DataInputStream"));
        byte[] term638108 = (byte[]) newByteArray(2);
        char[] term638111 = (char[]) newCharArray(7);
        byte[] term638119 = (byte[]) newByteArray(5);
        char[] term638125 = (char[]) newCharArray(5);
        setByteElement(term638108, 0, (byte) 18);
        setByteElement(term638108, 1, (byte) 87);
        setField(term638107, term638107.getClass(), "bytearr", term638108);
        setCharElement(term638111, 0, 'J');
        setCharElement(term638111, 1, 'A');
        setCharElement(term638111, 2, 'E');
        setCharElement(term638111, 3, 't');
        setCharElement(term638111, 4, 'R');
        setCharElement(term638111, 5, 'r');
        setCharElement(term638111, 6, 'b');
        setField(term638107, term638107.getClass(), "chararr", term638111);
        setByteElement(term638119, 0, (byte) 118);
        setByteElement(term638119, 1, (byte) 30);
        setByteElement(term638119, 2, (byte) -16);
        setByteElement(term638119, 3, (byte) 4);
        setByteElement(term638119, 4, (byte) 9);
        setField(term638107, term638107.getClass(), "readBuffer", term638119);
        setCharElement(term638125, 0, 'M');
        setCharElement(term638125, 1, 'u');
        setCharElement(term638125, 2, 'L');
        setCharElement(term638125, 3, 'c');
        setCharElement(term638125, 4, 'g');
        setField(term638107, term638107.getClass(), "lineBuffer", term638125);
        setField(term638107, term638107.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.leader.Leader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataInputStream");
        Object[] args = new Object[1];
        args[0] = term638107;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


