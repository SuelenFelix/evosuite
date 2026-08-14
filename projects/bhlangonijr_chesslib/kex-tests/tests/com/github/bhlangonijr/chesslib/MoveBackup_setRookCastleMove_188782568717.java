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

public class MoveBackup_setRookCastleMove_188782568717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1345217;
     Object term1345497;

    public MoveBackup_setRookCastleMove_188782568717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1345219 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Class<? extends Object> term1345652 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1345651 = ((Class) term1345652).getDeclaredField((String) "WHITE");
        ((Field) term1345651).setAccessible(true);
        Object enum5152 = ((Field) term1345651).get((Object) null);
        Class<? extends Object> term1345854 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1345853 = ((Class) term1345854).getDeclaredField((String) "BLACK");
        ((Field) term1345853).setAccessible(true);
        Object enum5153 = ((Field) term1345853).get((Object) null);
        Class<? extends Object> term1346056 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1346055 = ((Class) term1346056).getDeclaredField((String) "G4");
        ((Field) term1346055).setAccessible(true);
        Object enum5154 = ((Field) term1346055).get((Object) null);
        Class<? extends Object> term1346259 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1346258 = ((Class) term1346259).getDeclaredField((String) "C4");
        ((Field) term1346258).setAccessible(true);
        Object enum5155 = ((Field) term1346258).get((Object) null);
        Integer term1345324 = new Integer(-2131181468);
        Integer term1345326 = new Integer(282916351);
        Class<? extends Object> term1346462 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1346461 = ((Class) term1346462).getDeclaredField((String) "F3");
        ((Field) term1346461).setAccessible(true);
        Object enum5156 = ((Field) term1346461).get((Object) null);
        Class<? extends Object> term1346665 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1346664 = ((Class) term1346665).getDeclaredField((String) "D5");
        ((Field) term1346664).setAccessible(true);
        Object enum5157 = ((Field) term1346664).get((Object) null);
        Class<? extends Object> term1346868 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1346867 = ((Class) term1346868).getDeclaredField((String) "WHITE_ROOK");
        ((Field) term1346867).setAccessible(true);
        Object enum5158 = ((Field) term1346867).get((Object) null);
        Class<? extends Object> term1347100 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1347099 = ((Class) term1347100).getDeclaredField((String) "E4");
        ((Field) term1347099).setAccessible(true);
        Object enum5159 = ((Field) term1347099).get((Object) null);
        Class<? extends Object> term1347303 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1347302 = ((Class) term1347303).getDeclaredField((String) "D8");
        ((Field) term1347302).setAccessible(true);
        Object enum5160 = ((Field) term1347302).get((Object) null);
        Class<? extends Object> term1347506 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1347505 = ((Class) term1347506).getDeclaredField((String) "BLACK_ROOK");
        ((Field) term1347505).setAccessible(true);
        Object enum5161 = ((Field) term1347505).get((Object) null);
        Class<? extends Object> term1347738 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1347737 = ((Class) term1347738).getDeclaredField((String) "BLACK_ROOK");
        ((Field) term1347737).setAccessible(true);
        Object enum5162 = ((Field) term1347737).get((Object) null);
        Class<? extends Object> term1347960 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1347959 = ((Class) term1347960).getDeclaredField((String) "C7");
        ((Field) term1347959).setAccessible(true);
        Object enum5163 = ((Field) term1347959).get((Object) null);
        Class<? extends Object> term1348163 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1348162 = ((Class) term1348163).getDeclaredField((String) "WHITE_ROOK");
        ((Field) term1348162).setAccessible(true);
        Object enum5164 = ((Field) term1348162).get((Object) null);
        term1345217 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.MoveBackup"));
        Object term1345218 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term1345309 = (Object[]) newArray("com.github.bhlangonijr.chesslib.Side", 2);
        Object[] term1345310 = (Object[]) newArray("java.lang.Object", 2);
        Object term1345328 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        Object term1345378 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term1345218, term1345218.getClass(), "keyType", term1345219);
        setElement(term1345309, 0, enum5152);
        setElement(term1345309, 1, enum5153);
        setField(term1345218, term1345218.getClass(), "keyUniverse", term1345309);
        setField(term1345218, term1345218.getClass(), "vals", term1345310);
        setIntField(term1345218, term1345218.getClass(), "size", 0);
        setField(term1345218, term1345218.getClass(), "entrySet", null);
        setField(term1345218, term1345218.getClass(), "keySet", null);
        setField(term1345218, term1345218.getClass(), "values", null);
        setField(term1345217, term1345217.getClass(), "castleRight", term1345218);
        setField(term1345217, term1345217.getClass(), "sideToMove", enum5152);
        setField(term1345217, term1345217.getClass(), "enPassantTarget", enum5154);
        setField(term1345217, term1345217.getClass(), "enPassant", enum5155);
        setField(term1345217, term1345217.getClass(), "moveCounter", term1345324);
        setField(term1345217, term1345217.getClass(), "halfMoveCounter", term1345326);
        setField(term1345328, term1345328.getClass(), "from", enum5156);
        setField(term1345328, term1345328.getClass(), "to", enum5157);
        setField(term1345328, term1345328.getClass(), "promotion", enum5158);
        setField(term1345328, term1345328.getClass(), "san", "wXiUlhXQoC");
        setField(term1345217, term1345217.getClass(), "move", term1345328);
        setField(term1345378, term1345378.getClass(), "from", enum5159);
        setField(term1345378, term1345378.getClass(), "to", enum5160);
        setField(term1345378, term1345378.getClass(), "promotion", enum5161);
        setField(term1345378, term1345378.getClass(), "san", "gKhmgJzimH");
        setField(term1345217, term1345217.getClass(), "rookCastleMove", term1345378);
        setField(term1345217, term1345217.getClass(), "capturedPiece", enum5162);
        setField(term1345217, term1345217.getClass(), "capturedSquare", enum5163);
        setField(term1345217, term1345217.getClass(), "movingPiece", enum5164);
        setBooleanField(term1345217, term1345217.getClass(), "castleMove", true);
        setBooleanField(term1345217, term1345217.getClass(), "enPassantMove", false);
        setLongField(term1345217, term1345217.getClass(), "incrementalHashKey", -8211240904293846981L);
        setLongField(term1345217, term1345217.getClass(), "incrementalPolyglotKey", 3535528164828723056L);
        Class<? extends Object> term1348385 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1348384 = ((Class) term1348385).getDeclaredField((String) "A6");
        ((Field) term1348384).setAccessible(true);
        Object enum5165 = ((Field) term1348384).get((Object) null);
        Class<? extends Object> term1348588 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1348587 = ((Class) term1348588).getDeclaredField((String) "H4");
        ((Field) term1348587).setAccessible(true);
        Object enum5166 = ((Field) term1348587).get((Object) null);
        Class<? extends Object> term1348791 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1348790 = ((Class) term1348791).getDeclaredField((String) "BLACK_KNIGHT");
        ((Field) term1348790).setAccessible(true);
        Object enum5167 = ((Field) term1348790).get((Object) null);
        term1345497 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term1345497, term1345497.getClass(), "from", enum5165);
        setField(term1345497, term1345497.getClass(), "to", enum5166);
        setField(term1345497, term1345497.getClass(), "promotion", enum5167);
        setField(term1345497, term1345497.getClass(), "san", "OzRiWLVXNx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.MoveBackup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.move.Move");
        Object[] args = new Object[1];
        args[0] = term1345497;
        callMethod(klass, "setRookCastleMove", argTypes, term1345217, args);
    }

};


