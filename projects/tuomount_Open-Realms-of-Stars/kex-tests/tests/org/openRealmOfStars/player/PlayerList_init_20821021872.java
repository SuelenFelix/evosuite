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

public class PlayerList_init_20821021872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2728939;

    public PlayerList_init_20821021872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2728939 = newInstance(Class.forName("java.io.DataInputStream"));
        byte[] term2728940 = (byte[]) newByteArray(6);
        char[] term2728947 = (char[]) newCharArray(5);
        byte[] term2728953 = (byte[]) newByteArray(7);
        char[] term2728961 = (char[]) newCharArray(9);
        setByteElement(term2728940, 0, (byte) -30);
        setByteElement(term2728940, 1, (byte) 5);
        setByteElement(term2728940, 2, (byte) 117);
        setByteElement(term2728940, 3, (byte) -94);
        setByteElement(term2728940, 4, (byte) -49);
        setByteElement(term2728940, 5, (byte) -21);
        setField(term2728939, term2728939.getClass(), "bytearr", term2728940);
        setCharElement(term2728947, 0, 'S');
        setCharElement(term2728947, 1, 'z');
        setCharElement(term2728947, 2, 'Y');
        setCharElement(term2728947, 3, 'Y');
        setCharElement(term2728947, 4, 'I');
        setField(term2728939, term2728939.getClass(), "chararr", term2728947);
        setByteElement(term2728953, 0, (byte) 23);
        setByteElement(term2728953, 1, (byte) -126);
        setByteElement(term2728953, 2, (byte) -121);
        setByteElement(term2728953, 3, (byte) 99);
        setByteElement(term2728953, 4, (byte) -79);
        setByteElement(term2728953, 5, (byte) -122);
        setByteElement(term2728953, 6, (byte) -99);
        setField(term2728939, term2728939.getClass(), "readBuffer", term2728953);
        setCharElement(term2728961, 0, 'r');
        setCharElement(term2728961, 1, 'c');
        setCharElement(term2728961, 2, 'R');
        setCharElement(term2728961, 3, 'M');
        setCharElement(term2728961, 4, 'F');
        setCharElement(term2728961, 5, 'I');
        setCharElement(term2728961, 6, 's');
        setCharElement(term2728961, 7, 'Y');
        setCharElement(term2728961, 8, 'G');
        setField(term2728939, term2728939.getClass(), "lineBuffer", term2728961);
        setField(term2728939, term2728939.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataInputStream");
        Object[] args = new Object[1];
        args[0] = term2728939;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


