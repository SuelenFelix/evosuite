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

public class Board_getPiece_5797918192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3040;
     Object term3117;
     Object term3119;

    public Board_getPiece_5797918192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3041 = new HashMap();
        HashMap term3046 = new HashMap();
        HashMap term3066 = new HashMap();
        HashMap term3071 = new HashMap();
        ArrayList term3076 = new ArrayList();
        Class<? extends Object> term3132 = Class.forName((String) "commons.Color");
        Field term3131 = ((Class) term3132).getDeclaredField((String) "WHITE");
        ((Field) term3131).setAccessible(true);
        Object enum26 = ((Field) term3131).get((Object) null);
        Class<? extends Object> term3219 = Class.forName((String) "pieces.PieceType");
        Field term3218 = ((Class) term3219).getDeclaredField((String) "ROOK");
        ((Field) term3218).setAccessible(true);
        Object enum27 = ((Field) term3218).get((Object) null);
        term3040 = newInstance(Class.forName("game.Board"));
        long[] term3080 = (long[]) newLongArray(6);
        Object[] term3088 = (Object[]) newArray("[Z", 2);
        boolean[] term3089 = (boolean[]) newBooleanArray(2);
        boolean[] term3092 = (boolean[]) newBooleanArray(2);
        Object term3100 = newInstance(Class.forName("game.Move"));
        Object term3101 = newInstance(Class.forName("commons.Piece"));
        Object term3102 = newInstance(Class.forName("game.Cell"));
        Object term3108 = newInstance(Class.forName("game.Cell"));
        Object term3112 = newInstance(Class.forName("game.Cell"));
        Object[] term3116 = (Object[]) newArray("commons.Piece", 2);
        setField(term3040, term3040.getClass(), "pieces", term3041);
        setField(term3040, term3040.getClass(), "playerPieces", term3046);
        setField(term3040, term3040.getClass(), "moves", term3066);
        setField(term3040, term3040.getClass(), "guards", term3071);
        setField(term3040, term3040.getClass(), "moveList", term3076);
        setField(term3040, term3040.getClass(), "positions", term3080);
        setIntField(term3040, term3040.getClass(), "positionIndex", 1551099402);
        setBooleanElement(term3089, 0, true);
        setBooleanElement(term3089, 1, true);
        setElement(term3088, 0, term3089);
        setBooleanElement(term3092, 0, true);
        setBooleanElement(term3092, 1, true);
        setElement(term3088, 1, term3092);
        setField(term3040, term3040.getClass(), "canCastle", term3088);
        setLongField(term3040, term3040.getClass(), "zobristHash", 6375119433582206027L);
        setField(term3040, term3040.getClass(), "playerToMove", enum26);
        setBooleanField(term3040, term3040.getClass(), "isThreeFoldRepetition", false);
        setIntField(term3040, term3040.getClass(), "halfMoves", -2027534003);
        setBooleanField(term3040, term3040.getClass(), "fiftyMoveDraw", true);
        setBooleanField(term3040, term3040.getClass(), "inCheck", false);
        setField(term3101, term3101.getClass(), "color", enum26);
        setIntField(term3102, term3102.getClass(), "row", 1063420942);
        setIntField(term3102, term3102.getClass(), "col", 1375330971);
        setField(term3101, term3101.getClass(), "position", term3102);
        setField(term3101, term3101.getClass(), "pieceType", enum27);
        setField(term3100, term3100.getClass(), "piece", term3101);
        setIntField(term3108, term3108.getClass(), "row", -478195677);
        setIntField(term3108, term3108.getClass(), "col", 972867650);
        setField(term3100, term3100.getClass(), "target", term3108);
        setBooleanField(term3100, term3100.getClass(), "captureMove", false);
        setIntField(term3112, term3112.getClass(), "row", 1655935355);
        setIntField(term3112, term3112.getClass(), "col", -481533957);
        setField(term3100, term3100.getClass(), "captureCell", term3112);
        setField(term3100, term3100.getClass(), "promoteTo", enum27);
        setIntField(term3100, term3100.getClass(), "id", 1240914516);
        setField(term3040, term3040.getClass(), "previousMove", term3100);
        setField(term3040, term3040.getClass(), "kings", term3116);
        term3117 = new Integer(-1465035361);
        term3119 = new Integer(1090617576);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term3117;
        args[1] = term3119;
        callMethod(klass, "getPiece", argTypes, term3040, args);
    }

};


