package org.openRealmOfStars.player.message;

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
import static org.openRealmOfStars.player.message.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Message_init_12395276031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17723;

    public Message_init_12395276031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17723 = newInstance(Class.forName("java.io.DataInputStream"));
        byte[] term17724 = (byte[]) newByteArray(9);
        char[] term17734 = (char[]) newCharArray(7);
        byte[] term17742 = (byte[]) newByteArray(6);
        char[] term17749 = (char[]) newCharArray(5);
        setByteElement(term17724, 0, (byte) -101);
        setByteElement(term17724, 1, (byte) 35);
        setByteElement(term17724, 2, (byte) 66);
        setByteElement(term17724, 3, (byte) 123);
        setByteElement(term17724, 4, (byte) -5);
        setByteElement(term17724, 5, (byte) 84);
        setByteElement(term17724, 6, (byte) -97);
        setByteElement(term17724, 7, (byte) -24);
        setByteElement(term17724, 8, (byte) 88);
        setField(term17723, term17723.getClass(), "bytearr", term17724);
        setCharElement(term17734, 0, 'J');
        setCharElement(term17734, 1, 'A');
        setCharElement(term17734, 2, 'E');
        setCharElement(term17734, 3, 't');
        setCharElement(term17734, 4, 'R');
        setCharElement(term17734, 5, 'r');
        setCharElement(term17734, 6, 'b');
        setField(term17723, term17723.getClass(), "chararr", term17734);
        setByteElement(term17742, 0, (byte) 96);
        setByteElement(term17742, 1, (byte) 70);
        setByteElement(term17742, 2, (byte) 48);
        setByteElement(term17742, 3, (byte) -46);
        setByteElement(term17742, 4, (byte) -128);
        setByteElement(term17742, 5, (byte) 66);
        setField(term17723, term17723.getClass(), "readBuffer", term17742);
        setCharElement(term17749, 0, 'M');
        setCharElement(term17749, 1, 'u');
        setCharElement(term17749, 2, 'L');
        setCharElement(term17749, 3, 'c');
        setCharElement(term17749, 4, 'g');
        setField(term17723, term17723.getClass(), "lineBuffer", term17749);
        setField(term17723, term17723.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.Message");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataInputStream");
        Object[] args = new Object[1];
        args[0] = term17723;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


