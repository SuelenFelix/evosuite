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

public class Board_getMoveList_20289895123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3317;
     Object term3403;

    public Board_getMoveList_20289895123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3318 = new HashMap();
        HashMap term3323 = new HashMap();
        HashMap term3343 = new HashMap();
        HashMap term3348 = new HashMap();
        ArrayList term3353 = new ArrayList();
        Class<? extends Object> term3426 = Class.forName((String) "commons.Color");
        Field term3425 = ((Class) term3426).getDeclaredField((String) "BLACK");
        ((Field) term3425).setAccessible(true);
        Object enum28 = ((Field) term3425).get((Object) null);
        Class<? extends Object> term3513 = Class.forName((String) "commons.Color");
        Field term3512 = ((Class) term3513).getDeclaredField((String) "BLACK");
        ((Field) term3512).setAccessible(true);
        Object enum29 = ((Field) term3512).get((Object) null);
        Class<? extends Object> term3600 = Class.forName((String) "pieces.PieceType");
        Field term3599 = ((Class) term3600).getDeclaredField((String) "ROOK");
        ((Field) term3599).setAccessible(true);
        Object enum30 = ((Field) term3599).get((Object) null);
        Class<? extends Object> term3699 = Class.forName((String) "pieces.PieceType");
        Field term3698 = ((Class) term3699).getDeclaredField((String) "QUEEN");
        ((Field) term3698).setAccessible(true);
        Object enum31 = ((Field) term3698).get((Object) null);
        term3317 = newInstance(Class.forName("game.Board"));
        long[] term3357 = (long[]) newLongArray(6);
        Object[] term3365 = (Object[]) newArray("[Z", 2);
        boolean[] term3366 = (boolean[]) newBooleanArray(2);
        boolean[] term3369 = (boolean[]) newBooleanArray(2);
        Object term3377 = newInstance(Class.forName("game.Move"));
        Object term3378 = newInstance(Class.forName("commons.Piece"));
        Object term3379 = newInstance(Class.forName("game.Cell"));
        Object term3385 = newInstance(Class.forName("game.Cell"));
        Object term3389 = newInstance(Class.forName("game.Cell"));
        Object[] term3402 = (Object[]) newArray("commons.Piece", 2);
        setField(term3317, term3317.getClass(), "pieces", term3318);
        setField(term3317, term3317.getClass(), "playerPieces", term3323);
        setField(term3317, term3317.getClass(), "moves", term3343);
        setField(term3317, term3317.getClass(), "guards", term3348);
        setField(term3317, term3317.getClass(), "moveList", term3353);
        setField(term3317, term3317.getClass(), "positions", term3357);
        setIntField(term3317, term3317.getClass(), "positionIndex", -1547384488);
        setBooleanElement(term3366, 0, true);
        setBooleanElement(term3366, 1, true);
        setElement(term3365, 0, term3366);
        setBooleanElement(term3369, 0, true);
        setBooleanElement(term3369, 1, true);
        setElement(term3365, 1, term3369);
        setField(term3317, term3317.getClass(), "canCastle", term3365);
        setLongField(term3317, term3317.getClass(), "zobristHash", -8257434502486459194L);
        setField(term3317, term3317.getClass(), "playerToMove", enum28);
        setBooleanField(term3317, term3317.getClass(), "isThreeFoldRepetition", true);
        setIntField(term3317, term3317.getClass(), "halfMoves", 1442160736);
        setBooleanField(term3317, term3317.getClass(), "fiftyMoveDraw", true);
        setBooleanField(term3317, term3317.getClass(), "inCheck", false);
        setField(term3378, term3378.getClass(), "color", enum29);
        setIntField(term3379, term3379.getClass(), "row", 1114000454);
        setIntField(term3379, term3379.getClass(), "col", -556405712);
        setField(term3378, term3378.getClass(), "position", term3379);
        setField(term3378, term3378.getClass(), "pieceType", enum30);
        setField(term3377, term3377.getClass(), "piece", term3378);
        setIntField(term3385, term3385.getClass(), "row", -1772434990);
        setIntField(term3385, term3385.getClass(), "col", -1845499264);
        setField(term3377, term3377.getClass(), "target", term3385);
        setBooleanField(term3377, term3377.getClass(), "captureMove", false);
        setIntField(term3389, term3389.getClass(), "row", -505439934);
        setIntField(term3389, term3389.getClass(), "col", -344842608);
        setField(term3377, term3377.getClass(), "captureCell", term3389);
        setField(term3377, term3377.getClass(), "promoteTo", enum31);
        setIntField(term3377, term3377.getClass(), "id", 941650513);
        setField(term3317, term3317.getClass(), "previousMove", term3377);
        setField(term3317, term3317.getClass(), "kings", term3402);
        Class<? extends Object> term3801 = Class.forName((String) "pieces.PieceType");
        Field term3800 = ((Class) term3801).getDeclaredField((String) "PAWN");
        ((Field) term3800).setAccessible(true);
        Object enum32 = ((Field) term3800).get((Object) null);
        term3403 = newInstance(Class.forName("commons.Piece"));
        Object term3404 = newInstance(Class.forName("game.Cell"));
        setField(term3403, term3403.getClass(), "color", enum28);
        setIntField(term3404, term3404.getClass(), "row", 444029505);
        setIntField(term3404, term3404.getClass(), "col", -1034506028);
        setField(term3403, term3403.getClass(), "position", term3404);
        setField(term3403, term3403.getClass(), "pieceType", enum32);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("commons.Piece");
        Object[] args = new Object[1];
        args[0] = term3403;
        callMethod(klass, "getMoveList", argTypes, term3317, args);
    }

};


