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

public class Board_getKing_84626782414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7808;
     Object enum66;

    public Board_getKing_84626782414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7809 = new HashMap();
        HashMap term7814 = new HashMap();
        HashMap term7834 = new HashMap();
        HashMap term7839 = new HashMap();
        ArrayList term7844 = new ArrayList();
        Class<? extends Object> term7905 = Class.forName((String) "commons.Color");
        Field term7904 = ((Class) term7905).getDeclaredField((String) "BLACK");
        ((Field) term7904).setAccessible(true);
        Object enum65 = ((Field) term7904).get((Object) null);
        Class<? extends Object> term7992 = Class.forName((String) "commons.Color");
        Field term7991 = ((Class) term7992).getDeclaredField((String) "BLACK");
        ((Field) term7991).setAccessible(true);
        enum66 = ((Field) term7991).get((Object) null);
        Class<? extends Object> term8079 = Class.forName((String) "pieces.PieceType");
        Field term8078 = ((Class) term8079).getDeclaredField((String) "ROOK");
        ((Field) term8078).setAccessible(true);
        Object enum67 = ((Field) term8078).get((Object) null);
        Class<? extends Object> term8178 = Class.forName((String) "pieces.PieceType");
        Field term8177 = ((Class) term8178).getDeclaredField((String) "QUEEN");
        ((Field) term8177).setAccessible(true);
        Object enum68 = ((Field) term8177).get((Object) null);
        term7808 = newInstance(Class.forName("game.Board"));
        long[] term7848 = (long[]) newLongArray(6);
        Object[] term7856 = (Object[]) newArray("[Z", 2);
        boolean[] term7857 = (boolean[]) newBooleanArray(2);
        boolean[] term7860 = (boolean[]) newBooleanArray(2);
        Object term7868 = newInstance(Class.forName("game.Move"));
        Object term7869 = newInstance(Class.forName("commons.Piece"));
        Object term7870 = newInstance(Class.forName("game.Cell"));
        Object term7876 = newInstance(Class.forName("game.Cell"));
        Object term7880 = newInstance(Class.forName("game.Cell"));
        Object[] term7893 = (Object[]) newArray("commons.Piece", 2);
        setField(term7808, term7808.getClass(), "pieces", term7809);
        setField(term7808, term7808.getClass(), "playerPieces", term7814);
        setField(term7808, term7808.getClass(), "moves", term7834);
        setField(term7808, term7808.getClass(), "guards", term7839);
        setField(term7808, term7808.getClass(), "moveList", term7844);
        setField(term7808, term7808.getClass(), "positions", term7848);
        setIntField(term7808, term7808.getClass(), "positionIndex", -1882480155);
        setBooleanElement(term7857, 0, true);
        setBooleanElement(term7857, 1, true);
        setElement(term7856, 0, term7857);
        setBooleanElement(term7860, 0, true);
        setBooleanElement(term7860, 1, true);
        setElement(term7856, 1, term7860);
        setField(term7808, term7808.getClass(), "canCastle", term7856);
        setLongField(term7808, term7808.getClass(), "zobristHash", -4325723315152823407L);
        setField(term7808, term7808.getClass(), "playerToMove", enum65);
        setBooleanField(term7808, term7808.getClass(), "isThreeFoldRepetition", false);
        setIntField(term7808, term7808.getClass(), "halfMoves", -1410220680);
        setBooleanField(term7808, term7808.getClass(), "fiftyMoveDraw", true);
        setBooleanField(term7808, term7808.getClass(), "inCheck", false);
        setField(term7869, term7869.getClass(), "color", enum66);
        setIntField(term7870, term7870.getClass(), "row", 389427431);
        setIntField(term7870, term7870.getClass(), "col", -1945706126);
        setField(term7869, term7869.getClass(), "position", term7870);
        setField(term7869, term7869.getClass(), "pieceType", enum67);
        setField(term7868, term7868.getClass(), "piece", term7869);
        setIntField(term7876, term7876.getClass(), "row", 1152356969);
        setIntField(term7876, term7876.getClass(), "col", -1667990367);
        setField(term7868, term7868.getClass(), "target", term7876);
        setBooleanField(term7868, term7868.getClass(), "captureMove", false);
        setIntField(term7880, term7880.getClass(), "row", -1214628358);
        setIntField(term7880, term7880.getClass(), "col", 1102721075);
        setField(term7868, term7868.getClass(), "captureCell", term7880);
        setField(term7868, term7868.getClass(), "promoteTo", enum68);
        setIntField(term7868, term7868.getClass(), "id", -426764678);
        setField(term7808, term7808.getClass(), "previousMove", term7868);
        setField(term7808, term7808.getClass(), "kings", term7893);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("commons.Color");
        Object[] args = new Object[1];
        args[0] = enum66;
        callMethod(klass, "getKing", argTypes, term7808, args);
    }

};


