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

public class MoveBackup_makeBackup_181503189236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1397728;

    public MoveBackup_makeBackup_181503189236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1397728 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.MoveBackup"));
        setField(term1397728, term1397728.getClass(), "castleRight", null);
        setField(term1397728, term1397728.getClass(), "sideToMove", null);
        setField(term1397728, term1397728.getClass(), "enPassantTarget", null);
        setField(term1397728, term1397728.getClass(), "enPassant", null);
        setField(term1397728, term1397728.getClass(), "moveCounter", null);
        setField(term1397728, term1397728.getClass(), "halfMoveCounter", null);
        setField(term1397728, term1397728.getClass(), "move", null);
        setField(term1397728, term1397728.getClass(), "rookCastleMove", null);
        setField(term1397728, term1397728.getClass(), "capturedPiece", null);
        setField(term1397728, term1397728.getClass(), "capturedSquare", null);
        setField(term1397728, term1397728.getClass(), "movingPiece", null);
        setBooleanField(term1397728, term1397728.getClass(), "castleMove", false);
        setBooleanField(term1397728, term1397728.getClass(), "enPassantMove", false);
        setLongField(term1397728, term1397728.getClass(), "incrementalHashKey", 0L);
        setLongField(term1397728, term1397728.getClass(), "incrementalPolyglotKey", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.MoveBackup");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Board");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.move.Move");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "makeBackup", argTypes, term1397728, args);
    }

};


