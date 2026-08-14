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

public class Move_toString_7472004144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1207;

    public Move_toString_7472004144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1246 = Class.forName((String) "commons.Color");
        Field term1245 = ((Class) term1246).getDeclaredField((String) "BLACK");
        ((Field) term1245).setAccessible(true);
        Object enum10 = ((Field) term1245).get((Object) null);
        Class<? extends Object> term1333 = Class.forName((String) "pieces.PieceType");
        Field term1332 = ((Class) term1333).getDeclaredField((String) "KING");
        ((Field) term1332).setAccessible(true);
        Object enum11 = ((Field) term1332).get((Object) null);
        Class<? extends Object> term1432 = Class.forName((String) "pieces.PieceType");
        Field term1431 = ((Class) term1432).getDeclaredField((String) "ROOK");
        ((Field) term1431).setAccessible(true);
        Object enum12 = ((Field) term1431).get((Object) null);
        term1207 = newInstance(Class.forName("game.Move"));
        Object term1208 = newInstance(Class.forName("commons.Piece"));
        Object term1218 = newInstance(Class.forName("game.Cell"));
        Object term1229 = newInstance(Class.forName("game.Cell"));
        Object term1233 = newInstance(Class.forName("game.Cell"));
        setField(term1208, term1208.getClass(), "color", enum10);
        setIntField(term1218, term1218.getClass(), "row", -1179120542);
        setIntField(term1218, term1218.getClass(), "col", -73683645);
        setField(term1208, term1208.getClass(), "position", term1218);
        setField(term1208, term1208.getClass(), "pieceType", enum11);
        setField(term1207, term1207.getClass(), "piece", term1208);
        setIntField(term1229, term1229.getClass(), "row", -226514366);
        setIntField(term1229, term1229.getClass(), "col", 1193880199);
        setField(term1207, term1207.getClass(), "target", term1229);
        setBooleanField(term1207, term1207.getClass(), "captureMove", true);
        setIntField(term1233, term1233.getClass(), "row", -1087774327);
        setIntField(term1233, term1233.getClass(), "col", -1530420153);
        setField(term1207, term1207.getClass(), "captureCell", term1233);
        setField(term1207, term1207.getClass(), "promoteTo", enum12);
        setIntField(term1207, term1207.getClass(), "id", -469968304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Move");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1207, args);
    }

};


