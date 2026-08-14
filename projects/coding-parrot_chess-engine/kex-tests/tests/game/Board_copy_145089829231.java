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

public class Board_copy_145089829231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16847;

    public Board_copy_145089829231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term16848 = new HashMap();
        HashMap term16853 = new HashMap();
        HashMap term16873 = new HashMap();
        HashMap term16878 = new HashMap();
        ArrayList term16883 = new ArrayList();
        Class<? extends Object> term16943 = Class.forName((String) "commons.Color");
        Field term16942 = ((Class) term16943).getDeclaredField((String) "WHITE");
        ((Field) term16942).setAccessible(true);
        Object enum140 = ((Field) term16942).get((Object) null);
        Class<? extends Object> term17030 = Class.forName((String) "commons.Color");
        Field term17029 = ((Class) term17030).getDeclaredField((String) "BLACK");
        ((Field) term17029).setAccessible(true);
        Object enum141 = ((Field) term17029).get((Object) null);
        Class<? extends Object> term17117 = Class.forName((String) "pieces.PieceType");
        Field term17116 = ((Class) term17117).getDeclaredField((String) "PAWN");
        ((Field) term17116).setAccessible(true);
        Object enum142 = ((Field) term17116).get((Object) null);
        Class<? extends Object> term17216 = Class.forName((String) "pieces.PieceType");
        Field term17215 = ((Class) term17216).getDeclaredField((String) "KING");
        ((Field) term17215).setAccessible(true);
        Object enum143 = ((Field) term17215).get((Object) null);
        term16847 = newInstance(Class.forName("game.Board"));
        long[] term16887 = (long[]) newLongArray(6);
        Object[] term16895 = (Object[]) newArray("[Z", 2);
        boolean[] term16896 = (boolean[]) newBooleanArray(2);
        boolean[] term16899 = (boolean[]) newBooleanArray(2);
        Object term16907 = newInstance(Class.forName("game.Move"));
        Object term16908 = newInstance(Class.forName("commons.Piece"));
        Object term16909 = newInstance(Class.forName("game.Cell"));
        Object term16915 = newInstance(Class.forName("game.Cell"));
        Object term16919 = newInstance(Class.forName("game.Cell"));
        Object[] term16931 = (Object[]) newArray("commons.Piece", 2);
        setField(term16847, term16847.getClass(), "pieces", term16848);
        setField(term16847, term16847.getClass(), "playerPieces", term16853);
        setField(term16847, term16847.getClass(), "moves", term16873);
        setField(term16847, term16847.getClass(), "guards", term16878);
        setField(term16847, term16847.getClass(), "moveList", term16883);
        setField(term16847, term16847.getClass(), "positions", term16887);
        setIntField(term16847, term16847.getClass(), "positionIndex", 765766290);
        setBooleanElement(term16896, 0, true);
        setBooleanElement(term16896, 1, true);
        setElement(term16895, 0, term16896);
        setBooleanElement(term16899, 0, true);
        setBooleanElement(term16899, 1, true);
        setElement(term16895, 1, term16899);
        setField(term16847, term16847.getClass(), "canCastle", term16895);
        setLongField(term16847, term16847.getClass(), "zobristHash", 2120084523938730454L);
        setField(term16847, term16847.getClass(), "playerToMove", enum140);
        setBooleanField(term16847, term16847.getClass(), "isThreeFoldRepetition", true);
        setIntField(term16847, term16847.getClass(), "halfMoves", -1284825282);
        setBooleanField(term16847, term16847.getClass(), "fiftyMoveDraw", true);
        setBooleanField(term16847, term16847.getClass(), "inCheck", false);
        setField(term16908, term16908.getClass(), "color", enum141);
        setIntField(term16909, term16909.getClass(), "row", -1941343035);
        setIntField(term16909, term16909.getClass(), "col", 947897214);
        setField(term16908, term16908.getClass(), "position", term16909);
        setField(term16908, term16908.getClass(), "pieceType", enum142);
        setField(term16907, term16907.getClass(), "piece", term16908);
        setIntField(term16915, term16915.getClass(), "row", 1496340209);
        setIntField(term16915, term16915.getClass(), "col", -1748391876);
        setField(term16907, term16907.getClass(), "target", term16915);
        setBooleanField(term16907, term16907.getClass(), "captureMove", false);
        setIntField(term16919, term16919.getClass(), "row", 43258317);
        setIntField(term16919, term16919.getClass(), "col", 1707220033);
        setField(term16907, term16907.getClass(), "captureCell", term16919);
        setField(term16907, term16907.getClass(), "promoteTo", enum143);
        setIntField(term16907, term16907.getClass(), "id", -1792504217);
        setField(term16847, term16847.getClass(), "previousMove", term16907);
        setField(term16847, term16847.getClass(), "kings", term16931);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term16847, args);
    }

};


