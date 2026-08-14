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
import java.lang.Integer;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Pawn_addEnPassant_16636717592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5783;
     Object term5868;
     Object term5870;
     Object term5876;

    public Pawn_addEnPassant_16636717592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5784 = new HashMap();
        HashMap term5789 = new HashMap();
        HashMap term5809 = new HashMap();
        HashMap term5814 = new HashMap();
        ArrayList term5819 = new ArrayList();
        Class<? extends Object> term5899 = Class.forName((String) "commons.Color");
        Field term5898 = ((Class) term5899).getDeclaredField((String) "BLACK");
        ((Field) term5898).setAccessible(true);
        Object enum47 = ((Field) term5898).get((Object) null);
        Class<? extends Object> term5986 = Class.forName((String) "commons.Color");
        Field term5985 = ((Class) term5986).getDeclaredField((String) "BLACK");
        ((Field) term5985).setAccessible(true);
        Object enum48 = ((Field) term5985).get((Object) null);
        Class<? extends Object> term6073 = Class.forName((String) "pieces.PieceType");
        Field term6072 = ((Class) term6073).getDeclaredField((String) "ROOK");
        ((Field) term6072).setAccessible(true);
        Object enum49 = ((Field) term6072).get((Object) null);
        Class<? extends Object> term6172 = Class.forName((String) "pieces.PieceType");
        Field term6171 = ((Class) term6172).getDeclaredField((String) "KING");
        ((Field) term6171).setAccessible(true);
        Object enum50 = ((Field) term6171).get((Object) null);
        term5783 = newInstance(Class.forName("game.Board"));
        long[] term5823 = (long[]) newLongArray(6);
        Object[] term5831 = (Object[]) newArray("[Z", 2);
        boolean[] term5832 = (boolean[]) newBooleanArray(2);
        boolean[] term5835 = (boolean[]) newBooleanArray(2);
        Object term5843 = newInstance(Class.forName("game.Move"));
        Object term5844 = newInstance(Class.forName("commons.Piece"));
        Object term5845 = newInstance(Class.forName("game.Cell"));
        Object term5851 = newInstance(Class.forName("game.Cell"));
        Object term5855 = newInstance(Class.forName("game.Cell"));
        Object[] term5867 = (Object[]) newArray("commons.Piece", 2);
        setField(term5783, term5783.getClass(), "pieces", term5784);
        setField(term5783, term5783.getClass(), "playerPieces", term5789);
        setField(term5783, term5783.getClass(), "moves", term5809);
        setField(term5783, term5783.getClass(), "guards", term5814);
        setField(term5783, term5783.getClass(), "moveList", term5819);
        setField(term5783, term5783.getClass(), "positions", term5823);
        setIntField(term5783, term5783.getClass(), "positionIndex", -507387516);
        setBooleanElement(term5832, 0, true);
        setBooleanElement(term5832, 1, true);
        setElement(term5831, 0, term5832);
        setBooleanElement(term5835, 0, true);
        setBooleanElement(term5835, 1, true);
        setElement(term5831, 1, term5835);
        setField(term5783, term5783.getClass(), "canCastle", term5831);
        setLongField(term5783, term5783.getClass(), "zobristHash", -2813493605142626659L);
        setField(term5783, term5783.getClass(), "playerToMove", enum47);
        setBooleanField(term5783, term5783.getClass(), "isThreeFoldRepetition", false);
        setIntField(term5783, term5783.getClass(), "halfMoves", -1970452551);
        setBooleanField(term5783, term5783.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term5783, term5783.getClass(), "inCheck", true);
        setField(term5844, term5844.getClass(), "color", enum48);
        setIntField(term5845, term5845.getClass(), "row", -1896376975);
        setIntField(term5845, term5845.getClass(), "col", 729658803);
        setField(term5844, term5844.getClass(), "position", term5845);
        setField(term5844, term5844.getClass(), "pieceType", enum49);
        setField(term5843, term5843.getClass(), "piece", term5844);
        setIntField(term5851, term5851.getClass(), "row", 114754804);
        setIntField(term5851, term5851.getClass(), "col", 1687361082);
        setField(term5843, term5843.getClass(), "target", term5851);
        setBooleanField(term5843, term5843.getClass(), "captureMove", false);
        setIntField(term5855, term5855.getClass(), "row", 584893196);
        setIntField(term5855, term5855.getClass(), "col", 497269071);
        setField(term5843, term5843.getClass(), "captureCell", term5855);
        setField(term5843, term5843.getClass(), "promoteTo", enum50);
        setIntField(term5843, term5843.getClass(), "id", -1899301124);
        setField(term5783, term5783.getClass(), "previousMove", term5843);
        setField(term5783, term5783.getClass(), "kings", term5867);
        term5868 = new Integer(-1882480155);
        HashMap term5871 = new HashMap();
        Set<Object> term6270 =  ((Map) term5871).keySet();
        term5870 = new HashSet((Collection<? extends Object>) term6270);
        Class<? extends Object> term6272 = Class.forName((String) "pieces.PieceType");
        Field term6271 = ((Class) term6272).getDeclaredField((String) "ROOK");
        ((Field) term6271).setAccessible(true);
        Object enum51 = ((Field) term6271).get((Object) null);
        term5876 = newInstance(Class.forName("commons.Piece"));
        Object term5877 = newInstance(Class.forName("game.Cell"));
        setField(term5876, term5876.getClass(), "color", enum48);
        setIntField(term5877, term5877.getClass(), "row", -1410220680);
        setIntField(term5877, term5877.getClass(), "col", 389427431);
        setField(term5876, term5876.getClass(), "position", term5877);
        setField(term5876, term5876.getClass(), "pieceType", enum51);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pieces.Pawn");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("game.Board");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.util.Set");
        argTypes[3] = Class.forName("commons.Piece");
        Object[] args = new Object[4];
        args[0] = term5783;
        args[1] = term5868;
        args[2] = term5870;
        args[3] = term5876;
        callMethod(klass, "addEnPassant", argTypes, null, args);
    }

};


