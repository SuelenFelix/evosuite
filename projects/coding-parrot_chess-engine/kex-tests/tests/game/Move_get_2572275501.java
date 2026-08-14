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

public class Move_get_2572275501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326;
     Object term349;
     Object term352;
     Object term354;

    public Move_get_2572275501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term358 = Class.forName((String) "commons.Color");
        Field term357 = ((Class) term358).getDeclaredField((String) "WHITE");
        ((Field) term357).setAccessible(true);
        Object enum2 = ((Field) term357).get((Object) null);
        Class<? extends Object> term445 = Class.forName((String) "pieces.PieceType");
        Field term444 = ((Class) term445).getDeclaredField((String) "BISHOP");
        ((Field) term444).setAccessible(true);
        Object enum3 = ((Field) term444).get((Object) null);
        term326 = newInstance(Class.forName("commons.Piece"));
        Object term336 = newInstance(Class.forName("game.Cell"));
        setField(term326, term326.getClass(), "color", enum2);
        setIntField(term336, term336.getClass(), "row", 1134449235);
        setIntField(term336, term336.getClass(), "col", -883034806);
        setField(term326, term326.getClass(), "position", term336);
        setField(term326, term326.getClass(), "pieceType", enum3);
        term349 = newInstance(Class.forName("game.Cell"));
        setIntField(term349, term349.getClass(), "row", 1585847225);
        setIntField(term349, term349.getClass(), "col", 597278769);
        term352 = new Boolean(false);
        term354 = newInstance(Class.forName("game.Cell"));
        setIntField(term354, term354.getClass(), "row", -1685132342);
        setIntField(term354, term354.getClass(), "col", -1456670397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Move");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("commons.Piece");
        argTypes[1] = Class.forName("game.Cell");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("game.Cell");
        Object[] args = new Object[4];
        args[0] = term326;
        args[1] = term349;
        args[2] = term352;
        args[3] = term354;
        callMethod(klass, "get", argTypes, null, args);
    }

};


