package org.openRealmOfStars.player.ship.shipdesign;

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
import static org.openRealmOfStars.player.ship.shipdesign.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ShipDesign_init_2524386961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3916;

    public ShipDesign_init_2524386961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3916 = newInstance(Class.forName("java.io.DataInputStream"));
        byte[] term3917 = (byte[]) newByteArray(9);
        char[] term3927 = (char[]) newCharArray(9);
        byte[] term3937 = (byte[]) newByteArray(3);
        char[] term3941 = (char[]) newCharArray(7);
        setByteElement(term3917, 0, (byte) 18);
        setByteElement(term3917, 1, (byte) -58);
        setByteElement(term3917, 2, (byte) -29);
        setByteElement(term3917, 3, (byte) -54);
        setByteElement(term3917, 4, (byte) -10);
        setByteElement(term3917, 5, (byte) 79);
        setByteElement(term3917, 6, (byte) -119);
        setByteElement(term3917, 7, (byte) -66);
        setByteElement(term3917, 8, (byte) 83);
        setField(term3916, term3916.getClass(), "bytearr", term3917);
        setCharElement(term3927, 0, 'P');
        setCharElement(term3927, 1, 'A');
        setCharElement(term3927, 2, 'E');
        setCharElement(term3927, 3, 'B');
        setCharElement(term3927, 4, 't');
        setCharElement(term3927, 5, 'n');
        setCharElement(term3927, 6, 'Z');
        setCharElement(term3927, 7, 't');
        setCharElement(term3927, 8, 'T');
        setField(term3916, term3916.getClass(), "chararr", term3927);
        setByteElement(term3937, 0, (byte) 74);
        setByteElement(term3937, 1, (byte) -71);
        setByteElement(term3937, 2, (byte) 49);
        setField(term3916, term3916.getClass(), "readBuffer", term3937);
        setCharElement(term3941, 0, 'D');
        setCharElement(term3941, 1, 's');
        setCharElement(term3941, 2, 'j');
        setCharElement(term3941, 3, 'l');
        setCharElement(term3941, 4, 'J');
        setCharElement(term3941, 5, 'A');
        setCharElement(term3941, 6, 'E');
        setField(term3916, term3916.getClass(), "lineBuffer", term3941);
        setField(term3916, term3916.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataInputStream");
        Object[] args = new Object[1];
        args[0] = term3916;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


