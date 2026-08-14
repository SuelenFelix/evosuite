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

public class PgnHolder_countGamesInPgnFile_143830942910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2312;

    public PgnHolder_countGamesInPgnFile_143830942910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2313 = new HashMap();
        HashMap term2318 = new HashMap();
        ArrayList term2323 = new ArrayList();
        ArrayList term2327 = new ArrayList();
        Integer term2343 = new Integer(1585847225);
        term2312 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term2312, term2312.getClass(), "event", term2313);
        setField(term2312, term2312.getClass(), "player", term2318);
        setField(term2312, term2312.getClass(), "games", term2323);
        setField(term2312, term2312.getClass(), "listener", term2327);
        setField(term2312, term2312.getClass(), "fileName", "XqgfKFvPSD");
        setField(term2312, term2312.getClass(), "size", term2343);
        setBooleanField(term2312, term2312.getClass(), "lazyLoad", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "countGamesInPgnFile", argTypes, term2312, args);
    }

};


