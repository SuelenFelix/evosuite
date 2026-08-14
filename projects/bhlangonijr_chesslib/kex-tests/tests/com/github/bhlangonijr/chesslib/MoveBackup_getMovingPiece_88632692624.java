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

public class MoveBackup_getMovingPiece_88632692624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1367289;

    public MoveBackup_getMovingPiece_88632692624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1367291 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Class<? extends Object> term1367650 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1367649 = ((Class) term1367650).getDeclaredField((String) "WHITE");
        ((Field) term1367649).setAccessible(true);
        Object enum5244 = ((Field) term1367649).get((Object) null);
        Class<? extends Object> term1367852 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1367851 = ((Class) term1367852).getDeclaredField((String) "WHITE");
        ((Field) term1367851).setAccessible(true);
        Object enum5245 = ((Field) term1367851).get((Object) null);
        Class<? extends Object> term1368054 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1368053 = ((Class) term1368054).getDeclaredField((String) "D1");
        ((Field) term1368053).setAccessible(true);
        Object enum5246 = ((Field) term1368053).get((Object) null);
        Class<? extends Object> term1368257 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1368256 = ((Class) term1368257).getDeclaredField((String) "C1");
        ((Field) term1368256).setAccessible(true);
        Object enum5247 = ((Field) term1368256).get((Object) null);
        Integer term1367396 = new Integer(-860131894);
        Integer term1367398 = new Integer(-1022990421);
        Class<? extends Object> term1368460 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1368459 = ((Class) term1368460).getDeclaredField((String) "B2");
        ((Field) term1368459).setAccessible(true);
        Object enum5248 = ((Field) term1368459).get((Object) null);
        Class<? extends Object> term1368663 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1368662 = ((Class) term1368663).getDeclaredField((String) "WHITE_BISHOP");
        ((Field) term1368662).setAccessible(true);
        Object enum5249 = ((Field) term1368662).get((Object) null);
        Class<? extends Object> term1368901 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1368900 = ((Class) term1368901).getDeclaredField((String) "B6");
        ((Field) term1368900).setAccessible(true);
        Object enum5250 = ((Field) term1368900).get((Object) null);
        Class<? extends Object> term1369104 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1369103 = ((Class) term1369104).getDeclaredField((String) "C7");
        ((Field) term1369103).setAccessible(true);
        Object enum5251 = ((Field) term1369103).get((Object) null);
        Class<? extends Object> term1369307 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1369306 = ((Class) term1369307).getDeclaredField((String) "BLACK_KNIGHT");
        ((Field) term1369306).setAccessible(true);
        Object enum5252 = ((Field) term1369306).get((Object) null);
        Class<? extends Object> term1369545 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1369544 = ((Class) term1369545).getDeclaredField((String) "BLACK_BISHOP");
        ((Field) term1369544).setAccessible(true);
        Object enum5253 = ((Field) term1369544).get((Object) null);
        Class<? extends Object> term1369773 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1369772 = ((Class) term1369773).getDeclaredField((String) "A8");
        ((Field) term1369772).setAccessible(true);
        Object enum5254 = ((Field) term1369772).get((Object) null);
        term1367289 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.MoveBackup"));
        Object term1367290 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term1367381 = (Object[]) newArray("com.github.bhlangonijr.chesslib.Side", 2);
        Object[] term1367382 = (Object[]) newArray("java.lang.Object", 2);
        Object term1367400 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        Object term1367445 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term1367290, term1367290.getClass(), "keyType", term1367291);
        setElement(term1367381, 0, enum5244);
        setElement(term1367381, 1, enum5245);
        setField(term1367290, term1367290.getClass(), "keyUniverse", term1367381);
        setField(term1367290, term1367290.getClass(), "vals", term1367382);
        setIntField(term1367290, term1367290.getClass(), "size", 0);
        setField(term1367290, term1367290.getClass(), "entrySet", null);
        setField(term1367290, term1367290.getClass(), "keySet", null);
        setField(term1367290, term1367290.getClass(), "values", null);
        setField(term1367289, term1367289.getClass(), "castleRight", term1367290);
        setField(term1367289, term1367289.getClass(), "sideToMove", enum5244);
        setField(term1367289, term1367289.getClass(), "enPassantTarget", enum5246);
        setField(term1367289, term1367289.getClass(), "enPassant", enum5247);
        setField(term1367289, term1367289.getClass(), "moveCounter", term1367396);
        setField(term1367289, term1367289.getClass(), "halfMoveCounter", term1367398);
        setField(term1367400, term1367400.getClass(), "from", enum5248);
        setField(term1367400, term1367400.getClass(), "to", enum5247);
        setField(term1367400, term1367400.getClass(), "promotion", enum5249);
        setField(term1367400, term1367400.getClass(), "san", "CiPMRxGoHO");
        setField(term1367289, term1367289.getClass(), "move", term1367400);
        setField(term1367445, term1367445.getClass(), "from", enum5250);
        setField(term1367445, term1367445.getClass(), "to", enum5251);
        setField(term1367445, term1367445.getClass(), "promotion", enum5252);
        setField(term1367445, term1367445.getClass(), "san", "LauKpKmenw");
        setField(term1367289, term1367289.getClass(), "rookCastleMove", term1367445);
        setField(term1367289, term1367289.getClass(), "capturedPiece", enum5253);
        setField(term1367289, term1367289.getClass(), "capturedSquare", enum5254);
        setField(term1367289, term1367289.getClass(), "movingPiece", enum5252);
        setBooleanField(term1367289, term1367289.getClass(), "castleMove", true);
        setBooleanField(term1367289, term1367289.getClass(), "enPassantMove", false);
        setLongField(term1367289, term1367289.getClass(), "incrementalHashKey", -8172564209423941839L);
        setLongField(term1367289, term1367289.getClass(), "incrementalPolyglotKey", -4561371668792438386L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.MoveBackup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMovingPiece", argTypes, term1367289, args);
    }

};


