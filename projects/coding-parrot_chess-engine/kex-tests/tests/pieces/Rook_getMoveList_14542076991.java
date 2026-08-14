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

public class Rook_getMoveList_14542076991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term582;
     Object term667;

    public Rook_getMoveList_14542076991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term583 = new HashMap();
        HashMap term588 = new HashMap();
        HashMap term608 = new HashMap();
        HashMap term613 = new HashMap();
        ArrayList term618 = new ArrayList();
        Class<? extends Object> term692 = Class.forName((String) "commons.Color");
        Field term691 = ((Class) term692).getDeclaredField((String) "WHITE");
        ((Field) term691).setAccessible(true);
        Object enum4 = ((Field) term691).get((Object) null);
        Class<? extends Object> term779 = Class.forName((String) "pieces.PieceType");
        Field term778 = ((Class) term779).getDeclaredField((String) "KING");
        ((Field) term778).setAccessible(true);
        Object enum5 = ((Field) term778).get((Object) null);
        Class<? extends Object> term878 = Class.forName((String) "pieces.PieceType");
        Field term877 = ((Class) term878).getDeclaredField((String) "ROOK");
        ((Field) term877).setAccessible(true);
        Object enum6 = ((Field) term877).get((Object) null);
        term582 = newInstance(Class.forName("game.Board"));
        long[] term622 = (long[]) newLongArray(6);
        Object[] term630 = (Object[]) newArray("[Z", 2);
        boolean[] term631 = (boolean[]) newBooleanArray(2);
        boolean[] term634 = (boolean[]) newBooleanArray(2);
        Object term642 = newInstance(Class.forName("game.Move"));
        Object term643 = newInstance(Class.forName("commons.Piece"));
        Object term644 = newInstance(Class.forName("game.Cell"));
        Object term650 = newInstance(Class.forName("game.Cell"));
        Object term654 = newInstance(Class.forName("game.Cell"));
        Object[] term666 = (Object[]) newArray("commons.Piece", 2);
        setField(term582, term582.getClass(), "pieces", term583);
        setField(term582, term582.getClass(), "playerPieces", term588);
        setField(term582, term582.getClass(), "moves", term608);
        setField(term582, term582.getClass(), "guards", term613);
        setField(term582, term582.getClass(), "moveList", term618);
        setField(term582, term582.getClass(), "positions", term622);
        setIntField(term582, term582.getClass(), "positionIndex", 1134449235);
        setBooleanElement(term631, 0, true);
        setBooleanElement(term631, 1, true);
        setElement(term630, 0, term631);
        setBooleanElement(term634, 0, true);
        setBooleanElement(term634, 1, true);
        setElement(term630, 1, term634);
        setField(term582, term582.getClass(), "canCastle", term630);
        setLongField(term582, term582.getClass(), "zobristHash", 6375119433582206027L);
        setField(term582, term582.getClass(), "playerToMove", enum4);
        setBooleanField(term582, term582.getClass(), "isThreeFoldRepetition", true);
        setIntField(term582, term582.getClass(), "halfMoves", -883034806);
        setBooleanField(term582, term582.getClass(), "fiftyMoveDraw", true);
        setBooleanField(term582, term582.getClass(), "inCheck", true);
        setField(term643, term643.getClass(), "color", enum4);
        setIntField(term644, term644.getClass(), "row", 1585847225);
        setIntField(term644, term644.getClass(), "col", 597278769);
        setField(term643, term643.getClass(), "position", term644);
        setField(term643, term643.getClass(), "pieceType", enum5);
        setField(term642, term642.getClass(), "piece", term643);
        setIntField(term650, term650.getClass(), "row", -1685132342);
        setIntField(term650, term650.getClass(), "col", -1456670397);
        setField(term642, term642.getClass(), "target", term650);
        setBooleanField(term642, term642.getClass(), "captureMove", true);
        setIntField(term654, term654.getClass(), "row", 1622346318);
        setIntField(term654, term654.getClass(), "col", 1048535127);
        setField(term642, term642.getClass(), "captureCell", term654);
        setField(term642, term642.getClass(), "promoteTo", enum6);
        setIntField(term642, term642.getClass(), "id", -655067527);
        setField(term582, term582.getClass(), "previousMove", term642);
        setField(term582, term582.getClass(), "kings", term666);
        Class<? extends Object> term977 = Class.forName((String) "pieces.PieceType");
        Field term976 = ((Class) term977).getDeclaredField((String) "KNIGHT");
        ((Field) term976).setAccessible(true);
        Object enum7 = ((Field) term976).get((Object) null);
        term667 = newInstance(Class.forName("commons.Piece"));
        Object term668 = newInstance(Class.forName("game.Cell"));
        setField(term667, term667.getClass(), "color", enum4);
        setIntField(term668, term668.getClass(), "row", -6029667);
        setIntField(term668, term668.getClass(), "col", -2068769794);
        setField(term667, term667.getClass(), "position", term668);
        setField(term667, term667.getClass(), "pieceType", enum7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pieces.Rook");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("game.Board");
        argTypes[1] = Class.forName("commons.Piece");
        Object[] args = new Object[2];
        args[0] = term582;
        args[1] = term667;
        callMethod(klass, "getMoveList", argTypes, null, args);
    }

};


