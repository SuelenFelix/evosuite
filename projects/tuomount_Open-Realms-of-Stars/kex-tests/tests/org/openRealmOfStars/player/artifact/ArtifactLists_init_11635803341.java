package org.openRealmOfStars.player.artifact;

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
import static org.openRealmOfStars.player.artifact.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ArtifactLists_init_11635803341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5158;

    public ArtifactLists_init_11635803341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5158 = newInstance(Class.forName("java.io.DataInputStream"));
        byte[] term5159 = (byte[]) newByteArray(5);
        char[] term5165 = (char[]) newCharArray(4);
        byte[] term5170 = (byte[]) newByteArray(3);
        char[] term5174 = (char[]) newCharArray(4);
        setByteElement(term5159, 0, (byte) 47);
        setByteElement(term5159, 1, (byte) 48);
        setByteElement(term5159, 2, (byte) 89);
        setByteElement(term5159, 3, (byte) 75);
        setByteElement(term5159, 4, (byte) 18);
        setField(term5158, term5158.getClass(), "bytearr", term5159);
        setCharElement(term5165, 0, 'P');
        setCharElement(term5165, 1, 'A');
        setCharElement(term5165, 2, 'E');
        setCharElement(term5165, 3, 'B');
        setField(term5158, term5158.getClass(), "chararr", term5165);
        setByteElement(term5170, 0, (byte) -58);
        setByteElement(term5170, 1, (byte) -29);
        setByteElement(term5170, 2, (byte) -54);
        setField(term5158, term5158.getClass(), "readBuffer", term5170);
        setCharElement(term5174, 0, 't');
        setCharElement(term5174, 1, 'n');
        setCharElement(term5174, 2, 'Z');
        setCharElement(term5174, 3, 't');
        setField(term5158, term5158.getClass(), "lineBuffer", term5174);
        setField(term5158, term5158.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.artifact.ArtifactLists");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataInputStream");
        Object[] args = new Object[1];
        args[0] = term5158;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


