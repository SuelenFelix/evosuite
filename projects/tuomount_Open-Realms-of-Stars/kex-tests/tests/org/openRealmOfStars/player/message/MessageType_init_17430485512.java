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

public class MessageType_init_17430485512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12218;

    public MessageType_init_17430485512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12218 = newInstance(Class.forName("java.io.DataInputStream"));
        byte[] term12219 = (byte[]) newByteArray(8);
        char[] term12228 = (char[]) newCharArray(6);
        byte[] term12235 = (byte[]) newByteArray(2);
        char[] term12238 = (char[]) newCharArray(1);
        setByteElement(term12219, 0, (byte) 116);
        setByteElement(term12219, 1, (byte) -81);
        setByteElement(term12219, 2, (byte) 102);
        setByteElement(term12219, 3, (byte) -118);
        setByteElement(term12219, 4, (byte) -126);
        setByteElement(term12219, 5, (byte) -91);
        setByteElement(term12219, 6, (byte) -104);
        setByteElement(term12219, 7, (byte) -89);
        setField(term12218, term12218.getClass(), "bytearr", term12219);
        setCharElement(term12228, 0, 'Z');
        setCharElement(term12228, 1, 't');
        setCharElement(term12228, 2, 'T');
        setCharElement(term12228, 3, 'D');
        setCharElement(term12228, 4, 's');
        setCharElement(term12228, 5, 'j');
        setField(term12218, term12218.getClass(), "chararr", term12228);
        setByteElement(term12235, 0, (byte) 13);
        setByteElement(term12235, 1, (byte) 44);
        setField(term12218, term12218.getClass(), "readBuffer", term12235);
        setCharElement(term12238, 0, 'l');
        setField(term12218, term12218.getClass(), "lineBuffer", term12238);
        setField(term12218, term12218.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.MessageType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataInputStream");
        Object[] args = new Object[1];
        args[0] = term12218;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


