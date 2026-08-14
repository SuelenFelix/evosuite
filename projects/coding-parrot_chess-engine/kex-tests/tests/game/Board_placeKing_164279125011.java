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

public class Board_placeKing_164279125011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6469;
     Object term6554;
     Object term6556;
     Object enum54;

    public Board_placeKing_164279125011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6470 = new HashMap();
        HashMap term6475 = new HashMap();
        HashMap term6495 = new HashMap();
        HashMap term6500 = new HashMap();
        ArrayList term6505 = new ArrayList();
        Class<? extends Object> term6569 = Class.forName((String) "commons.Color");
        Field term6568 = ((Class) term6569).getDeclaredField((String) "BLACK");
        ((Field) term6568).setAccessible(true);
        enum54 = ((Field) term6568).get((Object) null);
        Class<? extends Object> term6656 = Class.forName((String) "commons.Color");
        Field term6655 = ((Class) term6656).getDeclaredField((String) "WHITE");
        ((Field) term6655).setAccessible(true);
        Object enum55 = ((Field) term6655).get((Object) null);
        Class<? extends Object> term6743 = Class.forName((String) "pieces.PieceType");
        Field term6742 = ((Class) term6743).getDeclaredField((String) "ROOK");
        ((Field) term6742).setAccessible(true);
        Object enum56 = ((Field) term6742).get((Object) null);
        Class<? extends Object> term6842 = Class.forName((String) "pieces.PieceType");
        Field term6841 = ((Class) term6842).getDeclaredField((String) "ROOK");
        ((Field) term6841).setAccessible(true);
        Object enum57 = ((Field) term6841).get((Object) null);
        term6469 = newInstance(Class.forName("game.Board"));
        long[] term6509 = (long[]) newLongArray(6);
        Object[] term6517 = (Object[]) newArray("[Z", 2);
        boolean[] term6518 = (boolean[]) newBooleanArray(2);
        boolean[] term6521 = (boolean[]) newBooleanArray(2);
        Object term6529 = newInstance(Class.forName("game.Move"));
        Object term6530 = newInstance(Class.forName("commons.Piece"));
        Object term6531 = newInstance(Class.forName("game.Cell"));
        Object term6537 = newInstance(Class.forName("game.Cell"));
        Object term6541 = newInstance(Class.forName("game.Cell"));
        Object[] term6553 = (Object[]) newArray("commons.Piece", 2);
        setField(term6469, term6469.getClass(), "pieces", term6470);
        setField(term6469, term6469.getClass(), "playerPieces", term6475);
        setField(term6469, term6469.getClass(), "moves", term6495);
        setField(term6469, term6469.getClass(), "guards", term6500);
        setField(term6469, term6469.getClass(), "moveList", term6505);
        setField(term6469, term6469.getClass(), "positions", term6509);
        setIntField(term6469, term6469.getClass(), "positionIndex", 229204365);
        setBooleanElement(term6518, 0, true);
        setBooleanElement(term6518, 1, true);
        setElement(term6517, 0, term6518);
        setBooleanElement(term6521, 0, true);
        setBooleanElement(term6521, 1, true);
        setElement(term6517, 1, term6521);
        setField(term6469, term6469.getClass(), "canCastle", term6517);
        setLongField(term6469, term6469.getClass(), "zobristHash", 6967924379644551255L);
        setField(term6469, term6469.getClass(), "playerToMove", enum54);
        setBooleanField(term6469, term6469.getClass(), "isThreeFoldRepetition", false);
        setIntField(term6469, term6469.getClass(), "halfMoves", -461771056);
        setBooleanField(term6469, term6469.getClass(), "fiftyMoveDraw", true);
        setBooleanField(term6469, term6469.getClass(), "inCheck", true);
        setField(term6530, term6530.getClass(), "color", enum55);
        setIntField(term6531, term6531.getClass(), "row", -243422082);
        setIntField(term6531, term6531.getClass(), "col", 1384592638);
        setField(term6530, term6530.getClass(), "position", term6531);
        setField(term6530, term6530.getClass(), "pieceType", enum56);
        setField(term6529, term6529.getClass(), "piece", term6530);
        setIntField(term6537, term6537.getClass(), "row", -1002370457);
        setIntField(term6537, term6537.getClass(), "col", -2014576105);
        setField(term6529, term6529.getClass(), "target", term6537);
        setBooleanField(term6529, term6529.getClass(), "captureMove", true);
        setIntField(term6541, term6541.getClass(), "row", 1296895584);
        setIntField(term6541, term6541.getClass(), "col", 628918458);
        setField(term6529, term6529.getClass(), "captureCell", term6541);
        setField(term6529, term6529.getClass(), "promoteTo", enum57);
        setIntField(term6529, term6529.getClass(), "id", -1274456137);
        setField(term6469, term6469.getClass(), "previousMove", term6529);
        setField(term6469, term6469.getClass(), "kings", term6553);
        term6554 = new Integer(1041916673);
        term6556 = new Integer(-601863069);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("commons.Color");
        Object[] args = new Object[3];
        args[0] = term6554;
        args[1] = term6556;
        args[2] = enum54;
        callMethod(klass, "placeKing", argTypes, term6469, args);
    }

};


