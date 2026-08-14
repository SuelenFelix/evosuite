package com.github.bhlangonijr.chesslib.pgn;

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
import static com.github.bhlangonijr.chesslib.pgn.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PgnIterator_init_11234326241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term705;

    public PgnIterator_init_11234326241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term705 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.util.LargeFile"));
        Object term706 = newInstance(Class.forName("java.io.BufferedReader"));
        char[] term707 = (char[]) newCharArray(1);
        Object term715 = newInstance(Class.forName("java.lang.Object"));
        char[] term716 = (char[]) newCharArray(6);
        setField(term706, term706.getClass(), "in", null);
        setCharElement(term707, 0, 'P');
        setField(term706, term706.getClass(), "cb", term707);
        setIntField(term706, term706.getClass(), "nChars", -1922583790);
        setIntField(term706, term706.getClass(), "nextChar", -616727354);
        setIntField(term706, term706.getClass(), "markedChar", -1955890973);
        setIntField(term706, term706.getClass(), "readAheadLimit", -2038273078);
        setBooleanField(term706, term706.getClass(), "skipLF", false);
        setBooleanField(term706, term706.getClass(), "markedSkipLF", false);
        setField(term706, term706.getClass(), "lock", term715);
        setCharElement(term716, 0, 'A');
        setCharElement(term716, 1, 'E');
        setCharElement(term716, 2, 'B');
        setCharElement(term716, 3, 't');
        setCharElement(term716, 4, 'n');
        setCharElement(term716, 5, 'Z');
        setField(term706, term706.getClass(), "skipBuffer", term716);
        setField(term705, term705.getClass(), "reader", term706);
        setField(term705, term705.getClass(), "nextLine", "tbcdzjIfER");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.util.LargeFile");
        Object[] args = new Object[1];
        args[0] = term705;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


