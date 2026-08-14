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

public class Bishop_getMoveList_9236585131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term88;

    public Bishop_getMoveList_9236585131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2 = new HashMap();
        HashMap term7 = new HashMap();
        HashMap term27 = new HashMap();
        HashMap term32 = new HashMap();
        ArrayList term37 = new ArrayList();
        Class<? extends Object> term130 = Class.forName((String) "commons.Color");
        Field term129 = ((Class) term130).getDeclaredField((String) "WHITE");
        ((Field) term129).setAccessible(true);
        Object enum0 = ((Field) term129).get((Object) null);
        Class<? extends Object> term270 = Class.forName((String) "pieces.PieceType");
        Field term269 = ((Class) term270).getDeclaredField((String) "BISHOP");
        ((Field) term269).setAccessible(true);
        Object enum1 = ((Field) term269).get((Object) null);
        Class<? extends Object> term375 = Class.forName((String) "pieces.PieceType");
        Field term374 = ((Class) term375).getDeclaredField((String) "BISHOP");
        ((Field) term374).setAccessible(true);
        Object enum2 = ((Field) term374).get((Object) null);
        term1 = newInstance(Class.forName("game.Board"));
        long[] term41 = (long[]) newLongArray(6);
        Object[] term49 = (Object[]) newArray("[Z", 2);
        boolean[] term50 = (boolean[]) newBooleanArray(2);
        boolean[] term53 = (boolean[]) newBooleanArray(2);
        Object term61 = newInstance(Class.forName("game.Move"));
        Object term62 = newInstance(Class.forName("commons.Piece"));
        Object term63 = newInstance(Class.forName("game.Cell"));
        Object term69 = newInstance(Class.forName("game.Cell"));
        Object term73 = newInstance(Class.forName("game.Cell"));
        Object[] term87 = (Object[]) newArray("commons.Piece", 2);
        setField(term1, term1.getClass(), "pieces", term2);
        setField(term1, term1.getClass(), "playerPieces", term7);
        setField(term1, term1.getClass(), "moves", term27);
        setField(term1, term1.getClass(), "guards", term32);
        setField(term1, term1.getClass(), "moveList", term37);
        setField(term1, term1.getClass(), "positions", term41);
        setIntField(term1, term1.getClass(), "positionIndex", 568599855);
        setBooleanElement(term50, 0, true);
        setBooleanElement(term50, 1, true);
        setElement(term49, 0, term50);
        setBooleanElement(term53, 0, true);
        setBooleanElement(term53, 1, true);
        setElement(term49, 1, term53);
        setField(term1, term1.getClass(), "canCastle", term49);
        setLongField(term1, term1.getClass(), "zobristHash", 2442117782898005296L);
        setField(term1, term1.getClass(), "playerToMove", enum0);
        setBooleanField(term1, term1.getClass(), "isThreeFoldRepetition", false);
        setIntField(term1, term1.getClass(), "halfMoves", 1162663216);
        setBooleanField(term1, term1.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term1, term1.getClass(), "inCheck", false);
        setField(term62, term62.getClass(), "color", enum0);
        setIntField(term63, term63.getClass(), "row", 1484323161);
        setIntField(term63, term63.getClass(), "col", 391863371);
        setField(term62, term62.getClass(), "position", term63);
        setField(term62, term62.getClass(), "pieceType", enum1);
        setField(term61, term61.getClass(), "piece", term62);
        setIntField(term69, term69.getClass(), "row", -1922583790);
        setIntField(term69, term69.getClass(), "col", -616727354);
        setField(term61, term61.getClass(), "target", term69);
        setBooleanField(term61, term61.getClass(), "captureMove", false);
        setIntField(term73, term73.getClass(), "row", -1955890973);
        setIntField(term73, term73.getClass(), "col", -2038273078);
        setField(term61, term61.getClass(), "captureCell", term73);
        setField(term61, term61.getClass(), "promoteTo", enum2);
        setIntField(term61, term61.getClass(), "id", 1227103734);
        setField(term1, term1.getClass(), "previousMove", term61);
        setField(term1, term1.getClass(), "kings", term87);
        Class<? extends Object> term480 = Class.forName((String) "pieces.PieceType");
        Field term479 = ((Class) term480).getDeclaredField((String) "QUEEN");
        ((Field) term479).setAccessible(true);
        Object enum3 = ((Field) term479).get((Object) null);
        term88 = newInstance(Class.forName("commons.Piece"));
        Object term89 = newInstance(Class.forName("game.Cell"));
        setField(term88, term88.getClass(), "color", enum0);
        setIntField(term89, term89.getClass(), "row", 1725571209);
        setIntField(term89, term89.getClass(), "col", -522618178);
        setField(term88, term88.getClass(), "position", term89);
        setField(term88, term88.getClass(), "pieceType", enum3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pieces.Bishop");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("game.Board");
        argTypes[1] = Class.forName("commons.Piece");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term88;
        callMethod(klass, "getMoveList", argTypes, null, args);
    }

};


