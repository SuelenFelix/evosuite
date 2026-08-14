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

public class Move_get_14901995362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term549;
     Object term571;
     Object term574;
     Object term576;
     Object enum6;

    public Move_get_14901995362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term588 = Class.forName((String) "commons.Color");
        Field term587 = ((Class) term588).getDeclaredField((String) "WHITE");
        ((Field) term587).setAccessible(true);
        Object enum4 = ((Field) term587).get((Object) null);
        Class<? extends Object> term675 = Class.forName((String) "pieces.PieceType");
        Field term674 = ((Class) term675).getDeclaredField((String) "QUEEN");
        ((Field) term674).setAccessible(true);
        Object enum5 = ((Field) term674).get((Object) null);
        term549 = newInstance(Class.forName("commons.Piece"));
        Object term559 = newInstance(Class.forName("game.Cell"));
        setField(term549, term549.getClass(), "color", enum4);
        setIntField(term559, term559.getClass(), "row", 1622346318);
        setIntField(term559, term559.getClass(), "col", 1048535127);
        setField(term549, term549.getClass(), "position", term559);
        setField(term549, term549.getClass(), "pieceType", enum5);
        term571 = newInstance(Class.forName("game.Cell"));
        setIntField(term571, term571.getClass(), "row", -655067527);
        setIntField(term571, term571.getClass(), "col", -6029667);
        term574 = new Boolean(false);
        term576 = newInstance(Class.forName("game.Cell"));
        setIntField(term576, term576.getClass(), "row", -2068769794);
        setIntField(term576, term576.getClass(), "col", -117576464);
        Class<? extends Object> term777 = Class.forName((String) "pieces.PieceType");
        Field term776 = ((Class) term777).getDeclaredField((String) "KING");
        ((Field) term776).setAccessible(true);
        enum6 = ((Field) term776).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Move");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("commons.Piece");
        argTypes[1] = Class.forName("game.Cell");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("game.Cell");
        argTypes[4] = Class.forName("pieces.PieceType");
        Object[] args = new Object[5];
        args[0] = term549;
        args[1] = term571;
        args[2] = term574;
        args[3] = term576;
        args[4] = enum6;
        callMethod(klass, "get", argTypes, null, args);
    }

};


