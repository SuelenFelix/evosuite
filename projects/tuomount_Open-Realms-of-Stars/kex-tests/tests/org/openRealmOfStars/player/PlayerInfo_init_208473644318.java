package org.openRealmOfStars.player;

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
import static org.openRealmOfStars.player.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PlayerInfo_init_208473644318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4556513;

    public PlayerInfo_init_208473644318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4556513 = newInstance(Class.forName("java.io.DataInputStream"));
        byte[] term4556514 = (byte[]) newByteArray(3);
        char[] term4556518 = (char[]) newCharArray(8);
        byte[] term4556527 = (byte[]) newByteArray(8);
        char[] term4556536 = (char[]) newCharArray(2);
        setByteElement(term4556514, 0, (byte) -96);
        setByteElement(term4556514, 1, (byte) -59);
        setByteElement(term4556514, 2, (byte) -14);
        setField(term4556513, term4556513.getClass(), "bytearr", term4556514);
        setCharElement(term4556518, 0, 'L');
        setCharElement(term4556518, 1, 'Q');
        setCharElement(term4556518, 2, 'F');
        setCharElement(term4556518, 3, 'p');
        setCharElement(term4556518, 4, 'a');
        setCharElement(term4556518, 5, 'H');
        setCharElement(term4556518, 6, 'E');
        setCharElement(term4556518, 7, 'w');
        setField(term4556513, term4556513.getClass(), "chararr", term4556518);
        setByteElement(term4556527, 0, (byte) 93);
        setByteElement(term4556527, 1, (byte) 4);
        setByteElement(term4556527, 2, (byte) -91);
        setByteElement(term4556527, 3, (byte) -76);
        setByteElement(term4556527, 4, (byte) 44);
        setByteElement(term4556527, 5, (byte) -50);
        setByteElement(term4556527, 6, (byte) 69);
        setByteElement(term4556527, 7, (byte) 116);
        setField(term4556513, term4556513.getClass(), "readBuffer", term4556527);
        setCharElement(term4556536, 0, 'X');
        setCharElement(term4556536, 1, 'R');
        setField(term4556513, term4556513.getClass(), "lineBuffer", term4556536);
        setField(term4556513, term4556513.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataInputStream");
        Object[] args = new Object[1];
        args[0] = term4556513;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


