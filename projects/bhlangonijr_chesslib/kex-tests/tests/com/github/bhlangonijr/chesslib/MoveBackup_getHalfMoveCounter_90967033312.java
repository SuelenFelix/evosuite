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

public class MoveBackup_getHalfMoveCounter_90967033312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1330067;

    public MoveBackup_getHalfMoveCounter_90967033312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1330069 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Class<? extends Object> term1330464 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1330463 = ((Class) term1330464).getDeclaredField((String) "BLACK");
        ((Field) term1330463).setAccessible(true);
        Object enum5089 = ((Field) term1330463).get((Object) null);
        Class<? extends Object> term1330666 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1330665 = ((Class) term1330666).getDeclaredField((String) "BLACK");
        ((Field) term1330665).setAccessible(true);
        Object enum5090 = ((Field) term1330665).get((Object) null);
        Class<? extends Object> term1330868 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1330867 = ((Class) term1330868).getDeclaredField((String) "E7");
        ((Field) term1330867).setAccessible(true);
        Object enum5091 = ((Field) term1330867).get((Object) null);
        Class<? extends Object> term1331071 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1331070 = ((Class) term1331071).getDeclaredField((String) "F5");
        ((Field) term1331070).setAccessible(true);
        Object enum5092 = ((Field) term1331070).get((Object) null);
        Integer term1330174 = new Integer(-2104981311);
        Integer term1330176 = new Integer(-571169753);
        Class<? extends Object> term1331274 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1331273 = ((Class) term1331274).getDeclaredField((String) "D7");
        ((Field) term1331273).setAccessible(true);
        Object enum5093 = ((Field) term1331273).get((Object) null);
        Class<? extends Object> term1331477 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1331476 = ((Class) term1331477).getDeclaredField((String) "D2");
        ((Field) term1331476).setAccessible(true);
        Object enum5094 = ((Field) term1331476).get((Object) null);
        Class<? extends Object> term1331680 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1331679 = ((Class) term1331680).getDeclaredField((String) "WHITE_BISHOP");
        ((Field) term1331679).setAccessible(true);
        Object enum5095 = ((Field) term1331679).get((Object) null);
        Class<? extends Object> term1331918 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1331917 = ((Class) term1331918).getDeclaredField((String) "F1");
        ((Field) term1331917).setAccessible(true);
        Object enum5096 = ((Field) term1331917).get((Object) null);
        Class<? extends Object> term1332121 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1332120 = ((Class) term1332121).getDeclaredField((String) "D4");
        ((Field) term1332120).setAccessible(true);
        Object enum5097 = ((Field) term1332120).get((Object) null);
        Class<? extends Object> term1332324 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1332323 = ((Class) term1332324).getDeclaredField((String) "BLACK_ROOK");
        ((Field) term1332323).setAccessible(true);
        Object enum5098 = ((Field) term1332323).get((Object) null);
        Class<? extends Object> term1332556 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1332555 = ((Class) term1332556).getDeclaredField((String) "BLACK_KNIGHT");
        ((Field) term1332555).setAccessible(true);
        Object enum5099 = ((Field) term1332555).get((Object) null);
        Class<? extends Object> term1332784 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1332783 = ((Class) term1332784).getDeclaredField((String) "G3");
        ((Field) term1332783).setAccessible(true);
        Object enum5100 = ((Field) term1332783).get((Object) null);
        Class<? extends Object> term1332987 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1332986 = ((Class) term1332987).getDeclaredField((String) "BLACK_PAWN");
        ((Field) term1332986).setAccessible(true);
        Object enum5101 = ((Field) term1332986).get((Object) null);
        term1330067 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.MoveBackup"));
        Object term1330068 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term1330159 = (Object[]) newArray("com.github.bhlangonijr.chesslib.Side", 2);
        Object[] term1330160 = (Object[]) newArray("java.lang.Object", 2);
        Object term1330178 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        Object term1330228 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term1330068, term1330068.getClass(), "keyType", term1330069);
        setElement(term1330159, 0, enum5089);
        setElement(term1330159, 1, enum5090);
        setField(term1330068, term1330068.getClass(), "keyUniverse", term1330159);
        setField(term1330068, term1330068.getClass(), "vals", term1330160);
        setIntField(term1330068, term1330068.getClass(), "size", 0);
        setField(term1330068, term1330068.getClass(), "entrySet", null);
        setField(term1330068, term1330068.getClass(), "keySet", null);
        setField(term1330068, term1330068.getClass(), "values", null);
        setField(term1330067, term1330067.getClass(), "castleRight", term1330068);
        setField(term1330067, term1330067.getClass(), "sideToMove", enum5090);
        setField(term1330067, term1330067.getClass(), "enPassantTarget", enum5091);
        setField(term1330067, term1330067.getClass(), "enPassant", enum5092);
        setField(term1330067, term1330067.getClass(), "moveCounter", term1330174);
        setField(term1330067, term1330067.getClass(), "halfMoveCounter", term1330176);
        setField(term1330178, term1330178.getClass(), "from", enum5093);
        setField(term1330178, term1330178.getClass(), "to", enum5094);
        setField(term1330178, term1330178.getClass(), "promotion", enum5095);
        setField(term1330178, term1330178.getClass(), "san", "fxxnbYOiZZ");
        setField(term1330067, term1330067.getClass(), "move", term1330178);
        setField(term1330228, term1330228.getClass(), "from", enum5096);
        setField(term1330228, term1330228.getClass(), "to", enum5097);
        setField(term1330228, term1330228.getClass(), "promotion", enum5098);
        setField(term1330228, term1330228.getClass(), "san", "CTnRYaYXia");
        setField(term1330067, term1330067.getClass(), "rookCastleMove", term1330228);
        setField(term1330067, term1330067.getClass(), "capturedPiece", enum5099);
        setField(term1330067, term1330067.getClass(), "capturedSquare", enum5100);
        setField(term1330067, term1330067.getClass(), "movingPiece", enum5101);
        setBooleanField(term1330067, term1330067.getClass(), "castleMove", false);
        setBooleanField(term1330067, term1330067.getClass(), "enPassantMove", false);
        setLongField(term1330067, term1330067.getClass(), "incrementalHashKey", 7893661350133453338L);
        setLongField(term1330067, term1330067.getClass(), "incrementalPolyglotKey", 9056245012917372169L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.MoveBackup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHalfMoveCounter", argTypes, term1330067, args);
    }

};


