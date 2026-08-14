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
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class Knight_getMoveList_13921858251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4804;
     Object term4890;

    public Knight_getMoveList_13921858251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4805 = new HashMap();
        HashMap term4810 = new HashMap();
        HashMap term4830 = new HashMap();
        HashMap term4835 = new HashMap();
        ArrayList term4840 = new ArrayList();
        Class<? extends Object> term4905 = Class.forName((String) "commons.Color");
        Field term4904 = ((Class) term4905).getDeclaredField((String) "WHITE");
        ((Field) term4904).setAccessible(true);
        Object enum39 = ((Field) term4904).get((Object) null);
        Class<? extends Object> term4992 = Class.forName((String) "pieces.PieceType");
        Field term4991 = ((Class) term4992).getDeclaredField((String) "PAWN");
        ((Field) term4991).setAccessible(true);
        Object enum40 = ((Field) term4991).get((Object) null);
        Class<? extends Object> term5091 = Class.forName((String) "pieces.PieceType");
        Field term5090 = ((Class) term5091).getDeclaredField((String) "QUEEN");
        ((Field) term5090).setAccessible(true);
        Object enum41 = ((Field) term5090).get((Object) null);
        term4804 = newInstance(Class.forName("game.Board"));
        long[] term4844 = (long[]) newLongArray(6);
        Object[] term4852 = (Object[]) newArray("[Z", 2);
        boolean[] term4853 = (boolean[]) newBooleanArray(2);
        boolean[] term4856 = (boolean[]) newBooleanArray(2);
        Object term4864 = newInstance(Class.forName("game.Move"));
        Object term4865 = newInstance(Class.forName("commons.Piece"));
        Object term4866 = newInstance(Class.forName("game.Cell"));
        Object term4872 = newInstance(Class.forName("game.Cell"));
        Object term4876 = newInstance(Class.forName("game.Cell"));
        Object[] term4889 = (Object[]) newArray("commons.Piece", 2);
        setField(term4804, term4804.getClass(), "pieces", term4805);
        setField(term4804, term4804.getClass(), "playerPieces", term4810);
        setField(term4804, term4804.getClass(), "moves", term4830);
        setField(term4804, term4804.getClass(), "guards", term4835);
        setField(term4804, term4804.getClass(), "moveList", term4840);
        setField(term4804, term4804.getClass(), "positions", term4844);
        setIntField(term4804, term4804.getClass(), "positionIndex", 229204365);
        setBooleanElement(term4853, 0, true);
        setBooleanElement(term4853, 1, true);
        setElement(term4852, 0, term4853);
        setBooleanElement(term4856, 0, true);
        setBooleanElement(term4856, 1, true);
        setElement(term4852, 1, term4856);
        setField(term4804, term4804.getClass(), "canCastle", term4852);
        setLongField(term4804, term4804.getClass(), "zobristHash", -7237588299778557629L);
        setField(term4804, term4804.getClass(), "playerToMove", enum39);
        setBooleanField(term4804, term4804.getClass(), "isThreeFoldRepetition", true);
        setIntField(term4804, term4804.getClass(), "halfMoves", -461771056);
        setBooleanField(term4804, term4804.getClass(), "fiftyMoveDraw", true);
        setBooleanField(term4804, term4804.getClass(), "inCheck", false);
        setField(term4865, term4865.getClass(), "color", enum39);
        setIntField(term4866, term4866.getClass(), "row", -243422082);
        setIntField(term4866, term4866.getClass(), "col", 1384592638);
        setField(term4865, term4865.getClass(), "position", term4866);
        setField(term4865, term4865.getClass(), "pieceType", enum40);
        setField(term4864, term4864.getClass(), "piece", term4865);
        setIntField(term4872, term4872.getClass(), "row", -1002370457);
        setIntField(term4872, term4872.getClass(), "col", -2014576105);
        setField(term4864, term4864.getClass(), "target", term4872);
        setBooleanField(term4864, term4864.getClass(), "captureMove", true);
        setIntField(term4876, term4876.getClass(), "row", 1296895584);
        setIntField(term4876, term4876.getClass(), "col", 628918458);
        setField(term4864, term4864.getClass(), "captureCell", term4876);
        setField(term4864, term4864.getClass(), "promoteTo", enum41);
        setIntField(term4864, term4864.getClass(), "id", -1274456137);
        setField(term4804, term4804.getClass(), "previousMove", term4864);
        setField(term4804, term4804.getClass(), "kings", term4889);
        term4890 = newInstance(Class.forName("commons.Piece"));
        Object term4891 = newInstance(Class.forName("game.Cell"));
        setField(term4890, term4890.getClass(), "color", enum39);
        setIntField(term4891, term4891.getClass(), "row", 1041916673);
        setIntField(term4891, term4891.getClass(), "col", -601863069);
        setField(term4890, term4890.getClass(), "position", term4891);
        setField(term4890, term4890.getClass(), "pieceType", enum41);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pieces.Knight");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("game.Board");
        argTypes[1] = Class.forName("commons.Piece");
        Object[] args = new Object[2];
        args[0] = term4804;
        args[1] = term4890;
        callMethod(klass, "getMoveList", argTypes, null, args);
    }

};


