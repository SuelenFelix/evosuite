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
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.util.ArrayList;

public class King_xRay_13279088386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3270;
     Object term3308;
     Object term3380;

    public King_xRay_13279088386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3395 = Class.forName((String) "commons.Color");
        Field term3394 = ((Class) term3395).getDeclaredField((String) "BLACK");
        ((Field) term3394).setAccessible(true);
        Object enum26 = ((Field) term3394).get((Object) null);
        Class<? extends Object> term3482 = Class.forName((String) "pieces.PieceType");
        Field term3481 = ((Class) term3482).getDeclaredField((String) "ROOK");
        ((Field) term3481).setAccessible(true);
        Object enum27 = ((Field) term3481).get((Object) null);
        Class<? extends Object> term3581 = Class.forName((String) "pieces.PieceType");
        Field term3580 = ((Class) term3581).getDeclaredField((String) "PAWN");
        ((Field) term3580).setAccessible(true);
        Object enum28 = ((Field) term3580).get((Object) null);
        term3270 = newInstance(Class.forName("game.Move"));
        Object term3271 = newInstance(Class.forName("commons.Piece"));
        Object term3281 = newInstance(Class.forName("game.Cell"));
        Object term3292 = newInstance(Class.forName("game.Cell"));
        Object term3296 = newInstance(Class.forName("game.Cell"));
        setField(term3271, term3271.getClass(), "color", enum26);
        setIntField(term3281, term3281.getClass(), "row", 107945604);
        setIntField(term3281, term3281.getClass(), "col", -1963464809);
        setField(term3271, term3271.getClass(), "position", term3281);
        setField(term3271, term3271.getClass(), "pieceType", enum27);
        setField(term3270, term3270.getClass(), "piece", term3271);
        setIntField(term3292, term3292.getClass(), "row", 71190297);
        setIntField(term3292, term3292.getClass(), "col", 1202361360);
        setField(term3270, term3270.getClass(), "target", term3292);
        setBooleanField(term3270, term3270.getClass(), "captureMove", true);
        setIntField(term3296, term3296.getClass(), "row", -2015048153);
        setIntField(term3296, term3296.getClass(), "col", -2063457669);
        setField(term3270, term3270.getClass(), "captureCell", term3296);
        setField(term3270, term3270.getClass(), "promoteTo", enum28);
        setIntField(term3270, term3270.getClass(), "id", -1222006000);
        HashMap term3309 = new HashMap();
        HashMap term3314 = new HashMap();
        HashMap term3332 = new HashMap();
        HashMap term3337 = new HashMap();
        ArrayList term3342 = new ArrayList();
        Class<? extends Object> term3690 = Class.forName((String) "commons.Color");
        Field term3689 = ((Class) term3690).getDeclaredField((String) "WHITE");
        ((Field) term3689).setAccessible(true);
        Object enum29 = ((Field) term3689).get((Object) null);
        term3308 = newInstance(Class.forName("game.Board"));
        long[] term3346 = (long[]) newLongArray(6);
        Object[] term3354 = (Object[]) newArray("[Z", 2);
        boolean[] term3355 = (boolean[]) newBooleanArray(2);
        boolean[] term3358 = (boolean[]) newBooleanArray(2);
        Object term3366 = newInstance(Class.forName("game.Move"));
        Object term3367 = newInstance(Class.forName("commons.Piece"));
        Object term3368 = newInstance(Class.forName("game.Cell"));
        Object term3371 = newInstance(Class.forName("game.Cell"));
        Object term3375 = newInstance(Class.forName("game.Cell"));
        Object[] term3379 = (Object[]) newArray("commons.Piece", 2);
        setField(term3308, term3308.getClass(), "pieces", term3309);
        setField(term3308, term3308.getClass(), "playerPieces", term3314);
        setField(term3308, term3308.getClass(), "moves", term3332);
        setField(term3308, term3308.getClass(), "guards", term3337);
        setField(term3308, term3308.getClass(), "moveList", term3342);
        setField(term3308, term3308.getClass(), "positions", term3346);
        setIntField(term3308, term3308.getClass(), "positionIndex", 2095798786);
        setBooleanElement(term3355, 0, true);
        setBooleanElement(term3355, 1, true);
        setElement(term3354, 0, term3355);
        setBooleanElement(term3358, 0, true);
        setBooleanElement(term3358, 1, true);
        setElement(term3354, 1, term3358);
        setField(term3308, term3308.getClass(), "canCastle", term3354);
        setLongField(term3308, term3308.getClass(), "zobristHash", 4872422362414183754L);
        setField(term3308, term3308.getClass(), "playerToMove", enum29);
        setBooleanField(term3308, term3308.getClass(), "isThreeFoldRepetition", false);
        setIntField(term3308, term3308.getClass(), "halfMoves", -1565502840);
        setBooleanField(term3308, term3308.getClass(), "fiftyMoveDraw", true);
        setBooleanField(term3308, term3308.getClass(), "inCheck", true);
        setField(term3367, term3367.getClass(), "color", enum26);
        setIntField(term3368, term3368.getClass(), "row", 344323424);
        setIntField(term3368, term3368.getClass(), "col", 9726679);
        setField(term3367, term3367.getClass(), "position", term3368);
        setField(term3367, term3367.getClass(), "pieceType", enum27);
        setField(term3366, term3366.getClass(), "piece", term3367);
        setIntField(term3371, term3371.getClass(), "row", -25637976);
        setIntField(term3371, term3371.getClass(), "col", 1555897383);
        setField(term3366, term3366.getClass(), "target", term3371);
        setBooleanField(term3366, term3366.getClass(), "captureMove", true);
        setIntField(term3375, term3375.getClass(), "row", 202001407);
        setIntField(term3375, term3375.getClass(), "col", 158873461);
        setField(term3366, term3366.getClass(), "captureCell", term3375);
        setField(term3366, term3366.getClass(), "promoteTo", enum28);
        setIntField(term3366, term3366.getClass(), "id", -430151637);
        setField(term3308, term3308.getClass(), "previousMove", term3366);
        setField(term3308, term3308.getClass(), "kings", term3379);
        Class<? extends Object> term3777 = Class.forName((String) "pieces.PieceType");
        Field term3776 = ((Class) term3777).getDeclaredField((String) "KNIGHT");
        ((Field) term3776).setAccessible(true);
        Object enum30 = ((Field) term3776).get((Object) null);
        term3380 = newInstance(Class.forName("commons.Piece"));
        Object term3381 = newInstance(Class.forName("game.Cell"));
        setField(term3380, term3380.getClass(), "color", enum26);
        setIntField(term3381, term3381.getClass(), "row", -1697741339);
        setIntField(term3381, term3381.getClass(), "col", 98922530);
        setField(term3380, term3380.getClass(), "position", term3381);
        setField(term3380, term3380.getClass(), "pieceType", enum30);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pieces.King");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("game.Move");
        argTypes[1] = Class.forName("game.Board");
        argTypes[2] = Class.forName("commons.Piece");
        Object[] args = new Object[3];
        args[0] = term3270;
        args[1] = term3308;
        args[2] = term3380;
        callMethod(klass, "xRay", argTypes, null, args);
    }

};


