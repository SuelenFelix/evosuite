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

public class Board_placeRook_14368124328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5244;
     Object term5321;
     Object term5323;
     Object enum44;

    public Board_placeRook_14368124328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5245 = new HashMap();
        HashMap term5250 = new HashMap();
        HashMap term5270 = new HashMap();
        HashMap term5275 = new HashMap();
        ArrayList term5280 = new ArrayList();
        Class<? extends Object> term5336 = Class.forName((String) "commons.Color");
        Field term5335 = ((Class) term5336).getDeclaredField((String) "BLACK");
        ((Field) term5335).setAccessible(true);
        enum44 = ((Field) term5335).get((Object) null);
        Class<? extends Object> term5423 = Class.forName((String) "pieces.PieceType");
        Field term5422 = ((Class) term5423).getDeclaredField((String) "ROOK");
        ((Field) term5422).setAccessible(true);
        Object enum45 = ((Field) term5422).get((Object) null);
        term5244 = newInstance(Class.forName("game.Board"));
        long[] term5284 = (long[]) newLongArray(6);
        Object[] term5292 = (Object[]) newArray("[Z", 2);
        boolean[] term5293 = (boolean[]) newBooleanArray(2);
        boolean[] term5296 = (boolean[]) newBooleanArray(2);
        Object term5304 = newInstance(Class.forName("game.Move"));
        Object term5305 = newInstance(Class.forName("commons.Piece"));
        Object term5306 = newInstance(Class.forName("game.Cell"));
        Object term5312 = newInstance(Class.forName("game.Cell"));
        Object term5316 = newInstance(Class.forName("game.Cell"));
        Object[] term5320 = (Object[]) newArray("commons.Piece", 2);
        setField(term5244, term5244.getClass(), "pieces", term5245);
        setField(term5244, term5244.getClass(), "playerPieces", term5250);
        setField(term5244, term5244.getClass(), "moves", term5270);
        setField(term5244, term5244.getClass(), "guards", term5275);
        setField(term5244, term5244.getClass(), "moveList", term5280);
        setField(term5244, term5244.getClass(), "positions", term5284);
        setIntField(term5244, term5244.getClass(), "positionIndex", -2015854073);
        setBooleanElement(term5293, 0, true);
        setBooleanElement(term5293, 1, true);
        setElement(term5292, 0, term5293);
        setBooleanElement(term5296, 0, true);
        setBooleanElement(term5296, 1, true);
        setElement(term5292, 1, term5296);
        setField(term5244, term5244.getClass(), "canCastle", term5292);
        setLongField(term5244, term5244.getClass(), "zobristHash", 4872422362414183754L);
        setField(term5244, term5244.getClass(), "playerToMove", enum44);
        setBooleanField(term5244, term5244.getClass(), "isThreeFoldRepetition", true);
        setIntField(term5244, term5244.getClass(), "halfMoves", 538259104);
        setBooleanField(term5244, term5244.getClass(), "fiftyMoveDraw", true);
        setBooleanField(term5244, term5244.getClass(), "inCheck", false);
        setField(term5305, term5305.getClass(), "color", enum44);
        setIntField(term5306, term5306.getClass(), "row", 96566506);
        setIntField(term5306, term5306.getClass(), "col", -343325701);
        setField(term5305, term5305.getClass(), "position", term5306);
        setField(term5305, term5305.getClass(), "pieceType", enum45);
        setField(term5304, term5304.getClass(), "piece", term5305);
        setIntField(term5312, term5312.getClass(), "row", 107945604);
        setIntField(term5312, term5312.getClass(), "col", -1963464809);
        setField(term5304, term5304.getClass(), "target", term5312);
        setBooleanField(term5304, term5304.getClass(), "captureMove", true);
        setIntField(term5316, term5316.getClass(), "row", 71190297);
        setIntField(term5316, term5316.getClass(), "col", 1202361360);
        setField(term5304, term5304.getClass(), "captureCell", term5316);
        setField(term5304, term5304.getClass(), "promoteTo", enum45);
        setIntField(term5304, term5304.getClass(), "id", -2015048153);
        setField(term5244, term5244.getClass(), "previousMove", term5304);
        setField(term5244, term5244.getClass(), "kings", term5320);
        term5321 = new Integer(-2063457669);
        term5323 = new Integer(-1222006000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("commons.Color");
        Object[] args = new Object[3];
        args[0] = term5321;
        args[1] = term5323;
        args[2] = enum44;
        callMethod(klass, "placeRook", argTypes, term5244, args);
    }

};


