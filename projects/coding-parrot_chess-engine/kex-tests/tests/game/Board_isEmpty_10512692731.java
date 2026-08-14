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

public class Board_isEmpty_10512692731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2558;
     Object term2645;
     Object term2647;

    public Board_isEmpty_10512692731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2559 = new HashMap();
        HashMap term2564 = new HashMap();
        HashMap term2584 = new HashMap();
        HashMap term2589 = new HashMap();
        ArrayList term2594 = new ArrayList();
        Class<? extends Object> term2660 = Class.forName((String) "commons.Color");
        Field term2659 = ((Class) term2660).getDeclaredField((String) "WHITE");
        ((Field) term2659).setAccessible(true);
        Object enum22 = ((Field) term2659).get((Object) null);
        Class<? extends Object> term2747 = Class.forName((String) "commons.Color");
        Field term2746 = ((Class) term2747).getDeclaredField((String) "WHITE");
        ((Field) term2746).setAccessible(true);
        Object enum23 = ((Field) term2746).get((Object) null);
        Class<? extends Object> term2834 = Class.forName((String) "pieces.PieceType");
        Field term2833 = ((Class) term2834).getDeclaredField((String) "QUEEN");
        ((Field) term2833).setAccessible(true);
        Object enum24 = ((Field) term2833).get((Object) null);
        Class<? extends Object> term2936 = Class.forName((String) "pieces.PieceType");
        Field term2935 = ((Class) term2936).getDeclaredField((String) "KNIGHT");
        ((Field) term2935).setAccessible(true);
        Object enum25 = ((Field) term2935).get((Object) null);
        term2558 = newInstance(Class.forName("game.Board"));
        long[] term2598 = (long[]) newLongArray(6);
        Object[] term2606 = (Object[]) newArray("[Z", 2);
        boolean[] term2607 = (boolean[]) newBooleanArray(2);
        boolean[] term2610 = (boolean[]) newBooleanArray(2);
        Object term2618 = newInstance(Class.forName("game.Move"));
        Object term2619 = newInstance(Class.forName("commons.Piece"));
        Object term2620 = newInstance(Class.forName("game.Cell"));
        Object term2626 = newInstance(Class.forName("game.Cell"));
        Object term2630 = newInstance(Class.forName("game.Cell"));
        Object[] term2644 = (Object[]) newArray("commons.Piece", 2);
        setField(term2558, term2558.getClass(), "pieces", term2559);
        setField(term2558, term2558.getClass(), "playerPieces", term2564);
        setField(term2558, term2558.getClass(), "moves", term2584);
        setField(term2558, term2558.getClass(), "guards", term2589);
        setField(term2558, term2558.getClass(), "moveList", term2594);
        setField(term2558, term2558.getClass(), "positions", term2598);
        setIntField(term2558, term2558.getClass(), "positionIndex", 1225272962);
        setBooleanElement(term2607, 0, true);
        setBooleanElement(term2607, 1, true);
        setElement(term2606, 0, term2607);
        setBooleanElement(term2610, 0, true);
        setBooleanElement(term2610, 1, true);
        setElement(term2606, 1, term2610);
        setField(term2558, term2558.getClass(), "canCastle", term2606);
        setLongField(term2558, term2558.getClass(), "zobristHash", 2442117782898005296L);
        setField(term2558, term2558.getClass(), "playerToMove", enum22);
        setBooleanField(term2558, term2558.getClass(), "isThreeFoldRepetition", false);
        setIntField(term2558, term2558.getClass(), "halfMoves", 1324040357);
        setBooleanField(term2558, term2558.getClass(), "fiftyMoveDraw", true);
        setBooleanField(term2558, term2558.getClass(), "inCheck", false);
        setField(term2619, term2619.getClass(), "color", enum23);
        setIntField(term2620, term2620.getClass(), "row", -1588772968);
        setIntField(term2620, term2620.getClass(), "col", -93135961);
        setField(term2619, term2619.getClass(), "position", term2620);
        setField(term2619, term2619.getClass(), "pieceType", enum24);
        setField(term2618, term2618.getClass(), "piece", term2619);
        setIntField(term2626, term2626.getClass(), "row", -112921587);
        setIntField(term2626, term2626.getClass(), "col", 933028652);
        setField(term2618, term2618.getClass(), "target", term2626);
        setBooleanField(term2618, term2618.getClass(), "captureMove", true);
        setIntField(term2630, term2630.getClass(), "row", 287287233);
        setIntField(term2630, term2630.getClass(), "col", 962840079);
        setField(term2618, term2618.getClass(), "captureCell", term2630);
        setField(term2618, term2618.getClass(), "promoteTo", enum25);
        setIntField(term2618, term2618.getClass(), "id", 1540719661);
        setField(term2558, term2558.getClass(), "previousMove", term2618);
        setField(term2558, term2558.getClass(), "kings", term2644);
        term2645 = new Integer(1265463001);
        term2647 = new Integer(335112684);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2645;
        args[1] = term2647;
        callMethod(klass, "isEmpty", argTypes, term2558, args);
    }

};


