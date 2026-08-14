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
import java.lang.Boolean;

public class MoveBackup_setEnPassantMove_11993411529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1382265;
     Object term1382558;

    public MoveBackup_setEnPassantMove_11993411529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1382267 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Class<? extends Object> term1382669 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1382668 = ((Class) term1382669).getDeclaredField((String) "WHITE");
        ((Field) term1382668).setAccessible(true);
        Object enum5306 = ((Field) term1382668).get((Object) null);
        Class<? extends Object> term1382871 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1382870 = ((Class) term1382871).getDeclaredField((String) "WHITE");
        ((Field) term1382870).setAccessible(true);
        Object enum5307 = ((Field) term1382870).get((Object) null);
        Class<? extends Object> term1383073 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1383072 = ((Class) term1383073).getDeclaredField((String) "D4");
        ((Field) term1383072).setAccessible(true);
        Object enum5308 = ((Field) term1383072).get((Object) null);
        Class<? extends Object> term1383276 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1383275 = ((Class) term1383276).getDeclaredField((String) "H7");
        ((Field) term1383275).setAccessible(true);
        Object enum5309 = ((Field) term1383275).get((Object) null);
        Integer term1382372 = new Integer(-130649791);
        Integer term1382374 = new Integer(534834644);
        Class<? extends Object> term1383479 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1383478 = ((Class) term1383479).getDeclaredField((String) "B4");
        ((Field) term1383478).setAccessible(true);
        Object enum5310 = ((Field) term1383478).get((Object) null);
        Class<? extends Object> term1383682 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1383681 = ((Class) term1383682).getDeclaredField((String) "G5");
        ((Field) term1383681).setAccessible(true);
        Object enum5311 = ((Field) term1383681).get((Object) null);
        Class<? extends Object> term1383885 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1383884 = ((Class) term1383885).getDeclaredField((String) "BLACK_QUEEN");
        ((Field) term1383884).setAccessible(true);
        Object enum5312 = ((Field) term1383884).get((Object) null);
        Class<? extends Object> term1384120 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1384119 = ((Class) term1384120).getDeclaredField((String) "H1");
        ((Field) term1384119).setAccessible(true);
        Object enum5313 = ((Field) term1384119).get((Object) null);
        Class<? extends Object> term1384323 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1384322 = ((Class) term1384323).getDeclaredField((String) "C7");
        ((Field) term1384322).setAccessible(true);
        Object enum5314 = ((Field) term1384322).get((Object) null);
        Class<? extends Object> term1384526 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1384525 = ((Class) term1384526).getDeclaredField((String) "WHITE_ROOK");
        ((Field) term1384525).setAccessible(true);
        Object enum5315 = ((Field) term1384525).get((Object) null);
        Class<? extends Object> term1384758 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1384757 = ((Class) term1384758).getDeclaredField((String) "WHITE_PAWN");
        ((Field) term1384757).setAccessible(true);
        Object enum5316 = ((Field) term1384757).get((Object) null);
        Class<? extends Object> term1384980 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1384979 = ((Class) term1384980).getDeclaredField((String) "C4");
        ((Field) term1384979).setAccessible(true);
        Object enum5317 = ((Field) term1384979).get((Object) null);
        Class<? extends Object> term1385183 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1385182 = ((Class) term1385183).getDeclaredField((String) "BLACK_KING");
        ((Field) term1385182).setAccessible(true);
        Object enum5318 = ((Field) term1385182).get((Object) null);
        term1382265 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.MoveBackup"));
        Object term1382266 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term1382357 = (Object[]) newArray("com.github.bhlangonijr.chesslib.Side", 2);
        Object[] term1382358 = (Object[]) newArray("java.lang.Object", 2);
        Object term1382376 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        Object term1382426 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term1382266, term1382266.getClass(), "keyType", term1382267);
        setElement(term1382357, 0, enum5306);
        setElement(term1382357, 1, enum5307);
        setField(term1382266, term1382266.getClass(), "keyUniverse", term1382357);
        setField(term1382266, term1382266.getClass(), "vals", term1382358);
        setIntField(term1382266, term1382266.getClass(), "size", 0);
        setField(term1382266, term1382266.getClass(), "entrySet", null);
        setField(term1382266, term1382266.getClass(), "keySet", null);
        setField(term1382266, term1382266.getClass(), "values", null);
        setField(term1382265, term1382265.getClass(), "castleRight", term1382266);
        setField(term1382265, term1382265.getClass(), "sideToMove", enum5306);
        setField(term1382265, term1382265.getClass(), "enPassantTarget", enum5308);
        setField(term1382265, term1382265.getClass(), "enPassant", enum5309);
        setField(term1382265, term1382265.getClass(), "moveCounter", term1382372);
        setField(term1382265, term1382265.getClass(), "halfMoveCounter", term1382374);
        setField(term1382376, term1382376.getClass(), "from", enum5310);
        setField(term1382376, term1382376.getClass(), "to", enum5311);
        setField(term1382376, term1382376.getClass(), "promotion", enum5312);
        setField(term1382376, term1382376.getClass(), "san", "bVlRrMQeRY");
        setField(term1382265, term1382265.getClass(), "move", term1382376);
        setField(term1382426, term1382426.getClass(), "from", enum5313);
        setField(term1382426, term1382426.getClass(), "to", enum5314);
        setField(term1382426, term1382426.getClass(), "promotion", enum5315);
        setField(term1382426, term1382426.getClass(), "san", "SXaXhlzAIB");
        setField(term1382265, term1382265.getClass(), "rookCastleMove", term1382426);
        setField(term1382265, term1382265.getClass(), "capturedPiece", enum5316);
        setField(term1382265, term1382265.getClass(), "capturedSquare", enum5317);
        setField(term1382265, term1382265.getClass(), "movingPiece", enum5318);
        setBooleanField(term1382265, term1382265.getClass(), "castleMove", false);
        setBooleanField(term1382265, term1382265.getClass(), "enPassantMove", false);
        setLongField(term1382265, term1382265.getClass(), "incrementalHashKey", -4825509285016265943L);
        setLongField(term1382265, term1382265.getClass(), "incrementalPolyglotKey", -1283563319051310751L);
        term1382558 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.MoveBackup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1382558;
        callMethod(klass, "setEnPassantMove", argTypes, term1382265, args);
    }

};


