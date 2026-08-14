package com.github.bhlangonijr.chesslib.util;

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
import static com.github.bhlangonijr.chesslib.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class LargeFile_FileIterator_init_15227219450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179;

    public LargeFile_FileIterator_init_15227219450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.util.LargeFile"));
        Object term180 = newInstance(Class.forName("java.io.BufferedReader"));
        char[] term181 = (char[]) newCharArray(2);
        Object term190 = newInstance(Class.forName("java.lang.Object"));
        char[] term191 = (char[]) newCharArray(6);
        setField(term180, term180.getClass(), "in", null);
        setCharElement(term181, 0, 'c');
        setCharElement(term181, 1, 'g');
        setField(term180, term180.getClass(), "cb", term181);
        setIntField(term180, term180.getClass(), "nChars", 1134449235);
        setIntField(term180, term180.getClass(), "nextChar", -883034806);
        setIntField(term180, term180.getClass(), "markedChar", 1585847225);
        setIntField(term180, term180.getClass(), "readAheadLimit", 597278769);
        setBooleanField(term180, term180.getClass(), "skipLF", true);
        setBooleanField(term180, term180.getClass(), "markedSkipLF", true);
        setField(term180, term180.getClass(), "lock", term190);
        setCharElement(term191, 0, 'Q');
        setCharElement(term191, 1, 'H');
        setCharElement(term191, 2, 'g');
        setCharElement(term191, 3, 'q');
        setCharElement(term191, 4, 'z');
        setCharElement(term191, 5, 'x');
        setField(term180, term180.getClass(), "skipBuffer", term191);
        setField(term179, term179.getClass(), "reader", term180);
        setField(term179, term179.getClass(), "nextLine", "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.util.LargeFile$FileIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.util.LargeFile");
        Object[] args = new Object[1];
        args[0] = term179;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


