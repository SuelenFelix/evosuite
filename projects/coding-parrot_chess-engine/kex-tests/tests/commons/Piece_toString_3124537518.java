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

public class Piece_toString_3124537518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2496;

    public Piece_toString_3124537518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2518 = Class.forName((String) "commons.Color");
        Field term2517 = ((Class) term2518).getDeclaredField((String) "BLACK");
        ((Field) term2517).setAccessible(true);
        Object enum22 = ((Field) term2517).get((Object) null);
        Class<? extends Object> term2605 = Class.forName((String) "pieces.PieceType");
        Field term2604 = ((Class) term2605).getDeclaredField((String) "ROOK");
        ((Field) term2604).setAccessible(true);
        Object enum23 = ((Field) term2604).get((Object) null);
        term2496 = newInstance(Class.forName("commons.Piece"));
        Object term2506 = newInstance(Class.forName("game.Cell"));
        setField(term2496, term2496.getClass(), "color", enum22);
        setIntField(term2506, term2506.getClass(), "row", 1876565163);
        setIntField(term2506, term2506.getClass(), "col", -817164822);
        setField(term2496, term2496.getClass(), "position", term2506);
        setField(term2496, term2496.getClass(), "pieceType", enum23);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("commons.Piece");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2496, args);
    }

};


