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

public class DiplomacyRepository_loadDiplomacy_2044340166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1665;

    public DiplomacyRepository_loadDiplomacy_2044340166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1665 = newInstance(Class.forName("java.io.DataInputStream"));
        byte[] term1666 = (byte[]) newByteArray(4);
        char[] term1671 = (char[]) newCharArray(7);
        byte[] term1679 = (byte[]) newByteArray(1);
        char[] term1681 = (char[]) newCharArray(8);
        setByteElement(term1666, 0, (byte) 106);
        setByteElement(term1666, 1, (byte) -57);
        setByteElement(term1666, 2, (byte) -103);
        setByteElement(term1666, 3, (byte) 98);
        setField(term1665, term1665.getClass(), "bytearr", term1666);
        setCharElement(term1671, 0, 'c');
        setCharElement(term1671, 1, 'g');
        setCharElement(term1671, 2, 'Q');
        setCharElement(term1671, 3, 'H');
        setCharElement(term1671, 4, 'g');
        setCharElement(term1671, 5, 'q');
        setCharElement(term1671, 6, 'z');
        setField(term1665, term1665.getClass(), "chararr", term1671);
        setByteElement(term1679, 0, (byte) 79);
        setField(term1665, term1665.getClass(), "readBuffer", term1679);
        setCharElement(term1681, 0, 'x');
        setCharElement(term1681, 1, 'x');
        setCharElement(term1681, 2, 't');
        setCharElement(term1681, 3, 'l');
        setCharElement(term1681, 4, 'P');
        setCharElement(term1681, 5, 'w');
        setCharElement(term1681, 6, 'D');
        setCharElement(term1681, 7, 'Y');
        setField(term1665, term1665.getClass(), "lineBuffer", term1681);
        setField(term1665, term1665.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.repository.DiplomacyRepository");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataInputStream");
        Object[] args = new Object[1];
        args[0] = term1665;
        callMethod(klass, "loadDiplomacy", argTypes, null, args);
    }

};


