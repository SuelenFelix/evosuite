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

public class Board_setEnableEvents_294527704173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1258281;
     Object term1258286;

    public Board_setEnableEvents_294527704173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1258281 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.Board"));
        setField(term1258281, term1258281.getClass(), "backup", null);
        setField(term1258281, term1258281.getClass(), "eventListener", null);
        setField(term1258281, term1258281.getClass(), "bitboard", null);
        setField(term1258281, term1258281.getClass(), "bbSide", null);
        setField(term1258281, term1258281.getClass(), "occupation", null);
        setField(term1258281, term1258281.getClass(), "castleRight", null);
        setField(term1258281, term1258281.getClass(), "history", null);
        setField(term1258281, term1258281.getClass(), "sideToMove", null);
        setField(term1258281, term1258281.getClass(), "enPassantTarget", null);
        setField(term1258281, term1258281.getClass(), "enPassant", null);
        setField(term1258281, term1258281.getClass(), "moveCounter", null);
        setField(term1258281, term1258281.getClass(), "halfMoveCounter", null);
        setField(term1258281, term1258281.getClass(), "context", null);
        setBooleanField(term1258281, term1258281.getClass(), "enableEvents", false);
        setBooleanField(term1258281, term1258281.getClass(), "updateHistory", false);
        setLongField(term1258281, term1258281.getClass(), "incrementalHashKey", 0L);
        setLongField(term1258281, term1258281.getClass(), "incrementalPolyglotKey", 0L);
        term1258286 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1258286;
        callMethod(klass, "setEnableEvents", argTypes, term1258281, args);
    }

};


