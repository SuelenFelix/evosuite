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

public class DiplomacyRepository_loadDiplomacyBonus_19748453982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1174;

    public DiplomacyRepository_loadDiplomacyBonus_19748453982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1174 = newInstance(Class.forName("java.io.DataInputStream"));
        byte[] term1175 = (byte[]) newByteArray(1);
        char[] term1177 = (char[]) newCharArray(6);
        byte[] term1184 = (byte[]) newByteArray(5);
        char[] term1190 = (char[]) newCharArray(5);
        setByteElement(term1175, 0, (byte) 67);
        setField(term1174, term1174.getClass(), "bytearr", term1175);
        setCharElement(term1177, 0, 'B');
        setCharElement(term1177, 1, 't');
        setCharElement(term1177, 2, 'n');
        setCharElement(term1177, 3, 'Z');
        setCharElement(term1177, 4, 't');
        setCharElement(term1177, 5, 'T');
        setField(term1174, term1174.getClass(), "chararr", term1177);
        setByteElement(term1184, 0, (byte) 66);
        setByteElement(term1184, 1, (byte) -121);
        setByteElement(term1184, 2, (byte) -119);
        setByteElement(term1184, 3, (byte) 71);
        setByteElement(term1184, 4, (byte) 80);
        setField(term1174, term1174.getClass(), "readBuffer", term1184);
        setCharElement(term1190, 0, 'D');
        setCharElement(term1190, 1, 's');
        setCharElement(term1190, 2, 'j');
        setCharElement(term1190, 3, 'l');
        setCharElement(term1190, 4, 'J');
        setField(term1174, term1174.getClass(), "lineBuffer", term1190);
        setField(term1174, term1174.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.repository.DiplomacyRepository");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataInputStream");
        Object[] args = new Object[1];
        args[0] = term1174;
        callMethod(klass, "loadDiplomacyBonus", argTypes, null, args);
    }

};


