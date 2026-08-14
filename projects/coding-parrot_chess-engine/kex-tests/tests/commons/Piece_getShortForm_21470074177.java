package commons;

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
import static commons.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Piece_getShortForm_21470074177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2281;

    public Piece_getShortForm_21470074177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2305 = Class.forName((String) "commons.Color");
        Field term2304 = ((Class) term2305).getDeclaredField((String) "WHITE");
        ((Field) term2304).setAccessible(true);
        Object enum20 = ((Field) term2304).get((Object) null);
        Class<? extends Object> term2392 = Class.forName((String) "pieces.PieceType");
        Field term2391 = ((Class) term2392).getDeclaredField((String) "KNIGHT");
        ((Field) term2391).setAccessible(true);
        Object enum21 = ((Field) term2391).get((Object) null);
        term2281 = newInstance(Class.forName("commons.Piece"));
        Object term2291 = newInstance(Class.forName("game.Cell"));
        setField(term2281, term2281.getClass(), "color", enum20);
        setIntField(term2291, term2291.getClass(), "row", -602026508);
        setIntField(term2291, term2291.getClass(), "col", -157887805);
        setField(term2281, term2281.getClass(), "position", term2291);
        setField(term2281, term2281.getClass(), "pieceType", enum21);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("commons.Piece");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getShortForm", argTypes, term2281, args);
    }

};


