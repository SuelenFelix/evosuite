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

public class PgnHolder_getEvent_180120311925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3250;

    public PgnHolder_getEvent_180120311925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3250 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term3250, term3250.getClass(), "event", null);
        setField(term3250, term3250.getClass(), "player", null);
        setField(term3250, term3250.getClass(), "games", null);
        setField(term3250, term3250.getClass(), "listener", null);
        setField(term3250, term3250.getClass(), "fileName", null);
        setField(term3250, term3250.getClass(), "size", null);
        setBooleanField(term3250, term3250.getClass(), "lazyLoad", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEvent", argTypes, term3250, args);
    }

};


