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
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;

public class Move_init_719657263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term875;
     Object term896;
     Object term899;
     Object term901;
     Object enum9;
     Object term914;

    public Move_init_719657263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term917 = Class.forName((String) "commons.Color");
        Field term916 = ((Class) term917).getDeclaredField((String) "WHITE");
        ((Field) term916).setAccessible(true);
        Object enum7 = ((Field) term916).get((Object) null);
        Class<? extends Object> term1004 = Class.forName((String) "pieces.PieceType");
        Field term1003 = ((Class) term1004).getDeclaredField((String) "ROOK");
        ((Field) term1003).setAccessible(true);
        Object enum8 = ((Field) term1003).get((Object) null);
        term875 = newInstance(Class.forName("commons.Piece"));
        Object term885 = newInstance(Class.forName("game.Cell"));
        setField(term875, term875.getClass(), "color", enum7);
        setIntField(term885, term885.getClass(), "row", -1007160944);
        setIntField(term885, term885.getClass(), "col", 1135664017);
        setField(term875, term875.getClass(), "position", term885);
        setField(term875, term875.getClass(), "pieceType", enum8);
        term896 = newInstance(Class.forName("game.Cell"));
        setIntField(term896, term896.getClass(), "row", 590364439);
        setIntField(term896, term896.getClass(), "col", 865208305);
        term899 = new Boolean(false);
        term901 = newInstance(Class.forName("game.Cell"));
        setIntField(term901, term901.getClass(), "row", -1275173084);
        setIntField(term901, term901.getClass(), "col", -244121226);
        Class<? extends Object> term1103 = Class.forName((String) "pieces.PieceType");
        Field term1102 = ((Class) term1103).getDeclaredField((String) "KNIGHT");
        ((Field) term1102).setAccessible(true);
        enum9 = ((Field) term1102).get((Object) null);
        term914 = new Integer(-203030934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Move");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("commons.Piece");
        argTypes[1] = Class.forName("game.Cell");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("game.Cell");
        argTypes[4] = Class.forName("pieces.PieceType");
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = term875;
        args[1] = term896;
        args[2] = term899;
        args[3] = term901;
        args[4] = enum9;
        args[5] = term914;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


