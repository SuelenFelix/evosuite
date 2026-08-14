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

public class MoveBackup_getRookCastleMove_143127686716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1342338;

    public MoveBackup_getRookCastleMove_143127686716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1342340 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Class<? extends Object> term1342701 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1342700 = ((Class) term1342701).getDeclaredField((String) "BLACK");
        ((Field) term1342700).setAccessible(true);
        Object enum5140 = ((Field) term1342700).get((Object) null);
        Class<? extends Object> term1342903 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1342902 = ((Class) term1342903).getDeclaredField((String) "BLACK");
        ((Field) term1342902).setAccessible(true);
        Object enum5141 = ((Field) term1342902).get((Object) null);
        Class<? extends Object> term1343105 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1343104 = ((Class) term1343105).getDeclaredField((String) "E1");
        ((Field) term1343104).setAccessible(true);
        Object enum5142 = ((Field) term1343104).get((Object) null);
        Class<? extends Object> term1343308 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1343307 = ((Class) term1343308).getDeclaredField((String) "A4");
        ((Field) term1343307).setAccessible(true);
        Object enum5143 = ((Field) term1343307).get((Object) null);
        Integer term1342445 = new Integer(937859191);
        Integer term1342447 = new Integer(-916584829);
        Class<? extends Object> term1343511 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1343510 = ((Class) term1343511).getDeclaredField((String) "B4");
        ((Field) term1343510).setAccessible(true);
        Object enum5144 = ((Field) term1343510).get((Object) null);
        Class<? extends Object> term1343714 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1343713 = ((Class) term1343714).getDeclaredField((String) "D8");
        ((Field) term1343713).setAccessible(true);
        Object enum5145 = ((Field) term1343713).get((Object) null);
        Class<? extends Object> term1343917 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1343916 = ((Class) term1343917).getDeclaredField((String) "BLACK_ROOK");
        ((Field) term1343916).setAccessible(true);
        Object enum5146 = ((Field) term1343916).get((Object) null);
        Class<? extends Object> term1344149 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1344148 = ((Class) term1344149).getDeclaredField((String) "C7");
        ((Field) term1344148).setAccessible(true);
        Object enum5147 = ((Field) term1344148).get((Object) null);
        Class<? extends Object> term1344352 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1344351 = ((Class) term1344352).getDeclaredField((String) "F7");
        ((Field) term1344351).setAccessible(true);
        Object enum5148 = ((Field) term1344351).get((Object) null);
        Class<? extends Object> term1344555 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1344554 = ((Class) term1344555).getDeclaredField((String) "WHITE_KNIGHT");
        ((Field) term1344554).setAccessible(true);
        Object enum5149 = ((Field) term1344554).get((Object) null);
        Class<? extends Object> term1344793 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1344792 = ((Class) term1344793).getDeclaredField((String) "WHITE_ROOK");
        ((Field) term1344792).setAccessible(true);
        Object enum5150 = ((Field) term1344792).get((Object) null);
        Class<? extends Object> term1345015 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1345014 = ((Class) term1345015).getDeclaredField((String) "G1");
        ((Field) term1345014).setAccessible(true);
        Object enum5151 = ((Field) term1345014).get((Object) null);
        term1342338 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.MoveBackup"));
        Object term1342339 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term1342430 = (Object[]) newArray("com.github.bhlangonijr.chesslib.Side", 2);
        Object[] term1342431 = (Object[]) newArray("java.lang.Object", 2);
        Object term1342449 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        Object term1342499 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term1342339, term1342339.getClass(), "keyType", term1342340);
        setElement(term1342430, 0, enum5140);
        setElement(term1342430, 1, enum5141);
        setField(term1342339, term1342339.getClass(), "keyUniverse", term1342430);
        setField(term1342339, term1342339.getClass(), "vals", term1342431);
        setIntField(term1342339, term1342339.getClass(), "size", 0);
        setField(term1342339, term1342339.getClass(), "entrySet", null);
        setField(term1342339, term1342339.getClass(), "keySet", null);
        setField(term1342339, term1342339.getClass(), "values", null);
        setField(term1342338, term1342338.getClass(), "castleRight", term1342339);
        setField(term1342338, term1342338.getClass(), "sideToMove", enum5141);
        setField(term1342338, term1342338.getClass(), "enPassantTarget", enum5142);
        setField(term1342338, term1342338.getClass(), "enPassant", enum5143);
        setField(term1342338, term1342338.getClass(), "moveCounter", term1342445);
        setField(term1342338, term1342338.getClass(), "halfMoveCounter", term1342447);
        setField(term1342449, term1342449.getClass(), "from", enum5144);
        setField(term1342449, term1342449.getClass(), "to", enum5145);
        setField(term1342449, term1342449.getClass(), "promotion", enum5146);
        setField(term1342449, term1342449.getClass(), "san", "isMKwgUmka");
        setField(term1342338, term1342338.getClass(), "move", term1342449);
        setField(term1342499, term1342499.getClass(), "from", enum5147);
        setField(term1342499, term1342499.getClass(), "to", enum5148);
        setField(term1342499, term1342499.getClass(), "promotion", enum5149);
        setField(term1342499, term1342499.getClass(), "san", "pDIyzhDtTy");
        setField(term1342338, term1342338.getClass(), "rookCastleMove", term1342499);
        setField(term1342338, term1342338.getClass(), "capturedPiece", enum5150);
        setField(term1342338, term1342338.getClass(), "capturedSquare", enum5151);
        setField(term1342338, term1342338.getClass(), "movingPiece", enum5146);
        setBooleanField(term1342338, term1342338.getClass(), "castleMove", false);
        setBooleanField(term1342338, term1342338.getClass(), "enPassantMove", true);
        setLongField(term1342338, term1342338.getClass(), "incrementalHashKey", 5857854340777182167L);
        setLongField(term1342338, term1342338.getClass(), "incrementalPolyglotKey", 3660520943100987842L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.MoveBackup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRookCastleMove", argTypes, term1342338, args);
    }

};


