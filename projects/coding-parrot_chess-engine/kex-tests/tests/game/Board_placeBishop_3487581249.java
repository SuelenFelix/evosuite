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
import java.lang.Integer;

public class Board_placeBishop_3487581249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5521;
     Object term5606;
     Object term5608;
     Object enum47;

    public Board_placeBishop_3487581249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5522 = new HashMap();
        HashMap term5527 = new HashMap();
        HashMap term5547 = new HashMap();
        HashMap term5552 = new HashMap();
        ArrayList term5557 = new ArrayList();
        Class<? extends Object> term5621 = Class.forName((String) "commons.Color");
        Field term5620 = ((Class) term5621).getDeclaredField((String) "WHITE");
        ((Field) term5620).setAccessible(true);
        Object enum46 = ((Field) term5620).get((Object) null);
        Class<? extends Object> term5708 = Class.forName((String) "commons.Color");
        Field term5707 = ((Class) term5708).getDeclaredField((String) "WHITE");
        ((Field) term5707).setAccessible(true);
        enum47 = ((Field) term5707).get((Object) null);
        Class<? extends Object> term5795 = Class.forName((String) "pieces.PieceType");
        Field term5794 = ((Class) term5795).getDeclaredField((String) "QUEEN");
        ((Field) term5794).setAccessible(true);
        Object enum48 = ((Field) term5794).get((Object) null);
        Class<? extends Object> term5897 = Class.forName((String) "pieces.PieceType");
        Field term5896 = ((Class) term5897).getDeclaredField((String) "ROOK");
        ((Field) term5896).setAccessible(true);
        Object enum49 = ((Field) term5896).get((Object) null);
        term5521 = newInstance(Class.forName("game.Board"));
        long[] term5561 = (long[]) newLongArray(6);
        Object[] term5569 = (Object[]) newArray("[Z", 2);
        boolean[] term5570 = (boolean[]) newBooleanArray(2);
        boolean[] term5573 = (boolean[]) newBooleanArray(2);
        Object term5581 = newInstance(Class.forName("game.Move"));
        Object term5582 = newInstance(Class.forName("commons.Piece"));
        Object term5583 = newInstance(Class.forName("game.Cell"));
        Object term5589 = newInstance(Class.forName("game.Cell"));
        Object term5593 = newInstance(Class.forName("game.Cell"));
        Object[] term5605 = (Object[]) newArray("commons.Piece", 2);
        setField(term5521, term5521.getClass(), "pieces", term5522);
        setField(term5521, term5521.getClass(), "playerPieces", term5527);
        setField(term5521, term5521.getClass(), "moves", term5547);
        setField(term5521, term5521.getClass(), "guards", term5552);
        setField(term5521, term5521.getClass(), "moveList", term5557);
        setField(term5521, term5521.getClass(), "positions", term5561);
        setIntField(term5521, term5521.getClass(), "positionIndex", 2095798786);
        setBooleanElement(term5570, 0, true);
        setBooleanElement(term5570, 1, true);
        setElement(term5569, 0, term5570);
        setBooleanElement(term5573, 0, true);
        setBooleanElement(term5573, 1, true);
        setElement(term5569, 1, term5573);
        setField(term5521, term5521.getClass(), "canCastle", term5569);
        setLongField(term5521, term5521.getClass(), "zobristHash", 6811161968424632369L);
        setField(term5521, term5521.getClass(), "playerToMove", enum46);
        setBooleanField(term5521, term5521.getClass(), "isThreeFoldRepetition", true);
        setIntField(term5521, term5521.getClass(), "halfMoves", -1565502840);
        setBooleanField(term5521, term5521.getClass(), "fiftyMoveDraw", true);
        setBooleanField(term5521, term5521.getClass(), "inCheck", true);
        setField(term5582, term5582.getClass(), "color", enum47);
        setIntField(term5583, term5583.getClass(), "row", 344323424);
        setIntField(term5583, term5583.getClass(), "col", 9726679);
        setField(term5582, term5582.getClass(), "position", term5583);
        setField(term5582, term5582.getClass(), "pieceType", enum48);
        setField(term5581, term5581.getClass(), "piece", term5582);
        setIntField(term5589, term5589.getClass(), "row", -25637976);
        setIntField(term5589, term5589.getClass(), "col", 1555897383);
        setField(term5581, term5581.getClass(), "target", term5589);
        setBooleanField(term5581, term5581.getClass(), "captureMove", false);
        setIntField(term5593, term5593.getClass(), "row", 202001407);
        setIntField(term5593, term5593.getClass(), "col", 158873461);
        setField(term5581, term5581.getClass(), "captureCell", term5593);
        setField(term5581, term5581.getClass(), "promoteTo", enum49);
        setIntField(term5581, term5581.getClass(), "id", -430151637);
        setField(term5521, term5521.getClass(), "previousMove", term5581);
        setField(term5521, term5521.getClass(), "kings", term5605);
        term5606 = new Integer(-1697741339);
        term5608 = new Integer(98922530);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("commons.Color");
        Object[] args = new Object[3];
        args[0] = term5606;
        args[1] = term5608;
        args[2] = enum47;
        callMethod(klass, "placeBishop", argTypes, term5521, args);
    }

};


