package commons;

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
import static commons.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayList;

public class Piece_getMoveList_20289895125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1325;
     Object term1346;

    public Piece_getMoveList_20289895125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1422 = Class.forName((String) "commons.Color");
        Field term1421 = ((Class) term1422).getDeclaredField((String) "BLACK");
        ((Field) term1421).setAccessible(true);
        Object enum12 = ((Field) term1421).get((Object) null);
        Class<? extends Object> term1509 = Class.forName((String) "pieces.PieceType");
        Field term1508 = ((Class) term1509).getDeclaredField((String) "KING");
        ((Field) term1508).setAccessible(true);
        Object enum13 = ((Field) term1508).get((Object) null);
        term1325 = newInstance(Class.forName("commons.Piece"));
        Object term1335 = newInstance(Class.forName("game.Cell"));
        setField(term1325, term1325.getClass(), "color", enum12);
        setIntField(term1335, term1335.getClass(), "row", -655067527);
        setIntField(term1335, term1335.getClass(), "col", -6029667);
        setField(term1325, term1325.getClass(), "position", term1335);
        setField(term1325, term1325.getClass(), "pieceType", enum13);
        HashMap term1347 = new HashMap();
        HashMap term1352 = new HashMap();
        HashMap term1370 = new HashMap();
        HashMap term1375 = new HashMap();
        ArrayList term1380 = new ArrayList();
        Class<? extends Object> term1618 = Class.forName((String) "commons.Color");
        Field term1617 = ((Class) term1618).getDeclaredField((String) "BLACK");
        ((Field) term1617).setAccessible(true);
        Object enum14 = ((Field) term1617).get((Object) null);
        Class<? extends Object> term1705 = Class.forName((String) "pieces.PieceType");
        Field term1704 = ((Class) term1705).getDeclaredField((String) "KING");
        ((Field) term1704).setAccessible(true);
        Object enum15 = ((Field) term1704).get((Object) null);
        term1346 = newInstance(Class.forName("game.Board"));
        long[] term1384 = (long[]) newLongArray(6);
        Object[] term1392 = (Object[]) newArray("[Z", 2);
        boolean[] term1393 = (boolean[]) newBooleanArray(2);
        boolean[] term1396 = (boolean[]) newBooleanArray(2);
        Object term1404 = newInstance(Class.forName("game.Move"));
        Object term1405 = newInstance(Class.forName("commons.Piece"));
        Object term1406 = newInstance(Class.forName("game.Cell"));
        Object term1412 = newInstance(Class.forName("game.Cell"));
        Object term1416 = newInstance(Class.forName("game.Cell"));
        Object[] term1420 = (Object[]) newArray("commons.Piece", 2);
        setField(term1346, term1346.getClass(), "pieces", term1347);
        setField(term1346, term1346.getClass(), "playerPieces", term1352);
        setField(term1346, term1346.getClass(), "moves", term1370);
        setField(term1346, term1346.getClass(), "guards", term1375);
        setField(term1346, term1346.getClass(), "moveList", term1380);
        setField(term1346, term1346.getClass(), "positions", term1384);
        setIntField(term1346, term1346.getClass(), "positionIndex", -2068769794);
        setBooleanElement(term1393, 0, true);
        setBooleanElement(term1393, 1, true);
        setElement(term1392, 0, term1393);
        setBooleanElement(term1396, 0, true);
        setBooleanElement(term1396, 1, true);
        setElement(term1392, 1, term1396);
        setField(term1346, term1346.getClass(), "canCastle", term1392);
        setLongField(term1346, term1346.getClass(), "zobristHash", 2442117782898005296L);
        setField(term1346, term1346.getClass(), "playerToMove", enum14);
        setBooleanField(term1346, term1346.getClass(), "isThreeFoldRepetition", false);
        setIntField(term1346, term1346.getClass(), "halfMoves", -117576464);
        setBooleanField(term1346, term1346.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term1346, term1346.getClass(), "inCheck", false);
        setField(term1405, term1405.getClass(), "color", enum12);
        setIntField(term1406, term1406.getClass(), "row", -1007160944);
        setIntField(term1406, term1406.getClass(), "col", 1135664017);
        setField(term1405, term1405.getClass(), "position", term1406);
        setField(term1405, term1405.getClass(), "pieceType", enum15);
        setField(term1404, term1404.getClass(), "piece", term1405);
        setIntField(term1412, term1412.getClass(), "row", 590364439);
        setIntField(term1412, term1412.getClass(), "col", 865208305);
        setField(term1404, term1404.getClass(), "target", term1412);
        setBooleanField(term1404, term1404.getClass(), "captureMove", true);
        setIntField(term1416, term1416.getClass(), "row", -1275173084);
        setIntField(term1416, term1416.getClass(), "col", -244121226);
        setField(term1404, term1404.getClass(), "captureCell", term1416);
        setField(term1404, term1404.getClass(), "promoteTo", enum15);
        setIntField(term1404, term1404.getClass(), "id", -203030934);
        setField(term1346, term1346.getClass(), "previousMove", term1404);
        setField(term1346, term1346.getClass(), "kings", term1420);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("commons.Piece");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("game.Board");
        Object[] args = new Object[1];
        args[0] = term1346;
        callMethod(klass, "getMoveList", argTypes, term1325, args);
    }

};


