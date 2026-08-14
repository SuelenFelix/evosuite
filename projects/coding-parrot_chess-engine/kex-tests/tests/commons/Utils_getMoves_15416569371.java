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
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class Utils_getMoves_15416569371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3038;
     Object term3123;
     Object term3125;

    public Utils_getMoves_15416569371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3039 = new HashMap();
        HashMap term3044 = new HashMap();
        HashMap term3064 = new HashMap();
        HashMap term3069 = new HashMap();
        ArrayList term3074 = new ArrayList();
        Class<? extends Object> term3140 = Class.forName((String) "commons.Color");
        Field term3139 = ((Class) term3140).getDeclaredField((String) "BLACK");
        ((Field) term3139).setAccessible(true);
        Object enum27 = ((Field) term3139).get((Object) null);
        Class<? extends Object> term3227 = Class.forName((String) "commons.Color");
        Field term3226 = ((Class) term3227).getDeclaredField((String) "WHITE");
        ((Field) term3226).setAccessible(true);
        Object enum28 = ((Field) term3226).get((Object) null);
        Class<? extends Object> term3314 = Class.forName((String) "pieces.PieceType");
        Field term3313 = ((Class) term3314).getDeclaredField((String) "ROOK");
        ((Field) term3313).setAccessible(true);
        Object enum29 = ((Field) term3313).get((Object) null);
        Class<? extends Object> term3413 = Class.forName((String) "pieces.PieceType");
        Field term3412 = ((Class) term3413).getDeclaredField((String) "ROOK");
        ((Field) term3412).setAccessible(true);
        Object enum30 = ((Field) term3412).get((Object) null);
        term3038 = newInstance(Class.forName("game.Board"));
        long[] term3078 = (long[]) newLongArray(6);
        Object[] term3086 = (Object[]) newArray("[Z", 2);
        boolean[] term3087 = (boolean[]) newBooleanArray(2);
        boolean[] term3090 = (boolean[]) newBooleanArray(2);
        Object term3098 = newInstance(Class.forName("game.Move"));
        Object term3099 = newInstance(Class.forName("commons.Piece"));
        Object term3100 = newInstance(Class.forName("game.Cell"));
        Object term3106 = newInstance(Class.forName("game.Cell"));
        Object term3110 = newInstance(Class.forName("game.Cell"));
        Object[] term3122 = (Object[]) newArray("commons.Piece", 2);
        setField(term3038, term3038.getClass(), "pieces", term3039);
        setField(term3038, term3038.getClass(), "playerPieces", term3044);
        setField(term3038, term3038.getClass(), "moves", term3064);
        setField(term3038, term3038.getClass(), "guards", term3069);
        setField(term3038, term3038.getClass(), "moveList", term3074);
        setField(term3038, term3038.getClass(), "positions", term3078);
        setIntField(term3038, term3038.getClass(), "positionIndex", 579005622);
        setBooleanElement(term3087, 0, true);
        setBooleanElement(term3087, 1, true);
        setElement(term3086, 0, term3087);
        setBooleanElement(term3090, 0, true);
        setBooleanElement(term3090, 1, true);
        setElement(term3086, 1, term3090);
        setField(term3038, term3038.getClass(), "canCastle", term3086);
        setLongField(term3038, term3038.getClass(), "zobristHash", -8257434502486459194L);
        setField(term3038, term3038.getClass(), "playerToMove", enum27);
        setBooleanField(term3038, term3038.getClass(), "isThreeFoldRepetition", true);
        setIntField(term3038, term3038.getClass(), "halfMoves", -14890619);
        setBooleanField(term3038, term3038.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term3038, term3038.getClass(), "inCheck", true);
        setField(term3099, term3099.getClass(), "color", enum28);
        setIntField(term3100, term3100.getClass(), "row", 1632125673);
        setIntField(term3100, term3100.getClass(), "col", 454281060);
        setField(term3099, term3099.getClass(), "position", term3100);
        setField(term3099, term3099.getClass(), "pieceType", enum29);
        setField(term3098, term3098.getClass(), "piece", term3099);
        setIntField(term3106, term3106.getClass(), "row", -1786399638);
        setIntField(term3106, term3106.getClass(), "col", 2055867847);
        setField(term3098, term3098.getClass(), "target", term3106);
        setBooleanField(term3098, term3098.getClass(), "captureMove", false);
        setIntField(term3110, term3110.getClass(), "row", -1048298087);
        setIntField(term3110, term3110.getClass(), "col", 292681826);
        setField(term3098, term3098.getClass(), "captureCell", term3110);
        setField(term3098, term3098.getClass(), "promoteTo", enum30);
        setIntField(term3098, term3098.getClass(), "id", 458147407);
        setField(term3038, term3038.getClass(), "previousMove", term3098);
        setField(term3038, term3038.getClass(), "kings", term3122);
        term3123 = new Integer(-184153539);
        term3125 = newInstance(Class.forName("commons.Piece"));
        Object term3126 = newInstance(Class.forName("game.Cell"));
        setField(term3125, term3125.getClass(), "color", enum27);
        setIntField(term3126, term3126.getClass(), "row", 493620644);
        setIntField(term3126, term3126.getClass(), "col", 1328271830);
        setField(term3125, term3125.getClass(), "position", term3126);
        setField(term3125, term3125.getClass(), "pieceType", enum30);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("commons.Utils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("game.Board");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.util.function.BiFunction");
        argTypes[3] = Class.forName("commons.Piece");
        Object[] args = new Object[4];
        args[0] = term3038;
        args[1] = term3123;
        args[2] = null;
        args[3] = term3125;
        callMethod(klass, "getMoves", argTypes, null, args);
    }

};


