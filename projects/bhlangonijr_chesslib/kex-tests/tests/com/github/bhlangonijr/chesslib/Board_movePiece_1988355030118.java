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

public class Board_movePiece_1988355030118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1257992;

    public Board_movePiece_1988355030118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1257992 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.Board"));
        setField(term1257992, term1257992.getClass(), "backup", null);
        setField(term1257992, term1257992.getClass(), "eventListener", null);
        setField(term1257992, term1257992.getClass(), "bitboard", null);
        setField(term1257992, term1257992.getClass(), "bbSide", null);
        setField(term1257992, term1257992.getClass(), "occupation", null);
        setField(term1257992, term1257992.getClass(), "castleRight", null);
        setField(term1257992, term1257992.getClass(), "history", null);
        setField(term1257992, term1257992.getClass(), "sideToMove", null);
        setField(term1257992, term1257992.getClass(), "enPassantTarget", null);
        setField(term1257992, term1257992.getClass(), "enPassant", null);
        setField(term1257992, term1257992.getClass(), "moveCounter", null);
        setField(term1257992, term1257992.getClass(), "halfMoveCounter", null);
        setField(term1257992, term1257992.getClass(), "context", null);
        setBooleanField(term1257992, term1257992.getClass(), "enableEvents", false);
        setBooleanField(term1257992, term1257992.getClass(), "updateHistory", false);
        setLongField(term1257992, term1257992.getClass(), "incrementalHashKey", 0L);
        setLongField(term1257992, term1257992.getClass(), "incrementalPolyglotKey", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.Board");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.move.Move");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.MoveBackup");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "movePiece", argTypes, term1257992, args);
    }

};


