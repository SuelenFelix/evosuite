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

public class MoveBackup_setMovingPiece_11837326225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1369975;
     Object enum5268;

    public MoveBackup_setMovingPiece_11837326225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1369977 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Class<? extends Object> term1370411 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1370410 = ((Class) term1370411).getDeclaredField((String) "WHITE");
        ((Field) term1370410).setAccessible(true);
        Object enum5255 = ((Field) term1370410).get((Object) null);
        Class<? extends Object> term1370613 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1370612 = ((Class) term1370613).getDeclaredField((String) "WHITE");
        ((Field) term1370612).setAccessible(true);
        Object enum5256 = ((Field) term1370612).get((Object) null);
        Class<? extends Object> term1370815 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1370814 = ((Class) term1370815).getDeclaredField((String) "B7");
        ((Field) term1370814).setAccessible(true);
        Object enum5257 = ((Field) term1370814).get((Object) null);
        Class<? extends Object> term1371018 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1371017 = ((Class) term1371018).getDeclaredField((String) "E1");
        ((Field) term1371017).setAccessible(true);
        Object enum5258 = ((Field) term1371017).get((Object) null);
        Integer term1370082 = new Integer(1045547089);
        Integer term1370084 = new Integer(-1122880881);
        Class<? extends Object> term1371221 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1371220 = ((Class) term1371221).getDeclaredField((String) "C4");
        ((Field) term1371220).setAccessible(true);
        Object enum5259 = ((Field) term1371220).get((Object) null);
        Class<? extends Object> term1371424 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1371423 = ((Class) term1371424).getDeclaredField((String) "C7");
        ((Field) term1371423).setAccessible(true);
        Object enum5260 = ((Field) term1371423).get((Object) null);
        Class<? extends Object> term1371627 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1371626 = ((Class) term1371627).getDeclaredField((String) "BLACK_BISHOP");
        ((Field) term1371626).setAccessible(true);
        Object enum5261 = ((Field) term1371626).get((Object) null);
        Class<? extends Object> term1371865 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1371864 = ((Class) term1371865).getDeclaredField((String) "F3");
        ((Field) term1371864).setAccessible(true);
        Object enum5262 = ((Field) term1371864).get((Object) null);
        Class<? extends Object> term1372068 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1372067 = ((Class) term1372068).getDeclaredField((String) "C5");
        ((Field) term1372067).setAccessible(true);
        Object enum5263 = ((Field) term1372067).get((Object) null);
        Class<? extends Object> term1372271 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1372270 = ((Class) term1372271).getDeclaredField((String) "BLACK_QUEEN");
        ((Field) term1372270).setAccessible(true);
        Object enum5264 = ((Field) term1372270).get((Object) null);
        Class<? extends Object> term1372506 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1372505 = ((Class) term1372506).getDeclaredField((String) "BLACK_BISHOP");
        ((Field) term1372505).setAccessible(true);
        Object enum5265 = ((Field) term1372505).get((Object) null);
        Class<? extends Object> term1372734 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1372733 = ((Class) term1372734).getDeclaredField((String) "E4");
        ((Field) term1372733).setAccessible(true);
        Object enum5266 = ((Field) term1372733).get((Object) null);
        Class<? extends Object> term1372937 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1372936 = ((Class) term1372937).getDeclaredField((String) "WHITE_BISHOP");
        ((Field) term1372936).setAccessible(true);
        Object enum5267 = ((Field) term1372936).get((Object) null);
        term1369975 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.MoveBackup"));
        Object term1369976 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term1370067 = (Object[]) newArray("com.github.bhlangonijr.chesslib.Side", 2);
        Object[] term1370068 = (Object[]) newArray("java.lang.Object", 2);
        Object term1370086 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        Object term1370136 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term1369976, term1369976.getClass(), "keyType", term1369977);
        setElement(term1370067, 0, enum5255);
        setElement(term1370067, 1, enum5256);
        setField(term1369976, term1369976.getClass(), "keyUniverse", term1370067);
        setField(term1369976, term1369976.getClass(), "vals", term1370068);
        setIntField(term1369976, term1369976.getClass(), "size", 0);
        setField(term1369976, term1369976.getClass(), "entrySet", null);
        setField(term1369976, term1369976.getClass(), "keySet", null);
        setField(term1369976, term1369976.getClass(), "values", null);
        setField(term1369975, term1369975.getClass(), "castleRight", term1369976);
        setField(term1369975, term1369975.getClass(), "sideToMove", enum5255);
        setField(term1369975, term1369975.getClass(), "enPassantTarget", enum5257);
        setField(term1369975, term1369975.getClass(), "enPassant", enum5258);
        setField(term1369975, term1369975.getClass(), "moveCounter", term1370082);
        setField(term1369975, term1369975.getClass(), "halfMoveCounter", term1370084);
        setField(term1370086, term1370086.getClass(), "from", enum5259);
        setField(term1370086, term1370086.getClass(), "to", enum5260);
        setField(term1370086, term1370086.getClass(), "promotion", enum5261);
        setField(term1370086, term1370086.getClass(), "san", "TydzbTXvbY");
        setField(term1369975, term1369975.getClass(), "move", term1370086);
        setField(term1370136, term1370136.getClass(), "from", enum5262);
        setField(term1370136, term1370136.getClass(), "to", enum5263);
        setField(term1370136, term1370136.getClass(), "promotion", enum5264);
        setField(term1370136, term1370136.getClass(), "san", "yNogNNecFu");
        setField(term1369975, term1369975.getClass(), "rookCastleMove", term1370136);
        setField(term1369975, term1369975.getClass(), "capturedPiece", enum5265);
        setField(term1369975, term1369975.getClass(), "capturedSquare", enum5266);
        setField(term1369975, term1369975.getClass(), "movingPiece", enum5267);
        setBooleanField(term1369975, term1369975.getClass(), "castleMove", true);
        setBooleanField(term1369975, term1369975.getClass(), "enPassantMove", false);
        setLongField(term1369975, term1369975.getClass(), "incrementalHashKey", 7065003857377879971L);
        setLongField(term1369975, term1369975.getClass(), "incrementalPolyglotKey", 2243864141567980599L);
        Class<? extends Object> term1373165 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1373164 = ((Class) term1373165).getDeclaredField((String) "WHITE_KNIGHT");
        ((Field) term1373164).setAccessible(true);
        enum5268 = ((Field) term1373164).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.MoveBackup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Piece");
        Object[] args = new Object[1];
        args[0] = enum5268;
        callMethod(klass, "setMovingPiece", argTypes, term1369975, args);
    }

};


