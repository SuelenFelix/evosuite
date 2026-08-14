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

public class Board_populateMoves_560905235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4377;
     Object term4462;

    public Board_populateMoves_560905235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4378 = new HashMap();
        HashMap term4383 = new HashMap();
        HashMap term4403 = new HashMap();
        HashMap term4408 = new HashMap();
        ArrayList term4413 = new ArrayList();
        Class<? extends Object> term4476 = Class.forName((String) "commons.Color");
        Field term4475 = ((Class) term4476).getDeclaredField((String) "BLACK");
        ((Field) term4475).setAccessible(true);
        Object enum37 = ((Field) term4475).get((Object) null);
        Class<? extends Object> term4563 = Class.forName((String) "pieces.PieceType");
        Field term4562 = ((Class) term4563).getDeclaredField((String) "KNIGHT");
        ((Field) term4562).setAccessible(true);
        Object enum38 = ((Field) term4562).get((Object) null);
        Class<? extends Object> term4668 = Class.forName((String) "pieces.PieceType");
        Field term4667 = ((Class) term4668).getDeclaredField((String) "ROOK");
        ((Field) term4667).setAccessible(true);
        Object enum39 = ((Field) term4667).get((Object) null);
        term4377 = newInstance(Class.forName("game.Board"));
        long[] term4417 = (long[]) newLongArray(6);
        Object[] term4425 = (Object[]) newArray("[Z", 2);
        boolean[] term4426 = (boolean[]) newBooleanArray(2);
        boolean[] term4429 = (boolean[]) newBooleanArray(2);
        Object term4437 = newInstance(Class.forName("game.Move"));
        Object term4438 = newInstance(Class.forName("commons.Piece"));
        Object term4439 = newInstance(Class.forName("game.Cell"));
        Object term4445 = newInstance(Class.forName("game.Cell"));
        Object term4449 = newInstance(Class.forName("game.Cell"));
        Object[] term4461 = (Object[]) newArray("commons.Piece", 2);
        setField(term4377, term4377.getClass(), "pieces", term4378);
        setField(term4377, term4377.getClass(), "playerPieces", term4383);
        setField(term4377, term4377.getClass(), "moves", term4403);
        setField(term4377, term4377.getClass(), "guards", term4408);
        setField(term4377, term4377.getClass(), "moveList", term4413);
        setField(term4377, term4377.getClass(), "positions", term4417);
        setIntField(term4377, term4377.getClass(), "positionIndex", -615654495);
        setBooleanElement(term4426, 0, true);
        setBooleanElement(term4426, 1, true);
        setElement(term4425, 0, term4426);
        setBooleanElement(term4429, 0, true);
        setBooleanElement(term4429, 1, true);
        setElement(term4425, 1, term4429);
        setField(term4377, term4377.getClass(), "canCastle", term4425);
        setLongField(term4377, term4377.getClass(), "zobristHash", 5270370404989704783L);
        setField(term4377, term4377.getClass(), "playerToMove", enum37);
        setBooleanField(term4377, term4377.getClass(), "isThreeFoldRepetition", true);
        setIntField(term4377, term4377.getClass(), "halfMoves", -1476117762);
        setBooleanField(term4377, term4377.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term4377, term4377.getClass(), "inCheck", false);
        setField(term4438, term4438.getClass(), "color", enum37);
        setIntField(term4439, term4439.getClass(), "row", -341962980);
        setIntField(term4439, term4439.getClass(), "col", 1532716628);
        setField(term4438, term4438.getClass(), "position", term4439);
        setField(term4438, term4438.getClass(), "pieceType", enum38);
        setField(term4437, term4437.getClass(), "piece", term4438);
        setIntField(term4445, term4445.getClass(), "row", -1801760683);
        setIntField(term4445, term4445.getClass(), "col", 1141317871);
        setField(term4437, term4437.getClass(), "target", term4445);
        setBooleanField(term4437, term4437.getClass(), "captureMove", false);
        setIntField(term4449, term4449.getClass(), "row", 890669485);
        setIntField(term4449, term4449.getClass(), "col", 691577392);
        setField(term4437, term4437.getClass(), "captureCell", term4449);
        setField(term4437, term4437.getClass(), "promoteTo", enum39);
        setIntField(term4437, term4437.getClass(), "id", -893623680);
        setField(term4377, term4377.getClass(), "previousMove", term4437);
        setField(term4377, term4377.getClass(), "kings", term4461);
        term4462 = newInstance(Class.forName("game.Cell"));
        setIntField(term4462, term4462.getClass(), "row", -1963434938);
        setIntField(term4462, term4462.getClass(), "col", 906181092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("game.Cell");
        Object[] args = new Object[1];
        args[0] = term4462;
        callMethod(klass, "populateMoves", argTypes, term4377, args);
    }

};


