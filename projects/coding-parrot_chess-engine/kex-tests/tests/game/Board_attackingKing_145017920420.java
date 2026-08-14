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

public class Board_attackingKing_145017920420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11264;
     Object term11349;

    public Board_attackingKing_145017920420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11265 = new HashMap();
        HashMap term11270 = new HashMap();
        HashMap term11290 = new HashMap();
        HashMap term11295 = new HashMap();
        ArrayList term11300 = new ArrayList();
        Class<? extends Object> term11374 = Class.forName((String) "commons.Color");
        Field term11373 = ((Class) term11374).getDeclaredField((String) "BLACK");
        ((Field) term11373).setAccessible(true);
        Object enum94 = ((Field) term11373).get((Object) null);
        Class<? extends Object> term11461 = Class.forName((String) "commons.Color");
        Field term11460 = ((Class) term11461).getDeclaredField((String) "WHITE");
        ((Field) term11460).setAccessible(true);
        Object enum95 = ((Field) term11460).get((Object) null);
        Class<? extends Object> term11548 = Class.forName((String) "pieces.PieceType");
        Field term11547 = ((Class) term11548).getDeclaredField((String) "ROOK");
        ((Field) term11547).setAccessible(true);
        Object enum96 = ((Field) term11547).get((Object) null);
        Class<? extends Object> term11647 = Class.forName((String) "pieces.PieceType");
        Field term11646 = ((Class) term11647).getDeclaredField((String) "PAWN");
        ((Field) term11646).setAccessible(true);
        Object enum97 = ((Field) term11646).get((Object) null);
        term11264 = newInstance(Class.forName("game.Board"));
        long[] term11304 = (long[]) newLongArray(6);
        Object[] term11312 = (Object[]) newArray("[Z", 2);
        boolean[] term11313 = (boolean[]) newBooleanArray(2);
        boolean[] term11316 = (boolean[]) newBooleanArray(2);
        Object term11324 = newInstance(Class.forName("game.Move"));
        Object term11325 = newInstance(Class.forName("commons.Piece"));
        Object term11326 = newInstance(Class.forName("game.Cell"));
        Object term11332 = newInstance(Class.forName("game.Cell"));
        Object term11336 = newInstance(Class.forName("game.Cell"));
        Object[] term11348 = (Object[]) newArray("commons.Piece", 2);
        setField(term11264, term11264.getClass(), "pieces", term11265);
        setField(term11264, term11264.getClass(), "playerPieces", term11270);
        setField(term11264, term11264.getClass(), "moves", term11290);
        setField(term11264, term11264.getClass(), "guards", term11295);
        setField(term11264, term11264.getClass(), "moveList", term11300);
        setField(term11264, term11264.getClass(), "positions", term11304);
        setIntField(term11264, term11264.getClass(), "positionIndex", 2009020256);
        setBooleanElement(term11313, 0, true);
        setBooleanElement(term11313, 1, true);
        setElement(term11312, 0, term11313);
        setBooleanElement(term11316, 0, true);
        setBooleanElement(term11316, 1, true);
        setElement(term11312, 1, term11316);
        setField(term11264, term11264.getClass(), "canCastle", term11312);
        setLongField(term11264, term11264.getClass(), "zobristHash", -6573104506744284592L);
        setField(term11264, term11264.getClass(), "playerToMove", enum94);
        setBooleanField(term11264, term11264.getClass(), "isThreeFoldRepetition", false);
        setIntField(term11264, term11264.getClass(), "halfMoves", 2049577015);
        setBooleanField(term11264, term11264.getClass(), "fiftyMoveDraw", true);
        setBooleanField(term11264, term11264.getClass(), "inCheck", false);
        setField(term11325, term11325.getClass(), "color", enum95);
        setIntField(term11326, term11326.getClass(), "row", 1236004505);
        setIntField(term11326, term11326.getClass(), "col", 1050765721);
        setField(term11325, term11325.getClass(), "position", term11326);
        setField(term11325, term11325.getClass(), "pieceType", enum96);
        setField(term11324, term11324.getClass(), "piece", term11325);
        setIntField(term11332, term11332.getClass(), "row", 474518942);
        setIntField(term11332, term11332.getClass(), "col", -1656687479);
        setField(term11324, term11324.getClass(), "target", term11332);
        setBooleanField(term11324, term11324.getClass(), "captureMove", true);
        setIntField(term11336, term11336.getClass(), "row", -249614216);
        setIntField(term11336, term11336.getClass(), "col", 1870727665);
        setField(term11324, term11324.getClass(), "captureCell", term11336);
        setField(term11324, term11324.getClass(), "promoteTo", enum97);
        setIntField(term11324, term11324.getClass(), "id", -519881101);
        setField(term11264, term11264.getClass(), "previousMove", term11324);
        setField(term11264, term11264.getClass(), "kings", term11348);
        Class<? extends Object> term11746 = Class.forName((String) "pieces.PieceType");
        Field term11745 = ((Class) term11746).getDeclaredField((String) "KNIGHT");
        ((Field) term11745).setAccessible(true);
        Object enum98 = ((Field) term11745).get((Object) null);
        term11349 = newInstance(Class.forName("commons.Piece"));
        Object term11350 = newInstance(Class.forName("game.Cell"));
        setField(term11349, term11349.getClass(), "color", enum94);
        setIntField(term11350, term11350.getClass(), "row", -680920524);
        setIntField(term11350, term11350.getClass(), "col", -916335264);
        setField(term11349, term11349.getClass(), "position", term11350);
        setField(term11349, term11349.getClass(), "pieceType", enum98);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("commons.Piece");
        Object[] args = new Object[1];
        args[0] = term11349;
        callMethod(klass, "attackingKing", argTypes, term11264, args);
    }

};


