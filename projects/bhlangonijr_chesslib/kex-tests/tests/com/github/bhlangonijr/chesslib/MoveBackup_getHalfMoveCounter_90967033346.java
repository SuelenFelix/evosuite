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

public class MoveBackup_getHalfMoveCounter_90967033346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1397778;

    public MoveBackup_getHalfMoveCounter_90967033346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1397778 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.MoveBackup"));
        setField(term1397778, term1397778.getClass(), "castleRight", null);
        setField(term1397778, term1397778.getClass(), "sideToMove", null);
        setField(term1397778, term1397778.getClass(), "enPassantTarget", null);
        setField(term1397778, term1397778.getClass(), "enPassant", null);
        setField(term1397778, term1397778.getClass(), "moveCounter", null);
        setField(term1397778, term1397778.getClass(), "halfMoveCounter", null);
        setField(term1397778, term1397778.getClass(), "move", null);
        setField(term1397778, term1397778.getClass(), "rookCastleMove", null);
        setField(term1397778, term1397778.getClass(), "capturedPiece", null);
        setField(term1397778, term1397778.getClass(), "capturedSquare", null);
        setField(term1397778, term1397778.getClass(), "movingPiece", null);
        setBooleanField(term1397778, term1397778.getClass(), "castleMove", false);
        setBooleanField(term1397778, term1397778.getClass(), "enPassantMove", false);
        setLongField(term1397778, term1397778.getClass(), "incrementalHashKey", 0L);
        setLongField(term1397778, term1397778.getClass(), "incrementalPolyglotKey", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.MoveBackup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHalfMoveCounter", argTypes, term1397778, args);
    }

};


