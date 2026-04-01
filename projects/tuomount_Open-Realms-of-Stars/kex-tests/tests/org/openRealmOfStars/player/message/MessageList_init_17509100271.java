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

public class MessageList_init_17509100271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7532;

    public MessageList_init_17509100271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7532 = newInstance(Class.forName("java.io.DataInputStream"));
        byte[] term7533 = (byte[]) newByteArray(4);
        char[] term7538 = (char[]) newCharArray(6);
        byte[] term7545 = (byte[]) newByteArray(7);
        char[] term7553 = (char[]) newCharArray(0);
        setByteElement(term7533, 0, (byte) -121);
        setByteElement(term7533, 1, (byte) -119);
        setByteElement(term7533, 2, (byte) 71);
        setByteElement(term7533, 3, (byte) 80);
        setField(term7532, term7532.getClass(), "bytearr", term7533);
        setCharElement(term7538, 0, 'P');
        setCharElement(term7538, 1, 'A');
        setCharElement(term7538, 2, 'E');
        setCharElement(term7538, 3, 'B');
        setCharElement(term7538, 4, 't');
        setCharElement(term7538, 5, 'n');
        setField(term7532, term7532.getClass(), "chararr", term7538);
        setByteElement(term7545, 0, (byte) 42);
        setByteElement(term7545, 1, (byte) 72);
        setByteElement(term7545, 2, (byte) 111);
        setByteElement(term7545, 3, (byte) 99);
        setByteElement(term7545, 4, (byte) -12);
        setByteElement(term7545, 5, (byte) -61);
        setByteElement(term7545, 6, (byte) -85);
        setField(term7532, term7532.getClass(), "readBuffer", term7545);
        setField(term7532, term7532.getClass(), "lineBuffer", term7553);
        setField(term7532, term7532.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.MessageList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataInputStream");
        Object[] args = new Object[1];
        args[0] = term7532;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


