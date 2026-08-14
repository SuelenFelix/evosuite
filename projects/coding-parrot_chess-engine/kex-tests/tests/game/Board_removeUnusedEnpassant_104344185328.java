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

public class Board_removeUnusedEnpassant_104344185328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15396;

    public Board_removeUnusedEnpassant_104344185328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term15397 = new HashMap();
        HashMap term15402 = new HashMap();
        HashMap term15422 = new HashMap();
        HashMap term15427 = new HashMap();
        ArrayList term15432 = new ArrayList();
        Class<? extends Object> term15492 = Class.forName((String) "commons.Color");
        Field term15491 = ((Class) term15492).getDeclaredField((String) "WHITE");
        ((Field) term15491).setAccessible(true);
        Object enum128 = ((Field) term15491).get((Object) null);
        Class<? extends Object> term15579 = Class.forName((String) "commons.Color");
        Field term15578 = ((Class) term15579).getDeclaredField((String) "BLACK");
        ((Field) term15578).setAccessible(true);
        Object enum129 = ((Field) term15578).get((Object) null);
        Class<? extends Object> term15666 = Class.forName((String) "pieces.PieceType");
        Field term15665 = ((Class) term15666).getDeclaredField((String) "KING");
        ((Field) term15665).setAccessible(true);
        Object enum130 = ((Field) term15665).get((Object) null);
        Class<? extends Object> term15765 = Class.forName((String) "pieces.PieceType");
        Field term15764 = ((Class) term15765).getDeclaredField((String) "KING");
        ((Field) term15764).setAccessible(true);
        Object enum131 = ((Field) term15764).get((Object) null);
        term15396 = newInstance(Class.forName("game.Board"));
        long[] term15436 = (long[]) newLongArray(6);
        Object[] term15444 = (Object[]) newArray("[Z", 2);
        boolean[] term15445 = (boolean[]) newBooleanArray(2);
        boolean[] term15448 = (boolean[]) newBooleanArray(2);
        Object term15456 = newInstance(Class.forName("game.Move"));
        Object term15457 = newInstance(Class.forName("commons.Piece"));
        Object term15458 = newInstance(Class.forName("game.Cell"));
        Object term15464 = newInstance(Class.forName("game.Cell"));
        Object term15468 = newInstance(Class.forName("game.Cell"));
        Object[] term15480 = (Object[]) newArray("commons.Piece", 2);
        setField(term15396, term15396.getClass(), "pieces", term15397);
        setField(term15396, term15396.getClass(), "playerPieces", term15402);
        setField(term15396, term15396.getClass(), "moves", term15422);
        setField(term15396, term15396.getClass(), "guards", term15427);
        setField(term15396, term15396.getClass(), "moveList", term15432);
        setField(term15396, term15396.getClass(), "positions", term15436);
        setIntField(term15396, term15396.getClass(), "positionIndex", -350454594);
        setBooleanElement(term15445, 0, true);
        setBooleanElement(term15445, 1, true);
        setElement(term15444, 0, term15445);
        setBooleanElement(term15448, 0, true);
        setBooleanElement(term15448, 1, true);
        setElement(term15444, 1, term15448);
        setField(term15396, term15396.getClass(), "canCastle", term15444);
        setLongField(term15396, term15396.getClass(), "zobristHash", -7672528020740371001L);
        setField(term15396, term15396.getClass(), "playerToMove", enum128);
        setBooleanField(term15396, term15396.getClass(), "isThreeFoldRepetition", true);
        setIntField(term15396, term15396.getClass(), "halfMoves", -1148142995);
        setBooleanField(term15396, term15396.getClass(), "fiftyMoveDraw", true);
        setBooleanField(term15396, term15396.getClass(), "inCheck", false);
        setField(term15457, term15457.getClass(), "color", enum129);
        setIntField(term15458, term15458.getClass(), "row", -233024044);
        setIntField(term15458, term15458.getClass(), "col", 1820784228);
        setField(term15457, term15457.getClass(), "position", term15458);
        setField(term15457, term15457.getClass(), "pieceType", enum130);
        setField(term15456, term15456.getClass(), "piece", term15457);
        setIntField(term15464, term15464.getClass(), "row", 1390820006);
        setIntField(term15464, term15464.getClass(), "col", -828982065);
        setField(term15456, term15456.getClass(), "target", term15464);
        setBooleanField(term15456, term15456.getClass(), "captureMove", false);
        setIntField(term15468, term15468.getClass(), "row", 1221443226);
        setIntField(term15468, term15468.getClass(), "col", 908108726);
        setField(term15456, term15456.getClass(), "captureCell", term15468);
        setField(term15456, term15456.getClass(), "promoteTo", enum131);
        setIntField(term15456, term15456.getClass(), "id", 1023209512);
        setField(term15396, term15396.getClass(), "previousMove", term15456);
        setField(term15396, term15396.getClass(), "kings", term15480);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "removeUnusedEnpassant", argTypes, term15396, args);
    }

};


