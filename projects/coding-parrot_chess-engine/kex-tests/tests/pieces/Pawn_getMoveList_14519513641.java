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

public class Pawn_getMoveList_14519513641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5193;
     Object term5280;

    public Pawn_getMoveList_14519513641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5194 = new HashMap();
        HashMap term5199 = new HashMap();
        HashMap term5219 = new HashMap();
        HashMap term5224 = new HashMap();
        ArrayList term5229 = new ArrayList();
        Class<? extends Object> term5304 = Class.forName((String) "commons.Color");
        Field term5303 = ((Class) term5304).getDeclaredField((String) "BLACK");
        ((Field) term5303).setAccessible(true);
        Object enum42 = ((Field) term5303).get((Object) null);
        Class<? extends Object> term5391 = Class.forName((String) "commons.Color");
        Field term5390 = ((Class) term5391).getDeclaredField((String) "BLACK");
        ((Field) term5390).setAccessible(true);
        Object enum43 = ((Field) term5390).get((Object) null);
        Class<? extends Object> term5478 = Class.forName((String) "pieces.PieceType");
        Field term5477 = ((Class) term5478).getDeclaredField((String) "KING");
        ((Field) term5477).setAccessible(true);
        Object enum44 = ((Field) term5477).get((Object) null);
        Class<? extends Object> term5577 = Class.forName((String) "pieces.PieceType");
        Field term5576 = ((Class) term5577).getDeclaredField((String) "BISHOP");
        ((Field) term5576).setAccessible(true);
        Object enum45 = ((Field) term5576).get((Object) null);
        term5193 = newInstance(Class.forName("game.Board"));
        long[] term5233 = (long[]) newLongArray(6);
        Object[] term5241 = (Object[]) newArray("[Z", 2);
        boolean[] term5242 = (boolean[]) newBooleanArray(2);
        boolean[] term5245 = (boolean[]) newBooleanArray(2);
        Object term5253 = newInstance(Class.forName("game.Move"));
        Object term5254 = newInstance(Class.forName("commons.Piece"));
        Object term5255 = newInstance(Class.forName("game.Cell"));
        Object term5261 = newInstance(Class.forName("game.Cell"));
        Object term5265 = newInstance(Class.forName("game.Cell"));
        Object[] term5279 = (Object[]) newArray("commons.Piece", 2);
        setField(term5193, term5193.getClass(), "pieces", term5194);
        setField(term5193, term5193.getClass(), "playerPieces", term5199);
        setField(term5193, term5193.getClass(), "moves", term5219);
        setField(term5193, term5193.getClass(), "guards", term5224);
        setField(term5193, term5193.getClass(), "moveList", term5229);
        setField(term5193, term5193.getClass(), "positions", term5233);
        setIntField(term5193, term5193.getClass(), "positionIndex", 663292551);
        setBooleanElement(term5242, 0, true);
        setBooleanElement(term5242, 1, true);
        setElement(term5241, 0, term5242);
        setBooleanElement(term5245, 0, true);
        setBooleanElement(term5245, 1, true);
        setElement(term5241, 1, term5245);
        setField(term5193, term5193.getClass(), "canCastle", term5241);
        setLongField(term5193, term5193.getClass(), "zobristHash", 6967924379644551255L);
        setField(term5193, term5193.getClass(), "playerToMove", enum42);
        setBooleanField(term5193, term5193.getClass(), "isThreeFoldRepetition", true);
        setIntField(term5193, term5193.getClass(), "halfMoves", -1885090354);
        setBooleanField(term5193, term5193.getClass(), "fiftyMoveDraw", true);
        setBooleanField(term5193, term5193.getClass(), "inCheck", false);
        setField(term5254, term5254.getClass(), "color", enum43);
        setIntField(term5255, term5255.getClass(), "row", -2066804303);
        setIntField(term5255, term5255.getClass(), "col", -1731761810);
        setField(term5254, term5254.getClass(), "position", term5255);
        setField(term5254, term5254.getClass(), "pieceType", enum44);
        setField(term5253, term5253.getClass(), "piece", term5254);
        setIntField(term5261, term5261.getClass(), "row", 197109649);
        setIntField(term5261, term5261.getClass(), "col", -1239406390);
        setField(term5253, term5253.getClass(), "target", term5261);
        setBooleanField(term5253, term5253.getClass(), "captureMove", true);
        setIntField(term5265, term5265.getClass(), "row", 1557431527);
        setIntField(term5265, term5265.getClass(), "col", -1504890659);
        setField(term5253, term5253.getClass(), "captureCell", term5265);
        setField(term5253, term5253.getClass(), "promoteTo", enum45);
        setIntField(term5253, term5253.getClass(), "id", 1358829571);
        setField(term5193, term5193.getClass(), "previousMove", term5253);
        setField(term5193, term5193.getClass(), "kings", term5279);
        Class<? extends Object> term5682 = Class.forName((String) "pieces.PieceType");
        Field term5681 = ((Class) term5682).getDeclaredField((String) "QUEEN");
        ((Field) term5681).setAccessible(true);
        Object enum46 = ((Field) term5681).get((Object) null);
        term5280 = newInstance(Class.forName("commons.Piece"));
        Object term5281 = newInstance(Class.forName("game.Cell"));
        setField(term5280, term5280.getClass(), "color", enum43);
        setIntField(term5281, term5281.getClass(), "row", 991356662);
        setIntField(term5281, term5281.getClass(), "col", -506958186);
        setField(term5280, term5280.getClass(), "position", term5281);
        setField(term5280, term5280.getClass(), "pieceType", enum46);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pieces.Pawn");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("game.Board");
        argTypes[1] = Class.forName("commons.Piece");
        Object[] args = new Object[2];
        args[0] = term5193;
        args[1] = term5280;
        callMethod(klass, "getMoveList", argTypes, null, args);
    }

};


