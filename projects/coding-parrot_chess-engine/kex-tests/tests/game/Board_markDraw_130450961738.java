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

public class Board_markDraw_130450961738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20467;
     Object term20552;

    public Board_markDraw_130450961738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term20468 = new HashMap();
        HashMap term20473 = new HashMap();
        HashMap term20493 = new HashMap();
        HashMap term20498 = new HashMap();
        ArrayList term20503 = new ArrayList();
        Class<? extends Object> term20576 = Class.forName((String) "commons.Color");
        Field term20575 = ((Class) term20576).getDeclaredField((String) "BLACK");
        ((Field) term20575).setAccessible(true);
        Object enum170 = ((Field) term20575).get((Object) null);
        Class<? extends Object> term20663 = Class.forName((String) "pieces.PieceType");
        Field term20662 = ((Class) term20663).getDeclaredField((String) "KING");
        ((Field) term20662).setAccessible(true);
        Object enum171 = ((Field) term20662).get((Object) null);
        Class<? extends Object> term20762 = Class.forName((String) "pieces.PieceType");
        Field term20761 = ((Class) term20762).getDeclaredField((String) "KING");
        ((Field) term20761).setAccessible(true);
        Object enum172 = ((Field) term20761).get((Object) null);
        term20467 = newInstance(Class.forName("game.Board"));
        long[] term20507 = (long[]) newLongArray(6);
        Object[] term20515 = (Object[]) newArray("[Z", 2);
        boolean[] term20516 = (boolean[]) newBooleanArray(2);
        boolean[] term20519 = (boolean[]) newBooleanArray(2);
        Object term20527 = newInstance(Class.forName("game.Move"));
        Object term20528 = newInstance(Class.forName("commons.Piece"));
        Object term20529 = newInstance(Class.forName("game.Cell"));
        Object term20535 = newInstance(Class.forName("game.Cell"));
        Object term20539 = newInstance(Class.forName("game.Cell"));
        Object[] term20551 = (Object[]) newArray("commons.Piece", 2);
        setField(term20467, term20467.getClass(), "pieces", term20468);
        setField(term20467, term20467.getClass(), "playerPieces", term20473);
        setField(term20467, term20467.getClass(), "moves", term20493);
        setField(term20467, term20467.getClass(), "guards", term20498);
        setField(term20467, term20467.getClass(), "moveList", term20503);
        setField(term20467, term20467.getClass(), "positions", term20507);
        setIntField(term20467, term20467.getClass(), "positionIndex", -380787857);
        setBooleanElement(term20516, 0, true);
        setBooleanElement(term20516, 1, true);
        setElement(term20515, 0, term20516);
        setBooleanElement(term20519, 0, true);
        setBooleanElement(term20519, 1, true);
        setElement(term20515, 1, term20519);
        setField(term20467, term20467.getClass(), "canCastle", term20515);
        setLongField(term20467, term20467.getClass(), "zobristHash", 6617340557564669657L);
        setField(term20467, term20467.getClass(), "playerToMove", enum170);
        setBooleanField(term20467, term20467.getClass(), "isThreeFoldRepetition", false);
        setIntField(term20467, term20467.getClass(), "halfMoves", 319853052);
        setBooleanField(term20467, term20467.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term20467, term20467.getClass(), "inCheck", true);
        setField(term20528, term20528.getClass(), "color", enum170);
        setIntField(term20529, term20529.getClass(), "row", -1097563716);
        setIntField(term20529, term20529.getClass(), "col", 1572907769);
        setField(term20528, term20528.getClass(), "position", term20529);
        setField(term20528, term20528.getClass(), "pieceType", enum171);
        setField(term20527, term20527.getClass(), "piece", term20528);
        setIntField(term20535, term20535.getClass(), "row", 1608016787);
        setIntField(term20535, term20535.getClass(), "col", -516303035);
        setField(term20527, term20527.getClass(), "target", term20535);
        setBooleanField(term20527, term20527.getClass(), "captureMove", false);
        setIntField(term20539, term20539.getClass(), "row", -2143043890);
        setIntField(term20539, term20539.getClass(), "col", -2138825831);
        setField(term20527, term20527.getClass(), "captureCell", term20539);
        setField(term20527, term20527.getClass(), "promoteTo", enum172);
        setIntField(term20527, term20527.getClass(), "id", 1454781562);
        setField(term20467, term20467.getClass(), "previousMove", term20527);
        setField(term20467, term20467.getClass(), "kings", term20551);
        Class<? extends Object> term20861 = Class.forName((String) "commons.Color");
        Field term20860 = ((Class) term20861).getDeclaredField((String) "BLACK");
        ((Field) term20860).setAccessible(true);
        Object enum173 = ((Field) term20860).get((Object) null);
        term20552 = newInstance(Class.forName("game.Move"));
        Object term20553 = newInstance(Class.forName("commons.Piece"));
        Object term20554 = newInstance(Class.forName("game.Cell"));
        Object term20557 = newInstance(Class.forName("game.Cell"));
        Object term20561 = newInstance(Class.forName("game.Cell"));
        setField(term20553, term20553.getClass(), "color", enum173);
        setIntField(term20554, term20554.getClass(), "row", -27944011);
        setIntField(term20554, term20554.getClass(), "col", -20614472);
        setField(term20553, term20553.getClass(), "position", term20554);
        setField(term20553, term20553.getClass(), "pieceType", enum172);
        setField(term20552, term20552.getClass(), "piece", term20553);
        setIntField(term20557, term20557.getClass(), "row", 1126618861);
        setIntField(term20557, term20557.getClass(), "col", 947449400);
        setField(term20552, term20552.getClass(), "target", term20557);
        setBooleanField(term20552, term20552.getClass(), "captureMove", false);
        setIntField(term20561, term20561.getClass(), "row", -763799087);
        setIntField(term20561, term20561.getClass(), "col", 1207142014);
        setField(term20552, term20552.getClass(), "captureCell", term20561);
        setField(term20552, term20552.getClass(), "promoteTo", enum171);
        setIntField(term20552, term20552.getClass(), "id", -876426634);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("game.Move");
        Object[] args = new Object[1];
        args[0] = term20552;
        callMethod(klass, "markDraw", argTypes, term20467, args);
    }

};


