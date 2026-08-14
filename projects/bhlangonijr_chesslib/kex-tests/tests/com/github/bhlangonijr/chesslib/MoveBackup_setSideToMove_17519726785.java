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

public class MoveBackup_setSideToMove_17519726785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1309507;
     Object enum5004;

    public MoveBackup_setSideToMove_17519726785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1309509 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Class<? extends Object> term1309903 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1309902 = ((Class) term1309903).getDeclaredField((String) "WHITE");
        ((Field) term1309902).setAccessible(true);
        Object enum5003 = ((Field) term1309902).get((Object) null);
        Class<? extends Object> term1310105 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1310104 = ((Class) term1310105).getDeclaredField((String) "WHITE");
        ((Field) term1310104).setAccessible(true);
        enum5004 = ((Field) term1310104).get((Object) null);
        Class<? extends Object> term1310307 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1310306 = ((Class) term1310307).getDeclaredField((String) "D7");
        ((Field) term1310306).setAccessible(true);
        Object enum5005 = ((Field) term1310306).get((Object) null);
        Class<? extends Object> term1310510 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1310509 = ((Class) term1310510).getDeclaredField((String) "B8");
        ((Field) term1310509).setAccessible(true);
        Object enum5006 = ((Field) term1310509).get((Object) null);
        Integer term1309614 = new Integer(584893196);
        Integer term1309616 = new Integer(497269071);
        Class<? extends Object> term1310713 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1310712 = ((Class) term1310713).getDeclaredField((String) "D8");
        ((Field) term1310712).setAccessible(true);
        Object enum5007 = ((Field) term1310712).get((Object) null);
        Class<? extends Object> term1310916 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1310915 = ((Class) term1310916).getDeclaredField((String) "H6");
        ((Field) term1310915).setAccessible(true);
        Object enum5008 = ((Field) term1310915).get((Object) null);
        Class<? extends Object> term1311119 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1311118 = ((Class) term1311119).getDeclaredField((String) "WHITE_BISHOP");
        ((Field) term1311118).setAccessible(true);
        Object enum5009 = ((Field) term1311118).get((Object) null);
        Class<? extends Object> term1311357 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1311356 = ((Class) term1311357).getDeclaredField((String) "F5");
        ((Field) term1311356).setAccessible(true);
        Object enum5010 = ((Field) term1311356).get((Object) null);
        Class<? extends Object> term1311560 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1311559 = ((Class) term1311560).getDeclaredField((String) "G8");
        ((Field) term1311559).setAccessible(true);
        Object enum5011 = ((Field) term1311559).get((Object) null);
        Class<? extends Object> term1311763 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1311762 = ((Class) term1311763).getDeclaredField((String) "WHITE_PAWN");
        ((Field) term1311762).setAccessible(true);
        Object enum5012 = ((Field) term1311762).get((Object) null);
        Class<? extends Object> term1311995 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1311994 = ((Class) term1311995).getDeclaredField((String) "NONE");
        ((Field) term1311994).setAccessible(true);
        Object enum5013 = ((Field) term1311994).get((Object) null);
        Class<? extends Object> term1312199 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1312198 = ((Class) term1312199).getDeclaredField((String) "F3");
        ((Field) term1312198).setAccessible(true);
        Object enum5014 = ((Field) term1312198).get((Object) null);
        Class<? extends Object> term1312402 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1312401 = ((Class) term1312402).getDeclaredField((String) "WHITE_PAWN");
        ((Field) term1312401).setAccessible(true);
        Object enum5015 = ((Field) term1312401).get((Object) null);
        term1309507 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.MoveBackup"));
        Object term1309508 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term1309599 = (Object[]) newArray("com.github.bhlangonijr.chesslib.Side", 2);
        Object[] term1309600 = (Object[]) newArray("java.lang.Object", 2);
        Object term1309618 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        Object term1309670 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term1309508, term1309508.getClass(), "keyType", term1309509);
        setElement(term1309599, 0, enum5003);
        setElement(term1309599, 1, enum5004);
        setField(term1309508, term1309508.getClass(), "keyUniverse", term1309599);
        setField(term1309508, term1309508.getClass(), "vals", term1309600);
        setIntField(term1309508, term1309508.getClass(), "size", 0);
        setField(term1309508, term1309508.getClass(), "entrySet", null);
        setField(term1309508, term1309508.getClass(), "keySet", null);
        setField(term1309508, term1309508.getClass(), "values", null);
        setField(term1309507, term1309507.getClass(), "castleRight", term1309508);
        setField(term1309507, term1309507.getClass(), "sideToMove", enum5004);
        setField(term1309507, term1309507.getClass(), "enPassantTarget", enum5005);
        setField(term1309507, term1309507.getClass(), "enPassant", enum5006);
        setField(term1309507, term1309507.getClass(), "moveCounter", term1309614);
        setField(term1309507, term1309507.getClass(), "halfMoveCounter", term1309616);
        setField(term1309618, term1309618.getClass(), "from", enum5007);
        setField(term1309618, term1309618.getClass(), "to", enum5008);
        setField(term1309618, term1309618.getClass(), "promotion", enum5009);
        setField(term1309618, term1309618.getClass(), "san", "JvKKIGdUWh");
        setField(term1309507, term1309507.getClass(), "move", term1309618);
        setField(term1309670, term1309670.getClass(), "from", enum5010);
        setField(term1309670, term1309670.getClass(), "to", enum5011);
        setField(term1309670, term1309670.getClass(), "promotion", enum5012);
        setField(term1309670, term1309670.getClass(), "san", "DInvDrzBtt");
        setField(term1309507, term1309507.getClass(), "rookCastleMove", term1309670);
        setField(term1309507, term1309507.getClass(), "capturedPiece", enum5013);
        setField(term1309507, term1309507.getClass(), "capturedSquare", enum5014);
        setField(term1309507, term1309507.getClass(), "movingPiece", enum5015);
        setBooleanField(term1309507, term1309507.getClass(), "castleMove", false);
        setBooleanField(term1309507, term1309507.getClass(), "enPassantMove", true);
        setLongField(term1309507, term1309507.getClass(), "incrementalHashKey", 493557348274366095L);
        setLongField(term1309507, term1309507.getClass(), "incrementalPolyglotKey", 8699742215739444902L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.MoveBackup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Side");
        Object[] args = new Object[1];
        args[0] = enum5004;
        callMethod(klass, "setSideToMove", argTypes, term1309507, args);
    }

};


