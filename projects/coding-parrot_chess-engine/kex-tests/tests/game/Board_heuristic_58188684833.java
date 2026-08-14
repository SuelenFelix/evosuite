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

public class Board_heuristic_58188684833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17789;

    public Board_heuristic_58188684833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term17790 = new HashMap();
        HashMap term17795 = new HashMap();
        HashMap term17815 = new HashMap();
        HashMap term17820 = new HashMap();
        ArrayList term17825 = new ArrayList();
        Class<? extends Object> term17887 = Class.forName((String) "commons.Color");
        Field term17886 = ((Class) term17887).getDeclaredField((String) "BLACK");
        ((Field) term17886).setAccessible(true);
        Object enum148 = ((Field) term17886).get((Object) null);
        Class<? extends Object> term17974 = Class.forName((String) "commons.Color");
        Field term17973 = ((Class) term17974).getDeclaredField((String) "BLACK");
        ((Field) term17973).setAccessible(true);
        Object enum149 = ((Field) term17973).get((Object) null);
        Class<? extends Object> term18061 = Class.forName((String) "pieces.PieceType");
        Field term18060 = ((Class) term18061).getDeclaredField((String) "PAWN");
        ((Field) term18060).setAccessible(true);
        Object enum150 = ((Field) term18060).get((Object) null);
        Class<? extends Object> term18160 = Class.forName((String) "pieces.PieceType");
        Field term18159 = ((Class) term18160).getDeclaredField((String) "BISHOP");
        ((Field) term18159).setAccessible(true);
        Object enum151 = ((Field) term18159).get((Object) null);
        term17789 = newInstance(Class.forName("game.Board"));
        long[] term17829 = (long[]) newLongArray(6);
        Object[] term17837 = (Object[]) newArray("[Z", 2);
        boolean[] term17838 = (boolean[]) newBooleanArray(2);
        boolean[] term17841 = (boolean[]) newBooleanArray(2);
        Object term17849 = newInstance(Class.forName("game.Move"));
        Object term17850 = newInstance(Class.forName("commons.Piece"));
        Object term17851 = newInstance(Class.forName("game.Cell"));
        Object term17857 = newInstance(Class.forName("game.Cell"));
        Object term17861 = newInstance(Class.forName("game.Cell"));
        Object[] term17875 = (Object[]) newArray("commons.Piece", 2);
        setField(term17789, term17789.getClass(), "pieces", term17790);
        setField(term17789, term17789.getClass(), "playerPieces", term17795);
        setField(term17789, term17789.getClass(), "moves", term17815);
        setField(term17789, term17789.getClass(), "guards", term17820);
        setField(term17789, term17789.getClass(), "moveList", term17825);
        setField(term17789, term17789.getClass(), "positions", term17829);
        setIntField(term17789, term17789.getClass(), "positionIndex", 489201218);
        setBooleanElement(term17838, 0, true);
        setBooleanElement(term17838, 1, true);
        setElement(term17837, 0, term17838);
        setBooleanElement(term17841, 0, true);
        setBooleanElement(term17841, 1, true);
        setElement(term17837, 1, term17841);
        setField(term17789, term17789.getClass(), "canCastle", term17837);
        setLongField(term17789, term17789.getClass(), "zobristHash", -5892135042702373494L);
        setField(term17789, term17789.getClass(), "playerToMove", enum148);
        setBooleanField(term17789, term17789.getClass(), "isThreeFoldRepetition", false);
        setIntField(term17789, term17789.getClass(), "halfMoves", 464181937);
        setBooleanField(term17789, term17789.getClass(), "fiftyMoveDraw", true);
        setBooleanField(term17789, term17789.getClass(), "inCheck", true);
        setField(term17850, term17850.getClass(), "color", enum149);
        setIntField(term17851, term17851.getClass(), "row", -1455526612);
        setIntField(term17851, term17851.getClass(), "col", -941356098);
        setField(term17850, term17850.getClass(), "position", term17851);
        setField(term17850, term17850.getClass(), "pieceType", enum150);
        setField(term17849, term17849.getClass(), "piece", term17850);
        setIntField(term17857, term17857.getClass(), "row", -201517446);
        setIntField(term17857, term17857.getClass(), "col", -97742366);
        setField(term17849, term17849.getClass(), "target", term17857);
        setBooleanField(term17849, term17849.getClass(), "captureMove", true);
        setIntField(term17861, term17861.getClass(), "row", 1638851942);
        setIntField(term17861, term17861.getClass(), "col", 1374790203);
        setField(term17849, term17849.getClass(), "captureCell", term17861);
        setField(term17849, term17849.getClass(), "promoteTo", enum151);
        setIntField(term17849, term17849.getClass(), "id", 1160010161);
        setField(term17789, term17789.getClass(), "previousMove", term17849);
        setField(term17789, term17789.getClass(), "kings", term17875);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "heuristic", argTypes, term17789, args);
    }

};


