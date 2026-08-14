package game;

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
import static game.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class Board_postMoveUpdates_188291415336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19257;
     Object term19342;

    public Board_postMoveUpdates_188291415336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term19258 = new HashMap();
        HashMap term19263 = new HashMap();
        HashMap term19283 = new HashMap();
        HashMap term19288 = new HashMap();
        ArrayList term19293 = new ArrayList();
        Class<? extends Object> term19384 = Class.forName((String) "commons.Color");
        Field term19383 = ((Class) term19384).getDeclaredField((String) "WHITE");
        ((Field) term19383).setAccessible(true);
        Object enum160 = ((Field) term19383).get((Object) null);
        Class<? extends Object> term19471 = Class.forName((String) "pieces.PieceType");
        Field term19470 = ((Class) term19471).getDeclaredField((String) "KING");
        ((Field) term19470).setAccessible(true);
        Object enum161 = ((Field) term19470).get((Object) null);
        Class<? extends Object> term19570 = Class.forName((String) "pieces.PieceType");
        Field term19569 = ((Class) term19570).getDeclaredField((String) "ROOK");
        ((Field) term19569).setAccessible(true);
        Object enum162 = ((Field) term19569).get((Object) null);
        term19257 = newInstance(Class.forName("game.Board"));
        long[] term19297 = (long[]) newLongArray(6);
        Object[] term19305 = (Object[]) newArray("[Z", 2);
        boolean[] term19306 = (boolean[]) newBooleanArray(2);
        boolean[] term19309 = (boolean[]) newBooleanArray(2);
        Object term19317 = newInstance(Class.forName("game.Move"));
        Object term19318 = newInstance(Class.forName("commons.Piece"));
        Object term19319 = newInstance(Class.forName("game.Cell"));
        Object term19325 = newInstance(Class.forName("game.Cell"));
        Object term19329 = newInstance(Class.forName("game.Cell"));
        Object[] term19341 = (Object[]) newArray("commons.Piece", 2);
        setField(term19257, term19257.getClass(), "pieces", term19258);
        setField(term19257, term19257.getClass(), "playerPieces", term19263);
        setField(term19257, term19257.getClass(), "moves", term19283);
        setField(term19257, term19257.getClass(), "guards", term19288);
        setField(term19257, term19257.getClass(), "moveList", term19293);
        setField(term19257, term19257.getClass(), "positions", term19297);
        setIntField(term19257, term19257.getClass(), "positionIndex", -2063365430);
        setBooleanElement(term19306, 0, true);
        setBooleanElement(term19306, 1, true);
        setElement(term19305, 0, term19306);
        setBooleanElement(term19309, 0, true);
        setBooleanElement(term19309, 1, true);
        setElement(term19305, 1, term19309);
        setField(term19257, term19257.getClass(), "canCastle", term19305);
        setLongField(term19257, term19257.getClass(), "zobristHash", -484994522244390100L);
        setField(term19257, term19257.getClass(), "playerToMove", enum160);
        setBooleanField(term19257, term19257.getClass(), "isThreeFoldRepetition", true);
        setIntField(term19257, term19257.getClass(), "halfMoves", 812570053);
        setBooleanField(term19257, term19257.getClass(), "fiftyMoveDraw", true);
        setBooleanField(term19257, term19257.getClass(), "inCheck", false);
        setField(term19318, term19318.getClass(), "color", enum160);
        setIntField(term19319, term19319.getClass(), "row", -1488938905);
        setIntField(term19319, term19319.getClass(), "col", 1916544127);
        setField(term19318, term19318.getClass(), "position", term19319);
        setField(term19318, term19318.getClass(), "pieceType", enum161);
        setField(term19317, term19317.getClass(), "piece", term19318);
        setIntField(term19325, term19325.getClass(), "row", -1133405894);
        setIntField(term19325, term19325.getClass(), "col", 1289741214);
        setField(term19317, term19317.getClass(), "target", term19325);
        setBooleanField(term19317, term19317.getClass(), "captureMove", true);
        setIntField(term19329, term19329.getClass(), "row", 243280944);
        setIntField(term19329, term19329.getClass(), "col", -726681073);
        setField(term19317, term19317.getClass(), "captureCell", term19329);
        setField(term19317, term19317.getClass(), "promoteTo", enum162);
        setIntField(term19317, term19317.getClass(), "id", -1724487863);
        setField(term19257, term19257.getClass(), "previousMove", term19317);
        setField(term19257, term19257.getClass(), "kings", term19341);
        Class<? extends Object> term19669 = Class.forName((String) "pieces.PieceType");
        Field term19668 = ((Class) term19669).getDeclaredField((String) "PAWN");
        ((Field) term19668).setAccessible(true);
        Object enum163 = ((Field) term19668).get((Object) null);
        Class<? extends Object> term19768 = Class.forName((String) "pieces.PieceType");
        Field term19767 = ((Class) term19768).getDeclaredField((String) "BISHOP");
        ((Field) term19767).setAccessible(true);
        Object enum164 = ((Field) term19767).get((Object) null);
        term19342 = newInstance(Class.forName("game.Move"));
        Object term19343 = newInstance(Class.forName("commons.Piece"));
        Object term19344 = newInstance(Class.forName("game.Cell"));
        Object term19355 = newInstance(Class.forName("game.Cell"));
        Object term19359 = newInstance(Class.forName("game.Cell"));
        setField(term19343, term19343.getClass(), "color", enum160);
        setIntField(term19344, term19344.getClass(), "row", -128490829);
        setIntField(term19344, term19344.getClass(), "col", 202214133);
        setField(term19343, term19343.getClass(), "position", term19344);
        setField(term19343, term19343.getClass(), "pieceType", enum163);
        setField(term19342, term19342.getClass(), "piece", term19343);
        setIntField(term19355, term19355.getClass(), "row", 1543091617);
        setIntField(term19355, term19355.getClass(), "col", -763166094);
        setField(term19342, term19342.getClass(), "target", term19355);
        setBooleanField(term19342, term19342.getClass(), "captureMove", true);
        setIntField(term19359, term19359.getClass(), "row", -222941705);
        setIntField(term19359, term19359.getClass(), "col", 291864719);
        setField(term19342, term19342.getClass(), "captureCell", term19359);
        setField(term19342, term19342.getClass(), "promoteTo", enum164);
        setIntField(term19342, term19342.getClass(), "id", -1549607466);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("game.Move");
        Object[] args = new Object[1];
        args[0] = term19342;
        callMethod(klass, "postMoveUpdates", argTypes, term19257, args);
    }

};


