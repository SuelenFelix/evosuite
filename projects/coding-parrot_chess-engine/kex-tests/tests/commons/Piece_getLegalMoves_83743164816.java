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

public class Piece_getLegalMoves_83743164816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3034;

    public Piece_getLegalMoves_83743164816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3034 = newInstance(Class.forName("commons.Piece"));
        setField(term3034, term3034.getClass(), "color", null);
        setField(term3034, term3034.getClass(), "position", null);
        setField(term3034, term3034.getClass(), "pieceType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("commons.Piece");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("game.Board");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getLegalMoves", argTypes, term3034, args);
    }

};


