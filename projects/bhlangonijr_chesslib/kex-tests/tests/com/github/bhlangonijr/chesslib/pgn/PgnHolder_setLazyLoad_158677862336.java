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
import java.lang.Boolean;

public class PgnHolder_setLazyLoad_158677862336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3272;
     Object term3274;

    public PgnHolder_setLazyLoad_158677862336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3272 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term3272, term3272.getClass(), "event", null);
        setField(term3272, term3272.getClass(), "player", null);
        setField(term3272, term3272.getClass(), "games", null);
        setField(term3272, term3272.getClass(), "listener", null);
        setField(term3272, term3272.getClass(), "fileName", null);
        setField(term3272, term3272.getClass(), "size", null);
        setBooleanField(term3272, term3272.getClass(), "lazyLoad", false);
        term3274 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term3274;
        callMethod(klass, "setLazyLoad", argTypes, term3272, args);
    }

};


