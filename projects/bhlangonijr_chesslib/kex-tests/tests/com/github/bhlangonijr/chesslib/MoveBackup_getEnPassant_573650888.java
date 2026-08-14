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

public class MoveBackup_getEnPassant_573650888 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1318146;

    public MoveBackup_getEnPassant_573650888() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1318148 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Class<? extends Object> term1318494 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1318493 = ((Class) term1318494).getDeclaredField((String) "BLACK");
        ((Field) term1318493).setAccessible(true);
        Object enum5039 = ((Field) term1318493).get((Object) null);
        Class<? extends Object> term1318696 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1318695 = ((Class) term1318696).getDeclaredField((String) "BLACK");
        ((Field) term1318695).setAccessible(true);
        Object enum5040 = ((Field) term1318695).get((Object) null);
        Class<? extends Object> term1318898 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1318897 = ((Class) term1318898).getDeclaredField((String) "F5");
        ((Field) term1318897).setAccessible(true);
        Object enum5041 = ((Field) term1318897).get((Object) null);
        Class<? extends Object> term1319101 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1319100 = ((Class) term1319101).getDeclaredField((String) "D8");
        ((Field) term1319100).setAccessible(true);
        Object enum5042 = ((Field) term1319100).get((Object) null);
        Integer term1318253 = new Integer(-1945706126);
        Integer term1318255 = new Integer(1152356969);
        Class<? extends Object> term1319304 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1319303 = ((Class) term1319304).getDeclaredField((String) "D5");
        ((Field) term1319303).setAccessible(true);
        Object enum5043 = ((Field) term1319303).get((Object) null);
        Class<? extends Object> term1319507 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1319506 = ((Class) term1319507).getDeclaredField((String) "E8");
        ((Field) term1319506).setAccessible(true);
        Object enum5044 = ((Field) term1319506).get((Object) null);
        Class<? extends Object> term1319710 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1319709 = ((Class) term1319710).getDeclaredField((String) "WHITE_KNIGHT");
        ((Field) term1319709).setAccessible(true);
        Object enum5045 = ((Field) term1319709).get((Object) null);
        Class<? extends Object> term1319948 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1319947 = ((Class) term1319948).getDeclaredField((String) "C6");
        ((Field) term1319947).setAccessible(true);
        Object enum5046 = ((Field) term1319947).get((Object) null);
        Class<? extends Object> term1320151 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1320150 = ((Class) term1320151).getDeclaredField((String) "B2");
        ((Field) term1320150).setAccessible(true);
        Object enum5047 = ((Field) term1320150).get((Object) null);
        Class<? extends Object> term1320354 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1320353 = ((Class) term1320354).getDeclaredField((String) "WHITE_ROOK");
        ((Field) term1320353).setAccessible(true);
        Object enum5048 = ((Field) term1320353).get((Object) null);
        Class<? extends Object> term1320586 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1320585 = ((Class) term1320586).getDeclaredField((String) "C2");
        ((Field) term1320585).setAccessible(true);
        Object enum5049 = ((Field) term1320585).get((Object) null);
        Class<? extends Object> term1320789 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1320788 = ((Class) term1320789).getDeclaredField((String) "NONE");
        ((Field) term1320788).setAccessible(true);
        Object enum5050 = ((Field) term1320788).get((Object) null);
        term1318146 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.MoveBackup"));
        Object term1318147 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term1318238 = (Object[]) newArray("com.github.bhlangonijr.chesslib.Side", 2);
        Object[] term1318239 = (Object[]) newArray("java.lang.Object", 2);
        Object term1318257 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        Object term1318307 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term1318147, term1318147.getClass(), "keyType", term1318148);
        setElement(term1318238, 0, enum5039);
        setElement(term1318238, 1, enum5040);
        setField(term1318147, term1318147.getClass(), "keyUniverse", term1318238);
        setField(term1318147, term1318147.getClass(), "vals", term1318239);
        setIntField(term1318147, term1318147.getClass(), "size", 0);
        setField(term1318147, term1318147.getClass(), "entrySet", null);
        setField(term1318147, term1318147.getClass(), "keySet", null);
        setField(term1318147, term1318147.getClass(), "values", null);
        setField(term1318146, term1318146.getClass(), "castleRight", term1318147);
        setField(term1318146, term1318146.getClass(), "sideToMove", enum5039);
        setField(term1318146, term1318146.getClass(), "enPassantTarget", enum5041);
        setField(term1318146, term1318146.getClass(), "enPassant", enum5042);
        setField(term1318146, term1318146.getClass(), "moveCounter", term1318253);
        setField(term1318146, term1318146.getClass(), "halfMoveCounter", term1318255);
        setField(term1318257, term1318257.getClass(), "from", enum5043);
        setField(term1318257, term1318257.getClass(), "to", enum5044);
        setField(term1318257, term1318257.getClass(), "promotion", enum5045);
        setField(term1318257, term1318257.getClass(), "san", "gOwOIsocMB");
        setField(term1318146, term1318146.getClass(), "move", term1318257);
        setField(term1318307, term1318307.getClass(), "from", enum5046);
        setField(term1318307, term1318307.getClass(), "to", enum5047);
        setField(term1318307, term1318307.getClass(), "promotion", enum5048);
        setField(term1318307, term1318307.getClass(), "san", "GqTBOhQBgV");
        setField(term1318146, term1318146.getClass(), "rookCastleMove", term1318307);
        setField(term1318146, term1318146.getClass(), "capturedPiece", enum5045);
        setField(term1318146, term1318146.getClass(), "capturedSquare", enum5049);
        setField(term1318146, term1318146.getClass(), "movingPiece", enum5050);
        setBooleanField(term1318146, term1318146.getClass(), "castleMove", false);
        setBooleanField(term1318146, term1318146.getClass(), "enPassantMove", false);
        setLongField(term1318146, term1318146.getClass(), "incrementalHashKey", 4947643967691976731L);
        setLongField(term1318146, term1318146.getClass(), "incrementalPolyglotKey", 4548576710115075073L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.MoveBackup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEnPassant", argTypes, term1318146, args);
    }

};


