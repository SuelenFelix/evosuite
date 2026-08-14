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

public class Board_longRangeUpdate_163317429826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14501;
     Object term14578;

    public Board_longRangeUpdate_163317429826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term14502 = new HashMap();
        HashMap term14507 = new HashMap();
        HashMap term14527 = new HashMap();
        HashMap term14532 = new HashMap();
        ArrayList term14537 = new ArrayList();
        Class<? extends Object> term14592 = Class.forName((String) "commons.Color");
        Field term14591 = ((Class) term14592).getDeclaredField((String) "WHITE");
        ((Field) term14591).setAccessible(true);
        Object enum121 = ((Field) term14591).get((Object) null);
        Class<? extends Object> term14679 = Class.forName((String) "pieces.PieceType");
        Field term14678 = ((Class) term14679).getDeclaredField((String) "PAWN");
        ((Field) term14678).setAccessible(true);
        Object enum122 = ((Field) term14678).get((Object) null);
        term14501 = newInstance(Class.forName("game.Board"));
        long[] term14541 = (long[]) newLongArray(6);
        Object[] term14549 = (Object[]) newArray("[Z", 2);
        boolean[] term14550 = (boolean[]) newBooleanArray(2);
        boolean[] term14553 = (boolean[]) newBooleanArray(2);
        Object term14561 = newInstance(Class.forName("game.Move"));
        Object term14562 = newInstance(Class.forName("commons.Piece"));
        Object term14563 = newInstance(Class.forName("game.Cell"));
        Object term14569 = newInstance(Class.forName("game.Cell"));
        Object term14573 = newInstance(Class.forName("game.Cell"));
        Object[] term14577 = (Object[]) newArray("commons.Piece", 2);
        setField(term14501, term14501.getClass(), "pieces", term14502);
        setField(term14501, term14501.getClass(), "playerPieces", term14507);
        setField(term14501, term14501.getClass(), "moves", term14527);
        setField(term14501, term14501.getClass(), "guards", term14532);
        setField(term14501, term14501.getClass(), "moveList", term14537);
        setField(term14501, term14501.getClass(), "positions", term14541);
        setIntField(term14501, term14501.getClass(), "positionIndex", -2119545015);
        setBooleanElement(term14550, 0, true);
        setBooleanElement(term14550, 1, true);
        setElement(term14549, 0, term14550);
        setBooleanElement(term14553, 0, true);
        setBooleanElement(term14553, 1, true);
        setElement(term14549, 1, term14553);
        setField(term14501, term14501.getClass(), "canCastle", term14549);
        setLongField(term14501, term14501.getClass(), "zobristHash", 2486810210675247493L);
        setField(term14501, term14501.getClass(), "playerToMove", enum121);
        setBooleanField(term14501, term14501.getClass(), "isThreeFoldRepetition", false);
        setIntField(term14501, term14501.getClass(), "halfMoves", 1272542218);
        setBooleanField(term14501, term14501.getClass(), "fiftyMoveDraw", true);
        setBooleanField(term14501, term14501.getClass(), "inCheck", true);
        setField(term14562, term14562.getClass(), "color", enum121);
        setIntField(term14563, term14563.getClass(), "row", 1209799204);
        setIntField(term14563, term14563.getClass(), "col", 1094107751);
        setField(term14562, term14562.getClass(), "position", term14563);
        setField(term14562, term14562.getClass(), "pieceType", enum122);
        setField(term14561, term14561.getClass(), "piece", term14562);
        setIntField(term14569, term14569.getClass(), "row", 844222656);
        setIntField(term14569, term14569.getClass(), "col", -18216811);
        setField(term14561, term14561.getClass(), "target", term14569);
        setBooleanField(term14561, term14561.getClass(), "captureMove", true);
        setIntField(term14573, term14573.getClass(), "row", -1813280137);
        setIntField(term14573, term14573.getClass(), "col", 719656595);
        setField(term14561, term14561.getClass(), "captureCell", term14573);
        setField(term14561, term14561.getClass(), "promoteTo", enum122);
        setIntField(term14561, term14561.getClass(), "id", -1516995753);
        setField(term14501, term14501.getClass(), "previousMove", term14561);
        setField(term14501, term14501.getClass(), "kings", term14577);
        term14578 = newInstance(Class.forName("game.Cell"));
        setIntField(term14578, term14578.getClass(), "row", -390501023);
        setIntField(term14578, term14578.getClass(), "col", -1667482829);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("game.Cell");
        argTypes[1] = Class.forName("java.util.function.Consumer");
        argTypes[2] = Class.forName("java.util.function.BiConsumer");
        argTypes[3] = Class.forName("java.util.function.BiConsumer");
        Object[] args = new Object[4];
        args[0] = term14578;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "longRangeUpdate", argTypes, term14501, args);
    }

};


