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

public class Board_getEventListener_1950241945154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1258180;

    public Board_getEventListener_1950241945154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1258180 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.Board"));
        setField(term1258180, term1258180.getClass(), "backup", null);
        setField(term1258180, term1258180.getClass(), "eventListener", null);
        setField(term1258180, term1258180.getClass(), "bitboard", null);
        setField(term1258180, term1258180.getClass(), "bbSide", null);
        setField(term1258180, term1258180.getClass(), "occupation", null);
        setField(term1258180, term1258180.getClass(), "castleRight", null);
        setField(term1258180, term1258180.getClass(), "history", null);
        setField(term1258180, term1258180.getClass(), "sideToMove", null);
        setField(term1258180, term1258180.getClass(), "enPassantTarget", null);
        setField(term1258180, term1258180.getClass(), "enPassant", null);
        setField(term1258180, term1258180.getClass(), "moveCounter", null);
        setField(term1258180, term1258180.getClass(), "halfMoveCounter", null);
        setField(term1258180, term1258180.getClass(), "context", null);
        setBooleanField(term1258180, term1258180.getClass(), "enableEvents", false);
        setBooleanField(term1258180, term1258180.getClass(), "updateHistory", false);
        setLongField(term1258180, term1258180.getClass(), "incrementalHashKey", 0L);
        setLongField(term1258180, term1258180.getClass(), "incrementalPolyglotKey", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEventListener", argTypes, term1258180, args);
    }

};


