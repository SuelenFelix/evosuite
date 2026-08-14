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
import java.lang.Boolean;

public class Board_isMoveLegal_1558405830163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1258227;
     Object term1258232;

    public Board_isMoveLegal_1558405830163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1258227 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.Board"));
        setField(term1258227, term1258227.getClass(), "backup", null);
        setField(term1258227, term1258227.getClass(), "eventListener", null);
        setField(term1258227, term1258227.getClass(), "bitboard", null);
        setField(term1258227, term1258227.getClass(), "bbSide", null);
        setField(term1258227, term1258227.getClass(), "occupation", null);
        setField(term1258227, term1258227.getClass(), "castleRight", null);
        setField(term1258227, term1258227.getClass(), "history", null);
        setField(term1258227, term1258227.getClass(), "sideToMove", null);
        setField(term1258227, term1258227.getClass(), "enPassantTarget", null);
        setField(term1258227, term1258227.getClass(), "enPassant", null);
        setField(term1258227, term1258227.getClass(), "moveCounter", null);
        setField(term1258227, term1258227.getClass(), "halfMoveCounter", null);
        setField(term1258227, term1258227.getClass(), "context", null);
        setBooleanField(term1258227, term1258227.getClass(), "enableEvents", false);
        setBooleanField(term1258227, term1258227.getClass(), "updateHistory", false);
        setLongField(term1258227, term1258227.getClass(), "incrementalHashKey", 0L);
        setLongField(term1258227, term1258227.getClass(), "incrementalPolyglotKey", 0L);
        term1258232 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.Board");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.move.Move");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1258232;
        callMethod(klass, "isMoveLegal", argTypes, term1258227, args);
    }

};


