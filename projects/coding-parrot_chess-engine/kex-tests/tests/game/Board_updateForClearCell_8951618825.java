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

public class Board_updateForClearCell_8951618825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14107;
     Object term14194;

    public Board_updateForClearCell_8951618825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term14108 = new HashMap();
        HashMap term14113 = new HashMap();
        HashMap term14133 = new HashMap();
        HashMap term14138 = new HashMap();
        ArrayList term14143 = new ArrayList();
        Class<? extends Object> term14208 = Class.forName((String) "commons.Color");
        Field term14207 = ((Class) term14208).getDeclaredField((String) "WHITE");
        ((Field) term14207).setAccessible(true);
        Object enum118 = ((Field) term14207).get((Object) null);
        Class<? extends Object> term14295 = Class.forName((String) "pieces.PieceType");
        Field term14294 = ((Class) term14295).getDeclaredField((String) "QUEEN");
        ((Field) term14294).setAccessible(true);
        Object enum119 = ((Field) term14294).get((Object) null);
        Class<? extends Object> term14397 = Class.forName((String) "pieces.PieceType");
        Field term14396 = ((Class) term14397).getDeclaredField((String) "KNIGHT");
        ((Field) term14396).setAccessible(true);
        Object enum120 = ((Field) term14396).get((Object) null);
        term14107 = newInstance(Class.forName("game.Board"));
        long[] term14147 = (long[]) newLongArray(6);
        Object[] term14155 = (Object[]) newArray("[Z", 2);
        boolean[] term14156 = (boolean[]) newBooleanArray(2);
        boolean[] term14159 = (boolean[]) newBooleanArray(2);
        Object term14167 = newInstance(Class.forName("game.Move"));
        Object term14168 = newInstance(Class.forName("commons.Piece"));
        Object term14169 = newInstance(Class.forName("game.Cell"));
        Object term14175 = newInstance(Class.forName("game.Cell"));
        Object term14179 = newInstance(Class.forName("game.Cell"));
        Object[] term14193 = (Object[]) newArray("commons.Piece", 2);
        setField(term14107, term14107.getClass(), "pieces", term14108);
        setField(term14107, term14107.getClass(), "playerPieces", term14113);
        setField(term14107, term14107.getClass(), "moves", term14133);
        setField(term14107, term14107.getClass(), "guards", term14138);
        setField(term14107, term14107.getClass(), "moveList", term14143);
        setField(term14107, term14107.getClass(), "positions", term14147);
        setIntField(term14107, term14107.getClass(), "positionIndex", 1048271679);
        setBooleanElement(term14156, 0, true);
        setBooleanElement(term14156, 1, true);
        setElement(term14155, 0, term14156);
        setBooleanElement(term14159, 0, true);
        setBooleanElement(term14159, 1, true);
        setElement(term14155, 1, term14159);
        setField(term14107, term14107.getClass(), "canCastle", term14155);
        setLongField(term14107, term14107.getClass(), "zobristHash", -4365849114644724155L);
        setField(term14107, term14107.getClass(), "playerToMove", enum118);
        setBooleanField(term14107, term14107.getClass(), "isThreeFoldRepetition", false);
        setIntField(term14107, term14107.getClass(), "halfMoves", -1529797673);
        setBooleanField(term14107, term14107.getClass(), "fiftyMoveDraw", true);
        setBooleanField(term14107, term14107.getClass(), "inCheck", true);
        setField(term14168, term14168.getClass(), "color", enum118);
        setIntField(term14169, term14169.getClass(), "row", -868676396);
        setIntField(term14169, term14169.getClass(), "col", 1922684808);
        setField(term14168, term14168.getClass(), "position", term14169);
        setField(term14168, term14168.getClass(), "pieceType", enum119);
        setField(term14167, term14167.getClass(), "piece", term14168);
        setIntField(term14175, term14175.getClass(), "row", -2005784375);
        setIntField(term14175, term14175.getClass(), "col", -288604325);
        setField(term14167, term14167.getClass(), "target", term14175);
        setBooleanField(term14167, term14167.getClass(), "captureMove", true);
        setIntField(term14179, term14179.getClass(), "row", -1268314569);
        setIntField(term14179, term14179.getClass(), "col", 877649659);
        setField(term14167, term14167.getClass(), "captureCell", term14179);
        setField(term14167, term14167.getClass(), "promoteTo", enum120);
        setIntField(term14167, term14167.getClass(), "id", -1332748804);
        setField(term14107, term14107.getClass(), "previousMove", term14167);
        setField(term14107, term14107.getClass(), "kings", term14193);
        term14194 = newInstance(Class.forName("game.Cell"));
        setIntField(term14194, term14194.getClass(), "row", 1774507971);
        setIntField(term14194, term14194.getClass(), "col", -1420269858);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("game.Cell");
        Object[] args = new Object[1];
        args[0] = term14194;
        callMethod(klass, "updateForClearCell", argTypes, term14107, args);
    }

};


