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

public class ShipStat_init_17879292011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185356;

    public ShipStat_init_17879292011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185356 = newInstance(Class.forName("java.io.DataInputStream"));
        byte[] term185357 = (byte[]) newByteArray(8);
        char[] term185366 = (char[]) newCharArray(6);
        byte[] term185373 = (byte[]) newByteArray(6);
        char[] term185380 = (char[]) newCharArray(8);
        setByteElement(term185357, 0, (byte) 127);
        setByteElement(term185357, 1, (byte) -24);
        setByteElement(term185357, 2, (byte) -89);
        setByteElement(term185357, 3, (byte) -35);
        setByteElement(term185357, 4, (byte) -59);
        setByteElement(term185357, 5, (byte) 73);
        setByteElement(term185357, 6, (byte) 94);
        setByteElement(term185357, 7, (byte) 114);
        setField(term185356, term185356.getClass(), "bytearr", term185357);
        setCharElement(term185366, 0, 'B');
        setCharElement(term185366, 1, 't');
        setCharElement(term185366, 2, 'n');
        setCharElement(term185366, 3, 'Z');
        setCharElement(term185366, 4, 't');
        setCharElement(term185366, 5, 'T');
        setField(term185356, term185356.getClass(), "chararr", term185366);
        setByteElement(term185373, 0, (byte) 110);
        setByteElement(term185373, 1, (byte) 70);
        setByteElement(term185373, 2, (byte) -46);
        setByteElement(term185373, 3, (byte) -78);
        setByteElement(term185373, 4, (byte) 109);
        setByteElement(term185373, 5, (byte) 17);
        setField(term185356, term185356.getClass(), "readBuffer", term185373);
        setCharElement(term185380, 0, 'D');
        setCharElement(term185380, 1, 's');
        setCharElement(term185380, 2, 'j');
        setCharElement(term185380, 3, 'l');
        setCharElement(term185380, 4, 'J');
        setCharElement(term185380, 5, 'A');
        setCharElement(term185380, 6, 'E');
        setCharElement(term185380, 7, 't');
        setField(term185356, term185356.getClass(), "lineBuffer", term185380);
        setField(term185356, term185356.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipStat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataInputStream");
        Object[] args = new Object[1];
        args[0] = term185356;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


