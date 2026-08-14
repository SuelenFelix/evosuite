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

public class Board_isInsufficientMaterial_896444168170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1258266;

    public Board_isInsufficientMaterial_896444168170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1258266 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.Board"));
        setField(term1258266, term1258266.getClass(), "backup", null);
        setField(term1258266, term1258266.getClass(), "eventListener", null);
        setField(term1258266, term1258266.getClass(), "bitboard", null);
        setField(term1258266, term1258266.getClass(), "bbSide", null);
        setField(term1258266, term1258266.getClass(), "occupation", null);
        setField(term1258266, term1258266.getClass(), "castleRight", null);
        setField(term1258266, term1258266.getClass(), "history", null);
        setField(term1258266, term1258266.getClass(), "sideToMove", null);
        setField(term1258266, term1258266.getClass(), "enPassantTarget", null);
        setField(term1258266, term1258266.getClass(), "enPassant", null);
        setField(term1258266, term1258266.getClass(), "moveCounter", null);
        setField(term1258266, term1258266.getClass(), "halfMoveCounter", null);
        setField(term1258266, term1258266.getClass(), "context", null);
        setBooleanField(term1258266, term1258266.getClass(), "enableEvents", false);
        setBooleanField(term1258266, term1258266.getClass(), "updateHistory", false);
        setLongField(term1258266, term1258266.getClass(), "incrementalHashKey", 0L);
        setLongField(term1258266, term1258266.getClass(), "incrementalPolyglotKey", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInsufficientMaterial", argTypes, term1258266, args);
    }

};


