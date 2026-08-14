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

public class MoveBackup_getType_202377528623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1364614;

    public MoveBackup_getType_202377528623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1364616 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Class<? extends Object> term1364982 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1364981 = ((Class) term1364982).getDeclaredField((String) "WHITE");
        ((Field) term1364981).setAccessible(true);
        Object enum5233 = ((Field) term1364981).get((Object) null);
        Class<? extends Object> term1365184 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1365183 = ((Class) term1365184).getDeclaredField((String) "BLACK");
        ((Field) term1365183).setAccessible(true);
        Object enum5234 = ((Field) term1365183).get((Object) null);
        Class<? extends Object> term1365386 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1365385 = ((Class) term1365386).getDeclaredField((String) "A3");
        ((Field) term1365385).setAccessible(true);
        Object enum5235 = ((Field) term1365385).get((Object) null);
        Class<? extends Object> term1365589 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1365588 = ((Class) term1365589).getDeclaredField((String) "B4");
        ((Field) term1365588).setAccessible(true);
        Object enum5236 = ((Field) term1365588).get((Object) null);
        Integer term1364721 = new Integer(1270666529);
        Integer term1364723 = new Integer(-1146679443);
        Class<? extends Object> term1365792 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1365791 = ((Class) term1365792).getDeclaredField((String) "D1");
        ((Field) term1365791).setAccessible(true);
        Object enum5237 = ((Field) term1365791).get((Object) null);
        Class<? extends Object> term1365995 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1365994 = ((Class) term1365995).getDeclaredField((String) "G3");
        ((Field) term1365994).setAccessible(true);
        Object enum5238 = ((Field) term1365994).get((Object) null);
        Class<? extends Object> term1366198 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1366197 = ((Class) term1366198).getDeclaredField((String) "WHITE_PAWN");
        ((Field) term1366197).setAccessible(true);
        Object enum5239 = ((Field) term1366197).get((Object) null);
        Class<? extends Object> term1366430 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1366429 = ((Class) term1366430).getDeclaredField((String) "G7");
        ((Field) term1366429).setAccessible(true);
        Object enum5240 = ((Field) term1366429).get((Object) null);
        Class<? extends Object> term1366643 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1366642 = ((Class) term1366643).getDeclaredField((String) "BLACK_PAWN");
        ((Field) term1366642).setAccessible(true);
        Object enum5241 = ((Field) term1366642).get((Object) null);
        Class<? extends Object> term1366865 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1366864 = ((Class) term1366865).getDeclaredField((String) "E8");
        ((Field) term1366864).setAccessible(true);
        Object enum5242 = ((Field) term1366864).get((Object) null);
        Class<? extends Object> term1367068 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1367067 = ((Class) term1367068).getDeclaredField((String) "BLACK_PAWN");
        ((Field) term1367067).setAccessible(true);
        Object enum5243 = ((Field) term1367067).get((Object) null);
        term1364614 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.MoveBackup"));
        Object term1364615 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term1364706 = (Object[]) newArray("com.github.bhlangonijr.chesslib.Side", 2);
        Object[] term1364707 = (Object[]) newArray("java.lang.Object", 2);
        Object term1364725 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        Object term1364776 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term1364615, term1364615.getClass(), "keyType", term1364616);
        setElement(term1364706, 0, enum5233);
        setElement(term1364706, 1, enum5234);
        setField(term1364615, term1364615.getClass(), "keyUniverse", term1364706);
        setField(term1364615, term1364615.getClass(), "vals", term1364707);
        setIntField(term1364615, term1364615.getClass(), "size", 0);
        setField(term1364615, term1364615.getClass(), "entrySet", null);
        setField(term1364615, term1364615.getClass(), "keySet", null);
        setField(term1364615, term1364615.getClass(), "values", null);
        setField(term1364614, term1364614.getClass(), "castleRight", term1364615);
        setField(term1364614, term1364614.getClass(), "sideToMove", enum5234);
        setField(term1364614, term1364614.getClass(), "enPassantTarget", enum5235);
        setField(term1364614, term1364614.getClass(), "enPassant", enum5236);
        setField(term1364614, term1364614.getClass(), "moveCounter", term1364721);
        setField(term1364614, term1364614.getClass(), "halfMoveCounter", term1364723);
        setField(term1364725, term1364725.getClass(), "from", enum5237);
        setField(term1364725, term1364725.getClass(), "to", enum5238);
        setField(term1364725, term1364725.getClass(), "promotion", enum5239);
        setField(term1364725, term1364725.getClass(), "san", "uQGMBLrmAj");
        setField(term1364614, term1364614.getClass(), "move", term1364725);
        setField(term1364776, term1364776.getClass(), "from", enum5240);
        setField(term1364776, term1364776.getClass(), "to", enum5240);
        setField(term1364776, term1364776.getClass(), "promotion", enum5239);
        setField(term1364776, term1364776.getClass(), "san", "vNFaheDeBv");
        setField(term1364614, term1364614.getClass(), "rookCastleMove", term1364776);
        setField(term1364614, term1364614.getClass(), "capturedPiece", enum5241);
        setField(term1364614, term1364614.getClass(), "capturedSquare", enum5242);
        setField(term1364614, term1364614.getClass(), "movingPiece", enum5243);
        setBooleanField(term1364614, term1364614.getClass(), "castleMove", true);
        setBooleanField(term1364614, term1364614.getClass(), "enPassantMove", false);
        setLongField(term1364614, term1364614.getClass(), "incrementalHashKey", 2712394591642260550L);
        setLongField(term1364614, term1364614.getClass(), "incrementalPolyglotKey", -1211273460223868511L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.MoveBackup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term1364614, args);
    }

};


