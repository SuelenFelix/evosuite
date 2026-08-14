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
import java.lang.String;
import java.lang.Object;

public class Piece_hashCode_1983059394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1110;

    public Piece_hashCode_1983059394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1134 = Class.forName((String) "commons.Color");
        Field term1133 = ((Class) term1134).getDeclaredField((String) "BLACK");
        ((Field) term1133).setAccessible(true);
        Object enum10 = ((Field) term1133).get((Object) null);
        Class<? extends Object> term1221 = Class.forName((String) "pieces.PieceType");
        Field term1220 = ((Class) term1221).getDeclaredField((String) "KNIGHT");
        ((Field) term1220).setAccessible(true);
        Object enum11 = ((Field) term1220).get((Object) null);
        term1110 = newInstance(Class.forName("commons.Piece"));
        Object term1120 = newInstance(Class.forName("game.Cell"));
        setField(term1110, term1110.getClass(), "color", enum10);
        setIntField(term1120, term1120.getClass(), "row", 1622346318);
        setIntField(term1120, term1120.getClass(), "col", 1048535127);
        setField(term1110, term1110.getClass(), "position", term1120);
        setField(term1110, term1110.getClass(), "pieceType", enum11);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("commons.Piece");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1110, args);
    }

};


