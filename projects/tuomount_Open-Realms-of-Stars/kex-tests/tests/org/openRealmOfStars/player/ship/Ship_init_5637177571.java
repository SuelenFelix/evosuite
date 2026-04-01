package org.openRealmOfStars.player.ship;

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
import static org.openRealmOfStars.player.ship.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Ship_init_5637177571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term543277;

    public Ship_init_5637177571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term543277 = newInstance(Class.forName("java.io.DataInputStream"));
        byte[] term543278 = (byte[]) newByteArray(7);
        char[] term543286 = (char[]) newCharArray(3);
        byte[] term543290 = (byte[]) newByteArray(9);
        char[] term543300 = (char[]) newCharArray(7);
        setByteElement(term543278, 0, (byte) 4);
        setByteElement(term543278, 1, (byte) 9);
        setByteElement(term543278, 2, (byte) -95);
        setByteElement(term543278, 3, (byte) -113);
        setByteElement(term543278, 4, (byte) -79);
        setByteElement(term543278, 5, (byte) -14);
        setByteElement(term543278, 6, (byte) 94);
        setField(term543277, term543277.getClass(), "bytearr", term543278);
        setCharElement(term543286, 0, 'R');
        setCharElement(term543286, 1, 'r');
        setCharElement(term543286, 2, 'b');
        setField(term543277, term543277.getClass(), "chararr", term543286);
        setByteElement(term543290, 0, (byte) -109);
        setByteElement(term543290, 1, (byte) -52);
        setByteElement(term543290, 2, (byte) -99);
        setByteElement(term543290, 3, (byte) 90);
        setByteElement(term543290, 4, (byte) 92);
        setByteElement(term543290, 5, (byte) 106);
        setByteElement(term543290, 6, (byte) 47);
        setByteElement(term543290, 7, (byte) -74);
        setByteElement(term543290, 8, (byte) -117);
        setField(term543277, term543277.getClass(), "readBuffer", term543290);
        setCharElement(term543300, 0, 'M');
        setCharElement(term543300, 1, 'u');
        setCharElement(term543300, 2, 'L');
        setCharElement(term543300, 3, 'c');
        setCharElement(term543300, 4, 'g');
        setCharElement(term543300, 5, 'Q');
        setCharElement(term543300, 6, 'H');
        setField(term543277, term543277.getClass(), "lineBuffer", term543300);
        setField(term543277, term543277.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.Ship");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataInputStream");
        Object[] args = new Object[1];
        args[0] = term543277;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


