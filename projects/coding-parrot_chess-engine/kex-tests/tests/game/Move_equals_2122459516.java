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

public class Move_equals_2122459516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1864;
     Object term1904;

    public Move_equals_2122459516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1906 = Class.forName((String) "commons.Color");
        Field term1905 = ((Class) term1906).getDeclaredField((String) "BLACK");
        ((Field) term1905).setAccessible(true);
        Object enum16 = ((Field) term1905).get((Object) null);
        Class<? extends Object> term1993 = Class.forName((String) "pieces.PieceType");
        Field term1992 = ((Class) term1993).getDeclaredField((String) "ROOK");
        ((Field) term1992).setAccessible(true);
        Object enum17 = ((Field) term1992).get((Object) null);
        Class<? extends Object> term2092 = Class.forName((String) "pieces.PieceType");
        Field term2091 = ((Class) term2092).getDeclaredField((String) "KNIGHT");
        ((Field) term2091).setAccessible(true);
        Object enum18 = ((Field) term2091).get((Object) null);
        term1864 = newInstance(Class.forName("game.Move"));
        Object term1865 = newInstance(Class.forName("commons.Piece"));
        Object term1875 = newInstance(Class.forName("game.Cell"));
        Object term1886 = newInstance(Class.forName("game.Cell"));
        Object term1890 = newInstance(Class.forName("game.Cell"));
        setField(term1865, term1865.getClass(), "color", enum16);
        setIntField(term1875, term1875.getClass(), "row", 1632125673);
        setIntField(term1875, term1875.getClass(), "col", 454281060);
        setField(term1865, term1865.getClass(), "position", term1875);
        setField(term1865, term1865.getClass(), "pieceType", enum17);
        setField(term1864, term1864.getClass(), "piece", term1865);
        setIntField(term1886, term1886.getClass(), "row", -1786399638);
        setIntField(term1886, term1886.getClass(), "col", 2055867847);
        setField(term1864, term1864.getClass(), "target", term1886);
        setBooleanField(term1864, term1864.getClass(), "captureMove", true);
        setIntField(term1890, term1890.getClass(), "row", -1048298087);
        setIntField(term1890, term1890.getClass(), "col", 292681826);
        setField(term1864, term1864.getClass(), "captureCell", term1890);
        setField(term1864, term1864.getClass(), "promoteTo", enum18);
        setIntField(term1864, term1864.getClass(), "id", 458147407);
        term1904 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Move");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1904;
        callMethod(klass, "equals", argTypes, term1864, args);
    }

};


