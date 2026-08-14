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

public class Piece_get_15961776681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum4;
     Object term442;
     Object enum5;

    public Piece_get_15961776681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term455 = Class.forName((String) "commons.Color");
        Field term454 = ((Class) term455).getDeclaredField((String) "WHITE");
        ((Field) term454).setAccessible(true);
        enum4 = ((Field) term454).get((Object) null);
        term442 = newInstance(Class.forName("game.Cell"));
        setIntField(term442, term442.getClass(), "row", 1134449235);
        setIntField(term442, term442.getClass(), "col", -883034806);
        Class<? extends Object> term595 = Class.forName((String) "pieces.PieceType");
        Field term594 = ((Class) term595).getDeclaredField((String) "QUEEN");
        ((Field) term594).setAccessible(true);
        enum5 = ((Field) term594).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("commons.Piece");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("commons.Color");
        argTypes[1] = Class.forName("game.Cell");
        argTypes[2] = Class.forName("pieces.PieceType");
        Object[] args = new Object[3];
        args[0] = enum4;
        args[1] = term442;
        args[2] = enum5;
        callMethod(klass, "get", argTypes, null, args);
    }

};


