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

public class Board_getMovesWithinPin_19333733415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8279;

    public Board_getMovesWithinPin_19333733415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8280 = new HashMap();
        HashMap term8285 = new HashMap();
        HashMap term8305 = new HashMap();
        HashMap term8310 = new HashMap();
        ArrayList term8315 = new ArrayList();
        Class<? extends Object> term8367 = Class.forName((String) "commons.Color");
        Field term8366 = ((Class) term8367).getDeclaredField((String) "BLACK");
        ((Field) term8366).setAccessible(true);
        Object enum69 = ((Field) term8366).get((Object) null);
        Class<? extends Object> term8454 = Class.forName((String) "commons.Color");
        Field term8453 = ((Class) term8454).getDeclaredField((String) "BLACK");
        ((Field) term8453).setAccessible(true);
        Object enum70 = ((Field) term8453).get((Object) null);
        Class<? extends Object> term8541 = Class.forName((String) "pieces.PieceType");
        Field term8540 = ((Class) term8541).getDeclaredField((String) "PAWN");
        ((Field) term8540).setAccessible(true);
        Object enum71 = ((Field) term8540).get((Object) null);
        term8279 = newInstance(Class.forName("game.Board"));
        long[] term8319 = (long[]) newLongArray(6);
        Object[] term8327 = (Object[]) newArray("[Z", 2);
        boolean[] term8328 = (boolean[]) newBooleanArray(2);
        boolean[] term8331 = (boolean[]) newBooleanArray(2);
        Object term8339 = newInstance(Class.forName("game.Move"));
        Object term8340 = newInstance(Class.forName("commons.Piece"));
        Object term8341 = newInstance(Class.forName("game.Cell"));
        Object term8347 = newInstance(Class.forName("game.Cell"));
        Object term8351 = newInstance(Class.forName("game.Cell"));
        Object[] term8355 = (Object[]) newArray("commons.Piece", 2);
        setField(term8279, term8279.getClass(), "pieces", term8280);
        setField(term8279, term8279.getClass(), "playerPieces", term8285);
        setField(term8279, term8279.getClass(), "moves", term8305);
        setField(term8279, term8279.getClass(), "guards", term8310);
        setField(term8279, term8279.getClass(), "moveList", term8315);
        setField(term8279, term8279.getClass(), "positions", term8319);
        setIntField(term8279, term8279.getClass(), "positionIndex", -1222614956);
        setBooleanElement(term8328, 0, true);
        setBooleanElement(term8328, 1, true);
        setElement(term8327, 0, term8328);
        setBooleanElement(term8331, 0, true);
        setBooleanElement(term8331, 1, true);
        setElement(term8327, 1, term8331);
        setField(term8279, term8279.getClass(), "canCastle", term8327);
        setLongField(term8279, term8279.getClass(), "zobristHash", 2535595959091595249L);
        setField(term8279, term8279.getClass(), "playerToMove", enum69);
        setBooleanField(term8279, term8279.getClass(), "isThreeFoldRepetition", false);
        setIntField(term8279, term8279.getClass(), "halfMoves", -1870495012);
        setBooleanField(term8279, term8279.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term8279, term8279.getClass(), "inCheck", true);
        setField(term8340, term8340.getClass(), "color", enum70);
        setIntField(term8341, term8341.getClass(), "row", -1310015129);
        setIntField(term8341, term8341.getClass(), "col", -2104981311);
        setField(term8340, term8340.getClass(), "position", term8341);
        setField(term8340, term8340.getClass(), "pieceType", enum71);
        setField(term8339, term8339.getClass(), "piece", term8340);
        setIntField(term8347, term8347.getClass(), "row", -571169753);
        setIntField(term8347, term8347.getClass(), "col", 318591690);
        setField(term8339, term8339.getClass(), "target", term8347);
        setBooleanField(term8339, term8339.getClass(), "captureMove", true);
        setIntField(term8351, term8351.getClass(), "row", -165587447);
        setIntField(term8351, term8351.getClass(), "col", -1347358701);
        setField(term8339, term8339.getClass(), "captureCell", term8351);
        setField(term8339, term8339.getClass(), "promoteTo", enum71);
        setIntField(term8339, term8339.getClass(), "id", 806595993);
        setField(term8279, term8279.getClass(), "previousMove", term8339);
        setField(term8279, term8279.getClass(), "kings", term8355);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map$Entry");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getMovesWithinPin", argTypes, term8279, args);
    }

};


