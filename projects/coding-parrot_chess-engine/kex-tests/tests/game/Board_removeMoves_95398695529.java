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

public class Board_removeMoves_95398695529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15863;
     Object term15948;

    public Board_removeMoves_95398695529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term15864 = new HashMap();
        HashMap term15869 = new HashMap();
        HashMap term15889 = new HashMap();
        HashMap term15894 = new HashMap();
        ArrayList term15899 = new ArrayList();
        Class<? extends Object> term15962 = Class.forName((String) "commons.Color");
        Field term15961 = ((Class) term15962).getDeclaredField((String) "WHITE");
        ((Field) term15961).setAccessible(true);
        Object enum132 = ((Field) term15961).get((Object) null);
        Class<? extends Object> term16049 = Class.forName((String) "commons.Color");
        Field term16048 = ((Class) term16049).getDeclaredField((String) "BLACK");
        ((Field) term16048).setAccessible(true);
        Object enum133 = ((Field) term16048).get((Object) null);
        Class<? extends Object> term16136 = Class.forName((String) "pieces.PieceType");
        Field term16135 = ((Class) term16136).getDeclaredField((String) "KNIGHT");
        ((Field) term16135).setAccessible(true);
        Object enum134 = ((Field) term16135).get((Object) null);
        Class<? extends Object> term16241 = Class.forName((String) "pieces.PieceType");
        Field term16240 = ((Class) term16241).getDeclaredField((String) "PAWN");
        ((Field) term16240).setAccessible(true);
        Object enum135 = ((Field) term16240).get((Object) null);
        term15863 = newInstance(Class.forName("game.Board"));
        long[] term15903 = (long[]) newLongArray(6);
        Object[] term15911 = (Object[]) newArray("[Z", 2);
        boolean[] term15912 = (boolean[]) newBooleanArray(2);
        boolean[] term15915 = (boolean[]) newBooleanArray(2);
        Object term15923 = newInstance(Class.forName("game.Move"));
        Object term15924 = newInstance(Class.forName("commons.Piece"));
        Object term15925 = newInstance(Class.forName("game.Cell"));
        Object term15931 = newInstance(Class.forName("game.Cell"));
        Object term15935 = newInstance(Class.forName("game.Cell"));
        Object[] term15947 = (Object[]) newArray("commons.Piece", 2);
        setField(term15863, term15863.getClass(), "pieces", term15864);
        setField(term15863, term15863.getClass(), "playerPieces", term15869);
        setField(term15863, term15863.getClass(), "moves", term15889);
        setField(term15863, term15863.getClass(), "guards", term15894);
        setField(term15863, term15863.getClass(), "moveList", term15899);
        setField(term15863, term15863.getClass(), "positions", term15903);
        setIntField(term15863, term15863.getClass(), "positionIndex", 1084849225);
        setBooleanElement(term15912, 0, true);
        setBooleanElement(term15912, 1, true);
        setElement(term15911, 0, term15912);
        setBooleanElement(term15915, 0, true);
        setBooleanElement(term15915, 1, true);
        setElement(term15911, 1, term15915);
        setField(term15863, term15863.getClass(), "canCastle", term15911);
        setLongField(term15863, term15863.getClass(), "zobristHash", -4502405999831680926L);
        setField(term15863, term15863.getClass(), "playerToMove", enum132);
        setBooleanField(term15863, term15863.getClass(), "isThreeFoldRepetition", false);
        setIntField(term15863, term15863.getClass(), "halfMoves", -1702055571);
        setBooleanField(term15863, term15863.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term15863, term15863.getClass(), "inCheck", false);
        setField(term15924, term15924.getClass(), "color", enum133);
        setIntField(term15925, term15925.getClass(), "row", -944542900);
        setIntField(term15925, term15925.getClass(), "col", 2063762142);
        setField(term15924, term15924.getClass(), "position", term15925);
        setField(term15924, term15924.getClass(), "pieceType", enum134);
        setField(term15923, term15923.getClass(), "piece", term15924);
        setIntField(term15931, term15931.getClass(), "row", 1658391716);
        setIntField(term15931, term15931.getClass(), "col", 2143282300);
        setField(term15923, term15923.getClass(), "target", term15931);
        setBooleanField(term15923, term15923.getClass(), "captureMove", false);
        setIntField(term15935, term15935.getClass(), "row", 1137624258);
        setIntField(term15935, term15935.getClass(), "col", 977862393);
        setField(term15923, term15923.getClass(), "captureCell", term15935);
        setField(term15923, term15923.getClass(), "promoteTo", enum135);
        setIntField(term15923, term15923.getClass(), "id", 301401782);
        setField(term15863, term15863.getClass(), "previousMove", term15923);
        setField(term15863, term15863.getClass(), "kings", term15947);
        term15948 = newInstance(Class.forName("game.Cell"));
        setIntField(term15948, term15948.getClass(), "row", 1988605357);
        setIntField(term15948, term15948.getClass(), "col", 808203320);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("game.Cell");
        Object[] args = new Object[1];
        args[0] = term15948;
        callMethod(klass, "removeMoves", argTypes, term15863, args);
    }

};


