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
import java.lang.String;
import java.lang.Object;

public class King_withinKingRange_14401919414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2515;
     Object enum20;
     Object term2528;

    public King_withinKingRange_14401919414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2515 = newInstance(Class.forName("game.Cell"));
        setIntField(term2515, term2515.getClass(), "row", 458147407);
        setIntField(term2515, term2515.getClass(), "col", -184153539);
        Class<? extends Object> term2532 = Class.forName((String) "pieces.PieceType");
        Field term2531 = ((Class) term2532).getDeclaredField((String) "BISHOP");
        ((Field) term2531).setAccessible(true);
        enum20 = ((Field) term2531).get((Object) null);
        term2528 = newInstance(Class.forName("game.Cell"));
        setIntField(term2528, term2528.getClass(), "row", 493620644);
        setIntField(term2528, term2528.getClass(), "col", 1328271830);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pieces.King");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("game.Cell");
        argTypes[1] = Class.forName("pieces.PieceType");
        argTypes[2] = Class.forName("game.Cell");
        Object[] args = new Object[3];
        args[0] = term2515;
        args[1] = enum20;
        args[2] = term2528;
        callMethod(klass, "withinKingRange", argTypes, null, args);
    }

};


