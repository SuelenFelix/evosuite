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

public class MoveBackup_setEnPassantMove_11993411563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1397865;
     Object term1397870;

    public MoveBackup_setEnPassantMove_11993411563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1397865 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.MoveBackup"));
        setField(term1397865, term1397865.getClass(), "castleRight", null);
        setField(term1397865, term1397865.getClass(), "sideToMove", null);
        setField(term1397865, term1397865.getClass(), "enPassantTarget", null);
        setField(term1397865, term1397865.getClass(), "enPassant", null);
        setField(term1397865, term1397865.getClass(), "moveCounter", null);
        setField(term1397865, term1397865.getClass(), "halfMoveCounter", null);
        setField(term1397865, term1397865.getClass(), "move", null);
        setField(term1397865, term1397865.getClass(), "rookCastleMove", null);
        setField(term1397865, term1397865.getClass(), "capturedPiece", null);
        setField(term1397865, term1397865.getClass(), "capturedSquare", null);
        setField(term1397865, term1397865.getClass(), "movingPiece", null);
        setBooleanField(term1397865, term1397865.getClass(), "castleMove", false);
        setBooleanField(term1397865, term1397865.getClass(), "enPassantMove", false);
        setLongField(term1397865, term1397865.getClass(), "incrementalHashKey", 0L);
        setLongField(term1397865, term1397865.getClass(), "incrementalPolyglotKey", 0L);
        term1397870 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.MoveBackup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1397870;
        callMethod(klass, "setEnPassantMove", argTypes, term1397865, args);
    }

};


