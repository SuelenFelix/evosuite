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

public class PgnHolder_getSize_122334574414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2567;

    public PgnHolder_getSize_122334574414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2568 = new HashMap();
        HashMap term2573 = new HashMap();
        ArrayList term2578 = new ArrayList();
        ArrayList term2582 = new ArrayList();
        Integer term2598 = new Integer(1622346318);
        term2567 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term2567, term2567.getClass(), "event", term2568);
        setField(term2567, term2567.getClass(), "player", term2573);
        setField(term2567, term2567.getClass(), "games", term2578);
        setField(term2567, term2567.getClass(), "listener", term2582);
        setField(term2567, term2567.getClass(), "fileName", "AWRooQKkdW");
        setField(term2567, term2567.getClass(), "size", term2598);
        setBooleanField(term2567, term2567.getClass(), "lazyLoad", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSize", argTypes, term2567, args);
    }

};


