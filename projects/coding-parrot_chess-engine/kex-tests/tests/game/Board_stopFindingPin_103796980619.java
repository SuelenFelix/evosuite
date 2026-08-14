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
import java.util.LinkedHashMap;

public class Board_stopFindingPin_103796980619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10639;
     Object term10725;
     Object term10727;
     Object enum89;
     Object term10729;
     Object term10744;
     Object term10773;

    public Board_stopFindingPin_103796980619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10640 = new HashMap();
        HashMap term10645 = new HashMap();
        HashMap term10665 = new HashMap();
        HashMap term10670 = new HashMap();
        ArrayList term10675 = new ArrayList();
        Class<? extends Object> term10785 = Class.forName((String) "commons.Color");
        Field term10784 = ((Class) term10785).getDeclaredField((String) "WHITE");
        ((Field) term10784).setAccessible(true);
        enum89 = ((Field) term10784).get((Object) null);
        Class<? extends Object> term10872 = Class.forName((String) "pieces.PieceType");
        Field term10871 = ((Class) term10872).getDeclaredField((String) "KING");
        ((Field) term10871).setAccessible(true);
        Object enum90 = ((Field) term10871).get((Object) null);
        Class<? extends Object> term10971 = Class.forName((String) "pieces.PieceType");
        Field term10970 = ((Class) term10971).getDeclaredField((String) "QUEEN");
        ((Field) term10970).setAccessible(true);
        Object enum91 = ((Field) term10970).get((Object) null);
        term10639 = newInstance(Class.forName("game.Board"));
        long[] term10679 = (long[]) newLongArray(6);
        Object[] term10687 = (Object[]) newArray("[Z", 2);
        boolean[] term10688 = (boolean[]) newBooleanArray(2);
        boolean[] term10691 = (boolean[]) newBooleanArray(2);
        Object term10699 = newInstance(Class.forName("game.Move"));
        Object term10700 = newInstance(Class.forName("commons.Piece"));
        Object term10701 = newInstance(Class.forName("game.Cell"));
        Object term10707 = newInstance(Class.forName("game.Cell"));
        Object term10711 = newInstance(Class.forName("game.Cell"));
        Object[] term10724 = (Object[]) newArray("commons.Piece", 2);
        setField(term10639, term10639.getClass(), "pieces", term10640);
        setField(term10639, term10639.getClass(), "playerPieces", term10645);
        setField(term10639, term10639.getClass(), "moves", term10665);
        setField(term10639, term10639.getClass(), "guards", term10670);
        setField(term10639, term10639.getClass(), "moveList", term10675);
        setField(term10639, term10639.getClass(), "positions", term10679);
        setIntField(term10639, term10639.getClass(), "positionIndex", -282881827);
        setBooleanElement(term10688, 0, true);
        setBooleanElement(term10688, 1, true);
        setElement(term10687, 0, term10688);
        setBooleanElement(term10691, 0, true);
        setBooleanElement(term10691, 1, true);
        setElement(term10687, 1, term10691);
        setField(term10639, term10639.getClass(), "canCastle", term10687);
        setLongField(term10639, term10639.getClass(), "zobristHash", 5127676408959197577L);
        setField(term10639, term10639.getClass(), "playerToMove", enum89);
        setBooleanField(term10639, term10639.getClass(), "isThreeFoldRepetition", false);
        setIntField(term10639, term10639.getClass(), "halfMoves", -1183353915);
        setBooleanField(term10639, term10639.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term10639, term10639.getClass(), "inCheck", true);
        setField(term10700, term10700.getClass(), "color", enum89);
        setIntField(term10701, term10701.getClass(), "row", -420030135);
        setIntField(term10701, term10701.getClass(), "col", 267763294);
        setField(term10700, term10700.getClass(), "position", term10701);
        setField(term10700, term10700.getClass(), "pieceType", enum90);
        setField(term10699, term10699.getClass(), "piece", term10700);
        setIntField(term10707, term10707.getClass(), "row", -1497710478);
        setIntField(term10707, term10707.getClass(), "col", 49950830);
        setField(term10699, term10699.getClass(), "target", term10707);
        setBooleanField(term10699, term10699.getClass(), "captureMove", false);
        setIntField(term10711, term10711.getClass(), "row", -525257914);
        setIntField(term10711, term10711.getClass(), "col", 147209682);
        setField(term10699, term10699.getClass(), "captureCell", term10711);
        setField(term10699, term10699.getClass(), "promoteTo", enum91);
        setIntField(term10699, term10699.getClass(), "id", 34470066);
        setField(term10639, term10639.getClass(), "previousMove", term10699);
        setField(term10639, term10639.getClass(), "kings", term10724);
        term10725 = new Integer(2058711405);
        term10727 = new Integer(1743683601);
        Class<? extends Object> term11073 = Class.forName((String) "commons.Color");
        Field term11072 = ((Class) term11073).getDeclaredField((String) "WHITE");
        ((Field) term11072).setAccessible(true);
        Object enum92 = ((Field) term11072).get((Object) null);
        Class<? extends Object> term11160 = Class.forName((String) "pieces.PieceType");
        Field term11159 = ((Class) term11160).getDeclaredField((String) "KNIGHT");
        ((Field) term11159).setAccessible(true);
        Object enum93 = ((Field) term11159).get((Object) null);
        term10729 = newInstance(Class.forName("game.Board$Reference"));
        Object term10730 = newInstance(Class.forName("commons.Piece"));
        Object term10731 = newInstance(Class.forName("game.Cell"));
        setField(term10730, term10730.getClass(), "color", enum92);
        setIntField(term10731, term10731.getClass(), "row", -945116798);
        setIntField(term10731, term10731.getClass(), "col", 1593461795);
        setField(term10730, term10730.getClass(), "position", term10731);
        setField(term10730, term10730.getClass(), "pieceType", enum93);
        setField(term10729, term10729.getClass(), "object", term10730);
        term10744 = new LinkedHashMap();
        term10773 = (Object[]) newArray("pieces.PieceType", 1);
        setElement(term10773, 0, enum93);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("commons.Color");
        argTypes[3] = Class.forName("game.Board$Reference");
        argTypes[4] = Class.forName("java.util.Map");
        argTypes[5] = Array.newInstance(Class.forName("pieces.PieceType"), 0).getClass();
        Object[] args = new Object[6];
        args[0] = term10725;
        args[1] = term10727;
        args[2] = enum89;
        args[3] = term10729;
        args[4] = term10744;
        args[5] = term10773;
        callMethod(klass, "stopFindingPin", argTypes, term10639, args);
    }

};


