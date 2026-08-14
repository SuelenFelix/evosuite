package pieces;

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
import static pieces.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class King_getIllegalSquares_19914202823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2038;
     Object enum19;
     Object term2123;
     Object term2129;

    public King_getIllegalSquares_19914202823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2039 = new HashMap();
        HashMap term2044 = new HashMap();
        HashMap term2064 = new HashMap();
        HashMap term2069 = new HashMap();
        ArrayList term2074 = new ArrayList();
        Class<? extends Object> term2143 = Class.forName((String) "commons.Color");
        Field term2142 = ((Class) term2143).getDeclaredField((String) "WHITE");
        ((Field) term2142).setAccessible(true);
        Object enum16 = ((Field) term2142).get((Object) null);
        Class<? extends Object> term2230 = Class.forName((String) "pieces.PieceType");
        Field term2229 = ((Class) term2230).getDeclaredField((String) "ROOK");
        ((Field) term2229).setAccessible(true);
        Object enum17 = ((Field) term2229).get((Object) null);
        Class<? extends Object> term2329 = Class.forName((String) "pieces.PieceType");
        Field term2328 = ((Class) term2329).getDeclaredField((String) "ROOK");
        ((Field) term2328).setAccessible(true);
        Object enum18 = ((Field) term2328).get((Object) null);
        term2038 = newInstance(Class.forName("game.Board"));
        long[] term2078 = (long[]) newLongArray(6);
        Object[] term2086 = (Object[]) newArray("[Z", 2);
        boolean[] term2087 = (boolean[]) newBooleanArray(2);
        boolean[] term2090 = (boolean[]) newBooleanArray(2);
        Object term2098 = newInstance(Class.forName("game.Move"));
        Object term2099 = newInstance(Class.forName("commons.Piece"));
        Object term2100 = newInstance(Class.forName("game.Cell"));
        Object term2106 = newInstance(Class.forName("game.Cell"));
        Object term2110 = newInstance(Class.forName("game.Cell"));
        Object[] term2122 = (Object[]) newArray("commons.Piece", 2);
        setField(term2038, term2038.getClass(), "pieces", term2039);
        setField(term2038, term2038.getClass(), "playerPieces", term2044);
        setField(term2038, term2038.getClass(), "moves", term2064);
        setField(term2038, term2038.getClass(), "guards", term2069);
        setField(term2038, term2038.getClass(), "moveList", term2074);
        setField(term2038, term2038.getClass(), "positions", term2078);
        setIntField(term2038, term2038.getClass(), "positionIndex", -817164822);
        setBooleanElement(term2087, 0, true);
        setBooleanElement(term2087, 1, true);
        setElement(term2086, 0, term2087);
        setBooleanElement(term2090, 0, true);
        setBooleanElement(term2090, 1, true);
        setElement(term2086, 1, term2090);
        setField(term2038, term2038.getClass(), "canCastle", term2086);
        setLongField(term2038, term2038.getClass(), "zobristHash", 5270370404989704783L);
        setField(term2038, term2038.getClass(), "playerToMove", enum16);
        setBooleanField(term2038, term2038.getClass(), "isThreeFoldRepetition", true);
        setIntField(term2038, term2038.getClass(), "halfMoves", -1016503459);
        setBooleanField(term2038, term2038.getClass(), "fiftyMoveDraw", true);
        setBooleanField(term2038, term2038.getClass(), "inCheck", false);
        setField(term2099, term2099.getClass(), "color", enum16);
        setIntField(term2100, term2100.getClass(), "row", -1968847291);
        setIntField(term2100, term2100.getClass(), "col", 579005622);
        setField(term2099, term2099.getClass(), "position", term2100);
        setField(term2099, term2099.getClass(), "pieceType", enum17);
        setField(term2098, term2098.getClass(), "piece", term2099);
        setIntField(term2106, term2106.getClass(), "row", -14890619);
        setIntField(term2106, term2106.getClass(), "col", 1632125673);
        setField(term2098, term2098.getClass(), "target", term2106);
        setBooleanField(term2098, term2098.getClass(), "captureMove", false);
        setIntField(term2110, term2110.getClass(), "row", 454281060);
        setIntField(term2110, term2110.getClass(), "col", -1786399638);
        setField(term2098, term2098.getClass(), "captureCell", term2110);
        setField(term2098, term2098.getClass(), "promoteTo", enum18);
        setIntField(term2098, term2098.getClass(), "id", 2055867847);
        setField(term2038, term2038.getClass(), "previousMove", term2098);
        setField(term2038, term2038.getClass(), "kings", term2122);
        Class<? extends Object> term2428 = Class.forName((String) "commons.Color");
        Field term2427 = ((Class) term2428).getDeclaredField((String) "WHITE");
        ((Field) term2427).setAccessible(true);
        enum19 = ((Field) term2427).get((Object) null);
        HashMap term2124 = new HashMap();
        Set<Object> term2514 =  ((Map) term2124).keySet();
        term2123 = new HashSet((Collection<? extends Object>) term2514);
        term2129 = newInstance(Class.forName("game.Cell"));
        setIntField(term2129, term2129.getClass(), "row", -1048298087);
        setIntField(term2129, term2129.getClass(), "col", 292681826);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pieces.King");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("game.Board");
        argTypes[1] = Class.forName("commons.Color");
        argTypes[2] = Class.forName("java.util.Set");
        argTypes[3] = Class.forName("game.Cell");
        Object[] args = new Object[4];
        args[0] = term2038;
        args[1] = enum19;
        args[2] = term2123;
        args[3] = term2129;
        callMethod(klass, "getIllegalSquares", argTypes, null, args);
    }

};


