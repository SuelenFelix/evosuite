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
import java.lang.Object;
import java.lang.String;

public class Move_hashCode_2364407247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2196;

    public Move_hashCode_2364407247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2237 = Class.forName((String) "commons.Color");
        Field term2236 = ((Class) term2237).getDeclaredField((String) "WHITE");
        ((Field) term2236).setAccessible(true);
        Object enum19 = ((Field) term2236).get((Object) null);
        Class<? extends Object> term2324 = Class.forName((String) "pieces.PieceType");
        Field term2323 = ((Class) term2324).getDeclaredField((String) "ROOK");
        ((Field) term2323).setAccessible(true);
        Object enum20 = ((Field) term2323).get((Object) null);
        Class<? extends Object> term2423 = Class.forName((String) "pieces.PieceType");
        Field term2422 = ((Class) term2423).getDeclaredField((String) "BISHOP");
        ((Field) term2422).setAccessible(true);
        Object enum21 = ((Field) term2422).get((Object) null);
        term2196 = newInstance(Class.forName("game.Move"));
        Object term2197 = newInstance(Class.forName("commons.Piece"));
        Object term2207 = newInstance(Class.forName("game.Cell"));
        Object term2218 = newInstance(Class.forName("game.Cell"));
        Object term2222 = newInstance(Class.forName("game.Cell"));
        setField(term2197, term2197.getClass(), "color", enum19);
        setIntField(term2207, term2207.getClass(), "row", -184153539);
        setIntField(term2207, term2207.getClass(), "col", 493620644);
        setField(term2197, term2197.getClass(), "position", term2207);
        setField(term2197, term2197.getClass(), "pieceType", enum20);
        setField(term2196, term2196.getClass(), "piece", term2197);
        setIntField(term2218, term2218.getClass(), "row", 1328271830);
        setIntField(term2218, term2218.getClass(), "col", 1596070772);
        setField(term2196, term2196.getClass(), "target", term2218);
        setBooleanField(term2196, term2196.getClass(), "captureMove", true);
        setIntField(term2222, term2222.getClass(), "row", 97029295);
        setIntField(term2222, term2222.getClass(), "col", -1371869594);
        setField(term2196, term2196.getClass(), "captureCell", term2222);
        setField(term2196, term2196.getClass(), "promoteTo", enum21);
        setIntField(term2196, term2196.getClass(), "id", -2095575670);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Move");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2196, args);
    }

};


