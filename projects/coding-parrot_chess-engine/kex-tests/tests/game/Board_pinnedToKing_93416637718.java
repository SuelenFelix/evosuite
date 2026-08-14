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

public class Board_pinnedToKing_93416637718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10050;
     Object term10137;

    public Board_pinnedToKing_93416637718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10051 = new HashMap();
        HashMap term10056 = new HashMap();
        HashMap term10076 = new HashMap();
        HashMap term10081 = new HashMap();
        ArrayList term10086 = new ArrayList();
        Class<? extends Object> term10160 = Class.forName((String) "commons.Color");
        Field term10159 = ((Class) term10160).getDeclaredField((String) "WHITE");
        ((Field) term10159).setAccessible(true);
        Object enum84 = ((Field) term10159).get((Object) null);
        Class<? extends Object> term10247 = Class.forName((String) "commons.Color");
        Field term10246 = ((Class) term10247).getDeclaredField((String) "BLACK");
        ((Field) term10246).setAccessible(true);
        Object enum85 = ((Field) term10246).get((Object) null);
        Class<? extends Object> term10334 = Class.forName((String) "pieces.PieceType");
        Field term10333 = ((Class) term10334).getDeclaredField((String) "QUEEN");
        ((Field) term10333).setAccessible(true);
        Object enum86 = ((Field) term10333).get((Object) null);
        Class<? extends Object> term10436 = Class.forName((String) "pieces.PieceType");
        Field term10435 = ((Class) term10436).getDeclaredField((String) "KNIGHT");
        ((Field) term10435).setAccessible(true);
        Object enum87 = ((Field) term10435).get((Object) null);
        term10050 = newInstance(Class.forName("game.Board"));
        long[] term10090 = (long[]) newLongArray(6);
        Object[] term10098 = (Object[]) newArray("[Z", 2);
        boolean[] term10099 = (boolean[]) newBooleanArray(2);
        boolean[] term10102 = (boolean[]) newBooleanArray(2);
        Object term10110 = newInstance(Class.forName("game.Move"));
        Object term10111 = newInstance(Class.forName("commons.Piece"));
        Object term10112 = newInstance(Class.forName("game.Cell"));
        Object term10118 = newInstance(Class.forName("game.Cell"));
        Object term10122 = newInstance(Class.forName("game.Cell"));
        Object[] term10136 = (Object[]) newArray("commons.Piece", 2);
        setField(term10050, term10050.getClass(), "pieces", term10051);
        setField(term10050, term10050.getClass(), "playerPieces", term10056);
        setField(term10050, term10050.getClass(), "moves", term10076);
        setField(term10050, term10050.getClass(), "guards", term10081);
        setField(term10050, term10050.getClass(), "moveList", term10086);
        setField(term10050, term10050.getClass(), "positions", term10090);
        setIntField(term10050, term10050.getClass(), "positionIndex", 1959097203);
        setBooleanElement(term10099, 0, true);
        setBooleanElement(term10099, 1, true);
        setElement(term10098, 0, term10099);
        setBooleanElement(term10102, 0, true);
        setBooleanElement(term10102, 1, true);
        setElement(term10098, 1, term10102);
        setField(term10050, term10050.getClass(), "canCastle", term10098);
        setLongField(term10050, term10050.getClass(), "zobristHash", -316468845751588286L);
        setField(term10050, term10050.getClass(), "playerToMove", enum84);
        setBooleanField(term10050, term10050.getClass(), "isThreeFoldRepetition", false);
        setIntField(term10050, term10050.getClass(), "halfMoves", -209654048);
        setBooleanField(term10050, term10050.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term10050, term10050.getClass(), "inCheck", false);
        setField(term10111, term10111.getClass(), "color", enum85);
        setIntField(term10112, term10112.getClass(), "row", 477625804);
        setIntField(term10112, term10112.getClass(), "col", 252575029);
        setField(term10111, term10111.getClass(), "position", term10112);
        setField(term10111, term10111.getClass(), "pieceType", enum86);
        setField(term10110, term10110.getClass(), "piece", term10111);
        setIntField(term10118, term10118.getClass(), "row", 57189932);
        setIntField(term10118, term10118.getClass(), "col", 1460722225);
        setField(term10110, term10110.getClass(), "target", term10118);
        setBooleanField(term10110, term10110.getClass(), "captureMove", true);
        setIntField(term10122, term10122.getClass(), "row", 1743224434);
        setIntField(term10122, term10122.getClass(), "col", 842904495);
        setField(term10110, term10110.getClass(), "captureCell", term10122);
        setField(term10110, term10110.getClass(), "promoteTo", enum87);
        setIntField(term10110, term10110.getClass(), "id", 1008080511);
        setField(term10050, term10050.getClass(), "previousMove", term10110);
        setField(term10050, term10050.getClass(), "kings", term10136);
        Class<? extends Object> term10541 = Class.forName((String) "pieces.PieceType");
        Field term10540 = ((Class) term10541).getDeclaredField((String) "ROOK");
        ((Field) term10540).setAccessible(true);
        Object enum88 = ((Field) term10540).get((Object) null);
        term10137 = newInstance(Class.forName("commons.Piece"));
        Object term10138 = newInstance(Class.forName("game.Cell"));
        setField(term10137, term10137.getClass(), "color", enum84);
        setIntField(term10138, term10138.getClass(), "row", 1935707624);
        setIntField(term10138, term10138.getClass(), "col", 1507074215);
        setField(term10137, term10137.getClass(), "position", term10138);
        setField(term10137, term10137.getClass(), "pieceType", enum88);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("commons.Piece");
        Object[] args = new Object[1];
        args[0] = term10137;
        callMethod(klass, "pinnedToKing", argTypes, term10050, args);
    }

};


