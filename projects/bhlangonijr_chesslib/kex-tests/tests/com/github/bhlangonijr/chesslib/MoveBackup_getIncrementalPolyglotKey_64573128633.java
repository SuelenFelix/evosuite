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
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class MoveBackup_getIncrementalPolyglotKey_64573128633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1394600;

    public MoveBackup_getIncrementalPolyglotKey_64573128633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1394602 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Class<? extends Object> term1394978 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1394977 = ((Class) term1394978).getDeclaredField((String) "WHITE");
        ((Field) term1394977).setAccessible(true);
        Object enum5357 = ((Field) term1394977).get((Object) null);
        Class<? extends Object> term1395180 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1395179 = ((Class) term1395180).getDeclaredField((String) "WHITE");
        ((Field) term1395179).setAccessible(true);
        Object enum5358 = ((Field) term1395179).get((Object) null);
        Class<? extends Object> term1395382 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1395381 = ((Class) term1395382).getDeclaredField((String) "H8");
        ((Field) term1395381).setAccessible(true);
        Object enum5359 = ((Field) term1395381).get((Object) null);
        Class<? extends Object> term1395585 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1395584 = ((Class) term1395585).getDeclaredField((String) "D3");
        ((Field) term1395584).setAccessible(true);
        Object enum5360 = ((Field) term1395584).get((Object) null);
        Integer term1394707 = new Integer(1743224434);
        Integer term1394709 = new Integer(842904495);
        Class<? extends Object> term1395788 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1395787 = ((Class) term1395788).getDeclaredField((String) "C3");
        ((Field) term1395787).setAccessible(true);
        Object enum5361 = ((Field) term1395787).get((Object) null);
        Class<? extends Object> term1395991 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1395990 = ((Class) term1395991).getDeclaredField((String) "D4");
        ((Field) term1395990).setAccessible(true);
        Object enum5362 = ((Field) term1395990).get((Object) null);
        Class<? extends Object> term1396194 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1396193 = ((Class) term1396194).getDeclaredField((String) "WHITE_ROOK");
        ((Field) term1396193).setAccessible(true);
        Object enum5363 = ((Field) term1396193).get((Object) null);
        Class<? extends Object> term1396426 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1396425 = ((Class) term1396426).getDeclaredField((String) "G2");
        ((Field) term1396425).setAccessible(true);
        Object enum5364 = ((Field) term1396425).get((Object) null);
        Class<? extends Object> term1396629 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1396628 = ((Class) term1396629).getDeclaredField((String) "C7");
        ((Field) term1396628).setAccessible(true);
        Object enum5365 = ((Field) term1396628).get((Object) null);
        Class<? extends Object> term1396832 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1396831 = ((Class) term1396832).getDeclaredField((String) "WHITE_BISHOP");
        ((Field) term1396831).setAccessible(true);
        Object enum5366 = ((Field) term1396831).get((Object) null);
        Class<? extends Object> term1397070 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1397069 = ((Class) term1397070).getDeclaredField((String) "WHITE_KNIGHT");
        ((Field) term1397069).setAccessible(true);
        Object enum5367 = ((Field) term1397069).get((Object) null);
        Class<? extends Object> term1397298 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1397297 = ((Class) term1397298).getDeclaredField((String) "A6");
        ((Field) term1397297).setAccessible(true);
        Object enum5368 = ((Field) term1397297).get((Object) null);
        Class<? extends Object> term1397501 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1397500 = ((Class) term1397501).getDeclaredField((String) "BLACK_KNIGHT");
        ((Field) term1397500).setAccessible(true);
        Object enum5369 = ((Field) term1397500).get((Object) null);
        term1394600 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.MoveBackup"));
        Object term1394601 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term1394692 = (Object[]) newArray("com.github.bhlangonijr.chesslib.Side", 2);
        Object[] term1394693 = (Object[]) newArray("java.lang.Object", 2);
        Object term1394711 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        Object term1394763 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term1394601, term1394601.getClass(), "keyType", term1394602);
        setElement(term1394692, 0, enum5357);
        setElement(term1394692, 1, enum5358);
        setField(term1394601, term1394601.getClass(), "keyUniverse", term1394692);
        setField(term1394601, term1394601.getClass(), "vals", term1394693);
        setIntField(term1394601, term1394601.getClass(), "size", 0);
        setField(term1394601, term1394601.getClass(), "entrySet", null);
        setField(term1394601, term1394601.getClass(), "keySet", null);
        setField(term1394601, term1394601.getClass(), "values", null);
        setField(term1394600, term1394600.getClass(), "castleRight", term1394601);
        setField(term1394600, term1394600.getClass(), "sideToMove", enum5357);
        setField(term1394600, term1394600.getClass(), "enPassantTarget", enum5359);
        setField(term1394600, term1394600.getClass(), "enPassant", enum5360);
        setField(term1394600, term1394600.getClass(), "moveCounter", term1394707);
        setField(term1394600, term1394600.getClass(), "halfMoveCounter", term1394709);
        setField(term1394711, term1394711.getClass(), "from", enum5361);
        setField(term1394711, term1394711.getClass(), "to", enum5362);
        setField(term1394711, term1394711.getClass(), "promotion", enum5363);
        setField(term1394711, term1394711.getClass(), "san", "gcFzvYOUch");
        setField(term1394600, term1394600.getClass(), "move", term1394711);
        setField(term1394763, term1394763.getClass(), "from", enum5364);
        setField(term1394763, term1394763.getClass(), "to", enum5365);
        setField(term1394763, term1394763.getClass(), "promotion", enum5366);
        setField(term1394763, term1394763.getClass(), "san", "NnFSMXLOUA");
        setField(term1394600, term1394600.getClass(), "rookCastleMove", term1394763);
        setField(term1394600, term1394600.getClass(), "capturedPiece", enum5367);
        setField(term1394600, term1394600.getClass(), "capturedSquare", enum5368);
        setField(term1394600, term1394600.getClass(), "movingPiece", enum5369);
        setBooleanField(term1394600, term1394600.getClass(), "castleMove", true);
        setBooleanField(term1394600, term1394600.getClass(), "enPassantMove", true);
        setLongField(term1394600, term1394600.getClass(), "incrementalHashKey", -6481933642917183045L);
        setLongField(term1394600, term1394600.getClass(), "incrementalPolyglotKey", 2054808971423494757L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.MoveBackup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIncrementalPolyglotKey", argTypes, term1394600, args);
    }

};


