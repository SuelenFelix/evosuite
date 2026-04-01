package org.openRealmOfStars.player.tech;

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
import static org.openRealmOfStars.player.tech.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;

public class TechListForLevel_init_14026955802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196343;
     Object enum592;
     Object term196359;

    public TechListForLevel_init_14026955802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196343 = new Integer(1822317628);
        Class<? extends Object> term196386 = Class.forName((String) "org.openRealmOfStars.player.tech.TechType");
        Field term196385 = ((Class) term196386).getDeclaredField((String) "Propulsion");
        ((Field) term196385).setAccessible(true);
        enum592 = ((Field) term196385).get((Object) null);
        term196359 = newInstance(Class.forName("java.io.DataInputStream"));
        byte[] term196360 = (byte[]) newByteArray(4);
        char[] term196365 = (char[]) newCharArray(1);
        byte[] term196367 = (byte[]) newByteArray(9);
        char[] term196377 = (char[]) newCharArray(7);
        setByteElement(term196360, 0, (byte) -61);
        setByteElement(term196360, 1, (byte) 70);
        setByteElement(term196360, 2, (byte) 89);
        setByteElement(term196360, 3, (byte) -99);
        setField(term196359, term196359.getClass(), "bytearr", term196360);
        setCharElement(term196365, 0, 'P');
        setField(term196359, term196359.getClass(), "chararr", term196365);
        setByteElement(term196367, 0, (byte) 59);
        setByteElement(term196367, 1, (byte) -99);
        setByteElement(term196367, 2, (byte) 61);
        setByteElement(term196367, 3, (byte) 100);
        setByteElement(term196367, 4, (byte) 55);
        setByteElement(term196367, 5, (byte) -111);
        setByteElement(term196367, 6, (byte) -127);
        setByteElement(term196367, 7, (byte) 19);
        setByteElement(term196367, 8, (byte) 83);
        setField(term196359, term196359.getClass(), "readBuffer", term196367);
        setCharElement(term196377, 0, 'A');
        setCharElement(term196377, 1, 'E');
        setCharElement(term196377, 2, 'B');
        setCharElement(term196377, 3, 't');
        setCharElement(term196377, 4, 'n');
        setCharElement(term196377, 5, 'Z');
        setCharElement(term196377, 6, 't');
        setField(term196359, term196359.getClass(), "lineBuffer", term196377);
        setField(term196359, term196359.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.TechListForLevel");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.openRealmOfStars.player.tech.TechType");
        argTypes[2] = Class.forName("java.io.DataInputStream");
        Object[] args = new Object[3];
        args[0] = term196343;
        args[1] = enum592;
        args[2] = term196359;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


