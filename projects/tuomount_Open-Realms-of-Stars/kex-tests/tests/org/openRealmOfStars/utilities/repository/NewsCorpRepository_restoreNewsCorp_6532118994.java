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
import java.lang.Integer;

public class NewsCorpRepository_restoreNewsCorp_6532118994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2060;
     Object term2061;
     Object term2086;

    public NewsCorpRepository_restoreNewsCorp_6532118994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2060 = newInstance(Class.forName("org.openRealmOfStars.utilities.repository.NewsCorpRepository"));
        term2061 = newInstance(Class.forName("java.io.DataInputStream"));
        byte[] term2062 = (byte[]) newByteArray(7);
        char[] term2070 = (char[]) newCharArray(7);
        byte[] term2078 = (byte[]) newByteArray(1);
        char[] term2080 = (char[]) newCharArray(5);
        setByteElement(term2062, 0, (byte) -5);
        setByteElement(term2062, 1, (byte) 84);
        setByteElement(term2062, 2, (byte) -97);
        setByteElement(term2062, 3, (byte) -24);
        setByteElement(term2062, 4, (byte) 88);
        setByteElement(term2062, 5, (byte) 96);
        setByteElement(term2062, 6, (byte) 70);
        setField(term2061, term2061.getClass(), "bytearr", term2062);
        setCharElement(term2070, 0, 'm');
        setCharElement(term2070, 1, 'a');
        setCharElement(term2070, 2, 'n');
        setCharElement(term2070, 3, 'W');
        setCharElement(term2070, 4, 'E');
        setCharElement(term2070, 5, 'G');
        setCharElement(term2070, 6, 't');
        setField(term2061, term2061.getClass(), "chararr", term2070);
        setByteElement(term2078, 0, (byte) 48);
        setField(term2061, term2061.getClass(), "readBuffer", term2078);
        setCharElement(term2080, 0, 'D');
        setCharElement(term2080, 1, 'I');
        setCharElement(term2080, 2, 'R');
        setCharElement(term2080, 3, 'b');
        setCharElement(term2080, 4, 'S');
        setField(term2061, term2061.getClass(), "lineBuffer", term2080);
        setField(term2061, term2061.getClass(), "in", null);
        term2086 = new Integer(-2027534003);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.repository.NewsCorpRepository");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataInputStream");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2061;
        args[1] = term2086;
        callMethod(klass, "restoreNewsCorp", argTypes, term2060, args);
    }

};


