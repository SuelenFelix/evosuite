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

public class LargeFile_readNextLine_16695248534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121;

    public LargeFile_readNextLine_16695248534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.util.LargeFile"));
        Object term122 = newInstance(Class.forName("java.io.BufferedReader"));
        char[] term123 = (char[]) newCharArray(1);
        Object term131 = newInstance(Class.forName("java.lang.Object"));
        char[] term132 = (char[]) newCharArray(6);
        setField(term122, term122.getClass(), "in", null);
        setCharElement(term123, 0, 't');
        setField(term122, term122.getClass(), "cb", term123);
        setIntField(term122, term122.getClass(), "nChars", 1227103734);
        setIntField(term122, term122.getClass(), "nextChar", -1339778481);
        setIntField(term122, term122.getClass(), "markedChar", 1725571209);
        setIntField(term122, term122.getClass(), "readAheadLimit", -522618178);
        setBooleanField(term122, term122.getClass(), "skipLF", true);
        setBooleanField(term122, term122.getClass(), "markedSkipLF", true);
        setField(term122, term122.getClass(), "lock", term131);
        setCharElement(term132, 0, 'R');
        setCharElement(term132, 1, 'r');
        setCharElement(term132, 2, 'b');
        setCharElement(term132, 3, 'M');
        setCharElement(term132, 4, 'u');
        setCharElement(term132, 5, 'L');
        setField(term122, term122.getClass(), "skipBuffer", term132);
        setField(term121, term121.getClass(), "reader", term122);
        setField(term121, term121.getClass(), "nextLine", "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.util.LargeFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "readNextLine", argTypes, term121, args);
    }

};


