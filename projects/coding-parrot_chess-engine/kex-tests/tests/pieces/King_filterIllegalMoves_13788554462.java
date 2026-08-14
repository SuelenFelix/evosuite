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
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class King_filterIllegalMoves_13788554462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1553;
     Object term1639;
     Object term1645;

    public King_filterIllegalMoves_13788554462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1554 = new HashMap();
        HashMap term1559 = new HashMap();
        HashMap term1579 = new HashMap();
        HashMap term1584 = new HashMap();
        ArrayList term1589 = new ArrayList();
        Class<? extends Object> term1660 = Class.forName((String) "commons.Color");
        Field term1659 = ((Class) term1660).getDeclaredField((String) "WHITE");
        ((Field) term1659).setAccessible(true);
        Object enum12 = ((Field) term1659).get((Object) null);
        Class<? extends Object> term1747 = Class.forName((String) "commons.Color");
        Field term1746 = ((Class) term1747).getDeclaredField((String) "BLACK");
        ((Field) term1746).setAccessible(true);
        Object enum13 = ((Field) term1746).get((Object) null);
        Class<? extends Object> term1834 = Class.forName((String) "pieces.PieceType");
        Field term1833 = ((Class) term1834).getDeclaredField((String) "QUEEN");
        ((Field) term1833).setAccessible(true);
        Object enum14 = ((Field) term1833).get((Object) null);
        Class<? extends Object> term1936 = Class.forName((String) "pieces.PieceType");
        Field term1935 = ((Class) term1936).getDeclaredField((String) "QUEEN");
        ((Field) term1935).setAccessible(true);
        Object enum15 = ((Field) term1935).get((Object) null);
        term1553 = newInstance(Class.forName("game.Board"));
        long[] term1593 = (long[]) newLongArray(6);
        Object[] term1601 = (Object[]) newArray("[Z", 2);
        boolean[] term1602 = (boolean[]) newBooleanArray(2);
        boolean[] term1605 = (boolean[]) newBooleanArray(2);
        Object term1613 = newInstance(Class.forName("game.Move"));
        Object term1614 = newInstance(Class.forName("commons.Piece"));
        Object term1615 = newInstance(Class.forName("game.Cell"));
        Object term1621 = newInstance(Class.forName("game.Cell"));
        Object term1625 = newInstance(Class.forName("game.Cell"));
        Object[] term1638 = (Object[]) newArray("commons.Piece", 2);
        setField(term1553, term1553.getClass(), "pieces", term1554);
        setField(term1553, term1553.getClass(), "playerPieces", term1559);
        setField(term1553, term1553.getClass(), "moves", term1579);
        setField(term1553, term1553.getClass(), "guards", term1584);
        setField(term1553, term1553.getClass(), "moveList", term1589);
        setField(term1553, term1553.getClass(), "positions", term1593);
        setIntField(term1553, term1553.getClass(), "positionIndex", 1193880199);
        setBooleanElement(term1602, 0, true);
        setBooleanElement(term1602, 1, true);
        setElement(term1601, 0, term1602);
        setBooleanElement(term1605, 0, true);
        setBooleanElement(term1605, 1, true);
        setElement(term1601, 1, term1605);
        setField(term1553, term1553.getClass(), "canCastle", term1601);
        setLongField(term1553, term1553.getClass(), "zobristHash", -8400487765614892086L);
        setField(term1553, term1553.getClass(), "playerToMove", enum12);
        setBooleanField(term1553, term1553.getClass(), "isThreeFoldRepetition", false);
        setIntField(term1553, term1553.getClass(), "halfMoves", -1087774327);
        setBooleanField(term1553, term1553.getClass(), "fiftyMoveDraw", true);
        setBooleanField(term1553, term1553.getClass(), "inCheck", false);
        setField(term1614, term1614.getClass(), "color", enum13);
        setIntField(term1615, term1615.getClass(), "row", -1530420153);
        setIntField(term1615, term1615.getClass(), "col", -469968304);
        setField(term1614, term1614.getClass(), "position", term1615);
        setField(term1614, term1614.getClass(), "pieceType", enum14);
        setField(term1613, term1613.getClass(), "piece", term1614);
        setIntField(term1621, term1621.getClass(), "row", -1145578966);
        setIntField(term1621, term1621.getClass(), "col", 679763016);
        setField(term1613, term1613.getClass(), "target", term1621);
        setBooleanField(term1613, term1613.getClass(), "captureMove", false);
        setIntField(term1625, term1625.getClass(), "row", 1962444399);
        setIntField(term1625, term1625.getClass(), "col", 767834723);
        setField(term1613, term1613.getClass(), "captureCell", term1625);
        setField(term1613, term1613.getClass(), "promoteTo", enum15);
        setIntField(term1613, term1613.getClass(), "id", -602026508);
        setField(term1553, term1553.getClass(), "previousMove", term1613);
        setField(term1553, term1553.getClass(), "kings", term1638);
        HashMap term1640 = new HashMap();
        Set<Object> term2037 =  ((Map) term1640).keySet();
        term1639 = new HashSet((Collection<? extends Object>) term2037);
        term1645 = newInstance(Class.forName("commons.Piece"));
        Object term1646 = newInstance(Class.forName("game.Cell"));
        setField(term1645, term1645.getClass(), "color", enum13);
        setIntField(term1646, term1646.getClass(), "row", -157887805);
        setIntField(term1646, term1646.getClass(), "col", 1876565163);
        setField(term1645, term1645.getClass(), "position", term1646);
        setField(term1645, term1645.getClass(), "pieceType", enum14);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pieces.King");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("game.Board");
        argTypes[1] = Class.forName("java.util.Set");
        argTypes[2] = Class.forName("commons.Piece");
        Object[] args = new Object[3];
        args[0] = term1553;
        args[1] = term1639;
        args[2] = term1645;
        callMethod(klass, "filterIllegalMoves", argTypes, null, args);
    }

};


