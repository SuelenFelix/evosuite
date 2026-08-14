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

public class PgnHolder_getGame_13496617498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2224;

    public PgnHolder_getGame_13496617498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2225 = new HashMap();
        HashMap term2230 = new HashMap();
        ArrayList term2235 = new ArrayList();
        ArrayList term2239 = new ArrayList();
        Integer term2255 = new Integer(1134449235);
        term2224 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term2224, term2224.getClass(), "event", term2225);
        setField(term2224, term2224.getClass(), "player", term2230);
        setField(term2224, term2224.getClass(), "games", term2235);
        setField(term2224, term2224.getClass(), "listener", term2239);
        setField(term2224, term2224.getClass(), "fileName", "jiKYgYHqIS");
        setField(term2224, term2224.getClass(), "size", term2255);
        setBooleanField(term2224, term2224.getClass(), "lazyLoad", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGame", argTypes, term2224, args);
    }

};


