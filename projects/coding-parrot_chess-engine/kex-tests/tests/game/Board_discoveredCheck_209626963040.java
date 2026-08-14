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

public class Board_discoveredCheck_209626963040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21562;
     Object term21639;
     Object term21651;

    public Board_discoveredCheck_209626963040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term21563 = new HashMap();
        HashMap term21568 = new HashMap();
        HashMap term21588 = new HashMap();
        HashMap term21593 = new HashMap();
        ArrayList term21598 = new ArrayList();
        Class<? extends Object> term21665 = Class.forName((String) "commons.Color");
        Field term21664 = ((Class) term21665).getDeclaredField((String) "BLACK");
        ((Field) term21664).setAccessible(true);
        Object enum179 = ((Field) term21664).get((Object) null);
        Class<? extends Object> term21752 = Class.forName((String) "commons.Color");
        Field term21751 = ((Class) term21752).getDeclaredField((String) "BLACK");
        ((Field) term21751).setAccessible(true);
        Object enum180 = ((Field) term21751).get((Object) null);
        Class<? extends Object> term21839 = Class.forName((String) "pieces.PieceType");
        Field term21838 = ((Class) term21839).getDeclaredField((String) "QUEEN");
        ((Field) term21838).setAccessible(true);
        Object enum181 = ((Field) term21838).get((Object) null);
        term21562 = newInstance(Class.forName("game.Board"));
        long[] term21602 = (long[]) newLongArray(6);
        Object[] term21610 = (Object[]) newArray("[Z", 2);
        boolean[] term21611 = (boolean[]) newBooleanArray(2);
        boolean[] term21614 = (boolean[]) newBooleanArray(2);
        Object term21622 = newInstance(Class.forName("game.Move"));
        Object term21623 = newInstance(Class.forName("commons.Piece"));
        Object term21624 = newInstance(Class.forName("game.Cell"));
        Object term21630 = newInstance(Class.forName("game.Cell"));
        Object term21634 = newInstance(Class.forName("game.Cell"));
        Object[] term21638 = (Object[]) newArray("commons.Piece", 2);
        setField(term21562, term21562.getClass(), "pieces", term21563);
        setField(term21562, term21562.getClass(), "playerPieces", term21568);
        setField(term21562, term21562.getClass(), "moves", term21588);
        setField(term21562, term21562.getClass(), "guards", term21593);
        setField(term21562, term21562.getClass(), "moveList", term21598);
        setField(term21562, term21562.getClass(), "positions", term21602);
        setIntField(term21562, term21562.getClass(), "positionIndex", -26316536);
        setBooleanElement(term21611, 0, true);
        setBooleanElement(term21611, 1, true);
        setElement(term21610, 0, term21611);
        setBooleanElement(term21614, 0, true);
        setBooleanElement(term21614, 1, true);
        setElement(term21610, 1, term21614);
        setField(term21562, term21562.getClass(), "canCastle", term21610);
        setLongField(term21562, term21562.getClass(), "zobristHash", -8708192233349544946L);
        setField(term21562, term21562.getClass(), "playerToMove", enum179);
        setBooleanField(term21562, term21562.getClass(), "isThreeFoldRepetition", false);
        setIntField(term21562, term21562.getClass(), "halfMoves", 1716165145);
        setBooleanField(term21562, term21562.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term21562, term21562.getClass(), "inCheck", true);
        setField(term21623, term21623.getClass(), "color", enum180);
        setIntField(term21624, term21624.getClass(), "row", 1692937831);
        setIntField(term21624, term21624.getClass(), "col", -1539747985);
        setField(term21623, term21623.getClass(), "position", term21624);
        setField(term21623, term21623.getClass(), "pieceType", enum181);
        setField(term21622, term21622.getClass(), "piece", term21623);
        setIntField(term21630, term21630.getClass(), "row", -1982489643);
        setIntField(term21630, term21630.getClass(), "col", 550892835);
        setField(term21622, term21622.getClass(), "target", term21630);
        setBooleanField(term21622, term21622.getClass(), "captureMove", false);
        setIntField(term21634, term21634.getClass(), "row", 1237549886);
        setIntField(term21634, term21634.getClass(), "col", -1945635750);
        setField(term21622, term21622.getClass(), "captureCell", term21634);
        setField(term21622, term21622.getClass(), "promoteTo", enum181);
        setIntField(term21622, term21622.getClass(), "id", -1622760744);
        setField(term21562, term21562.getClass(), "previousMove", term21622);
        setField(term21562, term21562.getClass(), "kings", term21638);
        Class<? extends Object> term21941 = Class.forName((String) "pieces.PieceType");
        Field term21940 = ((Class) term21941).getDeclaredField((String) "KING");
        ((Field) term21940).setAccessible(true);
        Object enum182 = ((Field) term21940).get((Object) null);
        term21639 = newInstance(Class.forName("commons.Piece"));
        Object term21640 = newInstance(Class.forName("game.Cell"));
        setField(term21639, term21639.getClass(), "color", enum179);
        setIntField(term21640, term21640.getClass(), "row", 2068435279);
        setIntField(term21640, term21640.getClass(), "col", -1556527718);
        setField(term21639, term21639.getClass(), "position", term21640);
        setField(term21639, term21639.getClass(), "pieceType", enum182);
        term21651 = newInstance(Class.forName("game.Cell"));
        setIntField(term21651, term21651.getClass(), "row", 895255351);
        setIntField(term21651, term21651.getClass(), "col", -1317044799);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("commons.Piece");
        argTypes[1] = Class.forName("game.Cell");
        Object[] args = new Object[2];
        args[0] = term21639;
        args[1] = term21651;
        callMethod(klass, "discoveredCheck", argTypes, term21562, args);
    }

};


