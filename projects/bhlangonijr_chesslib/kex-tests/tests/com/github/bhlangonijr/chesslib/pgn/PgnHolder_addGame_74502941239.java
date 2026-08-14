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

public class PgnHolder_addGame_74502941239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3280;

    public PgnHolder_addGame_74502941239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3280 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term3280, term3280.getClass(), "event", null);
        setField(term3280, term3280.getClass(), "player", null);
        setField(term3280, term3280.getClass(), "games", null);
        setField(term3280, term3280.getClass(), "listener", null);
        setField(term3280, term3280.getClass(), "fileName", null);
        setField(term3280, term3280.getClass(), "size", null);
        setBooleanField(term3280, term3280.getClass(), "lazyLoad", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addGame", argTypes, term3280, args);
    }

};


