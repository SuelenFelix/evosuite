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

public class Board_getLegalMoves_27190312313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7327;

    public Board_getLegalMoves_27190312313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7328 = new HashMap();
        HashMap term7333 = new HashMap();
        HashMap term7353 = new HashMap();
        HashMap term7358 = new HashMap();
        ArrayList term7363 = new ArrayList();
        Class<? extends Object> term7425 = Class.forName((String) "commons.Color");
        Field term7424 = ((Class) term7425).getDeclaredField((String) "BLACK");
        ((Field) term7424).setAccessible(true);
        Object enum61 = ((Field) term7424).get((Object) null);
        Class<? extends Object> term7512 = Class.forName((String) "commons.Color");
        Field term7511 = ((Class) term7512).getDeclaredField((String) "BLACK");
        ((Field) term7511).setAccessible(true);
        Object enum62 = ((Field) term7511).get((Object) null);
        Class<? extends Object> term7599 = Class.forName((String) "pieces.PieceType");
        Field term7598 = ((Class) term7599).getDeclaredField((String) "KNIGHT");
        ((Field) term7598).setAccessible(true);
        Object enum63 = ((Field) term7598).get((Object) null);
        Class<? extends Object> term7704 = Class.forName((String) "pieces.PieceType");
        Field term7703 = ((Class) term7704).getDeclaredField((String) "KNIGHT");
        ((Field) term7703).setAccessible(true);
        Object enum64 = ((Field) term7703).get((Object) null);
        term7327 = newInstance(Class.forName("game.Board"));
        long[] term7367 = (long[]) newLongArray(6);
        Object[] term7375 = (Object[]) newArray("[Z", 2);
        boolean[] term7376 = (boolean[]) newBooleanArray(2);
        boolean[] term7379 = (boolean[]) newBooleanArray(2);
        Object term7387 = newInstance(Class.forName("game.Move"));
        Object term7388 = newInstance(Class.forName("commons.Piece"));
        Object term7389 = newInstance(Class.forName("game.Cell"));
        Object term7395 = newInstance(Class.forName("game.Cell"));
        Object term7399 = newInstance(Class.forName("game.Cell"));
        Object[] term7413 = (Object[]) newArray("commons.Piece", 2);
        setField(term7327, term7327.getClass(), "pieces", term7328);
        setField(term7327, term7327.getClass(), "playerPieces", term7333);
        setField(term7327, term7327.getClass(), "moves", term7353);
        setField(term7327, term7327.getClass(), "guards", term7358);
        setField(term7327, term7327.getClass(), "moveList", term7363);
        setField(term7327, term7327.getClass(), "positions", term7367);
        setIntField(term7327, term7327.getClass(), "positionIndex", -507387516);
        setBooleanElement(term7376, 0, true);
        setBooleanElement(term7376, 1, true);
        setElement(term7375, 0, term7376);
        setBooleanElement(term7379, 0, true);
        setBooleanElement(term7379, 1, true);
        setElement(term7375, 1, term7379);
        setField(term7327, term7327.getClass(), "canCastle", term7375);
        setLongField(term7327, term7327.getClass(), "zobristHash", -8885298608300233488L);
        setField(term7327, term7327.getClass(), "playerToMove", enum61);
        setBooleanField(term7327, term7327.getClass(), "isThreeFoldRepetition", true);
        setIntField(term7327, term7327.getClass(), "halfMoves", -1970452551);
        setBooleanField(term7327, term7327.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term7327, term7327.getClass(), "inCheck", true);
        setField(term7388, term7388.getClass(), "color", enum62);
        setIntField(term7389, term7389.getClass(), "row", -1896376975);
        setIntField(term7389, term7389.getClass(), "col", 729658803);
        setField(term7388, term7388.getClass(), "position", term7389);
        setField(term7388, term7388.getClass(), "pieceType", enum63);
        setField(term7387, term7387.getClass(), "piece", term7388);
        setIntField(term7395, term7395.getClass(), "row", 114754804);
        setIntField(term7395, term7395.getClass(), "col", 1687361082);
        setField(term7387, term7387.getClass(), "target", term7395);
        setBooleanField(term7387, term7387.getClass(), "captureMove", false);
        setIntField(term7399, term7399.getClass(), "row", 584893196);
        setIntField(term7399, term7399.getClass(), "col", 497269071);
        setField(term7387, term7387.getClass(), "captureCell", term7399);
        setField(term7387, term7387.getClass(), "promoteTo", enum64);
        setIntField(term7387, term7387.getClass(), "id", -1899301124);
        setField(term7327, term7327.getClass(), "previousMove", term7387);
        setField(term7327, term7327.getClass(), "kings", term7413);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLegalMoves", argTypes, term7327, args);
    }

};


