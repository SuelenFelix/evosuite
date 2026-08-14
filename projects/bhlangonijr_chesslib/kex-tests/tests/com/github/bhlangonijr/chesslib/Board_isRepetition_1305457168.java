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
import java.lang.Integer;

public class Board_isRepetition_1305457168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1258254;
     Object term1258259;

    public Board_isRepetition_1305457168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1258254 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.Board"));
        setField(term1258254, term1258254.getClass(), "backup", null);
        setField(term1258254, term1258254.getClass(), "eventListener", null);
        setField(term1258254, term1258254.getClass(), "bitboard", null);
        setField(term1258254, term1258254.getClass(), "bbSide", null);
        setField(term1258254, term1258254.getClass(), "occupation", null);
        setField(term1258254, term1258254.getClass(), "castleRight", null);
        setField(term1258254, term1258254.getClass(), "history", null);
        setField(term1258254, term1258254.getClass(), "sideToMove", null);
        setField(term1258254, term1258254.getClass(), "enPassantTarget", null);
        setField(term1258254, term1258254.getClass(), "enPassant", null);
        setField(term1258254, term1258254.getClass(), "moveCounter", null);
        setField(term1258254, term1258254.getClass(), "halfMoveCounter", null);
        setField(term1258254, term1258254.getClass(), "context", null);
        setBooleanField(term1258254, term1258254.getClass(), "enableEvents", false);
        setBooleanField(term1258254, term1258254.getClass(), "updateHistory", false);
        setLongField(term1258254, term1258254.getClass(), "incrementalHashKey", 0L);
        setLongField(term1258254, term1258254.getClass(), "incrementalPolyglotKey", 0L);
        term1258259 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1258259;
        callMethod(klass, "isRepetition", argTypes, term1258254, args);
    }

};


