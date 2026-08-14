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

public class MoveBackup_getEnPassantTarget_970123696 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1312623;

    public MoveBackup_getEnPassantTarget_970123696() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1312625 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Class<? extends Object> term1312956 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1312955 = ((Class) term1312956).getDeclaredField((String) "BLACK");
        ((Field) term1312955).setAccessible(true);
        Object enum5016 = ((Field) term1312955).get((Object) null);
        Class<? extends Object> term1313158 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1313157 = ((Class) term1313158).getDeclaredField((String) "WHITE");
        ((Field) term1313157).setAccessible(true);
        Object enum5017 = ((Field) term1313157).get((Object) null);
        Class<? extends Object> term1313360 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1313359 = ((Class) term1313360).getDeclaredField((String) "C8");
        ((Field) term1313359).setAccessible(true);
        Object enum5018 = ((Field) term1313359).get((Object) null);
        Class<? extends Object> term1313563 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1313562 = ((Class) term1313563).getDeclaredField((String) "E8");
        ((Field) term1313562).setAccessible(true);
        Object enum5019 = ((Field) term1313562).get((Object) null);
        Integer term1312730 = new Integer(-1899301124);
        Integer term1312732 = new Integer(-1882480155);
        Class<? extends Object> term1313766 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1313765 = ((Class) term1313766).getDeclaredField((String) "A6");
        ((Field) term1313765).setAccessible(true);
        Object enum5020 = ((Field) term1313765).get((Object) null);
        Class<? extends Object> term1313969 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1313968 = ((Class) term1313969).getDeclaredField((String) "F5");
        ((Field) term1313968).setAccessible(true);
        Object enum5021 = ((Field) term1313968).get((Object) null);
        Class<? extends Object> term1314172 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1314171 = ((Class) term1314172).getDeclaredField((String) "WHITE_ROOK");
        ((Field) term1314171).setAccessible(true);
        Object enum5022 = ((Field) term1314171).get((Object) null);
        Class<? extends Object> term1314404 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1314403 = ((Class) term1314404).getDeclaredField((String) "C6");
        ((Field) term1314403).setAccessible(true);
        Object enum5023 = ((Field) term1314403).get((Object) null);
        Class<? extends Object> term1314607 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1314606 = ((Class) term1314607).getDeclaredField((String) "H4");
        ((Field) term1314606).setAccessible(true);
        Object enum5024 = ((Field) term1314606).get((Object) null);
        Class<? extends Object> term1314810 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1314809 = ((Class) term1314810).getDeclaredField((String) "BLACK_KING");
        ((Field) term1314809).setAccessible(true);
        Object enum5025 = ((Field) term1314809).get((Object) null);
        Class<? extends Object> term1315042 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1315041 = ((Class) term1315042).getDeclaredField((String) "C5");
        ((Field) term1315041).setAccessible(true);
        Object enum5026 = ((Field) term1315041).get((Object) null);
        term1312623 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.MoveBackup"));
        Object term1312624 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term1312715 = (Object[]) newArray("com.github.bhlangonijr.chesslib.Side", 2);
        Object[] term1312716 = (Object[]) newArray("java.lang.Object", 2);
        Object term1312734 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        Object term1312786 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term1312624, term1312624.getClass(), "keyType", term1312625);
        setElement(term1312715, 0, enum5016);
        setElement(term1312715, 1, enum5017);
        setField(term1312624, term1312624.getClass(), "keyUniverse", term1312715);
        setField(term1312624, term1312624.getClass(), "vals", term1312716);
        setIntField(term1312624, term1312624.getClass(), "size", 0);
        setField(term1312624, term1312624.getClass(), "entrySet", null);
        setField(term1312624, term1312624.getClass(), "keySet", null);
        setField(term1312624, term1312624.getClass(), "values", null);
        setField(term1312623, term1312623.getClass(), "castleRight", term1312624);
        setField(term1312623, term1312623.getClass(), "sideToMove", enum5017);
        setField(term1312623, term1312623.getClass(), "enPassantTarget", enum5018);
        setField(term1312623, term1312623.getClass(), "enPassant", enum5019);
        setField(term1312623, term1312623.getClass(), "moveCounter", term1312730);
        setField(term1312623, term1312623.getClass(), "halfMoveCounter", term1312732);
        setField(term1312734, term1312734.getClass(), "from", enum5020);
        setField(term1312734, term1312734.getClass(), "to", enum5021);
        setField(term1312734, term1312734.getClass(), "promotion", enum5022);
        setField(term1312734, term1312734.getClass(), "san", "igZJubDPuK");
        setField(term1312623, term1312623.getClass(), "move", term1312734);
        setField(term1312786, term1312786.getClass(), "from", enum5023);
        setField(term1312786, term1312786.getClass(), "to", enum5024);
        setField(term1312786, term1312786.getClass(), "promotion", enum5025);
        setField(term1312786, term1312786.getClass(), "san", "qxBdFhLbAN");
        setField(term1312623, term1312623.getClass(), "rookCastleMove", term1312786);
        setField(term1312623, term1312623.getClass(), "capturedPiece", enum5025);
        setField(term1312623, term1312623.getClass(), "capturedSquare", enum5026);
        setField(term1312623, term1312623.getClass(), "movingPiece", enum5022);
        setBooleanField(term1312623, term1312623.getClass(), "castleMove", false);
        setBooleanField(term1312623, term1312623.getClass(), "enPassantMove", false);
        setLongField(term1312623, term1312623.getClass(), "incrementalHashKey", 8261619652909874476L);
        setLongField(term1312623, term1312623.getClass(), "incrementalPolyglotKey", -3692936312179064102L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.MoveBackup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEnPassantTarget", argTypes, term1312623, args);
    }

};


