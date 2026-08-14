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

public class Board_makeMove_139383475523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12802;
     Object term12887;

    public Board_makeMove_139383475523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12803 = new HashMap();
        HashMap term12808 = new HashMap();
        HashMap term12828 = new HashMap();
        HashMap term12833 = new HashMap();
        ArrayList term12838 = new ArrayList();
        Class<? extends Object> term12929 = Class.forName((String) "commons.Color");
        Field term12928 = ((Class) term12929).getDeclaredField((String) "BLACK");
        ((Field) term12928).setAccessible(true);
        Object enum107 = ((Field) term12928).get((Object) null);
        Class<? extends Object> term13016 = Class.forName((String) "pieces.PieceType");
        Field term13015 = ((Class) term13016).getDeclaredField((String) "KNIGHT");
        ((Field) term13015).setAccessible(true);
        Object enum108 = ((Field) term13015).get((Object) null);
        Class<? extends Object> term13121 = Class.forName((String) "pieces.PieceType");
        Field term13120 = ((Class) term13121).getDeclaredField((String) "ROOK");
        ((Field) term13120).setAccessible(true);
        Object enum109 = ((Field) term13120).get((Object) null);
        term12802 = newInstance(Class.forName("game.Board"));
        long[] term12842 = (long[]) newLongArray(6);
        Object[] term12850 = (Object[]) newArray("[Z", 2);
        boolean[] term12851 = (boolean[]) newBooleanArray(2);
        boolean[] term12854 = (boolean[]) newBooleanArray(2);
        Object term12862 = newInstance(Class.forName("game.Move"));
        Object term12863 = newInstance(Class.forName("commons.Piece"));
        Object term12864 = newInstance(Class.forName("game.Cell"));
        Object term12870 = newInstance(Class.forName("game.Cell"));
        Object term12874 = newInstance(Class.forName("game.Cell"));
        Object[] term12886 = (Object[]) newArray("commons.Piece", 2);
        setField(term12802, term12802.getClass(), "pieces", term12803);
        setField(term12802, term12802.getClass(), "playerPieces", term12808);
        setField(term12802, term12802.getClass(), "moves", term12828);
        setField(term12802, term12802.getClass(), "guards", term12833);
        setField(term12802, term12802.getClass(), "moveList", term12838);
        setField(term12802, term12802.getClass(), "positions", term12842);
        setIntField(term12802, term12802.getClass(), "positionIndex", -2003192918);
        setBooleanElement(term12851, 0, true);
        setBooleanElement(term12851, 1, true);
        setElement(term12850, 0, term12851);
        setBooleanElement(term12854, 0, true);
        setBooleanElement(term12854, 1, true);
        setElement(term12850, 1, term12854);
        setField(term12802, term12802.getClass(), "canCastle", term12850);
        setLongField(term12802, term12802.getClass(), "zobristHash", -2585684163342970173L);
        setField(term12802, term12802.getClass(), "playerToMove", enum107);
        setBooleanField(term12802, term12802.getClass(), "isThreeFoldRepetition", true);
        setIntField(term12802, term12802.getClass(), "halfMoves", -1362856620);
        setBooleanField(term12802, term12802.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term12802, term12802.getClass(), "inCheck", false);
        setField(term12863, term12863.getClass(), "color", enum107);
        setIntField(term12864, term12864.getClass(), "row", -1835839814);
        setIntField(term12864, term12864.getClass(), "col", -1404350380);
        setField(term12863, term12863.getClass(), "position", term12864);
        setField(term12863, term12863.getClass(), "pieceType", enum108);
        setField(term12862, term12862.getClass(), "piece", term12863);
        setIntField(term12870, term12870.getClass(), "row", -2013924238);
        setIntField(term12870, term12870.getClass(), "col", 579006268);
        setField(term12862, term12862.getClass(), "target", term12870);
        setBooleanField(term12862, term12862.getClass(), "captureMove", true);
        setIntField(term12874, term12874.getClass(), "row", -1694747156);
        setIntField(term12874, term12874.getClass(), "col", 1466373988);
        setField(term12862, term12862.getClass(), "captureCell", term12874);
        setField(term12862, term12862.getClass(), "promoteTo", enum109);
        setIntField(term12862, term12862.getClass(), "id", -358526505);
        setField(term12802, term12802.getClass(), "previousMove", term12862);
        setField(term12802, term12802.getClass(), "kings", term12886);
        Class<? extends Object> term13220 = Class.forName((String) "commons.Color");
        Field term13219 = ((Class) term13220).getDeclaredField((String) "WHITE");
        ((Field) term13219).setAccessible(true);
        Object enum110 = ((Field) term13219).get((Object) null);
        Class<? extends Object> term13307 = Class.forName((String) "pieces.PieceType");
        Field term13306 = ((Class) term13307).getDeclaredField((String) "BISHOP");
        ((Field) term13306).setAccessible(true);
        Object enum111 = ((Field) term13306).get((Object) null);
        Class<? extends Object> term13412 = Class.forName((String) "pieces.PieceType");
        Field term13411 = ((Class) term13412).getDeclaredField((String) "KING");
        ((Field) term13411).setAccessible(true);
        Object enum112 = ((Field) term13411).get((Object) null);
        term12887 = newInstance(Class.forName("game.Move"));
        Object term12888 = newInstance(Class.forName("commons.Piece"));
        Object term12889 = newInstance(Class.forName("game.Cell"));
        Object term12902 = newInstance(Class.forName("game.Cell"));
        Object term12906 = newInstance(Class.forName("game.Cell"));
        setField(term12888, term12888.getClass(), "color", enum110);
        setIntField(term12889, term12889.getClass(), "row", 1843268026);
        setIntField(term12889, term12889.getClass(), "col", 954660603);
        setField(term12888, term12888.getClass(), "position", term12889);
        setField(term12888, term12888.getClass(), "pieceType", enum111);
        setField(term12887, term12887.getClass(), "piece", term12888);
        setIntField(term12902, term12902.getClass(), "row", -1351605385);
        setIntField(term12902, term12902.getClass(), "col", 278355793);
        setField(term12887, term12887.getClass(), "target", term12902);
        setBooleanField(term12887, term12887.getClass(), "captureMove", true);
        setIntField(term12906, term12906.getClass(), "row", -310648604);
        setIntField(term12906, term12906.getClass(), "col", -648200466);
        setField(term12887, term12887.getClass(), "captureCell", term12906);
        setField(term12887, term12887.getClass(), "promoteTo", enum112);
        setIntField(term12887, term12887.getClass(), "id", 2007134147);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("game.Move");
        Object[] args = new Object[1];
        args[0] = term12887;
        callMethod(klass, "makeMove", argTypes, term12802, args);
    }

};


