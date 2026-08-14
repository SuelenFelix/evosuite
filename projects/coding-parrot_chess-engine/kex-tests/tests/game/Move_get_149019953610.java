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
import java.lang.Boolean;

public class Move_get_149019953610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2537;
     Object term2540;

    public Move_get_149019953610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2537 = newInstance(Class.forName("game.Move"));
        setField(term2537, term2537.getClass(), "piece", null);
        setField(term2537, term2537.getClass(), "target", null);
        setBooleanField(term2537, term2537.getClass(), "captureMove", false);
        setField(term2537, term2537.getClass(), "captureCell", null);
        setField(term2537, term2537.getClass(), "promoteTo", null);
        setIntField(term2537, term2537.getClass(), "id", 0);
        term2540 = new Boolean(false);
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
        args[0] = null;
        args[1] = null;
        args[2] = term2540;
        args[3] = null;
        args[4] = null;
        callMethod(klass, "get", argTypes, term2537, args);
    }

};


