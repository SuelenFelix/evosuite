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

public class Board_toString_134833938541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22039;

    public Board_toString_134833938541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term22040 = new HashMap();
        HashMap term22045 = new HashMap();
        HashMap term22065 = new HashMap();
        HashMap term22070 = new HashMap();
        ArrayList term22075 = new ArrayList();
        Class<? extends Object> term22135 = Class.forName((String) "commons.Color");
        Field term22134 = ((Class) term22135).getDeclaredField((String) "BLACK");
        ((Field) term22134).setAccessible(true);
        Object enum183 = ((Field) term22134).get((Object) null);
        Class<? extends Object> term22222 = Class.forName((String) "commons.Color");
        Field term22221 = ((Class) term22222).getDeclaredField((String) "WHITE");
        ((Field) term22221).setAccessible(true);
        Object enum184 = ((Field) term22221).get((Object) null);
        Class<? extends Object> term22309 = Class.forName((String) "pieces.PieceType");
        Field term22308 = ((Class) term22309).getDeclaredField((String) "PAWN");
        ((Field) term22308).setAccessible(true);
        Object enum185 = ((Field) term22308).get((Object) null);
        Class<? extends Object> term22408 = Class.forName((String) "pieces.PieceType");
        Field term22407 = ((Class) term22408).getDeclaredField((String) "KING");
        ((Field) term22407).setAccessible(true);
        Object enum186 = ((Field) term22407).get((Object) null);
        term22039 = newInstance(Class.forName("game.Board"));
        long[] term22079 = (long[]) newLongArray(6);
        Object[] term22087 = (Object[]) newArray("[Z", 2);
        boolean[] term22088 = (boolean[]) newBooleanArray(2);
        boolean[] term22091 = (boolean[]) newBooleanArray(2);
        Object term22099 = newInstance(Class.forName("game.Move"));
        Object term22100 = newInstance(Class.forName("commons.Piece"));
        Object term22101 = newInstance(Class.forName("game.Cell"));
        Object term22107 = newInstance(Class.forName("game.Cell"));
        Object term22111 = newInstance(Class.forName("game.Cell"));
        Object[] term22123 = (Object[]) newArray("commons.Piece", 2);
        setField(term22039, term22039.getClass(), "pieces", term22040);
        setField(term22039, term22039.getClass(), "playerPieces", term22045);
        setField(term22039, term22039.getClass(), "moves", term22065);
        setField(term22039, term22039.getClass(), "guards", term22070);
        setField(term22039, term22039.getClass(), "moveList", term22075);
        setField(term22039, term22039.getClass(), "positions", term22079);
        setIntField(term22039, term22039.getClass(), "positionIndex", -1428063820);
        setBooleanElement(term22088, 0, true);
        setBooleanElement(term22088, 1, true);
        setElement(term22087, 0, term22088);
        setBooleanElement(term22091, 0, true);
        setBooleanElement(term22091, 1, true);
        setElement(term22087, 1, term22091);
        setField(term22039, term22039.getClass(), "canCastle", term22087);
        setLongField(term22039, term22039.getClass(), "zobristHash", 5907001541142728739L);
        setField(term22039, term22039.getClass(), "playerToMove", enum183);
        setBooleanField(term22039, term22039.getClass(), "isThreeFoldRepetition", true);
        setIntField(term22039, term22039.getClass(), "halfMoves", -1271375703);
        setBooleanField(term22039, term22039.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term22039, term22039.getClass(), "inCheck", true);
        setField(term22100, term22100.getClass(), "color", enum184);
        setIntField(term22101, term22101.getClass(), "row", 1136208236);
        setIntField(term22101, term22101.getClass(), "col", -1220630391);
        setField(term22100, term22100.getClass(), "position", term22101);
        setField(term22100, term22100.getClass(), "pieceType", enum185);
        setField(term22099, term22099.getClass(), "piece", term22100);
        setIntField(term22107, term22107.getClass(), "row", -995822131);
        setIntField(term22107, term22107.getClass(), "col", -687282231);
        setField(term22099, term22099.getClass(), "target", term22107);
        setBooleanField(term22099, term22099.getClass(), "captureMove", true);
        setIntField(term22111, term22111.getClass(), "row", 1200440315);
        setIntField(term22111, term22111.getClass(), "col", 40571662);
        setField(term22099, term22099.getClass(), "captureCell", term22111);
        setField(term22099, term22099.getClass(), "promoteTo", enum186);
        setIntField(term22099, term22099.getClass(), "id", 1863910269);
        setField(term22039, term22039.getClass(), "previousMove", term22099);
        setField(term22039, term22039.getClass(), "kings", term22123);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term22039, args);
    }

};


