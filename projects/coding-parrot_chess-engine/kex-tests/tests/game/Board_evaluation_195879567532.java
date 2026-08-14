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

public class Board_evaluation_195879567532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17314;
     Object term17399;

    public Board_evaluation_195879567532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term17315 = new HashMap();
        HashMap term17320 = new HashMap();
        HashMap term17340 = new HashMap();
        HashMap term17345 = new HashMap();
        ArrayList term17350 = new ArrayList();
        Class<? extends Object> term17412 = Class.forName((String) "commons.Color");
        Field term17411 = ((Class) term17412).getDeclaredField((String) "BLACK");
        ((Field) term17411).setAccessible(true);
        Object enum144 = ((Field) term17411).get((Object) null);
        Class<? extends Object> term17499 = Class.forName((String) "commons.Color");
        Field term17498 = ((Class) term17499).getDeclaredField((String) "WHITE");
        ((Field) term17498).setAccessible(true);
        Object enum145 = ((Field) term17498).get((Object) null);
        Class<? extends Object> term17586 = Class.forName((String) "pieces.PieceType");
        Field term17585 = ((Class) term17586).getDeclaredField((String) "KNIGHT");
        ((Field) term17585).setAccessible(true);
        Object enum146 = ((Field) term17585).get((Object) null);
        Class<? extends Object> term17691 = Class.forName((String) "pieces.PieceType");
        Field term17690 = ((Class) term17691).getDeclaredField((String) "KING");
        ((Field) term17690).setAccessible(true);
        Object enum147 = ((Field) term17690).get((Object) null);
        term17314 = newInstance(Class.forName("game.Board"));
        long[] term17354 = (long[]) newLongArray(6);
        Object[] term17362 = (Object[]) newArray("[Z", 2);
        boolean[] term17363 = (boolean[]) newBooleanArray(2);
        boolean[] term17366 = (boolean[]) newBooleanArray(2);
        Object term17374 = newInstance(Class.forName("game.Move"));
        Object term17375 = newInstance(Class.forName("commons.Piece"));
        Object term17376 = newInstance(Class.forName("game.Cell"));
        Object term17382 = newInstance(Class.forName("game.Cell"));
        Object term17386 = newInstance(Class.forName("game.Cell"));
        Object[] term17398 = (Object[]) newArray("commons.Piece", 2);
        setField(term17314, term17314.getClass(), "pieces", term17315);
        setField(term17314, term17314.getClass(), "playerPieces", term17320);
        setField(term17314, term17314.getClass(), "moves", term17340);
        setField(term17314, term17314.getClass(), "guards", term17345);
        setField(term17314, term17314.getClass(), "moveList", term17350);
        setField(term17314, term17314.getClass(), "positions", term17354);
        setIntField(term17314, term17314.getClass(), "positionIndex", 1824538861);
        setBooleanElement(term17363, 0, true);
        setBooleanElement(term17363, 1, true);
        setElement(term17362, 0, term17363);
        setBooleanElement(term17366, 0, true);
        setBooleanElement(term17366, 1, true);
        setElement(term17362, 1, term17366);
        setField(term17314, term17314.getClass(), "canCastle", term17362);
        setLongField(term17314, term17314.getClass(), "zobristHash", 6855071767938501807L);
        setField(term17314, term17314.getClass(), "playerToMove", enum144);
        setBooleanField(term17314, term17314.getClass(), "isThreeFoldRepetition", true);
        setIntField(term17314, term17314.getClass(), "halfMoves", 499519708);
        setBooleanField(term17314, term17314.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term17314, term17314.getClass(), "inCheck", true);
        setField(term17375, term17375.getClass(), "color", enum145);
        setIntField(term17376, term17376.getClass(), "row", 1501165033);
        setIntField(term17376, term17376.getClass(), "col", 510162332);
        setField(term17375, term17375.getClass(), "position", term17376);
        setField(term17375, term17375.getClass(), "pieceType", enum146);
        setField(term17374, term17374.getClass(), "piece", term17375);
        setIntField(term17382, term17382.getClass(), "row", 888506903);
        setIntField(term17382, term17382.getClass(), "col", 200252898);
        setField(term17374, term17374.getClass(), "target", term17382);
        setBooleanField(term17374, term17374.getClass(), "captureMove", false);
        setIntField(term17386, term17386.getClass(), "row", -1831826725);
        setIntField(term17386, term17386.getClass(), "col", 752152965);
        setField(term17374, term17374.getClass(), "captureCell", term17386);
        setField(term17374, term17374.getClass(), "promoteTo", enum147);
        setIntField(term17374, term17374.getClass(), "id", -1577069773);
        setField(term17314, term17314.getClass(), "previousMove", term17374);
        setField(term17314, term17314.getClass(), "kings", term17398);
        term17399 = new Integer(-266625190);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term17399;
        callMethod(klass, "evaluation", argTypes, term17314, args);
    }

};


