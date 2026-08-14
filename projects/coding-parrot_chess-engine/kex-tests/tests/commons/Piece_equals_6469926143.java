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

public class Piece_equals_6469926143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term902;
     Object term923;

    public Piece_equals_6469926143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term925 = Class.forName((String) "commons.Color");
        Field term924 = ((Class) term925).getDeclaredField((String) "BLACK");
        ((Field) term924).setAccessible(true);
        Object enum8 = ((Field) term924).get((Object) null);
        Class<? extends Object> term1012 = Class.forName((String) "pieces.PieceType");
        Field term1011 = ((Class) term1012).getDeclaredField((String) "ROOK");
        ((Field) term1011).setAccessible(true);
        Object enum9 = ((Field) term1011).get((Object) null);
        term902 = newInstance(Class.forName("commons.Piece"));
        Object term912 = newInstance(Class.forName("game.Cell"));
        setField(term902, term902.getClass(), "color", enum8);
        setIntField(term912, term912.getClass(), "row", -1685132342);
        setIntField(term912, term912.getClass(), "col", -1456670397);
        setField(term902, term902.getClass(), "position", term912);
        setField(term902, term902.getClass(), "pieceType", enum9);
        term923 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("commons.Piece");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term923;
        callMethod(klass, "equals", argTypes, term902, args);
    }

};


