package pieces;

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
import static pieces.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Pawn_allowsEnPassant_12921231918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7377;

    public Pawn_allowsEnPassant_12921231918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7377 = newInstance(Class.forName("pieces.Pawn"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pieces.Pawn");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("game.Move");
        argTypes[1] = Class.forName("commons.Piece");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "allowsEnPassant", argTypes, term7377, args);
    }

};


