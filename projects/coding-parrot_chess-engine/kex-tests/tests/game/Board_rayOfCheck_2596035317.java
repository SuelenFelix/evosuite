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

public class Board_rayOfCheck_2596035317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9355;
     Object term9440;
     Object term9452;

    public Board_rayOfCheck_2596035317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9356 = new HashMap();
        HashMap term9361 = new HashMap();
        HashMap term9381 = new HashMap();
        HashMap term9386 = new HashMap();
        ArrayList term9391 = new ArrayList();
        Class<? extends Object> term9475 = Class.forName((String) "commons.Color");
        Field term9474 = ((Class) term9475).getDeclaredField((String) "WHITE");
        ((Field) term9474).setAccessible(true);
        Object enum78 = ((Field) term9474).get((Object) null);
        Class<? extends Object> term9562 = Class.forName((String) "commons.Color");
        Field term9561 = ((Class) term9562).getDeclaredField((String) "BLACK");
        ((Field) term9561).setAccessible(true);
        Object enum79 = ((Field) term9561).get((Object) null);
        Class<? extends Object> term9649 = Class.forName((String) "pieces.PieceType");
        Field term9648 = ((Class) term9649).getDeclaredField((String) "KNIGHT");
        ((Field) term9648).setAccessible(true);
        Object enum80 = ((Field) term9648).get((Object) null);
        Class<? extends Object> term9754 = Class.forName((String) "pieces.PieceType");
        Field term9753 = ((Class) term9754).getDeclaredField((String) "PAWN");
        ((Field) term9753).setAccessible(true);
        Object enum81 = ((Field) term9753).get((Object) null);
        term9355 = newInstance(Class.forName("game.Board"));
        long[] term9395 = (long[]) newLongArray(6);
        Object[] term9403 = (Object[]) newArray("[Z", 2);
        boolean[] term9404 = (boolean[]) newBooleanArray(2);
        boolean[] term9407 = (boolean[]) newBooleanArray(2);
        Object term9415 = newInstance(Class.forName("game.Move"));
        Object term9416 = newInstance(Class.forName("commons.Piece"));
        Object term9417 = newInstance(Class.forName("game.Cell"));
        Object term9423 = newInstance(Class.forName("game.Cell"));
        Object term9427 = newInstance(Class.forName("game.Cell"));
        Object[] term9439 = (Object[]) newArray("commons.Piece", 2);
        setField(term9355, term9355.getClass(), "pieces", term9356);
        setField(term9355, term9355.getClass(), "playerPieces", term9361);
        setField(term9355, term9355.getClass(), "moves", term9381);
        setField(term9355, term9355.getClass(), "guards", term9386);
        setField(term9355, term9355.getClass(), "moveList", term9391);
        setField(term9355, term9355.getClass(), "positions", term9395);
        setIntField(term9355, term9355.getClass(), "positionIndex", -1146679443);
        setBooleanElement(term9404, 0, true);
        setBooleanElement(term9404, 1, true);
        setElement(term9403, 0, term9404);
        setBooleanElement(term9407, 0, true);
        setBooleanElement(term9407, 1, true);
        setElement(term9403, 1, term9407);
        setField(term9355, term9355.getClass(), "canCastle", term9403);
        setLongField(term9355, term9355.getClass(), "zobristHash", -872011222785455006L);
        setField(term9355, term9355.getClass(), "playerToMove", enum78);
        setBooleanField(term9355, term9355.getClass(), "isThreeFoldRepetition", false);
        setIntField(term9355, term9355.getClass(), "halfMoves", -860131894);
        setBooleanField(term9355, term9355.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term9355, term9355.getClass(), "inCheck", false);
        setField(term9416, term9416.getClass(), "color", enum79);
        setIntField(term9417, term9417.getClass(), "row", -1022990421);
        setIntField(term9417, term9417.getClass(), "col", 1045547089);
        setField(term9416, term9416.getClass(), "position", term9417);
        setField(term9416, term9416.getClass(), "pieceType", enum80);
        setField(term9415, term9415.getClass(), "piece", term9416);
        setIntField(term9423, term9423.getClass(), "row", -1122880881);
        setIntField(term9423, term9423.getClass(), "col", -542712742);
        setField(term9415, term9415.getClass(), "target", term9423);
        setBooleanField(term9415, term9415.getClass(), "captureMove", false);
        setIntField(term9427, term9427.getClass(), "row", -1254072822);
        setIntField(term9427, term9427.getClass(), "col", -1111249833);
        setField(term9415, term9415.getClass(), "captureCell", term9427);
        setField(term9415, term9415.getClass(), "promoteTo", enum81);
        setIntField(term9415, term9415.getClass(), "id", -1692331299);
        setField(term9355, term9355.getClass(), "previousMove", term9415);
        setField(term9355, term9355.getClass(), "kings", term9439);
        Class<? extends Object> term9853 = Class.forName((String) "pieces.PieceType");
        Field term9852 = ((Class) term9853).getDeclaredField((String) "KING");
        ((Field) term9852).setAccessible(true);
        Object enum82 = ((Field) term9852).get((Object) null);
        term9440 = newInstance(Class.forName("commons.Piece"));
        Object term9441 = newInstance(Class.forName("game.Cell"));
        setField(term9440, term9440.getClass(), "color", enum79);
        setIntField(term9441, term9441.getClass(), "row", 479531250);
        setIntField(term9441, term9441.getClass(), "col", 1320570890);
        setField(term9440, term9440.getClass(), "position", term9441);
        setField(term9440, term9440.getClass(), "pieceType", enum82);
        Class<? extends Object> term9952 = Class.forName((String) "pieces.PieceType");
        Field term9951 = ((Class) term9952).getDeclaredField((String) "ROOK");
        ((Field) term9951).setAccessible(true);
        Object enum83 = ((Field) term9951).get((Object) null);
        term9452 = newInstance(Class.forName("commons.Piece"));
        Object term9453 = newInstance(Class.forName("game.Cell"));
        setField(term9452, term9452.getClass(), "color", enum79);
        setIntField(term9453, term9453.getClass(), "row", -130649791);
        setIntField(term9453, term9453.getClass(), "col", 534834644);
        setField(term9452, term9452.getClass(), "position", term9453);
        setField(term9452, term9452.getClass(), "pieceType", enum83);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("commons.Piece");
        argTypes[1] = Class.forName("commons.Piece");
        Object[] args = new Object[2];
        args[0] = term9440;
        args[1] = term9452;
        callMethod(klass, "rayOfCheck", argTypes, term9355, args);
    }

};


