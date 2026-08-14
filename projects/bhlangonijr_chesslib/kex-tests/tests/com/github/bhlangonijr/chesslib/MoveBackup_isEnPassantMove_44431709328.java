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

public class MoveBackup_isEnPassantMove_44431709328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1379128;

    public MoveBackup_isEnPassantMove_44431709328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1379130 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Class<? extends Object> term1379527 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1379526 = ((Class) term1379527).getDeclaredField((String) "WHITE");
        ((Field) term1379526).setAccessible(true);
        Object enum5293 = ((Field) term1379526).get((Object) null);
        Class<? extends Object> term1379729 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1379728 = ((Class) term1379729).getDeclaredField((String) "BLACK");
        ((Field) term1379728).setAccessible(true);
        Object enum5294 = ((Field) term1379728).get((Object) null);
        Class<? extends Object> term1379931 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1379930 = ((Class) term1379931).getDeclaredField((String) "A6");
        ((Field) term1379930).setAccessible(true);
        Object enum5295 = ((Field) term1379930).get((Object) null);
        Class<? extends Object> term1380134 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1380133 = ((Class) term1380134).getDeclaredField((String) "B2");
        ((Field) term1380133).setAccessible(true);
        Object enum5296 = ((Field) term1380133).get((Object) null);
        Integer term1379235 = new Integer(479531250);
        Integer term1379237 = new Integer(1320570890);
        Class<? extends Object> term1380337 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1380336 = ((Class) term1380337).getDeclaredField((String) "H4");
        ((Field) term1380336).setAccessible(true);
        Object enum5297 = ((Field) term1380336).get((Object) null);
        Class<? extends Object> term1380540 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1380539 = ((Class) term1380540).getDeclaredField((String) "H7");
        ((Field) term1380539).setAccessible(true);
        Object enum5298 = ((Field) term1380539).get((Object) null);
        Class<? extends Object> term1380743 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1380742 = ((Class) term1380743).getDeclaredField((String) "WHITE_ROOK");
        ((Field) term1380742).setAccessible(true);
        Object enum5299 = ((Field) term1380742).get((Object) null);
        Class<? extends Object> term1380975 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1380974 = ((Class) term1380975).getDeclaredField((String) "C2");
        ((Field) term1380974).setAccessible(true);
        Object enum5300 = ((Field) term1380974).get((Object) null);
        Class<? extends Object> term1381178 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1381177 = ((Class) term1381178).getDeclaredField((String) "E7");
        ((Field) term1381177).setAccessible(true);
        Object enum5301 = ((Field) term1381177).get((Object) null);
        Class<? extends Object> term1381381 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1381380 = ((Class) term1381381).getDeclaredField((String) "WHITE_KNIGHT");
        ((Field) term1381380).setAccessible(true);
        Object enum5302 = ((Field) term1381380).get((Object) null);
        Class<? extends Object> term1381619 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1381618 = ((Class) term1381619).getDeclaredField((String) "BLACK_KING");
        ((Field) term1381618).setAccessible(true);
        Object enum5303 = ((Field) term1381618).get((Object) null);
        Class<? extends Object> term1381841 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1381840 = ((Class) term1381841).getDeclaredField((String) "D7");
        ((Field) term1381840).setAccessible(true);
        Object enum5304 = ((Field) term1381840).get((Object) null);
        Class<? extends Object> term1382044 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1382043 = ((Class) term1382044).getDeclaredField((String) "WHITE_PAWN");
        ((Field) term1382043).setAccessible(true);
        Object enum5305 = ((Field) term1382043).get((Object) null);
        term1379128 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.MoveBackup"));
        Object term1379129 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term1379220 = (Object[]) newArray("com.github.bhlangonijr.chesslib.Side", 2);
        Object[] term1379221 = (Object[]) newArray("java.lang.Object", 2);
        Object term1379239 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        Object term1379291 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term1379129, term1379129.getClass(), "keyType", term1379130);
        setElement(term1379220, 0, enum5293);
        setElement(term1379220, 1, enum5294);
        setField(term1379129, term1379129.getClass(), "keyUniverse", term1379220);
        setField(term1379129, term1379129.getClass(), "vals", term1379221);
        setIntField(term1379129, term1379129.getClass(), "size", 0);
        setField(term1379129, term1379129.getClass(), "entrySet", null);
        setField(term1379129, term1379129.getClass(), "keySet", null);
        setField(term1379129, term1379129.getClass(), "values", null);
        setField(term1379128, term1379128.getClass(), "castleRight", term1379129);
        setField(term1379128, term1379128.getClass(), "sideToMove", enum5293);
        setField(term1379128, term1379128.getClass(), "enPassantTarget", enum5295);
        setField(term1379128, term1379128.getClass(), "enPassant", enum5296);
        setField(term1379128, term1379128.getClass(), "moveCounter", term1379235);
        setField(term1379128, term1379128.getClass(), "halfMoveCounter", term1379237);
        setField(term1379239, term1379239.getClass(), "from", enum5297);
        setField(term1379239, term1379239.getClass(), "to", enum5298);
        setField(term1379239, term1379239.getClass(), "promotion", enum5299);
        setField(term1379239, term1379239.getClass(), "san", "gqMysJhxfA");
        setField(term1379128, term1379128.getClass(), "move", term1379239);
        setField(term1379291, term1379291.getClass(), "from", enum5300);
        setField(term1379291, term1379291.getClass(), "to", enum5301);
        setField(term1379291, term1379291.getClass(), "promotion", enum5302);
        setField(term1379291, term1379291.getClass(), "san", "HtLEppUqzI");
        setField(term1379128, term1379128.getClass(), "rookCastleMove", term1379291);
        setField(term1379128, term1379128.getClass(), "capturedPiece", enum5303);
        setField(term1379128, term1379128.getClass(), "capturedSquare", enum5304);
        setField(term1379128, term1379128.getClass(), "movingPiece", enum5305);
        setBooleanField(term1379128, term1379128.getClass(), "castleMove", false);
        setBooleanField(term1379128, term1379128.getClass(), "enPassantMove", false);
        setLongField(term1379128, term1379128.getClass(), "incrementalHashKey", 3810487266967550400L);
        setLongField(term1379128, term1379128.getClass(), "incrementalPolyglotKey", 8965244485590834147L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.MoveBackup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEnPassantMove", argTypes, term1379128, args);
    }

};


