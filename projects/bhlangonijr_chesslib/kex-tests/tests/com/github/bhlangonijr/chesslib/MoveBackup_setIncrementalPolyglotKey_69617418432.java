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
import java.lang.Long;

public class MoveBackup_setIncrementalPolyglotKey_69617418432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1391456;
     Object term1391748;

    public MoveBackup_setIncrementalPolyglotKey_69617418432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1391458 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Class<? extends Object> term1391859 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1391858 = ((Class) term1391859).getDeclaredField((String) "WHITE");
        ((Field) term1391858).setAccessible(true);
        Object enum5344 = ((Field) term1391858).get((Object) null);
        Class<? extends Object> term1392061 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1392060 = ((Class) term1392061).getDeclaredField((String) "WHITE");
        ((Field) term1392060).setAccessible(true);
        Object enum5345 = ((Field) term1392060).get((Object) null);
        Class<? extends Object> term1392263 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1392262 = ((Class) term1392263).getDeclaredField((String) "F3");
        ((Field) term1392262).setAccessible(true);
        Object enum5346 = ((Field) term1392262).get((Object) null);
        Class<? extends Object> term1392466 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1392465 = ((Class) term1392466).getDeclaredField((String) "B6");
        ((Field) term1392465).setAccessible(true);
        Object enum5347 = ((Field) term1392465).get((Object) null);
        Integer term1391563 = new Integer(57189932);
        Integer term1391565 = new Integer(1460722225);
        Class<? extends Object> term1392669 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1392668 = ((Class) term1392669).getDeclaredField((String) "H4");
        ((Field) term1392668).setAccessible(true);
        Object enum5348 = ((Field) term1392668).get((Object) null);
        Class<? extends Object> term1392872 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1392871 = ((Class) term1392872).getDeclaredField((String) "D8");
        ((Field) term1392871).setAccessible(true);
        Object enum5349 = ((Field) term1392871).get((Object) null);
        Class<? extends Object> term1393075 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1393074 = ((Class) term1393075).getDeclaredField((String) "BLACK_KNIGHT");
        ((Field) term1393074).setAccessible(true);
        Object enum5350 = ((Field) term1393074).get((Object) null);
        Class<? extends Object> term1393313 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1393312 = ((Class) term1393313).getDeclaredField((String) "C2");
        ((Field) term1393312).setAccessible(true);
        Object enum5351 = ((Field) term1393312).get((Object) null);
        Class<? extends Object> term1393516 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1393515 = ((Class) term1393516).getDeclaredField((String) "C1");
        ((Field) term1393515).setAccessible(true);
        Object enum5352 = ((Field) term1393515).get((Object) null);
        Class<? extends Object> term1393719 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1393718 = ((Class) term1393719).getDeclaredField((String) "BLACK_PAWN");
        ((Field) term1393718).setAccessible(true);
        Object enum5353 = ((Field) term1393718).get((Object) null);
        Class<? extends Object> term1393951 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1393950 = ((Class) term1393951).getDeclaredField((String) "BLACK_ROOK");
        ((Field) term1393950).setAccessible(true);
        Object enum5354 = ((Field) term1393950).get((Object) null);
        Class<? extends Object> term1394173 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1394172 = ((Class) term1394173).getDeclaredField((String) "B1");
        ((Field) term1394172).setAccessible(true);
        Object enum5355 = ((Field) term1394172).get((Object) null);
        Class<? extends Object> term1394376 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1394375 = ((Class) term1394376).getDeclaredField((String) "WHITE_QUEEN");
        ((Field) term1394375).setAccessible(true);
        Object enum5356 = ((Field) term1394375).get((Object) null);
        term1391456 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.MoveBackup"));
        Object term1391457 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term1391548 = (Object[]) newArray("com.github.bhlangonijr.chesslib.Side", 2);
        Object[] term1391549 = (Object[]) newArray("java.lang.Object", 2);
        Object term1391567 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        Object term1391618 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term1391457, term1391457.getClass(), "keyType", term1391458);
        setElement(term1391548, 0, enum5344);
        setElement(term1391548, 1, enum5345);
        setField(term1391457, term1391457.getClass(), "keyUniverse", term1391548);
        setField(term1391457, term1391457.getClass(), "vals", term1391549);
        setIntField(term1391457, term1391457.getClass(), "size", 0);
        setField(term1391457, term1391457.getClass(), "entrySet", null);
        setField(term1391457, term1391457.getClass(), "keySet", null);
        setField(term1391457, term1391457.getClass(), "values", null);
        setField(term1391456, term1391456.getClass(), "castleRight", term1391457);
        setField(term1391456, term1391456.getClass(), "sideToMove", enum5345);
        setField(term1391456, term1391456.getClass(), "enPassantTarget", enum5346);
        setField(term1391456, term1391456.getClass(), "enPassant", enum5347);
        setField(term1391456, term1391456.getClass(), "moveCounter", term1391563);
        setField(term1391456, term1391456.getClass(), "halfMoveCounter", term1391565);
        setField(term1391567, term1391567.getClass(), "from", enum5348);
        setField(term1391567, term1391567.getClass(), "to", enum5349);
        setField(term1391567, term1391567.getClass(), "promotion", enum5350);
        setField(term1391567, term1391567.getClass(), "san", "kAbILlhsZw");
        setField(term1391456, term1391456.getClass(), "move", term1391567);
        setField(term1391618, term1391618.getClass(), "from", enum5351);
        setField(term1391618, term1391618.getClass(), "to", enum5352);
        setField(term1391618, term1391618.getClass(), "promotion", enum5353);
        setField(term1391618, term1391618.getClass(), "san", "QsIOCSpRow");
        setField(term1391456, term1391456.getClass(), "rookCastleMove", term1391618);
        setField(term1391456, term1391456.getClass(), "capturedPiece", enum5354);
        setField(term1391456, term1391456.getClass(), "capturedSquare", enum5355);
        setField(term1391456, term1391456.getClass(), "movingPiece", enum5356);
        setBooleanField(term1391456, term1391456.getClass(), "castleMove", true);
        setBooleanField(term1391456, term1391456.getClass(), "enPassantMove", false);
        setLongField(term1391456, term1391456.getClass(), "incrementalHashKey", 6921855906793748590L);
        setLongField(term1391456, term1391456.getClass(), "incrementalPolyglotKey", 7450182989722198450L);
        term1391748 = new Long(675601558105654203L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.MoveBackup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1391748;
        callMethod(klass, "setIncrementalPolyglotKey", argTypes, term1391456, args);
    }

};


