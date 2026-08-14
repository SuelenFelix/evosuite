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

public class MoveBackup_getCastleRight_72782041018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1349028;

    public MoveBackup_getCastleRight_72782041018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1349030 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Class<? extends Object> term1349409 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1349408 = ((Class) term1349409).getDeclaredField((String) "WHITE");
        ((Field) term1349408).setAccessible(true);
        Object enum5168 = ((Field) term1349408).get((Object) null);
        Class<? extends Object> term1349611 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1349610 = ((Class) term1349611).getDeclaredField((String) "WHITE");
        ((Field) term1349610).setAccessible(true);
        Object enum5169 = ((Field) term1349610).get((Object) null);
        Class<? extends Object> term1349813 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1349812 = ((Class) term1349813).getDeclaredField((String) "G6");
        ((Field) term1349812).setAccessible(true);
        Object enum5170 = ((Field) term1349812).get((Object) null);
        Class<? extends Object> term1350016 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1350015 = ((Class) term1350016).getDeclaredField((String) "A4");
        ((Field) term1350015).setAccessible(true);
        Object enum5171 = ((Field) term1350015).get((Object) null);
        Integer term1349135 = new Integer(880977281);
        Integer term1349137 = new Integer(371943306);
        Class<? extends Object> term1350219 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1350218 = ((Class) term1350219).getDeclaredField((String) "F1");
        ((Field) term1350218).setAccessible(true);
        Object enum5172 = ((Field) term1350218).get((Object) null);
        Class<? extends Object> term1350422 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1350421 = ((Class) term1350422).getDeclaredField((String) "G2");
        ((Field) term1350421).setAccessible(true);
        Object enum5173 = ((Field) term1350421).get((Object) null);
        Class<? extends Object> term1350625 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1350624 = ((Class) term1350625).getDeclaredField((String) "BLACK_KING");
        ((Field) term1350624).setAccessible(true);
        Object enum5174 = ((Field) term1350624).get((Object) null);
        Class<? extends Object> term1350857 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1350856 = ((Class) term1350857).getDeclaredField((String) "E7");
        ((Field) term1350856).setAccessible(true);
        Object enum5175 = ((Field) term1350856).get((Object) null);
        Class<? extends Object> term1351060 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1351059 = ((Class) term1351060).getDeclaredField((String) "B1");
        ((Field) term1351059).setAccessible(true);
        Object enum5176 = ((Field) term1351059).get((Object) null);
        Class<? extends Object> term1351263 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1351262 = ((Class) term1351263).getDeclaredField((String) "WHITE_ROOK");
        ((Field) term1351262).setAccessible(true);
        Object enum5177 = ((Field) term1351262).get((Object) null);
        Class<? extends Object> term1351495 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1351494 = ((Class) term1351495).getDeclaredField((String) "WHITE_KING");
        ((Field) term1351494).setAccessible(true);
        Object enum5178 = ((Field) term1351494).get((Object) null);
        Class<? extends Object> term1351717 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1351716 = ((Class) term1351717).getDeclaredField((String) "E5");
        ((Field) term1351716).setAccessible(true);
        Object enum5179 = ((Field) term1351716).get((Object) null);
        Class<? extends Object> term1351920 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1351919 = ((Class) term1351920).getDeclaredField((String) "NONE");
        ((Field) term1351919).setAccessible(true);
        Object enum5180 = ((Field) term1351919).get((Object) null);
        term1349028 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.MoveBackup"));
        Object term1349029 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term1349120 = (Object[]) newArray("com.github.bhlangonijr.chesslib.Side", 2);
        Object[] term1349121 = (Object[]) newArray("java.lang.Object", 2);
        Object term1349139 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        Object term1349191 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term1349029, term1349029.getClass(), "keyType", term1349030);
        setElement(term1349120, 0, enum5168);
        setElement(term1349120, 1, enum5169);
        setField(term1349029, term1349029.getClass(), "keyUniverse", term1349120);
        setField(term1349029, term1349029.getClass(), "vals", term1349121);
        setIntField(term1349029, term1349029.getClass(), "size", 0);
        setField(term1349029, term1349029.getClass(), "entrySet", null);
        setField(term1349029, term1349029.getClass(), "keySet", null);
        setField(term1349029, term1349029.getClass(), "values", null);
        setField(term1349028, term1349028.getClass(), "castleRight", term1349029);
        setField(term1349028, term1349028.getClass(), "sideToMove", enum5169);
        setField(term1349028, term1349028.getClass(), "enPassantTarget", enum5170);
        setField(term1349028, term1349028.getClass(), "enPassant", enum5171);
        setField(term1349028, term1349028.getClass(), "moveCounter", term1349135);
        setField(term1349028, term1349028.getClass(), "halfMoveCounter", term1349137);
        setField(term1349139, term1349139.getClass(), "from", enum5172);
        setField(term1349139, term1349139.getClass(), "to", enum5173);
        setField(term1349139, term1349139.getClass(), "promotion", enum5174);
        setField(term1349139, term1349139.getClass(), "san", "pktmgYsknu");
        setField(term1349028, term1349028.getClass(), "move", term1349139);
        setField(term1349191, term1349191.getClass(), "from", enum5175);
        setField(term1349191, term1349191.getClass(), "to", enum5176);
        setField(term1349191, term1349191.getClass(), "promotion", enum5177);
        setField(term1349191, term1349191.getClass(), "san", "SsMHzYNeji");
        setField(term1349028, term1349028.getClass(), "rookCastleMove", term1349191);
        setField(term1349028, term1349028.getClass(), "capturedPiece", enum5178);
        setField(term1349028, term1349028.getClass(), "capturedSquare", enum5179);
        setField(term1349028, term1349028.getClass(), "movingPiece", enum5180);
        setBooleanField(term1349028, term1349028.getClass(), "castleMove", true);
        setBooleanField(term1349028, term1349028.getClass(), "enPassantMove", true);
        setLongField(term1349028, term1349028.getClass(), "incrementalHashKey", 4036794646678680547L);
        setLongField(term1349028, term1349028.getClass(), "incrementalPolyglotKey", 4006388896509492239L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.MoveBackup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCastleRight", argTypes, term1349028, args);
    }

};


