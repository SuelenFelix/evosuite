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
import java.util.LinkedList;

public class Board_insufficientMaterial_34986573235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18650;
     Object term18735;

    public Board_insufficientMaterial_34986573235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term18651 = new HashMap();
        HashMap term18656 = new HashMap();
        HashMap term18676 = new HashMap();
        HashMap term18681 = new HashMap();
        ArrayList term18686 = new ArrayList();
        Class<? extends Object> term18766 = Class.forName((String) "commons.Color");
        Field term18765 = ((Class) term18766).getDeclaredField((String) "WHITE");
        ((Field) term18765).setAccessible(true);
        Object enum155 = ((Field) term18765).get((Object) null);
        Class<? extends Object> term18853 = Class.forName((String) "pieces.PieceType");
        Field term18852 = ((Class) term18853).getDeclaredField((String) "QUEEN");
        ((Field) term18852).setAccessible(true);
        Object enum156 = ((Field) term18852).get((Object) null);
        Class<? extends Object> term18955 = Class.forName((String) "pieces.PieceType");
        Field term18954 = ((Class) term18955).getDeclaredField((String) "PAWN");
        ((Field) term18954).setAccessible(true);
        Object enum157 = ((Field) term18954).get((Object) null);
        term18650 = newInstance(Class.forName("game.Board"));
        long[] term18690 = (long[]) newLongArray(6);
        Object[] term18698 = (Object[]) newArray("[Z", 2);
        boolean[] term18699 = (boolean[]) newBooleanArray(2);
        boolean[] term18702 = (boolean[]) newBooleanArray(2);
        Object term18710 = newInstance(Class.forName("game.Move"));
        Object term18711 = newInstance(Class.forName("commons.Piece"));
        Object term18712 = newInstance(Class.forName("game.Cell"));
        Object term18718 = newInstance(Class.forName("game.Cell"));
        Object term18722 = newInstance(Class.forName("game.Cell"));
        Object[] term18734 = (Object[]) newArray("commons.Piece", 2);
        setField(term18650, term18650.getClass(), "pieces", term18651);
        setField(term18650, term18650.getClass(), "playerPieces", term18656);
        setField(term18650, term18650.getClass(), "moves", term18676);
        setField(term18650, term18650.getClass(), "guards", term18681);
        setField(term18650, term18650.getClass(), "moveList", term18686);
        setField(term18650, term18650.getClass(), "positions", term18690);
        setIntField(term18650, term18650.getClass(), "positionIndex", 952869601);
        setBooleanElement(term18699, 0, true);
        setBooleanElement(term18699, 1, true);
        setElement(term18698, 0, term18699);
        setBooleanElement(term18702, 0, true);
        setBooleanElement(term18702, 1, true);
        setElement(term18698, 1, term18702);
        setField(term18650, term18650.getClass(), "canCastle", term18698);
        setLongField(term18650, term18650.getClass(), "zobristHash", -6823727938421990489L);
        setField(term18650, term18650.getClass(), "playerToMove", enum155);
        setBooleanField(term18650, term18650.getClass(), "isThreeFoldRepetition", true);
        setIntField(term18650, term18650.getClass(), "halfMoves", 91958879);
        setBooleanField(term18650, term18650.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term18650, term18650.getClass(), "inCheck", false);
        setField(term18711, term18711.getClass(), "color", enum155);
        setIntField(term18712, term18712.getClass(), "row", -645429025);
        setIntField(term18712, term18712.getClass(), "col", -688213483);
        setField(term18711, term18711.getClass(), "position", term18712);
        setField(term18711, term18711.getClass(), "pieceType", enum156);
        setField(term18710, term18710.getClass(), "piece", term18711);
        setIntField(term18718, term18718.getClass(), "row", 644154104);
        setIntField(term18718, term18718.getClass(), "col", 76650923);
        setField(term18710, term18710.getClass(), "target", term18718);
        setBooleanField(term18710, term18710.getClass(), "captureMove", false);
        setIntField(term18722, term18722.getClass(), "row", 1003743923);
        setIntField(term18722, term18722.getClass(), "col", 1887772522);
        setField(term18710, term18710.getClass(), "captureCell", term18722);
        setField(term18710, term18710.getClass(), "promoteTo", enum157);
        setIntField(term18710, term18710.getClass(), "id", 354196060);
        setField(term18650, term18650.getClass(), "previousMove", term18710);
        setField(term18650, term18650.getClass(), "kings", term18734);
        Class<? extends Object> term19054 = Class.forName((String) "pieces.PieceType");
        Field term19053 = ((Class) term19054).getDeclaredField((String) "BISHOP");
        ((Field) term19053).setAccessible(true);
        Object enum158 = ((Field) term19053).get((Object) null);
        Object term18738 = newInstance(Class.forName("commons.Piece"));
        Object term18739 = newInstance(Class.forName("game.Cell"));
        setField(term18738, term18738.getClass(), "color", enum155);
        setIntField(term18739, term18739.getClass(), "row", -1840305774);
        setIntField(term18739, term18739.getClass(), "col", 1365087144);
        setField(term18738, term18738.getClass(), "position", term18739);
        setField(term18738, term18738.getClass(), "pieceType", enum158);
        Class<? extends Object> term19159 = Class.forName((String) "pieces.PieceType");
        Field term19158 = ((Class) term19159).getDeclaredField((String) "ROOK");
        ((Field) term19158).setAccessible(true);
        Object enum159 = ((Field) term19158).get((Object) null);
        Object term18746 = newInstance(Class.forName("commons.Piece"));
        Object term18747 = newInstance(Class.forName("game.Cell"));
        setField(term18746, term18746.getClass(), "color", enum155);
        setIntField(term18747, term18747.getClass(), "row", -1537255112);
        setIntField(term18747, term18747.getClass(), "col", 934477462);
        setField(term18746, term18746.getClass(), "position", term18747);
        setField(term18746, term18746.getClass(), "pieceType", enum159);
        Object term18753 = newInstance(Class.forName("commons.Piece"));
        setField(term18753, term18753.getClass(), "color", enum155);
        setField(term18753, term18753.getClass(), "position", null);
        setField(term18753, term18753.getClass(), "pieceType", null);
        term18735 = new LinkedList();
        ((LinkedList) term18735).add(term18738);
        ((LinkedList) term18735).add(term18746);
        ((LinkedList) term18735).add(term18753);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term18735;
        callMethod(klass, "insufficientMaterial", argTypes, term18650, args);
    }

};


