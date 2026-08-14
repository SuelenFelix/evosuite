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
import java.lang.Object;
import java.lang.String;

public class Move_printMove_6823568285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1530;
     Object term1560;
     Object term1573;

    public Move_printMove_6823568285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1577 = Class.forName((String) "commons.Color");
        Field term1576 = ((Class) term1577).getDeclaredField((String) "BLACK");
        ((Field) term1576).setAccessible(true);
        Object enum13 = ((Field) term1576).get((Object) null);
        Class<? extends Object> term1664 = Class.forName((String) "pieces.PieceType");
        Field term1663 = ((Class) term1664).getDeclaredField((String) "ROOK");
        ((Field) term1663).setAccessible(true);
        Object enum14 = ((Field) term1663).get((Object) null);
        term1530 = newInstance(Class.forName("game.Move"));
        Object term1531 = newInstance(Class.forName("commons.Piece"));
        Object term1541 = newInstance(Class.forName("game.Cell"));
        Object term1552 = newInstance(Class.forName("game.Cell"));
        Object term1556 = newInstance(Class.forName("game.Cell"));
        setField(term1531, term1531.getClass(), "color", enum13);
        setIntField(term1541, term1541.getClass(), "row", 679763016);
        setIntField(term1541, term1541.getClass(), "col", 1962444399);
        setField(term1531, term1531.getClass(), "position", term1541);
        setField(term1531, term1531.getClass(), "pieceType", enum14);
        setField(term1530, term1530.getClass(), "piece", term1531);
        setIntField(term1552, term1552.getClass(), "row", 767834723);
        setIntField(term1552, term1552.getClass(), "col", -602026508);
        setField(term1530, term1530.getClass(), "target", term1552);
        setBooleanField(term1530, term1530.getClass(), "captureMove", true);
        setIntField(term1556, term1556.getClass(), "row", -157887805);
        setIntField(term1556, term1556.getClass(), "col", 1876565163);
        setField(term1530, term1530.getClass(), "captureCell", term1556);
        setField(term1530, term1530.getClass(), "promoteTo", enum14);
        setIntField(term1530, term1530.getClass(), "id", -817164822);
        Class<? extends Object> term1763 = Class.forName((String) "pieces.PieceType");
        Field term1762 = ((Class) term1763).getDeclaredField((String) "QUEEN");
        ((Field) term1762).setAccessible(true);
        Object enum15 = ((Field) term1762).get((Object) null);
        term1560 = newInstance(Class.forName("commons.Piece"));
        Object term1561 = newInstance(Class.forName("game.Cell"));
        setField(term1560, term1560.getClass(), "color", enum13);
        setIntField(term1561, term1561.getClass(), "row", -1016503459);
        setIntField(term1561, term1561.getClass(), "col", -1968847291);
        setField(term1560, term1560.getClass(), "position", term1561);
        setField(term1560, term1560.getClass(), "pieceType", enum15);
        term1573 = newInstance(Class.forName("game.Cell"));
        setIntField(term1573, term1573.getClass(), "row", 579005622);
        setIntField(term1573, term1573.getClass(), "col", -14890619);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Move");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("commons.Piece");
        argTypes[1] = Class.forName("game.Cell");
        Object[] args = new Object[2];
        args[0] = term1560;
        args[1] = term1573;
        callMethod(klass, "printMove", argTypes, term1530, args);
    }

};


