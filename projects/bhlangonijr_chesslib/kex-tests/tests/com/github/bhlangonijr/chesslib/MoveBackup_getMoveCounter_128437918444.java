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

public class MoveBackup_getMoveCounter_128437918444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1397768;

    public MoveBackup_getMoveCounter_128437918444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1397768 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.MoveBackup"));
        setField(term1397768, term1397768.getClass(), "castleRight", null);
        setField(term1397768, term1397768.getClass(), "sideToMove", null);
        setField(term1397768, term1397768.getClass(), "enPassantTarget", null);
        setField(term1397768, term1397768.getClass(), "enPassant", null);
        setField(term1397768, term1397768.getClass(), "moveCounter", null);
        setField(term1397768, term1397768.getClass(), "halfMoveCounter", null);
        setField(term1397768, term1397768.getClass(), "move", null);
        setField(term1397768, term1397768.getClass(), "rookCastleMove", null);
        setField(term1397768, term1397768.getClass(), "capturedPiece", null);
        setField(term1397768, term1397768.getClass(), "capturedSquare", null);
        setField(term1397768, term1397768.getClass(), "movingPiece", null);
        setBooleanField(term1397768, term1397768.getClass(), "castleMove", false);
        setBooleanField(term1397768, term1397768.getClass(), "enPassantMove", false);
        setLongField(term1397768, term1397768.getClass(), "incrementalHashKey", 0L);
        setLongField(term1397768, term1397768.getClass(), "incrementalPolyglotKey", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.MoveBackup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMoveCounter", argTypes, term1397768, args);
    }

};


