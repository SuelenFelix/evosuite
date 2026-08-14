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

public class Board_setPiece_2062359121145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1258127;

    public Board_setPiece_2062359121145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1258127 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.Board"));
        setField(term1258127, term1258127.getClass(), "backup", null);
        setField(term1258127, term1258127.getClass(), "eventListener", null);
        setField(term1258127, term1258127.getClass(), "bitboard", null);
        setField(term1258127, term1258127.getClass(), "bbSide", null);
        setField(term1258127, term1258127.getClass(), "occupation", null);
        setField(term1258127, term1258127.getClass(), "castleRight", null);
        setField(term1258127, term1258127.getClass(), "history", null);
        setField(term1258127, term1258127.getClass(), "sideToMove", null);
        setField(term1258127, term1258127.getClass(), "enPassantTarget", null);
        setField(term1258127, term1258127.getClass(), "enPassant", null);
        setField(term1258127, term1258127.getClass(), "moveCounter", null);
        setField(term1258127, term1258127.getClass(), "halfMoveCounter", null);
        setField(term1258127, term1258127.getClass(), "context", null);
        setBooleanField(term1258127, term1258127.getClass(), "enableEvents", false);
        setBooleanField(term1258127, term1258127.getClass(), "updateHistory", false);
        setLongField(term1258127, term1258127.getClass(), "incrementalHashKey", 0L);
        setLongField(term1258127, term1258127.getClass(), "incrementalPolyglotKey", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.Board");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Piece");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "setPiece", argTypes, term1258127, args);
    }

};


