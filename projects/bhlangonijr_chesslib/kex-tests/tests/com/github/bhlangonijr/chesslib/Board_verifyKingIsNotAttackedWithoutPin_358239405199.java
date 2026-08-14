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

public class Board_verifyKingIsNotAttackedWithoutPin_358239405199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1258417;
     Object term1258422;

    public Board_verifyKingIsNotAttackedWithoutPin_358239405199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1258417 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.Board"));
        setField(term1258417, term1258417.getClass(), "backup", null);
        setField(term1258417, term1258417.getClass(), "eventListener", null);
        setField(term1258417, term1258417.getClass(), "bitboard", null);
        setField(term1258417, term1258417.getClass(), "bbSide", null);
        setField(term1258417, term1258417.getClass(), "occupation", null);
        setField(term1258417, term1258417.getClass(), "castleRight", null);
        setField(term1258417, term1258417.getClass(), "history", null);
        setField(term1258417, term1258417.getClass(), "sideToMove", null);
        setField(term1258417, term1258417.getClass(), "enPassantTarget", null);
        setField(term1258417, term1258417.getClass(), "enPassant", null);
        setField(term1258417, term1258417.getClass(), "moveCounter", null);
        setField(term1258417, term1258417.getClass(), "halfMoveCounter", null);
        setField(term1258417, term1258417.getClass(), "context", null);
        setBooleanField(term1258417, term1258417.getClass(), "enableEvents", false);
        setBooleanField(term1258417, term1258417.getClass(), "updateHistory", false);
        setLongField(term1258417, term1258417.getClass(), "incrementalHashKey", 0L);
        setLongField(term1258417, term1258417.getClass(), "incrementalPolyglotKey", 0L);
        term1258422 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.Board");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Side");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        argTypes[2] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        argTypes[3] = long.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term1258422;
        callMethod(klass, "verifyKingIsNotAttackedWithoutPin", argTypes, term1258417, args);
    }

};


