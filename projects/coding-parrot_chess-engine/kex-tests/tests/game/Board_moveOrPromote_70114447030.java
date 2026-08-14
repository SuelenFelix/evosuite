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

public class Board_moveOrPromote_70114447030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16339;
     Object term16416;

    public Board_moveOrPromote_70114447030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term16340 = new HashMap();
        HashMap term16345 = new HashMap();
        HashMap term16365 = new HashMap();
        HashMap term16370 = new HashMap();
        ArrayList term16375 = new ArrayList();
        Class<? extends Object> term16458 = Class.forName((String) "commons.Color");
        Field term16457 = ((Class) term16458).getDeclaredField((String) "WHITE");
        ((Field) term16457).setAccessible(true);
        Object enum136 = ((Field) term16457).get((Object) null);
        Class<? extends Object> term16545 = Class.forName((String) "pieces.PieceType");
        Field term16544 = ((Class) term16545).getDeclaredField((String) "ROOK");
        ((Field) term16544).setAccessible(true);
        Object enum137 = ((Field) term16544).get((Object) null);
        term16339 = newInstance(Class.forName("game.Board"));
        long[] term16379 = (long[]) newLongArray(6);
        Object[] term16387 = (Object[]) newArray("[Z", 2);
        boolean[] term16388 = (boolean[]) newBooleanArray(2);
        boolean[] term16391 = (boolean[]) newBooleanArray(2);
        Object term16399 = newInstance(Class.forName("game.Move"));
        Object term16400 = newInstance(Class.forName("commons.Piece"));
        Object term16401 = newInstance(Class.forName("game.Cell"));
        Object term16407 = newInstance(Class.forName("game.Cell"));
        Object term16411 = newInstance(Class.forName("game.Cell"));
        Object[] term16415 = (Object[]) newArray("commons.Piece", 2);
        setField(term16339, term16339.getClass(), "pieces", term16340);
        setField(term16339, term16339.getClass(), "playerPieces", term16345);
        setField(term16339, term16339.getClass(), "moves", term16365);
        setField(term16339, term16339.getClass(), "guards", term16370);
        setField(term16339, term16339.getClass(), "moveList", term16375);
        setField(term16339, term16339.getClass(), "positions", term16379);
        setIntField(term16339, term16339.getClass(), "positionIndex", -544382127);
        setBooleanElement(term16388, 0, true);
        setBooleanElement(term16388, 1, true);
        setElement(term16387, 0, term16388);
        setBooleanElement(term16391, 0, true);
        setBooleanElement(term16391, 1, true);
        setElement(term16387, 1, term16391);
        setField(term16339, term16339.getClass(), "canCastle", term16387);
        setLongField(term16339, term16339.getClass(), "zobristHash", 1967728129628047933L);
        setField(term16339, term16339.getClass(), "playerToMove", enum136);
        setBooleanField(term16339, term16339.getClass(), "isThreeFoldRepetition", false);
        setIntField(term16339, term16339.getClass(), "halfMoves", -1830198043);
        setBooleanField(term16339, term16339.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term16339, term16339.getClass(), "inCheck", true);
        setField(term16400, term16400.getClass(), "color", enum136);
        setIntField(term16401, term16401.getClass(), "row", -439048495);
        setIntField(term16401, term16401.getClass(), "col", -1849105286);
        setField(term16400, term16400.getClass(), "position", term16401);
        setField(term16400, term16400.getClass(), "pieceType", enum137);
        setField(term16399, term16399.getClass(), "piece", term16400);
        setIntField(term16407, term16407.getClass(), "row", 1334483645);
        setIntField(term16407, term16407.getClass(), "col", 917513193);
        setField(term16399, term16399.getClass(), "target", term16407);
        setBooleanField(term16399, term16399.getClass(), "captureMove", false);
        setIntField(term16411, term16411.getClass(), "row", 787278105);
        setIntField(term16411, term16411.getClass(), "col", -2063843486);
        setField(term16399, term16399.getClass(), "captureCell", term16411);
        setField(term16399, term16399.getClass(), "promoteTo", enum137);
        setIntField(term16399, term16399.getClass(), "id", 833762980);
        setField(term16339, term16339.getClass(), "previousMove", term16399);
        setField(term16339, term16339.getClass(), "kings", term16415);
        Class<? extends Object> term16644 = Class.forName((String) "pieces.PieceType");
        Field term16643 = ((Class) term16644).getDeclaredField((String) "BISHOP");
        ((Field) term16643).setAccessible(true);
        Object enum138 = ((Field) term16643).get((Object) null);
        Class<? extends Object> term16749 = Class.forName((String) "pieces.PieceType");
        Field term16748 = ((Class) term16749).getDeclaredField((String) "ROOK");
        ((Field) term16748).setAccessible(true);
        Object enum139 = ((Field) term16748).get((Object) null);
        term16416 = newInstance(Class.forName("game.Move"));
        Object term16417 = newInstance(Class.forName("commons.Piece"));
        Object term16418 = newInstance(Class.forName("game.Cell"));
        Object term16431 = newInstance(Class.forName("game.Cell"));
        Object term16435 = newInstance(Class.forName("game.Cell"));
        setField(term16417, term16417.getClass(), "color", enum136);
        setIntField(term16418, term16418.getClass(), "row", 320711637);
        setIntField(term16418, term16418.getClass(), "col", 1241164745);
        setField(term16417, term16417.getClass(), "position", term16418);
        setField(term16417, term16417.getClass(), "pieceType", enum138);
        setField(term16416, term16416.getClass(), "piece", term16417);
        setIntField(term16431, term16431.getClass(), "row", 1723148410);
        setIntField(term16431, term16431.getClass(), "col", -920797484);
        setField(term16416, term16416.getClass(), "target", term16431);
        setBooleanField(term16416, term16416.getClass(), "captureMove", false);
        setIntField(term16435, term16435.getClass(), "row", -1631697577);
        setIntField(term16435, term16435.getClass(), "col", 765731371);
        setField(term16416, term16416.getClass(), "captureCell", term16435);
        setField(term16416, term16416.getClass(), "promoteTo", enum139);
        setIntField(term16416, term16416.getClass(), "id", -1703035419);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("game.Move");
        Object[] args = new Object[1];
        args[0] = term16416;
        callMethod(klass, "moveOrPromote", argTypes, term16339, args);
    }

};


