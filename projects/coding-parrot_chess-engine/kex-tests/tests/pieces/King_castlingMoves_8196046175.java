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

public class King_castlingMoves_8196046175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2636;
     Object term2723;
     Object term2735;

    public King_castlingMoves_8196046175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2637 = new HashMap();
        HashMap term2642 = new HashMap();
        HashMap term2662 = new HashMap();
        HashMap term2667 = new HashMap();
        ArrayList term2672 = new ArrayList();
        Class<? extends Object> term2793 = Class.forName((String) "commons.Color");
        Field term2792 = ((Class) term2793).getDeclaredField((String) "BLACK");
        ((Field) term2792).setAccessible(true);
        Object enum21 = ((Field) term2792).get((Object) null);
        Class<? extends Object> term2880 = Class.forName((String) "pieces.PieceType");
        Field term2879 = ((Class) term2880).getDeclaredField((String) "ROOK");
        ((Field) term2879).setAccessible(true);
        Object enum22 = ((Field) term2879).get((Object) null);
        Class<? extends Object> term2979 = Class.forName((String) "pieces.PieceType");
        Field term2978 = ((Class) term2979).getDeclaredField((String) "KNIGHT");
        ((Field) term2978).setAccessible(true);
        Object enum23 = ((Field) term2978).get((Object) null);
        term2636 = newInstance(Class.forName("game.Board"));
        long[] term2676 = (long[]) newLongArray(6);
        Object[] term2684 = (Object[]) newArray("[Z", 2);
        boolean[] term2685 = (boolean[]) newBooleanArray(2);
        boolean[] term2688 = (boolean[]) newBooleanArray(2);
        Object term2696 = newInstance(Class.forName("game.Move"));
        Object term2697 = newInstance(Class.forName("commons.Piece"));
        Object term2698 = newInstance(Class.forName("game.Cell"));
        Object term2704 = newInstance(Class.forName("game.Cell"));
        Object term2708 = newInstance(Class.forName("game.Cell"));
        Object[] term2722 = (Object[]) newArray("commons.Piece", 2);
        setField(term2636, term2636.getClass(), "pieces", term2637);
        setField(term2636, term2636.getClass(), "playerPieces", term2642);
        setField(term2636, term2636.getClass(), "moves", term2662);
        setField(term2636, term2636.getClass(), "guards", term2667);
        setField(term2636, term2636.getClass(), "moveList", term2672);
        setField(term2636, term2636.getClass(), "positions", term2676);
        setIntField(term2636, term2636.getClass(), "positionIndex", 1596070772);
        setBooleanElement(term2685, 0, true);
        setBooleanElement(term2685, 1, true);
        setElement(term2684, 0, term2685);
        setBooleanElement(term2688, 0, true);
        setBooleanElement(term2688, 1, true);
        setElement(term2684, 1, term2688);
        setField(term2636, term2636.getClass(), "canCastle", term2684);
        setLongField(term2636, term2636.getClass(), "zobristHash", 7411271909051562686L);
        setField(term2636, term2636.getClass(), "playerToMove", enum21);
        setBooleanField(term2636, term2636.getClass(), "isThreeFoldRepetition", true);
        setIntField(term2636, term2636.getClass(), "halfMoves", 97029295);
        setBooleanField(term2636, term2636.getClass(), "fiftyMoveDraw", true);
        setBooleanField(term2636, term2636.getClass(), "inCheck", true);
        setField(term2697, term2697.getClass(), "color", enum21);
        setIntField(term2698, term2698.getClass(), "row", -1371869594);
        setIntField(term2698, term2698.getClass(), "col", -2095575670);
        setField(term2697, term2697.getClass(), "position", term2698);
        setField(term2697, term2697.getClass(), "pieceType", enum22);
        setField(term2696, term2696.getClass(), "piece", term2697);
        setIntField(term2704, term2704.getClass(), "row", 1225272962);
        setIntField(term2704, term2704.getClass(), "col", 1324040357);
        setField(term2696, term2696.getClass(), "target", term2704);
        setBooleanField(term2696, term2696.getClass(), "captureMove", true);
        setIntField(term2708, term2708.getClass(), "row", -1588772968);
        setIntField(term2708, term2708.getClass(), "col", -93135961);
        setField(term2696, term2696.getClass(), "captureCell", term2708);
        setField(term2696, term2696.getClass(), "promoteTo", enum23);
        setIntField(term2696, term2696.getClass(), "id", -112921587);
        setField(term2636, term2636.getClass(), "previousMove", term2696);
        setField(term2636, term2636.getClass(), "kings", term2722);
        Class<? extends Object> term3084 = Class.forName((String) "commons.Color");
        Field term3083 = ((Class) term3084).getDeclaredField((String) "WHITE");
        ((Field) term3083).setAccessible(true);
        Object enum24 = ((Field) term3083).get((Object) null);
        Class<? extends Object> term3171 = Class.forName((String) "pieces.PieceType");
        Field term3170 = ((Class) term3171).getDeclaredField((String) "ROOK");
        ((Field) term3170).setAccessible(true);
        Object enum25 = ((Field) term3170).get((Object) null);
        term2723 = newInstance(Class.forName("commons.Piece"));
        Object term2724 = newInstance(Class.forName("game.Cell"));
        setField(term2723, term2723.getClass(), "color", enum24);
        setIntField(term2724, term2724.getClass(), "row", 933028652);
        setIntField(term2724, term2724.getClass(), "col", 287287233);
        setField(term2723, term2723.getClass(), "position", term2724);
        setField(term2723, term2723.getClass(), "pieceType", enum25);
        HashMap term2736 = new HashMap();
        Set<Object> term3269 =  ((Map) term2736).keySet();
        term2735 = new HashSet((Collection<? extends Object>) term3269);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pieces.King");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("game.Board");
        argTypes[1] = Class.forName("commons.Piece");
        argTypes[2] = Class.forName("java.util.Set");
        Object[] args = new Object[3];
        args[0] = term2636;
        args[1] = term2723;
        args[2] = term2735;
        callMethod(klass, "castlingMoves", argTypes, null, args);
    }

};


