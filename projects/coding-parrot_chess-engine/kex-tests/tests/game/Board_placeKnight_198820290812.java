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

public class Board_placeKnight_198820290812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6940;
     Object term7025;
     Object term7027;
     Object enum58;

    public Board_placeKnight_198820290812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6941 = new HashMap();
        HashMap term6946 = new HashMap();
        HashMap term6966 = new HashMap();
        HashMap term6971 = new HashMap();
        ArrayList term6976 = new ArrayList();
        Class<? extends Object> term7040 = Class.forName((String) "commons.Color");
        Field term7039 = ((Class) term7040).getDeclaredField((String) "WHITE");
        ((Field) term7039).setAccessible(true);
        enum58 = ((Field) term7039).get((Object) null);
        Class<? extends Object> term7127 = Class.forName((String) "pieces.PieceType");
        Field term7126 = ((Class) term7127).getDeclaredField((String) "QUEEN");
        ((Field) term7126).setAccessible(true);
        Object enum59 = ((Field) term7126).get((Object) null);
        Class<? extends Object> term7229 = Class.forName((String) "pieces.PieceType");
        Field term7228 = ((Class) term7229).getDeclaredField((String) "ROOK");
        ((Field) term7228).setAccessible(true);
        Object enum60 = ((Field) term7228).get((Object) null);
        term6940 = newInstance(Class.forName("game.Board"));
        long[] term6980 = (long[]) newLongArray(6);
        Object[] term6988 = (Object[]) newArray("[Z", 2);
        boolean[] term6989 = (boolean[]) newBooleanArray(2);
        boolean[] term6992 = (boolean[]) newBooleanArray(2);
        Object term7000 = newInstance(Class.forName("game.Move"));
        Object term7001 = newInstance(Class.forName("commons.Piece"));
        Object term7002 = newInstance(Class.forName("game.Cell"));
        Object term7008 = newInstance(Class.forName("game.Cell"));
        Object term7012 = newInstance(Class.forName("game.Cell"));
        Object[] term7024 = (Object[]) newArray("commons.Piece", 2);
        setField(term6940, term6940.getClass(), "pieces", term6941);
        setField(term6940, term6940.getClass(), "playerPieces", term6946);
        setField(term6940, term6940.getClass(), "moves", term6966);
        setField(term6940, term6940.getClass(), "guards", term6971);
        setField(term6940, term6940.getClass(), "moveList", term6976);
        setField(term6940, term6940.getClass(), "positions", term6980);
        setIntField(term6940, term6940.getClass(), "positionIndex", 663292551);
        setBooleanElement(term6989, 0, true);
        setBooleanElement(term6989, 1, true);
        setElement(term6988, 0, term6989);
        setBooleanElement(term6992, 0, true);
        setBooleanElement(term6992, 1, true);
        setElement(term6988, 1, term6992);
        setField(term6940, term6940.getClass(), "canCastle", term6988);
        setLongField(term6940, term6940.getClass(), "zobristHash", -2813493605142626659L);
        setField(term6940, term6940.getClass(), "playerToMove", enum58);
        setBooleanField(term6940, term6940.getClass(), "isThreeFoldRepetition", false);
        setIntField(term6940, term6940.getClass(), "halfMoves", -1885090354);
        setBooleanField(term6940, term6940.getClass(), "fiftyMoveDraw", true);
        setBooleanField(term6940, term6940.getClass(), "inCheck", false);
        setField(term7001, term7001.getClass(), "color", enum58);
        setIntField(term7002, term7002.getClass(), "row", -2066804303);
        setIntField(term7002, term7002.getClass(), "col", -1731761810);
        setField(term7001, term7001.getClass(), "position", term7002);
        setField(term7001, term7001.getClass(), "pieceType", enum59);
        setField(term7000, term7000.getClass(), "piece", term7001);
        setIntField(term7008, term7008.getClass(), "row", 197109649);
        setIntField(term7008, term7008.getClass(), "col", -1239406390);
        setField(term7000, term7000.getClass(), "target", term7008);
        setBooleanField(term7000, term7000.getClass(), "captureMove", false);
        setIntField(term7012, term7012.getClass(), "row", 1557431527);
        setIntField(term7012, term7012.getClass(), "col", -1504890659);
        setField(term7000, term7000.getClass(), "captureCell", term7012);
        setField(term7000, term7000.getClass(), "promoteTo", enum60);
        setIntField(term7000, term7000.getClass(), "id", 1358829571);
        setField(term6940, term6940.getClass(), "previousMove", term7000);
        setField(term6940, term6940.getClass(), "kings", term7024);
        term7025 = new Integer(991356662);
        term7027 = new Integer(-506958186);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("commons.Color");
        Object[] args = new Object[3];
        args[0] = term7025;
        args[1] = term7027;
        args[2] = enum58;
        callMethod(klass, "placeKnight", argTypes, term6940, args);
    }

};


