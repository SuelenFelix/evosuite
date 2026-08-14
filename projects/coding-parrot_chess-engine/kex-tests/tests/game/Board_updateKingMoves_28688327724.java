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

public class Board_updateKingMoves_28688327724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13510;
     Object term13595;
     Object term13616;

    public Board_updateKingMoves_28688327724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term13511 = new HashMap();
        HashMap term13516 = new HashMap();
        HashMap term13536 = new HashMap();
        HashMap term13541 = new HashMap();
        ArrayList term13546 = new ArrayList();
        Class<? extends Object> term13631 = Class.forName((String) "commons.Color");
        Field term13630 = ((Class) term13631).getDeclaredField((String) "BLACK");
        ((Field) term13630).setAccessible(true);
        Object enum113 = ((Field) term13630).get((Object) null);
        Class<? extends Object> term13718 = Class.forName((String) "pieces.PieceType");
        Field term13717 = ((Class) term13718).getDeclaredField((String) "KNIGHT");
        ((Field) term13717).setAccessible(true);
        Object enum114 = ((Field) term13717).get((Object) null);
        Class<? extends Object> term13823 = Class.forName((String) "pieces.PieceType");
        Field term13822 = ((Class) term13823).getDeclaredField((String) "ROOK");
        ((Field) term13822).setAccessible(true);
        Object enum115 = ((Field) term13822).get((Object) null);
        term13510 = newInstance(Class.forName("game.Board"));
        long[] term13550 = (long[]) newLongArray(6);
        Object[] term13558 = (Object[]) newArray("[Z", 2);
        boolean[] term13559 = (boolean[]) newBooleanArray(2);
        boolean[] term13562 = (boolean[]) newBooleanArray(2);
        Object term13570 = newInstance(Class.forName("game.Move"));
        Object term13571 = newInstance(Class.forName("commons.Piece"));
        Object term13572 = newInstance(Class.forName("game.Cell"));
        Object term13578 = newInstance(Class.forName("game.Cell"));
        Object term13582 = newInstance(Class.forName("game.Cell"));
        Object[] term13594 = (Object[]) newArray("commons.Piece", 2);
        setField(term13510, term13510.getClass(), "pieces", term13511);
        setField(term13510, term13510.getClass(), "playerPieces", term13516);
        setField(term13510, term13510.getClass(), "moves", term13536);
        setField(term13510, term13510.getClass(), "guards", term13541);
        setField(term13510, term13510.getClass(), "moveList", term13546);
        setField(term13510, term13510.getClass(), "positions", term13550);
        setIntField(term13510, term13510.getClass(), "positionIndex", 993388358);
        setBooleanElement(term13559, 0, true);
        setBooleanElement(term13559, 1, true);
        setElement(term13558, 0, term13559);
        setBooleanElement(term13562, 0, true);
        setBooleanElement(term13562, 1, true);
        setElement(term13558, 1, term13562);
        setField(term13510, term13510.getClass(), "canCastle", term13558);
        setLongField(term13510, term13510.getClass(), "zobristHash", 8059786003080744426L);
        setField(term13510, term13510.getClass(), "playerToMove", enum113);
        setBooleanField(term13510, term13510.getClass(), "isThreeFoldRepetition", true);
        setIntField(term13510, term13510.getClass(), "halfMoves", -765191335);
        setBooleanField(term13510, term13510.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term13510, term13510.getClass(), "inCheck", true);
        setField(term13571, term13571.getClass(), "color", enum113);
        setIntField(term13572, term13572.getClass(), "row", -1697741155);
        setIntField(term13572, term13572.getClass(), "col", 1295839803);
        setField(term13571, term13571.getClass(), "position", term13572);
        setField(term13571, term13571.getClass(), "pieceType", enum114);
        setField(term13570, term13570.getClass(), "piece", term13571);
        setIntField(term13578, term13578.getClass(), "row", -1891015523);
        setIntField(term13578, term13578.getClass(), "col", -1560631747);
        setField(term13570, term13570.getClass(), "target", term13578);
        setBooleanField(term13570, term13570.getClass(), "captureMove", true);
        setIntField(term13582, term13582.getClass(), "row", 1215150180);
        setIntField(term13582, term13582.getClass(), "col", -1422859977);
        setField(term13570, term13570.getClass(), "captureCell", term13582);
        setField(term13570, term13570.getClass(), "promoteTo", enum115);
        setIntField(term13570, term13570.getClass(), "id", -1972436591);
        setField(term13510, term13510.getClass(), "previousMove", term13570);
        setField(term13510, term13510.getClass(), "kings", term13594);
        Class<? extends Object> term13922 = Class.forName((String) "pieces.PieceType");
        Field term13921 = ((Class) term13922).getDeclaredField((String) "KING");
        ((Field) term13921).setAccessible(true);
        Object enum116 = ((Field) term13921).get((Object) null);
        term13595 = newInstance(Class.forName("game.Move"));
        Object term13596 = newInstance(Class.forName("commons.Piece"));
        Object term13597 = newInstance(Class.forName("game.Cell"));
        Object term13600 = newInstance(Class.forName("game.Cell"));
        Object term13604 = newInstance(Class.forName("game.Cell"));
        setField(term13596, term13596.getClass(), "color", enum113);
        setIntField(term13597, term13597.getClass(), "row", 68922753);
        setIntField(term13597, term13597.getClass(), "col", -220791533);
        setField(term13596, term13596.getClass(), "position", term13597);
        setField(term13596, term13596.getClass(), "pieceType", enum114);
        setField(term13595, term13595.getClass(), "piece", term13596);
        setIntField(term13600, term13600.getClass(), "row", 1741500243);
        setIntField(term13600, term13600.getClass(), "col", -2070466617);
        setField(term13595, term13595.getClass(), "target", term13600);
        setBooleanField(term13595, term13595.getClass(), "captureMove", false);
        setIntField(term13604, term13604.getClass(), "row", -1127721881);
        setIntField(term13604, term13604.getClass(), "col", 1074848808);
        setField(term13595, term13595.getClass(), "captureCell", term13604);
        setField(term13595, term13595.getClass(), "promoteTo", enum116);
        setIntField(term13595, term13595.getClass(), "id", -146054762);
        Class<? extends Object> term14021 = Class.forName((String) "commons.Color");
        Field term14020 = ((Class) term14021).getDeclaredField((String) "BLACK");
        ((Field) term14020).setAccessible(true);
        Object enum117 = ((Field) term14020).get((Object) null);
        term13616 = newInstance(Class.forName("commons.Piece"));
        Object term13617 = newInstance(Class.forName("game.Cell"));
        setField(term13616, term13616.getClass(), "color", enum117);
        setIntField(term13617, term13617.getClass(), "row", 798043553);
        setIntField(term13617, term13617.getClass(), "col", 533197381);
        setField(term13616, term13616.getClass(), "position", term13617);
        setField(term13616, term13616.getClass(), "pieceType", enum115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("game.Move");
        argTypes[1] = Class.forName("commons.Piece");
        Object[] args = new Object[2];
        args[0] = term13595;
        args[1] = term13616;
        callMethod(klass, "updateKingMoves", argTypes, term13510, args);
    }

};


