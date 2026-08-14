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

public class MoveBackup_setCapturedPiece_163592975820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1354998;
     Object enum5206;

    public MoveBackup_setCapturedPiece_163592975820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1355000 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Class<? extends Object> term1355400 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1355399 = ((Class) term1355400).getDeclaredField((String) "BLACK");
        ((Field) term1355399).setAccessible(true);
        Object enum5193 = ((Field) term1355399).get((Object) null);
        Class<? extends Object> term1355602 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1355601 = ((Class) term1355602).getDeclaredField((String) "BLACK");
        ((Field) term1355601).setAccessible(true);
        Object enum5194 = ((Field) term1355601).get((Object) null);
        Class<? extends Object> term1355804 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1355803 = ((Class) term1355804).getDeclaredField((String) "D3");
        ((Field) term1355803).setAccessible(true);
        Object enum5195 = ((Field) term1355803).get((Object) null);
        Class<? extends Object> term1356007 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1356006 = ((Class) term1356007).getDeclaredField((String) "E5");
        ((Field) term1356006).setAccessible(true);
        Object enum5196 = ((Field) term1356006).get((Object) null);
        Integer term1355105 = new Integer(-75206835);
        Integer term1355107 = new Integer(-1618206977);
        Class<? extends Object> term1356210 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1356209 = ((Class) term1356210).getDeclaredField((String) "H7");
        ((Field) term1356209).setAccessible(true);
        Object enum5197 = ((Field) term1356209).get((Object) null);
        Class<? extends Object> term1356413 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1356412 = ((Class) term1356413).getDeclaredField((String) "B2");
        ((Field) term1356412).setAccessible(true);
        Object enum5198 = ((Field) term1356412).get((Object) null);
        Class<? extends Object> term1356616 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1356615 = ((Class) term1356616).getDeclaredField((String) "WHITE_KNIGHT");
        ((Field) term1356615).setAccessible(true);
        Object enum5199 = ((Field) term1356615).get((Object) null);
        Class<? extends Object> term1356854 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1356853 = ((Class) term1356854).getDeclaredField((String) "B4");
        ((Field) term1356853).setAccessible(true);
        Object enum5200 = ((Field) term1356853).get((Object) null);
        Class<? extends Object> term1357057 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1357056 = ((Class) term1357057).getDeclaredField((String) "F6");
        ((Field) term1357056).setAccessible(true);
        Object enum5201 = ((Field) term1357056).get((Object) null);
        Class<? extends Object> term1357260 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1357259 = ((Class) term1357260).getDeclaredField((String) "WHITE_KING");
        ((Field) term1357259).setAccessible(true);
        Object enum5202 = ((Field) term1357259).get((Object) null);
        Class<? extends Object> term1357492 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1357491 = ((Class) term1357492).getDeclaredField((String) "NONE");
        ((Field) term1357491).setAccessible(true);
        Object enum5203 = ((Field) term1357491).get((Object) null);
        Class<? extends Object> term1357696 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1357695 = ((Class) term1357696).getDeclaredField((String) "D1");
        ((Field) term1357695).setAccessible(true);
        Object enum5204 = ((Field) term1357695).get((Object) null);
        Class<? extends Object> term1357899 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1357898 = ((Class) term1357899).getDeclaredField((String) "BLACK_KNIGHT");
        ((Field) term1357898).setAccessible(true);
        Object enum5205 = ((Field) term1357898).get((Object) null);
        term1354998 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.MoveBackup"));
        Object term1354999 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term1355090 = (Object[]) newArray("com.github.bhlangonijr.chesslib.Side", 2);
        Object[] term1355091 = (Object[]) newArray("java.lang.Object", 2);
        Object term1355109 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        Object term1355161 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term1354999, term1354999.getClass(), "keyType", term1355000);
        setElement(term1355090, 0, enum5193);
        setElement(term1355090, 1, enum5194);
        setField(term1354999, term1354999.getClass(), "keyUniverse", term1355090);
        setField(term1354999, term1354999.getClass(), "vals", term1355091);
        setIntField(term1354999, term1354999.getClass(), "size", 0);
        setField(term1354999, term1354999.getClass(), "entrySet", null);
        setField(term1354999, term1354999.getClass(), "keySet", null);
        setField(term1354999, term1354999.getClass(), "values", null);
        setField(term1354998, term1354998.getClass(), "castleRight", term1354999);
        setField(term1354998, term1354998.getClass(), "sideToMove", enum5193);
        setField(term1354998, term1354998.getClass(), "enPassantTarget", enum5195);
        setField(term1354998, term1354998.getClass(), "enPassant", enum5196);
        setField(term1354998, term1354998.getClass(), "moveCounter", term1355105);
        setField(term1354998, term1354998.getClass(), "halfMoveCounter", term1355107);
        setField(term1355109, term1355109.getClass(), "from", enum5197);
        setField(term1355109, term1355109.getClass(), "to", enum5198);
        setField(term1355109, term1355109.getClass(), "promotion", enum5199);
        setField(term1355109, term1355109.getClass(), "san", "LONFjqAsUp");
        setField(term1354998, term1354998.getClass(), "move", term1355109);
        setField(term1355161, term1355161.getClass(), "from", enum5200);
        setField(term1355161, term1355161.getClass(), "to", enum5201);
        setField(term1355161, term1355161.getClass(), "promotion", enum5202);
        setField(term1355161, term1355161.getClass(), "san", "tAhydlbSMf");
        setField(term1354998, term1354998.getClass(), "rookCastleMove", term1355161);
        setField(term1354998, term1354998.getClass(), "capturedPiece", enum5203);
        setField(term1354998, term1354998.getClass(), "capturedSquare", enum5204);
        setField(term1354998, term1354998.getClass(), "movingPiece", enum5205);
        setBooleanField(term1354998, term1354998.getClass(), "castleMove", true);
        setBooleanField(term1354998, term1354998.getClass(), "enPassantMove", false);
        setLongField(term1354998, term1354998.getClass(), "incrementalHashKey", 6465539339431559532L);
        setLongField(term1354998, term1354998.getClass(), "incrementalPolyglotKey", -5304831679802174866L);
        Class<? extends Object> term1358127 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1358126 = ((Class) term1358127).getDeclaredField((String) "BLACK_BISHOP");
        ((Field) term1358126).setAccessible(true);
        enum5206 = ((Field) term1358126).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.MoveBackup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Piece");
        Object[] args = new Object[1];
        args[0] = enum5206;
        callMethod(klass, "setCapturedPiece", argTypes, term1354998, args);
    }

};


