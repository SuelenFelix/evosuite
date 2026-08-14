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

public class Board_fenRepresentation_35800603942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22506;

    public Board_fenRepresentation_35800603942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term22507 = new HashMap();
        HashMap term22512 = new HashMap();
        HashMap term22532 = new HashMap();
        HashMap term22537 = new HashMap();
        ArrayList term22542 = new ArrayList();
        Class<? extends Object> term22602 = Class.forName((String) "commons.Color");
        Field term22601 = ((Class) term22602).getDeclaredField((String) "WHITE");
        ((Field) term22601).setAccessible(true);
        Object enum187 = ((Field) term22601).get((Object) null);
        Class<? extends Object> term22689 = Class.forName((String) "pieces.PieceType");
        Field term22688 = ((Class) term22689).getDeclaredField((String) "BISHOP");
        ((Field) term22688).setAccessible(true);
        Object enum188 = ((Field) term22688).get((Object) null);
        Class<? extends Object> term22794 = Class.forName((String) "pieces.PieceType");
        Field term22793 = ((Class) term22794).getDeclaredField((String) "PAWN");
        ((Field) term22793).setAccessible(true);
        Object enum189 = ((Field) term22793).get((Object) null);
        term22506 = newInstance(Class.forName("game.Board"));
        long[] term22546 = (long[]) newLongArray(6);
        Object[] term22554 = (Object[]) newArray("[Z", 2);
        boolean[] term22555 = (boolean[]) newBooleanArray(2);
        boolean[] term22558 = (boolean[]) newBooleanArray(2);
        Object term22566 = newInstance(Class.forName("game.Move"));
        Object term22567 = newInstance(Class.forName("commons.Piece"));
        Object term22568 = newInstance(Class.forName("game.Cell"));
        Object term22574 = newInstance(Class.forName("game.Cell"));
        Object term22578 = newInstance(Class.forName("game.Cell"));
        Object[] term22590 = (Object[]) newArray("commons.Piece", 2);
        setField(term22506, term22506.getClass(), "pieces", term22507);
        setField(term22506, term22506.getClass(), "playerPieces", term22512);
        setField(term22506, term22506.getClass(), "moves", term22532);
        setField(term22506, term22506.getClass(), "guards", term22537);
        setField(term22506, term22506.getClass(), "moveList", term22542);
        setField(term22506, term22506.getClass(), "positions", term22546);
        setIntField(term22506, term22506.getClass(), "positionIndex", 864645689);
        setBooleanElement(term22555, 0, true);
        setBooleanElement(term22555, 1, true);
        setElement(term22554, 0, term22555);
        setBooleanElement(term22558, 0, true);
        setBooleanElement(term22558, 1, true);
        setElement(term22554, 1, term22558);
        setField(term22506, term22506.getClass(), "canCastle", term22554);
        setLongField(term22506, term22506.getClass(), "zobristHash", 4178434741742309755L);
        setField(term22506, term22506.getClass(), "playerToMove", enum187);
        setBooleanField(term22506, term22506.getClass(), "isThreeFoldRepetition", true);
        setIntField(term22506, term22506.getClass(), "halfMoves", 279384872);
        setBooleanField(term22506, term22506.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term22506, term22506.getClass(), "inCheck", true);
        setField(term22567, term22567.getClass(), "color", enum187);
        setIntField(term22568, term22568.getClass(), "row", 1427305953);
        setIntField(term22568, term22568.getClass(), "col", -781832877);
        setField(term22567, term22567.getClass(), "position", term22568);
        setField(term22567, term22567.getClass(), "pieceType", enum188);
        setField(term22566, term22566.getClass(), "piece", term22567);
        setIntField(term22574, term22574.getClass(), "row", 797203987);
        setIntField(term22574, term22574.getClass(), "col", 1973060703);
        setField(term22566, term22566.getClass(), "target", term22574);
        setBooleanField(term22566, term22566.getClass(), "captureMove", false);
        setIntField(term22578, term22578.getClass(), "row", -138239905);
        setIntField(term22578, term22578.getClass(), "col", 1709474063);
        setField(term22566, term22566.getClass(), "captureCell", term22578);
        setField(term22566, term22566.getClass(), "promoteTo", enum189);
        setIntField(term22566, term22566.getClass(), "id", 1406617209);
        setField(term22506, term22506.getClass(), "previousMove", term22566);
        setField(term22506, term22506.getClass(), "kings", term22590);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "fenRepresentation", argTypes, term22506, args);
    }

};


