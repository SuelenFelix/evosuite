package pieces;

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
import static pieces.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class Queen_getMoveList_11344261661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4324;
     Object term4411;

    public Queen_getMoveList_11344261661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4325 = new HashMap();
        HashMap term4330 = new HashMap();
        HashMap term4350 = new HashMap();
        HashMap term4355 = new HashMap();
        ArrayList term4360 = new ArrayList();
        Class<? extends Object> term4426 = Class.forName((String) "commons.Color");
        Field term4425 = ((Class) term4426).getDeclaredField((String) "BLACK");
        ((Field) term4425).setAccessible(true);
        Object enum35 = ((Field) term4425).get((Object) null);
        Class<? extends Object> term4513 = Class.forName((String) "commons.Color");
        Field term4512 = ((Class) term4513).getDeclaredField((String) "BLACK");
        ((Field) term4512).setAccessible(true);
        Object enum36 = ((Field) term4512).get((Object) null);
        Class<? extends Object> term4600 = Class.forName((String) "pieces.PieceType");
        Field term4599 = ((Class) term4600).getDeclaredField((String) "PAWN");
        ((Field) term4599).setAccessible(true);
        Object enum37 = ((Field) term4599).get((Object) null);
        Class<? extends Object> term4699 = Class.forName((String) "pieces.PieceType");
        Field term4698 = ((Class) term4699).getDeclaredField((String) "KNIGHT");
        ((Field) term4698).setAccessible(true);
        Object enum38 = ((Field) term4698).get((Object) null);
        term4324 = newInstance(Class.forName("game.Board"));
        long[] term4364 = (long[]) newLongArray(6);
        Object[] term4372 = (Object[]) newArray("[Z", 2);
        boolean[] term4373 = (boolean[]) newBooleanArray(2);
        boolean[] term4376 = (boolean[]) newBooleanArray(2);
        Object term4384 = newInstance(Class.forName("game.Move"));
        Object term4385 = newInstance(Class.forName("commons.Piece"));
        Object term4386 = newInstance(Class.forName("game.Cell"));
        Object term4392 = newInstance(Class.forName("game.Cell"));
        Object term4396 = newInstance(Class.forName("game.Cell"));
        Object[] term4410 = (Object[]) newArray("commons.Piece", 2);
        setField(term4324, term4324.getClass(), "pieces", term4325);
        setField(term4324, term4324.getClass(), "playerPieces", term4330);
        setField(term4324, term4324.getClass(), "moves", term4350);
        setField(term4324, term4324.getClass(), "guards", term4355);
        setField(term4324, term4324.getClass(), "moveList", term4360);
        setField(term4324, term4324.getClass(), "positions", term4364);
        setIntField(term4324, term4324.getClass(), "positionIndex", -1388471422);
        setBooleanElement(term4373, 0, true);
        setBooleanElement(term4373, 1, true);
        setElement(term4372, 0, term4373);
        setBooleanElement(term4376, 0, true);
        setBooleanElement(term4376, 1, true);
        setElement(term4372, 1, term4376);
        setField(term4324, term4324.getClass(), "canCastle", term4372);
        setLongField(term4324, term4324.getClass(), "zobristHash", 6811161968424632369L);
        setField(term4324, term4324.getClass(), "playerToMove", enum35);
        setBooleanField(term4324, term4324.getClass(), "isThreeFoldRepetition", true);
        setIntField(term4324, term4324.getClass(), "halfMoves", -1498296052);
        setBooleanField(term4324, term4324.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term4324, term4324.getClass(), "inCheck", false);
        setField(term4385, term4385.getClass(), "color", enum36);
        setIntField(term4386, term4386.getClass(), "row", 2098647989);
        setIntField(term4386, term4386.getClass(), "col", 1598895173);
        setField(term4385, term4385.getClass(), "position", term4386);
        setField(term4385, term4385.getClass(), "pieceType", enum37);
        setField(term4384, term4384.getClass(), "piece", term4385);
        setIntField(term4392, term4392.getClass(), "row", 1830648570);
        setIntField(term4392, term4392.getClass(), "col", -227365013);
        setField(term4384, term4384.getClass(), "target", term4392);
        setBooleanField(term4384, term4384.getClass(), "captureMove", false);
        setIntField(term4396, term4396.getClass(), "row", 11724947);
        setIntField(term4396, term4396.getClass(), "col", 1953277050);
        setField(term4384, term4384.getClass(), "captureCell", term4396);
        setField(term4384, term4384.getClass(), "promoteTo", enum38);
        setIntField(term4384, term4384.getClass(), "id", 1283079251);
        setField(term4324, term4324.getClass(), "previousMove", term4384);
        setField(term4324, term4324.getClass(), "kings", term4410);
        term4411 = newInstance(Class.forName("commons.Piece"));
        Object term4412 = newInstance(Class.forName("game.Cell"));
        setField(term4411, term4411.getClass(), "color", enum35);
        setIntField(term4412, term4412.getClass(), "row", -523949691);
        setIntField(term4412, term4412.getClass(), "col", 1398204340);
        setField(term4411, term4411.getClass(), "position", term4412);
        setField(term4411, term4411.getClass(), "pieceType", enum38);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pieces.Queen");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("game.Board");
        argTypes[1] = Class.forName("commons.Piece");
        Object[] args = new Object[2];
        args[0] = term4324;
        args[1] = term4411;
        callMethod(klass, "getMoveList", argTypes, null, args);
    }

};


