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

public class Board_castlingAllowanceFen_129968559144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22914;
     Object term23000;

    public Board_castlingAllowanceFen_129968559144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term22915 = new HashMap();
        HashMap term22920 = new HashMap();
        HashMap term22940 = new HashMap();
        HashMap term22945 = new HashMap();
        ArrayList term22950 = new ArrayList();
        Class<? extends Object> term23035 = Class.forName((String) "commons.Color");
        Field term23034 = ((Class) term23035).getDeclaredField((String) "WHITE");
        ((Field) term23034).setAccessible(true);
        Object enum190 = ((Field) term23034).get((Object) null);
        Class<? extends Object> term23122 = Class.forName((String) "commons.Color");
        Field term23121 = ((Class) term23122).getDeclaredField((String) "WHITE");
        ((Field) term23121).setAccessible(true);
        Object enum191 = ((Field) term23121).get((Object) null);
        Class<? extends Object> term23209 = Class.forName((String) "pieces.PieceType");
        Field term23208 = ((Class) term23209).getDeclaredField((String) "ROOK");
        ((Field) term23208).setAccessible(true);
        Object enum192 = ((Field) term23208).get((Object) null);
        Class<? extends Object> term23308 = Class.forName((String) "pieces.PieceType");
        Field term23307 = ((Class) term23308).getDeclaredField((String) "QUEEN");
        ((Field) term23307).setAccessible(true);
        Object enum193 = ((Field) term23307).get((Object) null);
        term22914 = newInstance(Class.forName("game.Board"));
        long[] term22954 = (long[]) newLongArray(6);
        Object[] term22962 = (Object[]) newArray("[Z", 2);
        boolean[] term22963 = (boolean[]) newBooleanArray(2);
        boolean[] term22966 = (boolean[]) newBooleanArray(2);
        Object term22974 = newInstance(Class.forName("game.Move"));
        Object term22975 = newInstance(Class.forName("commons.Piece"));
        Object term22976 = newInstance(Class.forName("game.Cell"));
        Object term22982 = newInstance(Class.forName("game.Cell"));
        Object term22986 = newInstance(Class.forName("game.Cell"));
        Object[] term22999 = (Object[]) newArray("commons.Piece", 2);
        setField(term22914, term22914.getClass(), "pieces", term22915);
        setField(term22914, term22914.getClass(), "playerPieces", term22920);
        setField(term22914, term22914.getClass(), "moves", term22940);
        setField(term22914, term22914.getClass(), "guards", term22945);
        setField(term22914, term22914.getClass(), "moveList", term22950);
        setField(term22914, term22914.getClass(), "positions", term22954);
        setIntField(term22914, term22914.getClass(), "positionIndex", 1706047059);
        setBooleanElement(term22963, 0, true);
        setBooleanElement(term22963, 1, true);
        setElement(term22962, 0, term22963);
        setBooleanElement(term22966, 0, true);
        setBooleanElement(term22966, 1, true);
        setElement(term22962, 1, term22966);
        setField(term22914, term22914.getClass(), "canCastle", term22962);
        setLongField(term22914, term22914.getClass(), "zobristHash", -2068172595987555756L);
        setField(term22914, term22914.getClass(), "playerToMove", enum190);
        setBooleanField(term22914, term22914.getClass(), "isThreeFoldRepetition", true);
        setIntField(term22914, term22914.getClass(), "halfMoves", 590451710);
        setBooleanField(term22914, term22914.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term22914, term22914.getClass(), "inCheck", false);
        setField(term22975, term22975.getClass(), "color", enum191);
        setIntField(term22976, term22976.getClass(), "row", -1999787419);
        setIntField(term22976, term22976.getClass(), "col", -1224443634);
        setField(term22975, term22975.getClass(), "position", term22976);
        setField(term22975, term22975.getClass(), "pieceType", enum192);
        setField(term22974, term22974.getClass(), "piece", term22975);
        setIntField(term22982, term22982.getClass(), "row", 1048451946);
        setIntField(term22982, term22982.getClass(), "col", 5603560);
        setField(term22974, term22974.getClass(), "target", term22982);
        setBooleanField(term22974, term22974.getClass(), "captureMove", true);
        setIntField(term22986, term22986.getClass(), "row", -1079020032);
        setIntField(term22986, term22986.getClass(), "col", -1973791064);
        setField(term22974, term22974.getClass(), "captureCell", term22986);
        setField(term22974, term22974.getClass(), "promoteTo", enum193);
        setIntField(term22974, term22974.getClass(), "id", -2072158633);
        setField(term22914, term22914.getClass(), "previousMove", term22974);
        setField(term22914, term22914.getClass(), "kings", term22999);
        term23000 = (Object[]) newArray("[Z", 4);
        boolean[] term23001 = (boolean[]) newBooleanArray(0);
        boolean[] term23002 = (boolean[]) newBooleanArray(7);
        boolean[] term23010 = (boolean[]) newBooleanArray(4);
        boolean[] term23015 = (boolean[]) newBooleanArray(8);
        setElement(term23000, 0, term23001);
        setBooleanElement(term23002, 0, true);
        setBooleanElement(term23002, 1, true);
        setBooleanElement(term23002, 2, true);
        setElement(term23000, 1, term23002);
        setBooleanElement(term23010, 1, true);
        setBooleanElement(term23010, 2, true);
        setBooleanElement(term23010, 3, true);
        setElement(term23000, 2, term23010);
        setBooleanElement(term23015, 1, true);
        setBooleanElement(term23015, 3, true);
        setBooleanElement(term23015, 4, true);
        setBooleanElement(term23015, 6, true);
        setBooleanElement(term23015, 7, true);
        setElement(term23000, 3, term23015);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(boolean.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term23000;
        callMethod(klass, "castlingAllowanceFen", argTypes, term22914, args);
    }

};


