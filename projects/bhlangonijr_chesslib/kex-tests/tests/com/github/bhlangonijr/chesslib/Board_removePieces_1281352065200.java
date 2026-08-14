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

public class Board_removePieces_1281352065200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1258424;
     Object term1258429;

    public Board_removePieces_1281352065200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1258424 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.Board"));
        setField(term1258424, term1258424.getClass(), "backup", null);
        setField(term1258424, term1258424.getClass(), "eventListener", null);
        setField(term1258424, term1258424.getClass(), "bitboard", null);
        setField(term1258424, term1258424.getClass(), "bbSide", null);
        setField(term1258424, term1258424.getClass(), "occupation", null);
        setField(term1258424, term1258424.getClass(), "castleRight", null);
        setField(term1258424, term1258424.getClass(), "history", null);
        setField(term1258424, term1258424.getClass(), "sideToMove", null);
        setField(term1258424, term1258424.getClass(), "enPassantTarget", null);
        setField(term1258424, term1258424.getClass(), "enPassant", null);
        setField(term1258424, term1258424.getClass(), "moveCounter", null);
        setField(term1258424, term1258424.getClass(), "halfMoveCounter", null);
        setField(term1258424, term1258424.getClass(), "context", null);
        setBooleanField(term1258424, term1258424.getClass(), "enableEvents", false);
        setBooleanField(term1258424, term1258424.getClass(), "updateHistory", false);
        setLongField(term1258424, term1258424.getClass(), "incrementalHashKey", 0L);
        setLongField(term1258424, term1258424.getClass(), "incrementalPolyglotKey", 0L);
        term1258429 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.Board");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        argTypes[2] = long.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term1258429;
        callMethod(klass, "removePieces", argTypes, term1258424, args);
    }

};


