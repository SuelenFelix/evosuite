package commons;

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
import static commons.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayList;

public class Piece_getLegalMoves_8374316486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1803;
     Object term1824;

    public Piece_getLegalMoves_8374316486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1900 = Class.forName((String) "commons.Color");
        Field term1899 = ((Class) term1900).getDeclaredField((String) "WHITE");
        ((Field) term1899).setAccessible(true);
        Object enum16 = ((Field) term1899).get((Object) null);
        Class<? extends Object> term1987 = Class.forName((String) "pieces.PieceType");
        Field term1986 = ((Class) term1987).getDeclaredField((String) "ROOK");
        ((Field) term1986).setAccessible(true);
        Object enum17 = ((Field) term1986).get((Object) null);
        term1803 = newInstance(Class.forName("commons.Piece"));
        Object term1813 = newInstance(Class.forName("game.Cell"));
        setField(term1803, term1803.getClass(), "color", enum16);
        setIntField(term1813, term1813.getClass(), "row", -1179120542);
        setIntField(term1813, term1813.getClass(), "col", -73683645);
        setField(term1803, term1803.getClass(), "position", term1813);
        setField(term1803, term1803.getClass(), "pieceType", enum17);
        HashMap term1825 = new HashMap();
        HashMap term1830 = new HashMap();
        HashMap term1848 = new HashMap();
        HashMap term1853 = new HashMap();
        ArrayList term1858 = new ArrayList();
        Class<? extends Object> term2096 = Class.forName((String) "commons.Color");
        Field term2095 = ((Class) term2096).getDeclaredField((String) "BLACK");
        ((Field) term2095).setAccessible(true);
        Object enum18 = ((Field) term2095).get((Object) null);
        Class<? extends Object> term2183 = Class.forName((String) "pieces.PieceType");
        Field term2182 = ((Class) term2183).getDeclaredField((String) "ROOK");
        ((Field) term2182).setAccessible(true);
        Object enum19 = ((Field) term2182).get((Object) null);
        term1824 = newInstance(Class.forName("game.Board"));
        long[] term1862 = (long[]) newLongArray(6);
        Object[] term1870 = (Object[]) newArray("[Z", 2);
        boolean[] term1871 = (boolean[]) newBooleanArray(2);
        boolean[] term1874 = (boolean[]) newBooleanArray(2);
        Object term1882 = newInstance(Class.forName("game.Move"));
        Object term1883 = newInstance(Class.forName("commons.Piece"));
        Object term1884 = newInstance(Class.forName("game.Cell"));
        Object term1890 = newInstance(Class.forName("game.Cell"));
        Object term1894 = newInstance(Class.forName("game.Cell"));
        Object[] term1898 = (Object[]) newArray("commons.Piece", 2);
        setField(term1824, term1824.getClass(), "pieces", term1825);
        setField(term1824, term1824.getClass(), "playerPieces", term1830);
        setField(term1824, term1824.getClass(), "moves", term1848);
        setField(term1824, term1824.getClass(), "guards", term1853);
        setField(term1824, term1824.getClass(), "moveList", term1858);
        setField(term1824, term1824.getClass(), "positions", term1862);
        setIntField(term1824, term1824.getClass(), "positionIndex", -226514366);
        setBooleanElement(term1871, 0, true);
        setBooleanElement(term1871, 1, true);
        setElement(term1870, 0, term1871);
        setBooleanElement(term1874, 0, true);
        setBooleanElement(term1874, 1, true);
        setElement(term1870, 1, term1874);
        setField(term1824, term1824.getClass(), "canCastle", term1870);
        setLongField(term1824, term1824.getClass(), "zobristHash", 6375119433582206027L);
        setField(term1824, term1824.getClass(), "playerToMove", enum16);
        setBooleanField(term1824, term1824.getClass(), "isThreeFoldRepetition", true);
        setIntField(term1824, term1824.getClass(), "halfMoves", 1193880199);
        setBooleanField(term1824, term1824.getClass(), "fiftyMoveDraw", true);
        setBooleanField(term1824, term1824.getClass(), "inCheck", true);
        setField(term1883, term1883.getClass(), "color", enum18);
        setIntField(term1884, term1884.getClass(), "row", -1087774327);
        setIntField(term1884, term1884.getClass(), "col", -1530420153);
        setField(term1883, term1883.getClass(), "position", term1884);
        setField(term1883, term1883.getClass(), "pieceType", enum19);
        setField(term1882, term1882.getClass(), "piece", term1883);
        setIntField(term1890, term1890.getClass(), "row", -469968304);
        setIntField(term1890, term1890.getClass(), "col", -1145578966);
        setField(term1882, term1882.getClass(), "target", term1890);
        setBooleanField(term1882, term1882.getClass(), "captureMove", false);
        setIntField(term1894, term1894.getClass(), "row", 679763016);
        setIntField(term1894, term1894.getClass(), "col", 1962444399);
        setField(term1882, term1882.getClass(), "captureCell", term1894);
        setField(term1882, term1882.getClass(), "promoteTo", enum17);
        setIntField(term1882, term1882.getClass(), "id", 767834723);
        setField(term1824, term1824.getClass(), "previousMove", term1882);
        setField(term1824, term1824.getClass(), "kings", term1898);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("commons.Piece");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("game.Board");
        Object[] args = new Object[1];
        args[0] = term1824;
        callMethod(klass, "getLegalMoves", argTypes, term1803, args);
    }

};


