package org.openRealmOfStars.utilities.repository;

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
import static org.openRealmOfStars.utilities.repository.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DiplomacyRepository_loadDiplomacyBonusList_9683464144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1574;

    public DiplomacyRepository_loadDiplomacyBonusList_9683464144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1574 = newInstance(Class.forName("java.io.DataInputStream"));
        byte[] term1575 = (byte[]) newByteArray(1);
        char[] term1577 = (char[]) newCharArray(5);
        byte[] term1583 = (byte[]) newByteArray(5);
        char[] term1589 = (char[]) newCharArray(4);
        setByteElement(term1575, 0, (byte) -61);
        setField(term1574, term1574.getClass(), "bytearr", term1575);
        setCharElement(term1577, 0, 'A');
        setCharElement(term1577, 1, 'E');
        setCharElement(term1577, 2, 't');
        setCharElement(term1577, 3, 'R');
        setCharElement(term1577, 4, 'r');
        setField(term1574, term1574.getClass(), "chararr", term1577);
        setByteElement(term1583, 0, (byte) -85);
        setByteElement(term1583, 1, (byte) -22);
        setByteElement(term1583, 2, (byte) 93);
        setByteElement(term1583, 3, (byte) 69);
        setByteElement(term1583, 4, (byte) -74);
        setField(term1574, term1574.getClass(), "readBuffer", term1583);
        setCharElement(term1589, 0, 'b');
        setCharElement(term1589, 1, 'M');
        setCharElement(term1589, 2, 'u');
        setCharElement(term1589, 3, 'L');
        setField(term1574, term1574.getClass(), "lineBuffer", term1589);
        setField(term1574, term1574.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.repository.DiplomacyRepository");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataInputStream");
        Object[] args = new Object[1];
        args[0] = term1574;
        callMethod(klass, "loadDiplomacyBonusList", argTypes, null, args);
    }

};


