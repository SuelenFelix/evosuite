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

public class MoveBackup_getCapturedSquare_7966595821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1358354;

    public MoveBackup_getCapturedSquare_7966595821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1358356 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Class<? extends Object> term1358748 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1358747 = ((Class) term1358748).getDeclaredField((String) "WHITE");
        ((Field) term1358747).setAccessible(true);
        Object enum5207 = ((Field) term1358747).get((Object) null);
        Class<? extends Object> term1358950 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1358949 = ((Class) term1358950).getDeclaredField((String) "WHITE");
        ((Field) term1358949).setAccessible(true);
        Object enum5208 = ((Field) term1358949).get((Object) null);
        Class<? extends Object> term1359152 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1359151 = ((Class) term1359152).getDeclaredField((String) "G2");
        ((Field) term1359151).setAccessible(true);
        Object enum5209 = ((Field) term1359151).get((Object) null);
        Class<? extends Object> term1359355 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1359354 = ((Class) term1359355).getDeclaredField((String) "G1");
        ((Field) term1359354).setAccessible(true);
        Object enum5210 = ((Field) term1359354).get((Object) null);
        Integer term1358461 = new Integer(-1747406163);
        Integer term1358463 = new Integer(388157121);
        Class<? extends Object> term1359558 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1359557 = ((Class) term1359558).getDeclaredField((String) "E3");
        ((Field) term1359557).setAccessible(true);
        Object enum5211 = ((Field) term1359557).get((Object) null);
        Class<? extends Object> term1359761 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1359760 = ((Class) term1359761).getDeclaredField((String) "BLACK_KNIGHT");
        ((Field) term1359760).setAccessible(true);
        Object enum5212 = ((Field) term1359760).get((Object) null);
        Class<? extends Object> term1359999 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1359998 = ((Class) term1359999).getDeclaredField((String) "D5");
        ((Field) term1359998).setAccessible(true);
        Object enum5213 = ((Field) term1359998).get((Object) null);
        Class<? extends Object> term1360202 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1360201 = ((Class) term1360202).getDeclaredField((String) "D3");
        ((Field) term1360201).setAccessible(true);
        Object enum5214 = ((Field) term1360201).get((Object) null);
        Class<? extends Object> term1360405 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1360404 = ((Class) term1360405).getDeclaredField((String) "BLACK_KNIGHT");
        ((Field) term1360404).setAccessible(true);
        Object enum5215 = ((Field) term1360404).get((Object) null);
        Class<? extends Object> term1360643 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1360642 = ((Class) term1360643).getDeclaredField((String) "BLACK_ROOK");
        ((Field) term1360642).setAccessible(true);
        Object enum5216 = ((Field) term1360642).get((Object) null);
        Class<? extends Object> term1360865 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1360864 = ((Class) term1360865).getDeclaredField((String) "H6");
        ((Field) term1360864).setAccessible(true);
        Object enum5217 = ((Field) term1360864).get((Object) null);
        Class<? extends Object> term1361068 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1361067 = ((Class) term1361068).getDeclaredField((String) "BLACK_BISHOP");
        ((Field) term1361067).setAccessible(true);
        Object enum5218 = ((Field) term1361067).get((Object) null);
        term1358354 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.MoveBackup"));
        Object term1358355 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term1358446 = (Object[]) newArray("com.github.bhlangonijr.chesslib.Side", 2);
        Object[] term1358447 = (Object[]) newArray("java.lang.Object", 2);
        Object term1358465 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        Object term1358509 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term1358355, term1358355.getClass(), "keyType", term1358356);
        setElement(term1358446, 0, enum5207);
        setElement(term1358446, 1, enum5208);
        setField(term1358355, term1358355.getClass(), "keyUniverse", term1358446);
        setField(term1358355, term1358355.getClass(), "vals", term1358447);
        setIntField(term1358355, term1358355.getClass(), "size", 0);
        setField(term1358355, term1358355.getClass(), "entrySet", null);
        setField(term1358355, term1358355.getClass(), "keySet", null);
        setField(term1358355, term1358355.getClass(), "values", null);
        setField(term1358354, term1358354.getClass(), "castleRight", term1358355);
        setField(term1358354, term1358354.getClass(), "sideToMove", enum5208);
        setField(term1358354, term1358354.getClass(), "enPassantTarget", enum5209);
        setField(term1358354, term1358354.getClass(), "enPassant", enum5210);
        setField(term1358354, term1358354.getClass(), "moveCounter", term1358461);
        setField(term1358354, term1358354.getClass(), "halfMoveCounter", term1358463);
        setField(term1358465, term1358465.getClass(), "from", enum5211);
        setField(term1358465, term1358465.getClass(), "to", enum5209);
        setField(term1358465, term1358465.getClass(), "promotion", enum5212);
        setField(term1358465, term1358465.getClass(), "san", "wNYtcPFyIe");
        setField(term1358354, term1358354.getClass(), "move", term1358465);
        setField(term1358509, term1358509.getClass(), "from", enum5213);
        setField(term1358509, term1358509.getClass(), "to", enum5214);
        setField(term1358509, term1358509.getClass(), "promotion", enum5215);
        setField(term1358509, term1358509.getClass(), "san", "tlIqgTUSQw");
        setField(term1358354, term1358354.getClass(), "rookCastleMove", term1358509);
        setField(term1358354, term1358354.getClass(), "capturedPiece", enum5216);
        setField(term1358354, term1358354.getClass(), "capturedSquare", enum5217);
        setField(term1358354, term1358354.getClass(), "movingPiece", enum5218);
        setBooleanField(term1358354, term1358354.getClass(), "castleMove", true);
        setBooleanField(term1358354, term1358354.getClass(), "enPassantMove", false);
        setLongField(term1358354, term1358354.getClass(), "incrementalHashKey", 1909175111101717943L);
        setLongField(term1358354, term1358354.getClass(), "incrementalPolyglotKey", 8499930868919012909L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.MoveBackup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCapturedSquare", argTypes, term1358354, args);
    }

};


