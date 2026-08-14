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

public class Board_updateHashForAddition_45422910722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12331;
     Object term12416;

    public Board_updateHashForAddition_45422910722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12332 = new HashMap();
        HashMap term12337 = new HashMap();
        HashMap term12357 = new HashMap();
        HashMap term12362 = new HashMap();
        ArrayList term12367 = new ArrayList();
        Class<? extends Object> term12431 = Class.forName((String) "commons.Color");
        Field term12430 = ((Class) term12431).getDeclaredField((String) "WHITE");
        ((Field) term12430).setAccessible(true);
        Object enum103 = ((Field) term12430).get((Object) null);
        Class<? extends Object> term12518 = Class.forName((String) "pieces.PieceType");
        Field term12517 = ((Class) term12518).getDeclaredField((String) "ROOK");
        ((Field) term12517).setAccessible(true);
        Object enum104 = ((Field) term12517).get((Object) null);
        Class<? extends Object> term12617 = Class.forName((String) "pieces.PieceType");
        Field term12616 = ((Class) term12617).getDeclaredField((String) "PAWN");
        ((Field) term12616).setAccessible(true);
        Object enum105 = ((Field) term12616).get((Object) null);
        term12331 = newInstance(Class.forName("game.Board"));
        long[] term12371 = (long[]) newLongArray(6);
        Object[] term12379 = (Object[]) newArray("[Z", 2);
        boolean[] term12380 = (boolean[]) newBooleanArray(2);
        boolean[] term12383 = (boolean[]) newBooleanArray(2);
        Object term12391 = newInstance(Class.forName("game.Move"));
        Object term12392 = newInstance(Class.forName("commons.Piece"));
        Object term12393 = newInstance(Class.forName("game.Cell"));
        Object term12399 = newInstance(Class.forName("game.Cell"));
        Object term12403 = newInstance(Class.forName("game.Cell"));
        Object[] term12415 = (Object[]) newArray("commons.Piece", 2);
        setField(term12331, term12331.getClass(), "pieces", term12332);
        setField(term12331, term12331.getClass(), "playerPieces", term12337);
        setField(term12331, term12331.getClass(), "moves", term12357);
        setField(term12331, term12331.getClass(), "guards", term12362);
        setField(term12331, term12331.getClass(), "moveList", term12367);
        setField(term12331, term12331.getClass(), "positions", term12371);
        setIntField(term12331, term12331.getClass(), "positionIndex", 1768204942);
        setBooleanElement(term12380, 0, true);
        setBooleanElement(term12380, 1, true);
        setElement(term12379, 0, term12380);
        setBooleanElement(term12383, 0, true);
        setBooleanElement(term12383, 1, true);
        setElement(term12379, 1, term12383);
        setField(term12331, term12331.getClass(), "canCastle", term12379);
        setLongField(term12331, term12331.getClass(), "zobristHash", 8428634514691209827L);
        setField(term12331, term12331.getClass(), "playerToMove", enum103);
        setBooleanField(term12331, term12331.getClass(), "isThreeFoldRepetition", true);
        setIntField(term12331, term12331.getClass(), "halfMoves", 1252951645);
        setBooleanField(term12331, term12331.getClass(), "fiftyMoveDraw", true);
        setBooleanField(term12331, term12331.getClass(), "inCheck", true);
        setField(term12392, term12392.getClass(), "color", enum103);
        setIntField(term12393, term12393.getClass(), "row", 574481092);
        setIntField(term12393, term12393.getClass(), "col", -310528004);
        setField(term12392, term12392.getClass(), "position", term12393);
        setField(term12392, term12392.getClass(), "pieceType", enum104);
        setField(term12391, term12391.getClass(), "piece", term12392);
        setIntField(term12399, term12399.getClass(), "row", -634976996);
        setIntField(term12399, term12399.getClass(), "col", -1015274146);
        setField(term12391, term12391.getClass(), "target", term12399);
        setBooleanField(term12391, term12391.getClass(), "captureMove", true);
        setIntField(term12403, term12403.getClass(), "row", -49052672);
        setIntField(term12403, term12403.getClass(), "col", 339372704);
        setField(term12391, term12391.getClass(), "captureCell", term12403);
        setField(term12391, term12391.getClass(), "promoteTo", enum105);
        setIntField(term12391, term12391.getClass(), "id", -851097944);
        setField(term12331, term12331.getClass(), "previousMove", term12391);
        setField(term12331, term12331.getClass(), "kings", term12415);
        Class<? extends Object> term12716 = Class.forName((String) "commons.Color");
        Field term12715 = ((Class) term12716).getDeclaredField((String) "BLACK");
        ((Field) term12715).setAccessible(true);
        Object enum106 = ((Field) term12715).get((Object) null);
        term12416 = newInstance(Class.forName("commons.Piece"));
        Object term12417 = newInstance(Class.forName("game.Cell"));
        setField(term12416, term12416.getClass(), "color", enum106);
        setIntField(term12417, term12417.getClass(), "row", 803925431);
        setIntField(term12417, term12417.getClass(), "col", 76929641);
        setField(term12416, term12416.getClass(), "position", term12417);
        setField(term12416, term12416.getClass(), "pieceType", enum105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("commons.Piece");
        Object[] args = new Object[1];
        args[0] = term12416;
        callMethod(klass, "updateHashForAddition", argTypes, term12331, args);
    }

};


