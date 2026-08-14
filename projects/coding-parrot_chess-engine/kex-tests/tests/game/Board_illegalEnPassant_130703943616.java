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

public class Board_illegalEnPassant_130703943616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8639;
     Object term8725;
     Object term8746;

    public Board_illegalEnPassant_130703943616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8640 = new HashMap();
        HashMap term8645 = new HashMap();
        HashMap term8665 = new HashMap();
        HashMap term8670 = new HashMap();
        ArrayList term8675 = new ArrayList();
        Class<? extends Object> term8771 = Class.forName((String) "commons.Color");
        Field term8770 = ((Class) term8771).getDeclaredField((String) "BLACK");
        ((Field) term8770).setAccessible(true);
        Object enum72 = ((Field) term8770).get((Object) null);
        Class<? extends Object> term8858 = Class.forName((String) "commons.Color");
        Field term8857 = ((Class) term8858).getDeclaredField((String) "WHITE");
        ((Field) term8857).setAccessible(true);
        Object enum73 = ((Field) term8857).get((Object) null);
        Class<? extends Object> term8945 = Class.forName((String) "pieces.PieceType");
        Field term8944 = ((Class) term8945).getDeclaredField((String) "KNIGHT");
        ((Field) term8944).setAccessible(true);
        Object enum74 = ((Field) term8944).get((Object) null);
        Class<? extends Object> term9050 = Class.forName((String) "pieces.PieceType");
        Field term9049 = ((Class) term9050).getDeclaredField((String) "QUEEN");
        ((Field) term9049).setAccessible(true);
        Object enum75 = ((Field) term9049).get((Object) null);
        term8639 = newInstance(Class.forName("game.Board"));
        long[] term8679 = (long[]) newLongArray(6);
        Object[] term8687 = (Object[]) newArray("[Z", 2);
        boolean[] term8688 = (boolean[]) newBooleanArray(2);
        boolean[] term8691 = (boolean[]) newBooleanArray(2);
        Object term8699 = newInstance(Class.forName("game.Move"));
        Object term8700 = newInstance(Class.forName("commons.Piece"));
        Object term8701 = newInstance(Class.forName("game.Cell"));
        Object term8707 = newInstance(Class.forName("game.Cell"));
        Object term8711 = newInstance(Class.forName("game.Cell"));
        Object[] term8724 = (Object[]) newArray("commons.Piece", 2);
        setField(term8639, term8639.getClass(), "pieces", term8640);
        setField(term8639, term8639.getClass(), "playerPieces", term8645);
        setField(term8639, term8639.getClass(), "moves", term8665);
        setField(term8639, term8639.getClass(), "guards", term8670);
        setField(term8639, term8639.getClass(), "moveList", term8675);
        setField(term8639, term8639.getClass(), "positions", term8679);
        setIntField(term8639, term8639.getClass(), "positionIndex", 548228925);
        setBooleanElement(term8688, 0, true);
        setBooleanElement(term8688, 1, true);
        setElement(term8687, 0, term8688);
        setBooleanElement(term8691, 0, true);
        setBooleanElement(term8691, 1, true);
        setElement(term8687, 1, term8691);
        setField(term8639, term8639.getClass(), "canCastle", term8687);
        setLongField(term8639, term8639.getClass(), "zobristHash", -5476826692763582090L);
        setField(term8639, term8639.getClass(), "playerToMove", enum72);
        setBooleanField(term8639, term8639.getClass(), "isThreeFoldRepetition", false);
        setIntField(term8639, term8639.getClass(), "halfMoves", -749861210);
        setBooleanField(term8639, term8639.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term8639, term8639.getClass(), "inCheck", true);
        setField(term8700, term8700.getClass(), "color", enum73);
        setIntField(term8701, term8701.getClass(), "row", 1694224101);
        setIntField(term8701, term8701.getClass(), "col", 937859191);
        setField(term8700, term8700.getClass(), "position", term8701);
        setField(term8700, term8700.getClass(), "pieceType", enum74);
        setField(term8699, term8699.getClass(), "piece", term8700);
        setIntField(term8707, term8707.getClass(), "row", -916584829);
        setIntField(term8707, term8707.getClass(), "col", -2131181468);
        setField(term8699, term8699.getClass(), "target", term8707);
        setBooleanField(term8699, term8699.getClass(), "captureMove", true);
        setIntField(term8711, term8711.getClass(), "row", 282916351);
        setIntField(term8711, term8711.getClass(), "col", 880977281);
        setField(term8699, term8699.getClass(), "captureCell", term8711);
        setField(term8699, term8699.getClass(), "promoteTo", enum75);
        setIntField(term8699, term8699.getClass(), "id", 371943306);
        setField(term8639, term8639.getClass(), "previousMove", term8699);
        setField(term8639, term8639.getClass(), "kings", term8724);
        Class<? extends Object> term9152 = Class.forName((String) "pieces.PieceType");
        Field term9151 = ((Class) term9152).getDeclaredField((String) "ROOK");
        ((Field) term9151).setAccessible(true);
        Object enum76 = ((Field) term9151).get((Object) null);
        term8725 = newInstance(Class.forName("game.Move"));
        Object term8726 = newInstance(Class.forName("commons.Piece"));
        Object term8727 = newInstance(Class.forName("game.Cell"));
        Object term8730 = newInstance(Class.forName("game.Cell"));
        Object term8734 = newInstance(Class.forName("game.Cell"));
        setField(term8726, term8726.getClass(), "color", enum73);
        setIntField(term8727, term8727.getClass(), "row", 982388293);
        setIntField(term8727, term8727.getClass(), "col", -159494544);
        setField(term8726, term8726.getClass(), "position", term8727);
        setField(term8726, term8726.getClass(), "pieceType", enum75);
        setField(term8725, term8725.getClass(), "piece", term8726);
        setIntField(term8730, term8730.getClass(), "row", -75206835);
        setIntField(term8730, term8730.getClass(), "col", -1618206977);
        setField(term8725, term8725.getClass(), "target", term8730);
        setBooleanField(term8725, term8725.getClass(), "captureMove", true);
        setIntField(term8734, term8734.getClass(), "row", -1747406163);
        setIntField(term8734, term8734.getClass(), "col", 388157121);
        setField(term8725, term8725.getClass(), "captureCell", term8734);
        setField(term8725, term8725.getClass(), "promoteTo", enum76);
        setIntField(term8725, term8725.getClass(), "id", 1684998508);
        Class<? extends Object> term9251 = Class.forName((String) "pieces.PieceType");
        Field term9250 = ((Class) term9251).getDeclaredField((String) "BISHOP");
        ((Field) term9250).setAccessible(true);
        Object enum77 = ((Field) term9250).get((Object) null);
        term8746 = newInstance(Class.forName("commons.Piece"));
        Object term8747 = newInstance(Class.forName("game.Cell"));
        setField(term8746, term8746.getClass(), "color", enum72);
        setIntField(term8747, term8747.getClass(), "row", -1476644457);
        setIntField(term8747, term8747.getClass(), "col", 1270666529);
        setField(term8746, term8746.getClass(), "position", term8747);
        setField(term8746, term8746.getClass(), "pieceType", enum77);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("game.Move");
        argTypes[1] = Class.forName("commons.Piece");
        Object[] args = new Object[2];
        args[0] = term8725;
        args[1] = term8746;
        callMethod(klass, "illegalEnPassant", argTypes, term8639, args);
    }

};


