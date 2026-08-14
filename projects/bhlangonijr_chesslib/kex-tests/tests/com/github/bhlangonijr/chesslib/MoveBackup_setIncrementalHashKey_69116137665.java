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

public class MoveBackup_setIncrementalHashKey_69116137665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1397877;
     Object term1397882;

    public MoveBackup_setIncrementalHashKey_69116137665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1397877 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.MoveBackup"));
        setField(term1397877, term1397877.getClass(), "castleRight", null);
        setField(term1397877, term1397877.getClass(), "sideToMove", null);
        setField(term1397877, term1397877.getClass(), "enPassantTarget", null);
        setField(term1397877, term1397877.getClass(), "enPassant", null);
        setField(term1397877, term1397877.getClass(), "moveCounter", null);
        setField(term1397877, term1397877.getClass(), "halfMoveCounter", null);
        setField(term1397877, term1397877.getClass(), "move", null);
        setField(term1397877, term1397877.getClass(), "rookCastleMove", null);
        setField(term1397877, term1397877.getClass(), "capturedPiece", null);
        setField(term1397877, term1397877.getClass(), "capturedSquare", null);
        setField(term1397877, term1397877.getClass(), "movingPiece", null);
        setBooleanField(term1397877, term1397877.getClass(), "castleMove", false);
        setBooleanField(term1397877, term1397877.getClass(), "enPassantMove", false);
        setLongField(term1397877, term1397877.getClass(), "incrementalHashKey", 0L);
        setLongField(term1397877, term1397877.getClass(), "incrementalPolyglotKey", 0L);
        term1397882 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.MoveBackup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1397882;
        callMethod(klass, "setIncrementalHashKey", argTypes, term1397877, args);
    }

};


