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

public class Board_castlingAllowance_14652902337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19872;
     Object term19959;

    public Board_castlingAllowance_14652902337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term19873 = new HashMap();
        HashMap term19878 = new HashMap();
        HashMap term19898 = new HashMap();
        HashMap term19903 = new HashMap();
        ArrayList term19908 = new ArrayList();
        Class<? extends Object> term19991 = Class.forName((String) "commons.Color");
        Field term19990 = ((Class) term19991).getDeclaredField((String) "BLACK");
        ((Field) term19990).setAccessible(true);
        Object enum165 = ((Field) term19990).get((Object) null);
        Class<? extends Object> term20078 = Class.forName((String) "commons.Color");
        Field term20077 = ((Class) term20078).getDeclaredField((String) "WHITE");
        ((Field) term20077).setAccessible(true);
        Object enum166 = ((Field) term20077).get((Object) null);
        Class<? extends Object> term20165 = Class.forName((String) "pieces.PieceType");
        Field term20164 = ((Class) term20165).getDeclaredField((String) "ROOK");
        ((Field) term20164).setAccessible(true);
        Object enum167 = ((Field) term20164).get((Object) null);
        Class<? extends Object> term20264 = Class.forName((String) "pieces.PieceType");
        Field term20263 = ((Class) term20264).getDeclaredField((String) "KNIGHT");
        ((Field) term20263).setAccessible(true);
        Object enum168 = ((Field) term20263).get((Object) null);
        term19872 = newInstance(Class.forName("game.Board"));
        long[] term19912 = (long[]) newLongArray(6);
        Object[] term19920 = (Object[]) newArray("[Z", 2);
        boolean[] term19921 = (boolean[]) newBooleanArray(2);
        boolean[] term19924 = (boolean[]) newBooleanArray(2);
        Object term19932 = newInstance(Class.forName("game.Move"));
        Object term19933 = newInstance(Class.forName("commons.Piece"));
        Object term19934 = newInstance(Class.forName("game.Cell"));
        Object term19940 = newInstance(Class.forName("game.Cell"));
        Object term19944 = newInstance(Class.forName("game.Cell"));
        Object[] term19958 = (Object[]) newArray("commons.Piece", 2);
        setField(term19872, term19872.getClass(), "pieces", term19873);
        setField(term19872, term19872.getClass(), "playerPieces", term19878);
        setField(term19872, term19872.getClass(), "moves", term19898);
        setField(term19872, term19872.getClass(), "guards", term19903);
        setField(term19872, term19872.getClass(), "moveList", term19908);
        setField(term19872, term19872.getClass(), "positions", term19912);
        setIntField(term19872, term19872.getClass(), "positionIndex", 853609788);
        setBooleanElement(term19921, 0, true);
        setBooleanElement(term19921, 1, true);
        setElement(term19920, 0, term19921);
        setBooleanElement(term19924, 0, true);
        setBooleanElement(term19924, 1, true);
        setElement(term19920, 1, term19924);
        setField(term19872, term19872.getClass(), "canCastle", term19920);
        setLongField(term19872, term19872.getClass(), "zobristHash", 1233889271256172047L);
        setField(term19872, term19872.getClass(), "playerToMove", enum165);
        setBooleanField(term19872, term19872.getClass(), "isThreeFoldRepetition", false);
        setIntField(term19872, term19872.getClass(), "halfMoves", -197820800);
        setBooleanField(term19872, term19872.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term19872, term19872.getClass(), "inCheck", false);
        setField(term19933, term19933.getClass(), "color", enum166);
        setIntField(term19934, term19934.getClass(), "row", 723812297);
        setIntField(term19934, term19934.getClass(), "col", 1639448749);
        setField(term19933, term19933.getClass(), "position", term19934);
        setField(term19933, term19933.getClass(), "pieceType", enum167);
        setField(term19932, term19932.getClass(), "piece", term19933);
        setIntField(term19940, term19940.getClass(), "row", 873659088);
        setIntField(term19940, term19940.getClass(), "col", -975748721);
        setField(term19932, term19932.getClass(), "target", term19940);
        setBooleanField(term19932, term19932.getClass(), "captureMove", true);
        setIntField(term19944, term19944.getClass(), "row", 433248783);
        setIntField(term19944, term19944.getClass(), "col", -507944154);
        setField(term19932, term19932.getClass(), "captureCell", term19944);
        setField(term19932, term19932.getClass(), "promoteTo", enum168);
        setIntField(term19932, term19932.getClass(), "id", -1736183862);
        setField(term19872, term19872.getClass(), "previousMove", term19932);
        setField(term19872, term19872.getClass(), "kings", term19958);
        Class<? extends Object> term20369 = Class.forName((String) "pieces.PieceType");
        Field term20368 = ((Class) term20369).getDeclaredField((String) "PAWN");
        ((Field) term20368).setAccessible(true);
        Object enum169 = ((Field) term20368).get((Object) null);
        term19959 = newInstance(Class.forName("game.Move"));
        Object term19960 = newInstance(Class.forName("commons.Piece"));
        Object term19961 = newInstance(Class.forName("game.Cell"));
        Object term19972 = newInstance(Class.forName("game.Cell"));
        Object term19976 = newInstance(Class.forName("game.Cell"));
        setField(term19960, term19960.getClass(), "color", enum165);
        setIntField(term19961, term19961.getClass(), "row", 897010381);
        setIntField(term19961, term19961.getClass(), "col", -15712667);
        setField(term19960, term19960.getClass(), "position", term19961);
        setField(term19960, term19960.getClass(), "pieceType", enum169);
        setField(term19959, term19959.getClass(), "piece", term19960);
        setIntField(term19972, term19972.getClass(), "row", 1964967720);
        setIntField(term19972, term19972.getClass(), "col", 1351900243);
        setField(term19959, term19959.getClass(), "target", term19972);
        setBooleanField(term19959, term19959.getClass(), "captureMove", false);
        setIntField(term19976, term19976.getClass(), "row", -330897705);
        setIntField(term19976, term19976.getClass(), "col", 1065595802);
        setField(term19959, term19959.getClass(), "captureCell", term19976);
        setField(term19959, term19959.getClass(), "promoteTo", enum168);
        setIntField(term19959, term19959.getClass(), "id", 21031843);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("game.Move");
        Object[] args = new Object[1];
        args[0] = term19959;
        callMethod(klass, "castlingAllowance", argTypes, term19872, args);
    }

};


