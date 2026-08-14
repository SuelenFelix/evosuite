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

public class Board_squareAttackedBy_700198443158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1258200;
     Object term1258205;

    public Board_squareAttackedBy_700198443158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1258200 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.Board"));
        setField(term1258200, term1258200.getClass(), "backup", null);
        setField(term1258200, term1258200.getClass(), "eventListener", null);
        setField(term1258200, term1258200.getClass(), "bitboard", null);
        setField(term1258200, term1258200.getClass(), "bbSide", null);
        setField(term1258200, term1258200.getClass(), "occupation", null);
        setField(term1258200, term1258200.getClass(), "castleRight", null);
        setField(term1258200, term1258200.getClass(), "history", null);
        setField(term1258200, term1258200.getClass(), "sideToMove", null);
        setField(term1258200, term1258200.getClass(), "enPassantTarget", null);
        setField(term1258200, term1258200.getClass(), "enPassant", null);
        setField(term1258200, term1258200.getClass(), "moveCounter", null);
        setField(term1258200, term1258200.getClass(), "halfMoveCounter", null);
        setField(term1258200, term1258200.getClass(), "context", null);
        setBooleanField(term1258200, term1258200.getClass(), "enableEvents", false);
        setBooleanField(term1258200, term1258200.getClass(), "updateHistory", false);
        setLongField(term1258200, term1258200.getClass(), "incrementalHashKey", 0L);
        setLongField(term1258200, term1258200.getClass(), "incrementalPolyglotKey", 0L);
        term1258205 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.Board");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.Side");
        argTypes[2] = long.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term1258205;
        callMethod(klass, "squareAttackedBy", argTypes, term1258200, args);
    }

};


