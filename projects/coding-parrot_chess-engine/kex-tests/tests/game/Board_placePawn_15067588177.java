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
import java.lang.Integer;

public class Board_placePawn_15067588177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4766;
     Object term4852;
     Object term4854;
     Object enum41;

    public Board_placePawn_15067588177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4767 = new HashMap();
        HashMap term4772 = new HashMap();
        HashMap term4792 = new HashMap();
        HashMap term4797 = new HashMap();
        ArrayList term4802 = new ArrayList();
        Class<? extends Object> term4867 = Class.forName((String) "commons.Color");
        Field term4866 = ((Class) term4867).getDeclaredField((String) "BLACK");
        ((Field) term4866).setAccessible(true);
        Object enum40 = ((Field) term4866).get((Object) null);
        Class<? extends Object> term4954 = Class.forName((String) "commons.Color");
        Field term4953 = ((Class) term4954).getDeclaredField((String) "WHITE");
        ((Field) term4953).setAccessible(true);
        enum41 = ((Field) term4953).get((Object) null);
        Class<? extends Object> term5041 = Class.forName((String) "pieces.PieceType");
        Field term5040 = ((Class) term5041).getDeclaredField((String) "QUEEN");
        ((Field) term5040).setAccessible(true);
        Object enum42 = ((Field) term5040).get((Object) null);
        Class<? extends Object> term5143 = Class.forName((String) "pieces.PieceType");
        Field term5142 = ((Class) term5143).getDeclaredField((String) "QUEEN");
        ((Field) term5142).setAccessible(true);
        Object enum43 = ((Field) term5142).get((Object) null);
        term4766 = newInstance(Class.forName("game.Board"));
        long[] term4806 = (long[]) newLongArray(6);
        Object[] term4814 = (Object[]) newArray("[Z", 2);
        boolean[] term4815 = (boolean[]) newBooleanArray(2);
        boolean[] term4818 = (boolean[]) newBooleanArray(2);
        Object term4826 = newInstance(Class.forName("game.Move"));
        Object term4827 = newInstance(Class.forName("commons.Piece"));
        Object term4828 = newInstance(Class.forName("game.Cell"));
        Object term4834 = newInstance(Class.forName("game.Cell"));
        Object term4838 = newInstance(Class.forName("game.Cell"));
        Object[] term4851 = (Object[]) newArray("commons.Piece", 2);
        setField(term4766, term4766.getClass(), "pieces", term4767);
        setField(term4766, term4766.getClass(), "playerPieces", term4772);
        setField(term4766, term4766.getClass(), "moves", term4792);
        setField(term4766, term4766.getClass(), "guards", term4797);
        setField(term4766, term4766.getClass(), "moveList", term4802);
        setField(term4766, term4766.getClass(), "positions", term4806);
        setIntField(term4766, term4766.getClass(), "positionIndex", 1045657203);
        setBooleanElement(term4815, 0, true);
        setBooleanElement(term4815, 1, true);
        setElement(term4814, 0, term4815);
        setBooleanElement(term4818, 0, true);
        setBooleanElement(term4818, 1, true);
        setElement(term4814, 1, term4818);
        setField(term4766, term4766.getClass(), "canCastle", term4814);
        setLongField(term4766, term4766.getClass(), "zobristHash", 7411271909051562686L);
        setField(term4766, term4766.getClass(), "playerToMove", enum40);
        setBooleanField(term4766, term4766.getClass(), "isThreeFoldRepetition", true);
        setIntField(term4766, term4766.getClass(), "halfMoves", 1386130016);
        setBooleanField(term4766, term4766.getClass(), "fiftyMoveDraw", true);
        setBooleanField(term4766, term4766.getClass(), "inCheck", true);
        setField(term4827, term4827.getClass(), "color", enum41);
        setIntField(term4828, term4828.getClass(), "row", 1072005683);
        setIntField(term4828, term4828.getClass(), "col", 1861318859);
        setField(term4827, term4827.getClass(), "position", term4828);
        setField(term4827, term4827.getClass(), "pieceType", enum42);
        setField(term4826, term4826.getClass(), "piece", term4827);
        setIntField(term4834, term4834.getClass(), "row", 1474524152);
        setIntField(term4834, term4834.getClass(), "col", 568954359);
        setField(term4826, term4826.getClass(), "target", term4834);
        setBooleanField(term4826, term4826.getClass(), "captureMove", true);
        setIntField(term4838, term4838.getClass(), "row", 53410913);
        setIntField(term4838, term4838.getClass(), "col", -375014958);
        setField(term4826, term4826.getClass(), "captureCell", term4838);
        setField(term4826, term4826.getClass(), "promoteTo", enum43);
        setIntField(term4826, term4826.getClass(), "id", 1107176718);
        setField(term4766, term4766.getClass(), "previousMove", term4826);
        setField(term4766, term4766.getClass(), "kings", term4851);
        term4852 = new Integer(480137250);
        term4854 = new Integer(-341152642);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("commons.Color");
        Object[] args = new Object[3];
        args[0] = term4852;
        args[1] = term4854;
        args[2] = enum41;
        callMethod(klass, "placePawn", argTypes, term4766, args);
    }

};


