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

public class Board_doMove_386366125113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1257965;

    public Board_doMove_386366125113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1257965 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.Board"));
        setField(term1257965, term1257965.getClass(), "backup", null);
        setField(term1257965, term1257965.getClass(), "eventListener", null);
        setField(term1257965, term1257965.getClass(), "bitboard", null);
        setField(term1257965, term1257965.getClass(), "bbSide", null);
        setField(term1257965, term1257965.getClass(), "occupation", null);
        setField(term1257965, term1257965.getClass(), "castleRight", null);
        setField(term1257965, term1257965.getClass(), "history", null);
        setField(term1257965, term1257965.getClass(), "sideToMove", null);
        setField(term1257965, term1257965.getClass(), "enPassantTarget", null);
        setField(term1257965, term1257965.getClass(), "enPassant", null);
        setField(term1257965, term1257965.getClass(), "moveCounter", null);
        setField(term1257965, term1257965.getClass(), "halfMoveCounter", null);
        setField(term1257965, term1257965.getClass(), "context", null);
        setBooleanField(term1257965, term1257965.getClass(), "enableEvents", false);
        setBooleanField(term1257965, term1257965.getClass(), "updateHistory", false);
        setLongField(term1257965, term1257965.getClass(), "incrementalHashKey", 0L);
        setLongField(term1257965, term1257965.getClass(), "incrementalPolyglotKey", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "doMove", argTypes, term1257965, args);
    }

};


