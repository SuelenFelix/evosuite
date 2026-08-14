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
import java.lang.Object;
import java.lang.String;

public class Pawn_allowsEnPassant_12921231913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6370;
     Object term6412;

    public Pawn_allowsEnPassant_12921231913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6425 = Class.forName((String) "commons.Color");
        Field term6424 = ((Class) term6425).getDeclaredField((String) "BLACK");
        ((Field) term6424).setAccessible(true);
        Object enum52 = ((Field) term6424).get((Object) null);
        Class<? extends Object> term6512 = Class.forName((String) "pieces.PieceType");
        Field term6511 = ((Class) term6512).getDeclaredField((String) "BISHOP");
        ((Field) term6511).setAccessible(true);
        Object enum53 = ((Field) term6511).get((Object) null);
        Class<? extends Object> term6617 = Class.forName((String) "pieces.PieceType");
        Field term6616 = ((Class) term6617).getDeclaredField((String) "KNIGHT");
        ((Field) term6616).setAccessible(true);
        Object enum54 = ((Field) term6616).get((Object) null);
        term6370 = newInstance(Class.forName("game.Move"));
        Object term6371 = newInstance(Class.forName("commons.Piece"));
        Object term6381 = newInstance(Class.forName("game.Cell"));
        Object term6394 = newInstance(Class.forName("game.Cell"));
        Object term6398 = newInstance(Class.forName("game.Cell"));
        setField(term6371, term6371.getClass(), "color", enum52);
        setIntField(term6381, term6381.getClass(), "row", -1945706126);
        setIntField(term6381, term6381.getClass(), "col", 1152356969);
        setField(term6371, term6371.getClass(), "position", term6381);
        setField(term6371, term6371.getClass(), "pieceType", enum53);
        setField(term6370, term6370.getClass(), "piece", term6371);
        setIntField(term6394, term6394.getClass(), "row", -1667990367);
        setIntField(term6394, term6394.getClass(), "col", -1214628358);
        setField(term6370, term6370.getClass(), "target", term6394);
        setBooleanField(term6370, term6370.getClass(), "captureMove", true);
        setIntField(term6398, term6398.getClass(), "row", 1102721075);
        setIntField(term6398, term6398.getClass(), "col", -426764678);
        setField(term6370, term6370.getClass(), "captureCell", term6398);
        setField(term6370, term6370.getClass(), "promoteTo", enum54);
        setIntField(term6370, term6370.getClass(), "id", -1222614956);
        Class<? extends Object> term6722 = Class.forName((String) "pieces.PieceType");
        Field term6721 = ((Class) term6722).getDeclaredField((String) "ROOK");
        ((Field) term6721).setAccessible(true);
        Object enum55 = ((Field) term6721).get((Object) null);
        term6412 = newInstance(Class.forName("commons.Piece"));
        Object term6413 = newInstance(Class.forName("game.Cell"));
        setField(term6412, term6412.getClass(), "color", enum52);
        setIntField(term6413, term6413.getClass(), "row", -1870495012);
        setIntField(term6413, term6413.getClass(), "col", -1310015129);
        setField(term6412, term6412.getClass(), "position", term6413);
        setField(term6412, term6412.getClass(), "pieceType", enum55);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pieces.Pawn");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("game.Move");
        argTypes[1] = Class.forName("commons.Piece");
        Object[] args = new Object[2];
        args[0] = term6370;
        args[1] = term6412;
        callMethod(klass, "allowsEnPassant", argTypes, null, args);
    }

};


