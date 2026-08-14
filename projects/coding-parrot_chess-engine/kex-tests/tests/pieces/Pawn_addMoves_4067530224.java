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
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Pawn_addMoves_4067530224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6820;
     Object term6823;
     Object term6825;
     Object term6861;
     Object term6867;

    public Pawn_addMoves_4067530224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6820 = newInstance(Class.forName("game.Cell"));
        setIntField(term6820, term6820.getClass(), "row", -2104981311);
        setIntField(term6820, term6820.getClass(), "col", -571169753);
        term6823 = new Boolean(false);
        Class<? extends Object> term6881 = Class.forName((String) "pieces.PieceType");
        Field term6880 = ((Class) term6881).getDeclaredField((String) "PAWN");
        ((Field) term6880).setAccessible(true);
        Object enum56 = ((Field) term6880).get((Object) null);
        Class<? extends Object> term6980 = Class.forName((String) "pieces.PieceType");
        Field term6979 = ((Class) term6980).getDeclaredField((String) "QUEEN");
        ((Field) term6979).setAccessible(true);
        Object enum57 = ((Field) term6979).get((Object) null);
        Class<? extends Object> term7082 = Class.forName((String) "pieces.PieceType");
        Field term7081 = ((Class) term7082).getDeclaredField((String) "KNIGHT");
        ((Field) term7081).setAccessible(true);
        Object enum58 = ((Field) term7081).get((Object) null);
        Class<? extends Object> term7187 = Class.forName((String) "pieces.PieceType");
        Field term7186 = ((Class) term7187).getDeclaredField((String) "ROOK");
        ((Field) term7186).setAccessible(true);
        Object enum59 = ((Field) term7186).get((Object) null);
        term6825 = (Object[]) newArray("pieces.PieceType", 5);
        setElement(term6825, 0, enum56);
        setElement(term6825, 1, enum57);
        setElement(term6825, 2, enum58);
        setElement(term6825, 3, enum57);
        setElement(term6825, 4, enum59);
        HashMap term6862 = new HashMap();
        Set<Object> term7285 =  ((Map) term6862).keySet();
        term6861 = new HashSet((Collection<? extends Object>) term7285);
        Class<? extends Object> term7287 = Class.forName((String) "commons.Color");
        Field term7286 = ((Class) term7287).getDeclaredField((String) "WHITE");
        ((Field) term7286).setAccessible(true);
        Object enum60 = ((Field) term7286).get((Object) null);
        term6867 = newInstance(Class.forName("commons.Piece"));
        Object term6877 = newInstance(Class.forName("game.Cell"));
        setField(term6867, term6867.getClass(), "color", enum60);
        setIntField(term6877, term6877.getClass(), "row", 318591690);
        setIntField(term6877, term6877.getClass(), "col", -165587447);
        setField(term6867, term6867.getClass(), "position", term6877);
        setField(term6867, term6867.getClass(), "pieceType", enum58);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pieces.Pawn");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("game.Cell");
        argTypes[1] = boolean.class;
        argTypes[2] = Array.newInstance(Class.forName("pieces.PieceType"), 0).getClass();
        argTypes[3] = Class.forName("java.util.Set");
        argTypes[4] = Class.forName("commons.Piece");
        Object[] args = new Object[5];
        args[0] = term6820;
        args[1] = term6823;
        args[2] = term6825;
        args[3] = term6861;
        args[4] = term6867;
        callMethod(klass, "addMoves", argTypes, null, args);
    }

};


