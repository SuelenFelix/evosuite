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
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.Object;

public class PgnHolder_loadPgn_126215096111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2356;
     Object term2390;

    public PgnHolder_loadPgn_126215096111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2357 = new HashMap();
        HashMap term2362 = new HashMap();
        ArrayList term2367 = new ArrayList();
        ArrayList term2371 = new ArrayList();
        Integer term2387 = new Integer(597278769);
        term2356 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term2356, term2356.getClass(), "event", term2357);
        setField(term2356, term2356.getClass(), "player", term2362);
        setField(term2356, term2356.getClass(), "games", term2367);
        setField(term2356, term2356.getClass(), "listener", term2371);
        setField(term2356, term2356.getClass(), "fileName", "JiVRgTZvKc");
        setField(term2356, term2356.getClass(), "size", term2387);
        setBooleanField(term2356, term2356.getClass(), "lazyLoad", true);
        term2390 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.util.LargeFile"));
        Object term2391 = newInstance(Class.forName("java.io.BufferedReader"));
        char[] term2392 = (char[]) newCharArray(9);
        Object term2408 = newInstance(Class.forName("java.lang.Object"));
        char[] term2409 = (char[]) newCharArray(3);
        setField(term2391, term2391.getClass(), "in", null);
        setCharElement(term2392, 0, 't');
        setCharElement(term2392, 1, 'T');
        setCharElement(term2392, 2, 'D');
        setCharElement(term2392, 3, 's');
        setCharElement(term2392, 4, 'j');
        setCharElement(term2392, 5, 'l');
        setCharElement(term2392, 6, 'J');
        setCharElement(term2392, 7, 'A');
        setCharElement(term2392, 8, 'E');
        setField(term2391, term2391.getClass(), "cb", term2392);
        setIntField(term2391, term2391.getClass(), "nChars", -1530420153);
        setIntField(term2391, term2391.getClass(), "nextChar", -469968304);
        setIntField(term2391, term2391.getClass(), "markedChar", -1145578966);
        setIntField(term2391, term2391.getClass(), "readAheadLimit", 679763016);
        setBooleanField(term2391, term2391.getClass(), "skipLF", false);
        setBooleanField(term2391, term2391.getClass(), "markedSkipLF", false);
        setField(term2391, term2391.getClass(), "lock", term2408);
        setCharElement(term2409, 0, 't');
        setCharElement(term2409, 1, 'R');
        setCharElement(term2409, 2, 'r');
        setField(term2391, term2391.getClass(), "skipBuffer", term2409);
        setField(term2390, term2390.getClass(), "reader", term2391);
        setField(term2390, term2390.getClass(), "nextLine", "XPKmummaqg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.util.LargeFile");
        Object[] args = new Object[1];
        args[0] = term2390;
        callMethod(klass, "loadPgn", argTypes, term2356, args);
    }

};


