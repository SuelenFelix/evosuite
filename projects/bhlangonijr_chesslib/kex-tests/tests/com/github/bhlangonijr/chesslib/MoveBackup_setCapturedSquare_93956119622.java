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

public class MoveBackup_setCapturedSquare_93956119622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1361295;
     Object enum5232;

    public MoveBackup_setCapturedSquare_93956119622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1361297 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Class<? extends Object> term1361691 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1361690 = ((Class) term1361691).getDeclaredField((String) "BLACK");
        ((Field) term1361690).setAccessible(true);
        Object enum5219 = ((Field) term1361690).get((Object) null);
        Class<? extends Object> term1361893 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1361892 = ((Class) term1361893).getDeclaredField((String) "WHITE");
        ((Field) term1361892).setAccessible(true);
        Object enum5220 = ((Field) term1361892).get((Object) null);
        Class<? extends Object> term1362095 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1362094 = ((Class) term1362095).getDeclaredField((String) "G4");
        ((Field) term1362094).setAccessible(true);
        Object enum5221 = ((Field) term1362094).get((Object) null);
        Class<? extends Object> term1362298 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1362297 = ((Class) term1362298).getDeclaredField((String) "E4");
        ((Field) term1362297).setAccessible(true);
        Object enum5222 = ((Field) term1362297).get((Object) null);
        Integer term1361402 = new Integer(1684998508);
        Integer term1361404 = new Integer(-1476644457);
        Class<? extends Object> term1362501 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1362500 = ((Class) term1362501).getDeclaredField((String) "C6");
        ((Field) term1362500).setAccessible(true);
        Object enum5223 = ((Field) term1362500).get((Object) null);
        Class<? extends Object> term1362704 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1362703 = ((Class) term1362704).getDeclaredField((String) "G2");
        ((Field) term1362703).setAccessible(true);
        Object enum5224 = ((Field) term1362703).get((Object) null);
        Class<? extends Object> term1362907 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1362906 = ((Class) term1362907).getDeclaredField((String) "NONE");
        ((Field) term1362906).setAccessible(true);
        Object enum5225 = ((Field) term1362906).get((Object) null);
        Class<? extends Object> term1363121 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1363120 = ((Class) term1363121).getDeclaredField((String) "G8");
        ((Field) term1363120).setAccessible(true);
        Object enum5226 = ((Field) term1363120).get((Object) null);
        Class<? extends Object> term1363324 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1363323 = ((Class) term1363324).getDeclaredField((String) "A8");
        ((Field) term1363323).setAccessible(true);
        Object enum5227 = ((Field) term1363323).get((Object) null);
        Class<? extends Object> term1363527 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1363526 = ((Class) term1363527).getDeclaredField((String) "BLACK_KNIGHT");
        ((Field) term1363526).setAccessible(true);
        Object enum5228 = ((Field) term1363526).get((Object) null);
        Class<? extends Object> term1363765 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1363764 = ((Class) term1363765).getDeclaredField((String) "BLACK_ROOK");
        ((Field) term1363764).setAccessible(true);
        Object enum5229 = ((Field) term1363764).get((Object) null);
        Class<? extends Object> term1363987 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1363986 = ((Class) term1363987).getDeclaredField((String) "F8");
        ((Field) term1363986).setAccessible(true);
        Object enum5230 = ((Field) term1363986).get((Object) null);
        Class<? extends Object> term1364190 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1364189 = ((Class) term1364190).getDeclaredField((String) "WHITE_KING");
        ((Field) term1364189).setAccessible(true);
        Object enum5231 = ((Field) term1364189).get((Object) null);
        term1361295 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.MoveBackup"));
        Object term1361296 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term1361387 = (Object[]) newArray("com.github.bhlangonijr.chesslib.Side", 2);
        Object[] term1361388 = (Object[]) newArray("java.lang.Object", 2);
        Object term1361406 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        Object term1361448 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term1361296, term1361296.getClass(), "keyType", term1361297);
        setElement(term1361387, 0, enum5219);
        setElement(term1361387, 1, enum5220);
        setField(term1361296, term1361296.getClass(), "keyUniverse", term1361387);
        setField(term1361296, term1361296.getClass(), "vals", term1361388);
        setIntField(term1361296, term1361296.getClass(), "size", 0);
        setField(term1361296, term1361296.getClass(), "entrySet", null);
        setField(term1361296, term1361296.getClass(), "keySet", null);
        setField(term1361296, term1361296.getClass(), "values", null);
        setField(term1361295, term1361295.getClass(), "castleRight", term1361296);
        setField(term1361295, term1361295.getClass(), "sideToMove", enum5219);
        setField(term1361295, term1361295.getClass(), "enPassantTarget", enum5221);
        setField(term1361295, term1361295.getClass(), "enPassant", enum5222);
        setField(term1361295, term1361295.getClass(), "moveCounter", term1361402);
        setField(term1361295, term1361295.getClass(), "halfMoveCounter", term1361404);
        setField(term1361406, term1361406.getClass(), "from", enum5223);
        setField(term1361406, term1361406.getClass(), "to", enum5224);
        setField(term1361406, term1361406.getClass(), "promotion", enum5225);
        setField(term1361406, term1361406.getClass(), "san", "UvweyXjDhG");
        setField(term1361295, term1361295.getClass(), "move", term1361406);
        setField(term1361448, term1361448.getClass(), "from", enum5226);
        setField(term1361448, term1361448.getClass(), "to", enum5227);
        setField(term1361448, term1361448.getClass(), "promotion", enum5228);
        setField(term1361448, term1361448.getClass(), "san", "wnoVhNwdJy");
        setField(term1361295, term1361295.getClass(), "rookCastleMove", term1361448);
        setField(term1361295, term1361295.getClass(), "capturedPiece", enum5229);
        setField(term1361295, term1361295.getClass(), "capturedSquare", enum5230);
        setField(term1361295, term1361295.getClass(), "movingPiece", enum5231);
        setBooleanField(term1361295, term1361295.getClass(), "castleMove", true);
        setBooleanField(term1361295, term1361295.getClass(), "enPassantMove", true);
        setLongField(term1361295, term1361295.getClass(), "incrementalHashKey", 6252795312796363233L);
        setLongField(term1361295, term1361295.getClass(), "incrementalPolyglotKey", 3968143267572761057L);
        Class<? extends Object> term1364412 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1364411 = ((Class) term1364412).getDeclaredField((String) "H8");
        ((Field) term1364411).setAccessible(true);
        enum5232 = ((Field) term1364411).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.MoveBackup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        Object[] args = new Object[1];
        args[0] = enum5232;
        callMethod(klass, "setCapturedSquare", argTypes, term1361295, args);
    }

};


