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
import java.lang.Integer;

public class Pawn_addEnPassant_16636717597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7374;
     Object term7375;

    public Pawn_addEnPassant_16636717597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7374 = newInstance(Class.forName("pieces.Pawn"));
        term7375 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pieces.Pawn");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("game.Board");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.util.Set");
        argTypes[3] = Class.forName("commons.Piece");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term7375;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "addEnPassant", argTypes, term7374, args);
    }

};


