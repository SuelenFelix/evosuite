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

public class Board_updateForBlockedCell_12626033227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14777;
     Object term14864;

    public Board_updateForBlockedCell_12626033227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term14778 = new HashMap();
        HashMap term14783 = new HashMap();
        HashMap term14803 = new HashMap();
        HashMap term14808 = new HashMap();
        ArrayList term14813 = new ArrayList();
        Class<? extends Object> term14905 = Class.forName((String) "commons.Color");
        Field term14904 = ((Class) term14905).getDeclaredField((String) "WHITE");
        ((Field) term14904).setAccessible(true);
        Object enum123 = ((Field) term14904).get((Object) null);
        Class<? extends Object> term14992 = Class.forName((String) "pieces.PieceType");
        Field term14991 = ((Class) term14992).getDeclaredField((String) "PAWN");
        ((Field) term14991).setAccessible(true);
        Object enum124 = ((Field) term14991).get((Object) null);
        Class<? extends Object> term15091 = Class.forName((String) "pieces.PieceType");
        Field term15090 = ((Class) term15091).getDeclaredField((String) "KNIGHT");
        ((Field) term15090).setAccessible(true);
        Object enum125 = ((Field) term15090).get((Object) null);
        term14777 = newInstance(Class.forName("game.Board"));
        long[] term14817 = (long[]) newLongArray(6);
        Object[] term14825 = (Object[]) newArray("[Z", 2);
        boolean[] term14826 = (boolean[]) newBooleanArray(2);
        boolean[] term14829 = (boolean[]) newBooleanArray(2);
        Object term14837 = newInstance(Class.forName("game.Move"));
        Object term14838 = newInstance(Class.forName("commons.Piece"));
        Object term14839 = newInstance(Class.forName("game.Cell"));
        Object term14845 = newInstance(Class.forName("game.Cell"));
        Object term14849 = newInstance(Class.forName("game.Cell"));
        Object[] term14863 = (Object[]) newArray("commons.Piece", 2);
        setField(term14777, term14777.getClass(), "pieces", term14778);
        setField(term14777, term14777.getClass(), "playerPieces", term14783);
        setField(term14777, term14777.getClass(), "moves", term14803);
        setField(term14777, term14777.getClass(), "guards", term14808);
        setField(term14777, term14777.getClass(), "moveList", term14813);
        setField(term14777, term14777.getClass(), "positions", term14817);
        setIntField(term14777, term14777.getClass(), "positionIndex", 1116576792);
        setBooleanElement(term14826, 0, true);
        setBooleanElement(term14826, 1, true);
        setElement(term14825, 0, term14826);
        setBooleanElement(term14829, 0, true);
        setBooleanElement(term14829, 1, true);
        setElement(term14825, 1, term14829);
        setField(term14777, term14777.getClass(), "canCastle", term14825);
        setLongField(term14777, term14777.getClass(), "zobristHash", 7009926388951271268L);
        setField(term14777, term14777.getClass(), "playerToMove", enum123);
        setBooleanField(term14777, term14777.getClass(), "isThreeFoldRepetition", false);
        setIntField(term14777, term14777.getClass(), "halfMoves", -942194446);
        setBooleanField(term14777, term14777.getClass(), "fiftyMoveDraw", true);
        setBooleanField(term14777, term14777.getClass(), "inCheck", false);
        setField(term14838, term14838.getClass(), "color", enum123);
        setIntField(term14839, term14839.getClass(), "row", -938508470);
        setIntField(term14839, term14839.getClass(), "col", 1242676024);
        setField(term14838, term14838.getClass(), "position", term14839);
        setField(term14838, term14838.getClass(), "pieceType", enum124);
        setField(term14837, term14837.getClass(), "piece", term14838);
        setIntField(term14845, term14845.getClass(), "row", -1865023308);
        setIntField(term14845, term14845.getClass(), "col", 1698510819);
        setField(term14837, term14837.getClass(), "target", term14845);
        setBooleanField(term14837, term14837.getClass(), "captureMove", false);
        setIntField(term14849, term14849.getClass(), "row", -1553893255);
        setIntField(term14849, term14849.getClass(), "col", 1303442927);
        setField(term14837, term14837.getClass(), "captureCell", term14849);
        setField(term14837, term14837.getClass(), "promoteTo", enum125);
        setIntField(term14837, term14837.getClass(), "id", 794568325);
        setField(term14777, term14777.getClass(), "previousMove", term14837);
        setField(term14777, term14777.getClass(), "kings", term14863);
        Class<? extends Object> term15196 = Class.forName((String) "pieces.PieceType");
        Field term15195 = ((Class) term15196).getDeclaredField((String) "QUEEN");
        ((Field) term15195).setAccessible(true);
        Object enum126 = ((Field) term15195).get((Object) null);
        Class<? extends Object> term15298 = Class.forName((String) "pieces.PieceType");
        Field term15297 = ((Class) term15298).getDeclaredField((String) "ROOK");
        ((Field) term15297).setAccessible(true);
        Object enum127 = ((Field) term15297).get((Object) null);
        term14864 = newInstance(Class.forName("game.Move"));
        Object term14865 = newInstance(Class.forName("commons.Piece"));
        Object term14866 = newInstance(Class.forName("game.Cell"));
        Object term14878 = newInstance(Class.forName("game.Cell"));
        Object term14882 = newInstance(Class.forName("game.Cell"));
        setField(term14865, term14865.getClass(), "color", enum123);
        setIntField(term14866, term14866.getClass(), "row", -434468428);
        setIntField(term14866, term14866.getClass(), "col", 1559605714);
        setField(term14865, term14865.getClass(), "position", term14866);
        setField(term14865, term14865.getClass(), "pieceType", enum126);
        setField(term14864, term14864.getClass(), "piece", term14865);
        setIntField(term14878, term14878.getClass(), "row", 1146601902);
        setIntField(term14878, term14878.getClass(), "col", -1938881385);
        setField(term14864, term14864.getClass(), "target", term14878);
        setBooleanField(term14864, term14864.getClass(), "captureMove", false);
        setIntField(term14882, term14882.getClass(), "row", -1629418973);
        setIntField(term14882, term14882.getClass(), "col", -100825168);
        setField(term14864, term14864.getClass(), "captureCell", term14882);
        setField(term14864, term14864.getClass(), "promoteTo", enum127);
        setIntField(term14864, term14864.getClass(), "id", 768407648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("game.Move");
        Object[] args = new Object[1];
        args[0] = term14864;
        callMethod(klass, "updateForBlockedCell", argTypes, term14777, args);
    }

};


