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

public class King_getMoveList_14475632211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1082;
     Object term1167;

    public King_getMoveList_14475632211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1083 = new HashMap();
        HashMap term1088 = new HashMap();
        HashMap term1108 = new HashMap();
        HashMap term1113 = new HashMap();
        ArrayList term1118 = new ArrayList();
        Class<? extends Object> term1182 = Class.forName((String) "commons.Color");
        Field term1181 = ((Class) term1182).getDeclaredField((String) "BLACK");
        ((Field) term1181).setAccessible(true);
        Object enum8 = ((Field) term1181).get((Object) null);
        Class<? extends Object> term1269 = Class.forName((String) "commons.Color");
        Field term1268 = ((Class) term1269).getDeclaredField((String) "BLACK");
        ((Field) term1268).setAccessible(true);
        Object enum9 = ((Field) term1268).get((Object) null);
        Class<? extends Object> term1356 = Class.forName((String) "pieces.PieceType");
        Field term1355 = ((Class) term1356).getDeclaredField((String) "KING");
        ((Field) term1355).setAccessible(true);
        Object enum10 = ((Field) term1355).get((Object) null);
        Class<? extends Object> term1455 = Class.forName((String) "pieces.PieceType");
        Field term1454 = ((Class) term1455).getDeclaredField((String) "ROOK");
        ((Field) term1454).setAccessible(true);
        Object enum11 = ((Field) term1454).get((Object) null);
        term1082 = newInstance(Class.forName("game.Board"));
        long[] term1122 = (long[]) newLongArray(6);
        Object[] term1130 = (Object[]) newArray("[Z", 2);
        boolean[] term1131 = (boolean[]) newBooleanArray(2);
        boolean[] term1134 = (boolean[]) newBooleanArray(2);
        Object term1142 = newInstance(Class.forName("game.Move"));
        Object term1143 = newInstance(Class.forName("commons.Piece"));
        Object term1144 = newInstance(Class.forName("game.Cell"));
        Object term1150 = newInstance(Class.forName("game.Cell"));
        Object term1154 = newInstance(Class.forName("game.Cell"));
        Object[] term1166 = (Object[]) newArray("commons.Piece", 2);
        setField(term1082, term1082.getClass(), "pieces", term1083);
        setField(term1082, term1082.getClass(), "playerPieces", term1088);
        setField(term1082, term1082.getClass(), "moves", term1108);
        setField(term1082, term1082.getClass(), "guards", term1113);
        setField(term1082, term1082.getClass(), "moveList", term1118);
        setField(term1082, term1082.getClass(), "positions", term1122);
        setIntField(term1082, term1082.getClass(), "positionIndex", -117576464);
        setBooleanElement(term1131, 0, true);
        setBooleanElement(term1131, 1, true);
        setElement(term1130, 0, term1131);
        setBooleanElement(term1134, 0, true);
        setBooleanElement(term1134, 1, true);
        setElement(term1130, 1, term1134);
        setField(term1082, term1082.getClass(), "canCastle", term1130);
        setLongField(term1082, term1082.getClass(), "zobristHash", -8257434502486459194L);
        setField(term1082, term1082.getClass(), "playerToMove", enum8);
        setBooleanField(term1082, term1082.getClass(), "isThreeFoldRepetition", false);
        setIntField(term1082, term1082.getClass(), "halfMoves", -1007160944);
        setBooleanField(term1082, term1082.getClass(), "fiftyMoveDraw", true);
        setBooleanField(term1082, term1082.getClass(), "inCheck", false);
        setField(term1143, term1143.getClass(), "color", enum9);
        setIntField(term1144, term1144.getClass(), "row", 1135664017);
        setIntField(term1144, term1144.getClass(), "col", 590364439);
        setField(term1143, term1143.getClass(), "position", term1144);
        setField(term1143, term1143.getClass(), "pieceType", enum10);
        setField(term1142, term1142.getClass(), "piece", term1143);
        setIntField(term1150, term1150.getClass(), "row", 865208305);
        setIntField(term1150, term1150.getClass(), "col", -1275173084);
        setField(term1142, term1142.getClass(), "target", term1150);
        setBooleanField(term1142, term1142.getClass(), "captureMove", true);
        setIntField(term1154, term1154.getClass(), "row", -244121226);
        setIntField(term1154, term1154.getClass(), "col", -203030934);
        setField(term1142, term1142.getClass(), "captureCell", term1154);
        setField(term1142, term1142.getClass(), "promoteTo", enum11);
        setIntField(term1142, term1142.getClass(), "id", -1179120542);
        setField(term1082, term1082.getClass(), "previousMove", term1142);
        setField(term1082, term1082.getClass(), "kings", term1166);
        term1167 = newInstance(Class.forName("commons.Piece"));
        Object term1168 = newInstance(Class.forName("game.Cell"));
        setField(term1167, term1167.getClass(), "color", enum9);
        setIntField(term1168, term1168.getClass(), "row", -73683645);
        setIntField(term1168, term1168.getClass(), "col", -226514366);
        setField(term1167, term1167.getClass(), "position", term1168);
        setField(term1167, term1167.getClass(), "pieceType", enum11);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pieces.King");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("game.Board");
        argTypes[1] = Class.forName("commons.Piece");
        Object[] args = new Object[2];
        args[0] = term1082;
        args[1] = term1167;
        callMethod(klass, "getMoveList", argTypes, null, args);
    }

};


