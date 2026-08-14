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

public class Piece_get_159617766811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3030;

    public Piece_get_159617766811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3030 = newInstance(Class.forName("commons.Piece"));
        setField(term3030, term3030.getClass(), "color", null);
        setField(term3030, term3030.getClass(), "position", null);
        setField(term3030, term3030.getClass(), "pieceType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("commons.Piece");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("commons.Color");
        argTypes[1] = Class.forName("game.Cell");
        argTypes[2] = Class.forName("pieces.PieceType");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "get", argTypes, term3030, args);
    }

};


