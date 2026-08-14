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
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class Board_updateHashForRemove_43721203721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11850;
     Object term11936;

    public Board_updateHashForRemove_43721203721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11851 = new HashMap();
        HashMap term11856 = new HashMap();
        HashMap term11876 = new HashMap();
        HashMap term11881 = new HashMap();
        ArrayList term11886 = new ArrayList();
        Class<? extends Object> term11951 = Class.forName((String) "commons.Color");
        Field term11950 = ((Class) term11951).getDeclaredField((String) "BLACK");
        ((Field) term11950).setAccessible(true);
        Object enum99 = ((Field) term11950).get((Object) null);
        Class<? extends Object> term12038 = Class.forName((String) "commons.Color");
        Field term12037 = ((Class) term12038).getDeclaredField((String) "WHITE");
        ((Field) term12037).setAccessible(true);
        Object enum100 = ((Field) term12037).get((Object) null);
        Class<? extends Object> term12125 = Class.forName((String) "pieces.PieceType");
        Field term12124 = ((Class) term12125).getDeclaredField((String) "KNIGHT");
        ((Field) term12124).setAccessible(true);
        Object enum101 = ((Field) term12124).get((Object) null);
        Class<? extends Object> term12230 = Class.forName((String) "pieces.PieceType");
        Field term12229 = ((Class) term12230).getDeclaredField((String) "QUEEN");
        ((Field) term12229).setAccessible(true);
        Object enum102 = ((Field) term12229).get((Object) null);
        term11850 = newInstance(Class.forName("game.Board"));
        long[] term11890 = (long[]) newLongArray(6);
        Object[] term11898 = (Object[]) newArray("[Z", 2);
        boolean[] term11899 = (boolean[]) newBooleanArray(2);
        boolean[] term11902 = (boolean[]) newBooleanArray(2);
        Object term11910 = newInstance(Class.forName("game.Move"));
        Object term11911 = newInstance(Class.forName("commons.Piece"));
        Object term11912 = newInstance(Class.forName("game.Cell"));
        Object term11918 = newInstance(Class.forName("game.Cell"));
        Object term11922 = newInstance(Class.forName("game.Cell"));
        Object[] term11935 = (Object[]) newArray("commons.Piece", 2);
        setField(term11850, term11850.getClass(), "pieces", term11851);
        setField(term11850, term11850.getClass(), "playerPieces", term11856);
        setField(term11850, term11850.getClass(), "moves", term11876);
        setField(term11850, term11850.getClass(), "guards", term11881);
        setField(term11850, term11850.getClass(), "moveList", term11886);
        setField(term11850, term11850.getClass(), "positions", term11890);
        setIntField(term11850, term11850.getClass(), "positionIndex", -919416536);
        setBooleanElement(term11899, 0, true);
        setBooleanElement(term11899, 1, true);
        setElement(term11898, 0, term11899);
        setBooleanElement(term11902, 0, true);
        setBooleanElement(term11902, 1, true);
        setElement(term11898, 1, term11902);
        setField(term11850, term11850.getClass(), "canCastle", term11898);
        setLongField(term11850, term11850.getClass(), "zobristHash", -4920224193275732920L);
        setField(term11850, term11850.getClass(), "playerToMove", enum99);
        setBooleanField(term11850, term11850.getClass(), "isThreeFoldRepetition", false);
        setIntField(term11850, term11850.getClass(), "halfMoves", -43417861);
        setBooleanField(term11850, term11850.getClass(), "fiftyMoveDraw", true);
        setBooleanField(term11850, term11850.getClass(), "inCheck", false);
        setField(term11911, term11911.getClass(), "color", enum100);
        setIntField(term11912, term11912.getClass(), "row", -1533843432);
        setIntField(term11912, term11912.getClass(), "col", -123338791);
        setField(term11911, term11911.getClass(), "position", term11912);
        setField(term11911, term11911.getClass(), "pieceType", enum101);
        setField(term11910, term11910.getClass(), "piece", term11911);
        setIntField(term11918, term11918.getClass(), "row", -1467089634);
        setIntField(term11918, term11918.getClass(), "col", 413548937);
        setField(term11910, term11910.getClass(), "target", term11918);
        setBooleanField(term11910, term11910.getClass(), "captureMove", false);
        setIntField(term11922, term11922.getClass(), "row", 1901317214);
        setIntField(term11922, term11922.getClass(), "col", 1166710220);
        setField(term11910, term11910.getClass(), "captureCell", term11922);
        setField(term11910, term11910.getClass(), "promoteTo", enum102);
        setIntField(term11910, term11910.getClass(), "id", -1070592289);
        setField(term11850, term11850.getClass(), "previousMove", term11910);
        setField(term11850, term11850.getClass(), "kings", term11935);
        term11936 = newInstance(Class.forName("commons.Piece"));
        Object term11937 = newInstance(Class.forName("game.Cell"));
        setField(term11936, term11936.getClass(), "color", enum99);
        setIntField(term11937, term11937.getClass(), "row", -1464172784);
        setIntField(term11937, term11937.getClass(), "col", 32185364);
        setField(term11936, term11936.getClass(), "position", term11937);
        setField(term11936, term11936.getClass(), "pieceType", enum102);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("commons.Piece");
        Object[] args = new Object[1];
        args[0] = term11936;
        callMethod(klass, "updateHashForRemove", argTypes, term11850, args);
    }

};


