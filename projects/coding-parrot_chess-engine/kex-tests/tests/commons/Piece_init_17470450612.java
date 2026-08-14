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

public class Piece_init_17470450612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum6;
     Object term705;
     Object enum7;

    public Piece_init_17470450612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term717 = Class.forName((String) "commons.Color");
        Field term716 = ((Class) term717).getDeclaredField((String) "WHITE");
        ((Field) term716).setAccessible(true);
        enum6 = ((Field) term716).get((Object) null);
        term705 = newInstance(Class.forName("game.Cell"));
        setIntField(term705, term705.getClass(), "row", 1585847225);
        setIntField(term705, term705.getClass(), "col", 597278769);
        Class<? extends Object> term804 = Class.forName((String) "pieces.PieceType");
        Field term803 = ((Class) term804).getDeclaredField((String) "KING");
        ((Field) term803).setAccessible(true);
        enum7 = ((Field) term803).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("commons.Piece");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("commons.Color");
        argTypes[1] = Class.forName("game.Cell");
        argTypes[2] = Class.forName("pieces.PieceType");
        Object[] args = new Object[3];
        args[0] = enum6;
        args[1] = term705;
        args[2] = enum7;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


