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

public class Board_isDraw_168988854034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18264;

    public Board_isDraw_168988854034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term18265 = new HashMap();
        HashMap term18270 = new HashMap();
        HashMap term18290 = new HashMap();
        HashMap term18295 = new HashMap();
        ArrayList term18300 = new ArrayList();
        Class<? extends Object> term18360 = Class.forName((String) "commons.Color");
        Field term18359 = ((Class) term18360).getDeclaredField((String) "BLACK");
        ((Field) term18359).setAccessible(true);
        Object enum152 = ((Field) term18359).get((Object) null);
        Class<? extends Object> term18447 = Class.forName((String) "pieces.PieceType");
        Field term18446 = ((Class) term18447).getDeclaredField((String) "BISHOP");
        ((Field) term18446).setAccessible(true);
        Object enum153 = ((Field) term18446).get((Object) null);
        Class<? extends Object> term18552 = Class.forName((String) "pieces.PieceType");
        Field term18551 = ((Class) term18552).getDeclaredField((String) "ROOK");
        ((Field) term18551).setAccessible(true);
        Object enum154 = ((Field) term18551).get((Object) null);
        term18264 = newInstance(Class.forName("game.Board"));
        long[] term18304 = (long[]) newLongArray(6);
        Object[] term18312 = (Object[]) newArray("[Z", 2);
        boolean[] term18313 = (boolean[]) newBooleanArray(2);
        boolean[] term18316 = (boolean[]) newBooleanArray(2);
        Object term18324 = newInstance(Class.forName("game.Move"));
        Object term18325 = newInstance(Class.forName("commons.Piece"));
        Object term18326 = newInstance(Class.forName("game.Cell"));
        Object term18332 = newInstance(Class.forName("game.Cell"));
        Object term18336 = newInstance(Class.forName("game.Cell"));
        Object[] term18348 = (Object[]) newArray("commons.Piece", 2);
        setField(term18264, term18264.getClass(), "pieces", term18265);
        setField(term18264, term18264.getClass(), "playerPieces", term18270);
        setField(term18264, term18264.getClass(), "moves", term18290);
        setField(term18264, term18264.getClass(), "guards", term18295);
        setField(term18264, term18264.getClass(), "moveList", term18300);
        setField(term18264, term18264.getClass(), "positions", term18304);
        setIntField(term18264, term18264.getClass(), "positionIndex", -423900705);
        setBooleanElement(term18313, 0, true);
        setBooleanElement(term18313, 1, true);
        setElement(term18312, 0, term18313);
        setBooleanElement(term18316, 0, true);
        setBooleanElement(term18316, 1, true);
        setElement(term18312, 1, term18316);
        setField(term18264, term18264.getClass(), "canCastle", term18312);
        setLongField(term18264, term18264.getClass(), "zobristHash", 5262507301787091109L);
        setField(term18264, term18264.getClass(), "playerToMove", enum152);
        setBooleanField(term18264, term18264.getClass(), "isThreeFoldRepetition", false);
        setIntField(term18264, term18264.getClass(), "halfMoves", -525570815);
        setBooleanField(term18264, term18264.getClass(), "fiftyMoveDraw", true);
        setBooleanField(term18264, term18264.getClass(), "inCheck", false);
        setField(term18325, term18325.getClass(), "color", enum152);
        setIntField(term18326, term18326.getClass(), "row", 754055848);
        setIntField(term18326, term18326.getClass(), "col", -19246901);
        setField(term18325, term18325.getClass(), "position", term18326);
        setField(term18325, term18325.getClass(), "pieceType", enum153);
        setField(term18324, term18324.getClass(), "piece", term18325);
        setIntField(term18332, term18332.getClass(), "row", -370828664);
        setIntField(term18332, term18332.getClass(), "col", 1168633950);
        setField(term18324, term18324.getClass(), "target", term18332);
        setBooleanField(term18324, term18324.getClass(), "captureMove", false);
        setIntField(term18336, term18336.getClass(), "row", 1607082164);
        setIntField(term18336, term18336.getClass(), "col", 1890399366);
        setField(term18324, term18324.getClass(), "captureCell", term18336);
        setField(term18324, term18324.getClass(), "promoteTo", enum154);
        setIntField(term18324, term18324.getClass(), "id", -1867239125);
        setField(term18264, term18264.getClass(), "previousMove", term18324);
        setField(term18264, term18264.getClass(), "kings", term18348);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDraw", argTypes, term18264, args);
    }

};


