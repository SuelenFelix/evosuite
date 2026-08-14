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

public class Board_lookForChecks_70365126339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20947;
     Object term21034;

    public Board_lookForChecks_70365126339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term20948 = new HashMap();
        HashMap term20953 = new HashMap();
        HashMap term20973 = new HashMap();
        HashMap term20978 = new HashMap();
        ArrayList term20983 = new ArrayList();
        Class<? extends Object> term21074 = Class.forName((String) "commons.Color");
        Field term21073 = ((Class) term21074).getDeclaredField((String) "WHITE");
        ((Field) term21073).setAccessible(true);
        Object enum174 = ((Field) term21073).get((Object) null);
        Class<? extends Object> term21161 = Class.forName((String) "pieces.PieceType");
        Field term21160 = ((Class) term21161).getDeclaredField((String) "PAWN");
        ((Field) term21160).setAccessible(true);
        Object enum175 = ((Field) term21160).get((Object) null);
        Class<? extends Object> term21260 = Class.forName((String) "pieces.PieceType");
        Field term21259 = ((Class) term21260).getDeclaredField((String) "BISHOP");
        ((Field) term21259).setAccessible(true);
        Object enum176 = ((Field) term21259).get((Object) null);
        term20947 = newInstance(Class.forName("game.Board"));
        long[] term20987 = (long[]) newLongArray(6);
        Object[] term20995 = (Object[]) newArray("[Z", 2);
        boolean[] term20996 = (boolean[]) newBooleanArray(2);
        boolean[] term20999 = (boolean[]) newBooleanArray(2);
        Object term21007 = newInstance(Class.forName("game.Move"));
        Object term21008 = newInstance(Class.forName("commons.Piece"));
        Object term21009 = newInstance(Class.forName("game.Cell"));
        Object term21015 = newInstance(Class.forName("game.Cell"));
        Object term21019 = newInstance(Class.forName("game.Cell"));
        Object[] term21033 = (Object[]) newArray("commons.Piece", 2);
        setField(term20947, term20947.getClass(), "pieces", term20948);
        setField(term20947, term20947.getClass(), "playerPieces", term20953);
        setField(term20947, term20947.getClass(), "moves", term20973);
        setField(term20947, term20947.getClass(), "guards", term20978);
        setField(term20947, term20947.getClass(), "moveList", term20983);
        setField(term20947, term20947.getClass(), "positions", term20987);
        setIntField(term20947, term20947.getClass(), "positionIndex", 213831054);
        setBooleanElement(term20996, 0, true);
        setBooleanElement(term20996, 1, true);
        setElement(term20995, 0, term20996);
        setBooleanElement(term20999, 0, true);
        setBooleanElement(term20999, 1, true);
        setElement(term20995, 1, term20999);
        setField(term20947, term20947.getClass(), "canCastle", term20995);
        setLongField(term20947, term20947.getClass(), "zobristHash", 1439298019805881866L);
        setField(term20947, term20947.getClass(), "playerToMove", enum174);
        setBooleanField(term20947, term20947.getClass(), "isThreeFoldRepetition", true);
        setIntField(term20947, term20947.getClass(), "halfMoves", 330043745);
        setBooleanField(term20947, term20947.getClass(), "fiftyMoveDraw", true);
        setBooleanField(term20947, term20947.getClass(), "inCheck", false);
        setField(term21008, term21008.getClass(), "color", enum174);
        setIntField(term21009, term21009.getClass(), "row", -509349195);
        setIntField(term21009, term21009.getClass(), "col", -1639041228);
        setField(term21008, term21008.getClass(), "position", term21009);
        setField(term21008, term21008.getClass(), "pieceType", enum175);
        setField(term21007, term21007.getClass(), "piece", term21008);
        setIntField(term21015, term21015.getClass(), "row", 2027686272);
        setIntField(term21015, term21015.getClass(), "col", -1494356104);
        setField(term21007, term21007.getClass(), "target", term21015);
        setBooleanField(term21007, term21007.getClass(), "captureMove", true);
        setIntField(term21019, term21019.getClass(), "row", -695279311);
        setIntField(term21019, term21019.getClass(), "col", 114279242);
        setField(term21007, term21007.getClass(), "captureCell", term21019);
        setField(term21007, term21007.getClass(), "promoteTo", enum176);
        setIntField(term21007, term21007.getClass(), "id", 990883365);
        setField(term20947, term20947.getClass(), "previousMove", term21007);
        setField(term20947, term20947.getClass(), "kings", term21033);
        Class<? extends Object> term21365 = Class.forName((String) "pieces.PieceType");
        Field term21364 = ((Class) term21365).getDeclaredField((String) "KING");
        ((Field) term21364).setAccessible(true);
        Object enum177 = ((Field) term21364).get((Object) null);
        Class<? extends Object> term21464 = Class.forName((String) "pieces.PieceType");
        Field term21463 = ((Class) term21464).getDeclaredField((String) "ROOK");
        ((Field) term21463).setAccessible(true);
        Object enum178 = ((Field) term21463).get((Object) null);
        term21034 = newInstance(Class.forName("game.Move"));
        Object term21035 = newInstance(Class.forName("commons.Piece"));
        Object term21036 = newInstance(Class.forName("game.Cell"));
        Object term21047 = newInstance(Class.forName("game.Cell"));
        Object term21051 = newInstance(Class.forName("game.Cell"));
        setField(term21035, term21035.getClass(), "color", enum174);
        setIntField(term21036, term21036.getClass(), "row", 633598642);
        setIntField(term21036, term21036.getClass(), "col", 1862841859);
        setField(term21035, term21035.getClass(), "position", term21036);
        setField(term21035, term21035.getClass(), "pieceType", enum177);
        setField(term21034, term21034.getClass(), "piece", term21035);
        setIntField(term21047, term21047.getClass(), "row", -1114668574);
        setIntField(term21047, term21047.getClass(), "col", 514511037);
        setField(term21034, term21034.getClass(), "target", term21047);
        setBooleanField(term21034, term21034.getClass(), "captureMove", true);
        setIntField(term21051, term21051.getClass(), "row", 1713573821);
        setIntField(term21051, term21051.getClass(), "col", 1956590498);
        setField(term21034, term21034.getClass(), "captureCell", term21051);
        setField(term21034, term21034.getClass(), "promoteTo", enum178);
        setIntField(term21034, term21034.getClass(), "id", 1467356494);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("game.Move");
        Object[] args = new Object[1];
        args[0] = term21034;
        callMethod(klass, "lookForChecks", argTypes, term20947, args);
    }

};


