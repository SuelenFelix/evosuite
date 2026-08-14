package com.github.bhlangonijr.chesslib;

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
import static com.github.bhlangonijr.chesslib.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Board_verifyAllPins_489847576198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1258410;
     Object term1258415;

    public Board_verifyAllPins_489847576198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1258410 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.Board"));
        setField(term1258410, term1258410.getClass(), "backup", null);
        setField(term1258410, term1258410.getClass(), "eventListener", null);
        setField(term1258410, term1258410.getClass(), "bitboard", null);
        setField(term1258410, term1258410.getClass(), "bbSide", null);
        setField(term1258410, term1258410.getClass(), "occupation", null);
        setField(term1258410, term1258410.getClass(), "castleRight", null);
        setField(term1258410, term1258410.getClass(), "history", null);
        setField(term1258410, term1258410.getClass(), "sideToMove", null);
        setField(term1258410, term1258410.getClass(), "enPassantTarget", null);
        setField(term1258410, term1258410.getClass(), "enPassant", null);
        setField(term1258410, term1258410.getClass(), "moveCounter", null);
        setField(term1258410, term1258410.getClass(), "halfMoveCounter", null);
        setField(term1258410, term1258410.getClass(), "context", null);
        setBooleanField(term1258410, term1258410.getClass(), "enableEvents", false);
        setBooleanField(term1258410, term1258410.getClass(), "updateHistory", false);
        setLongField(term1258410, term1258410.getClass(), "incrementalHashKey", 0L);
        setLongField(term1258410, term1258410.getClass(), "incrementalPolyglotKey", 0L);
        term1258415 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.Board");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.Side");
        argTypes[2] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        argTypes[3] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        Object[] args = new Object[4];
        args[0] = term1258415;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "verifyAllPins", argTypes, term1258410, args);
    }

};


