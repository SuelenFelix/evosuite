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

public class Piece_sameType_16715515809 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2703;
     Object enum26;

    public Piece_sameType_16715515809() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2736 = Class.forName((String) "commons.Color");
        Field term2735 = ((Class) term2736).getDeclaredField((String) "WHITE");
        ((Field) term2735).setAccessible(true);
        Object enum24 = ((Field) term2735).get((Object) null);
        Class<? extends Object> term2823 = Class.forName((String) "pieces.PieceType");
        Field term2822 = ((Class) term2823).getDeclaredField((String) "BISHOP");
        ((Field) term2822).setAccessible(true);
        Object enum25 = ((Field) term2822).get((Object) null);
        term2703 = newInstance(Class.forName("commons.Piece"));
        Object term2713 = newInstance(Class.forName("game.Cell"));
        setField(term2703, term2703.getClass(), "color", enum24);
        setIntField(term2713, term2713.getClass(), "row", -1016503459);
        setIntField(term2713, term2713.getClass(), "col", -1968847291);
        setField(term2703, term2703.getClass(), "position", term2713);
        setField(term2703, term2703.getClass(), "pieceType", enum25);
        Class<? extends Object> term2928 = Class.forName((String) "pieces.PieceType");
        Field term2927 = ((Class) term2928).getDeclaredField((String) "QUEEN");
        ((Field) term2927).setAccessible(true);
        enum26 = ((Field) term2927).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("commons.Piece");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("pieces.PieceType");
        Object[] args = new Object[1];
        args[0] = enum26;
        callMethod(klass, "sameType", argTypes, term2703, args);
    }

};


