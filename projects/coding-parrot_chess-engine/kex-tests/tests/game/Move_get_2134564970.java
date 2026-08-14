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
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;

public class Move_get_2134564970 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35;
     Object term58;
     Object term61;

    public Move_get_2134564970() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term82 = Class.forName((String) "commons.Color");
        Field term81 = ((Class) term82).getDeclaredField((String) "WHITE");
        ((Field) term81).setAccessible(true);
        Object enum0 = ((Field) term81).get((Object) null);
        Class<? extends Object> term222 = Class.forName((String) "pieces.PieceType");
        Field term221 = ((Class) term222).getDeclaredField((String) "KNIGHT");
        ((Field) term221).setAccessible(true);
        Object enum1 = ((Field) term221).get((Object) null);
        term35 = newInstance(Class.forName("commons.Piece"));
        Object term45 = newInstance(Class.forName("game.Cell"));
        setField(term35, term35.getClass(), "color", enum0);
        setIntField(term45, term45.getClass(), "row", 1227103734);
        setIntField(term45, term45.getClass(), "col", -1339778481);
        setField(term35, term35.getClass(), "position", term45);
        setField(term35, term35.getClass(), "pieceType", enum1);
        term58 = newInstance(Class.forName("game.Cell"));
        setIntField(term58, term58.getClass(), "row", 1725571209);
        setIntField(term58, term58.getClass(), "col", -522618178);
        term61 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Move");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("commons.Piece");
        argTypes[1] = Class.forName("game.Cell");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term35;
        args[1] = term58;
        args[2] = term61;
        callMethod(klass, "get", argTypes, null, args);
    }

};


