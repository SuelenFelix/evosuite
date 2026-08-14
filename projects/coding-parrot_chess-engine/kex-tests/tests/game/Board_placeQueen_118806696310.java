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
import java.lang.Integer;

public class Board_placeQueen_118806696310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5995;
     Object term6080;
     Object term6082;
     Object enum51;

    public Board_placeQueen_118806696310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5996 = new HashMap();
        HashMap term6001 = new HashMap();
        HashMap term6021 = new HashMap();
        HashMap term6026 = new HashMap();
        ArrayList term6031 = new ArrayList();
        Class<? extends Object> term6095 = Class.forName((String) "commons.Color");
        Field term6094 = ((Class) term6095).getDeclaredField((String) "BLACK");
        ((Field) term6094).setAccessible(true);
        Object enum50 = ((Field) term6094).get((Object) null);
        Class<? extends Object> term6182 = Class.forName((String) "commons.Color");
        Field term6181 = ((Class) term6182).getDeclaredField((String) "BLACK");
        ((Field) term6181).setAccessible(true);
        enum51 = ((Field) term6181).get((Object) null);
        Class<? extends Object> term6269 = Class.forName((String) "pieces.PieceType");
        Field term6268 = ((Class) term6269).getDeclaredField((String) "QUEEN");
        ((Field) term6268).setAccessible(true);
        Object enum52 = ((Field) term6268).get((Object) null);
        Class<? extends Object> term6371 = Class.forName((String) "pieces.PieceType");
        Field term6370 = ((Class) term6371).getDeclaredField((String) "ROOK");
        ((Field) term6370).setAccessible(true);
        Object enum53 = ((Field) term6370).get((Object) null);
        term5995 = newInstance(Class.forName("game.Board"));
        long[] term6035 = (long[]) newLongArray(6);
        Object[] term6043 = (Object[]) newArray("[Z", 2);
        boolean[] term6044 = (boolean[]) newBooleanArray(2);
        boolean[] term6047 = (boolean[]) newBooleanArray(2);
        Object term6055 = newInstance(Class.forName("game.Move"));
        Object term6056 = newInstance(Class.forName("commons.Piece"));
        Object term6057 = newInstance(Class.forName("game.Cell"));
        Object term6063 = newInstance(Class.forName("game.Cell"));
        Object term6067 = newInstance(Class.forName("game.Cell"));
        Object[] term6079 = (Object[]) newArray("commons.Piece", 2);
        setField(term5995, term5995.getClass(), "pieces", term5996);
        setField(term5995, term5995.getClass(), "playerPieces", term6001);
        setField(term5995, term5995.getClass(), "moves", term6021);
        setField(term5995, term5995.getClass(), "guards", term6026);
        setField(term5995, term5995.getClass(), "moveList", term6031);
        setField(term5995, term5995.getClass(), "positions", term6035);
        setIntField(term5995, term5995.getClass(), "positionIndex", -1388471422);
        setBooleanElement(term6044, 0, true);
        setBooleanElement(term6044, 1, true);
        setElement(term6043, 0, term6044);
        setBooleanElement(term6047, 0, true);
        setBooleanElement(term6047, 1, true);
        setElement(term6043, 1, term6047);
        setField(term5995, term5995.getClass(), "canCastle", term6043);
        setLongField(term5995, term5995.getClass(), "zobristHash", -7237588299778557629L);
        setField(term5995, term5995.getClass(), "playerToMove", enum50);
        setBooleanField(term5995, term5995.getClass(), "isThreeFoldRepetition", false);
        setIntField(term5995, term5995.getClass(), "halfMoves", -1498296052);
        setBooleanField(term5995, term5995.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term5995, term5995.getClass(), "inCheck", true);
        setField(term6056, term6056.getClass(), "color", enum51);
        setIntField(term6057, term6057.getClass(), "row", 2098647989);
        setIntField(term6057, term6057.getClass(), "col", 1598895173);
        setField(term6056, term6056.getClass(), "position", term6057);
        setField(term6056, term6056.getClass(), "pieceType", enum52);
        setField(term6055, term6055.getClass(), "piece", term6056);
        setIntField(term6063, term6063.getClass(), "row", 1830648570);
        setIntField(term6063, term6063.getClass(), "col", -227365013);
        setField(term6055, term6055.getClass(), "target", term6063);
        setBooleanField(term6055, term6055.getClass(), "captureMove", true);
        setIntField(term6067, term6067.getClass(), "row", 11724947);
        setIntField(term6067, term6067.getClass(), "col", 1953277050);
        setField(term6055, term6055.getClass(), "captureCell", term6067);
        setField(term6055, term6055.getClass(), "promoteTo", enum53);
        setIntField(term6055, term6055.getClass(), "id", 1283079251);
        setField(term5995, term5995.getClass(), "previousMove", term6055);
        setField(term5995, term5995.getClass(), "kings", term6079);
        term6080 = new Integer(-523949691);
        term6082 = new Integer(1398204340);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("commons.Color");
        Object[] args = new Object[3];
        args[0] = term6080;
        args[1] = term6082;
        args[2] = enum51;
        callMethod(klass, "placeQueen", argTypes, term5995, args);
    }

};


