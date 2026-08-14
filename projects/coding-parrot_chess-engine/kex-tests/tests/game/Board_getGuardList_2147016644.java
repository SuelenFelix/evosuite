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

public class Board_getGuardList_2147016644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3899;
     Object term3985;

    public Board_getGuardList_2147016644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3900 = new HashMap();
        HashMap term3905 = new HashMap();
        HashMap term3925 = new HashMap();
        HashMap term3930 = new HashMap();
        ArrayList term3935 = new ArrayList();
        Class<? extends Object> term4000 = Class.forName((String) "commons.Color");
        Field term3999 = ((Class) term4000).getDeclaredField((String) "WHITE");
        ((Field) term3999).setAccessible(true);
        Object enum33 = ((Field) term3999).get((Object) null);
        Class<? extends Object> term4087 = Class.forName((String) "commons.Color");
        Field term4086 = ((Class) term4087).getDeclaredField((String) "BLACK");
        ((Field) term4086).setAccessible(true);
        Object enum34 = ((Field) term4086).get((Object) null);
        Class<? extends Object> term4174 = Class.forName((String) "pieces.PieceType");
        Field term4173 = ((Class) term4174).getDeclaredField((String) "QUEEN");
        ((Field) term4173).setAccessible(true);
        Object enum35 = ((Field) term4173).get((Object) null);
        Class<? extends Object> term4276 = Class.forName((String) "pieces.PieceType");
        Field term4275 = ((Class) term4276).getDeclaredField((String) "QUEEN");
        ((Field) term4275).setAccessible(true);
        Object enum36 = ((Field) term4275).get((Object) null);
        term3899 = newInstance(Class.forName("game.Board"));
        long[] term3939 = (long[]) newLongArray(6);
        Object[] term3947 = (Object[]) newArray("[Z", 2);
        boolean[] term3948 = (boolean[]) newBooleanArray(2);
        boolean[] term3951 = (boolean[]) newBooleanArray(2);
        Object term3959 = newInstance(Class.forName("game.Move"));
        Object term3960 = newInstance(Class.forName("commons.Piece"));
        Object term3961 = newInstance(Class.forName("game.Cell"));
        Object term3967 = newInstance(Class.forName("game.Cell"));
        Object term3971 = newInstance(Class.forName("game.Cell"));
        Object[] term3984 = (Object[]) newArray("commons.Piece", 2);
        setField(term3899, term3899.getClass(), "pieces", term3900);
        setField(term3899, term3899.getClass(), "playerPieces", term3905);
        setField(term3899, term3899.getClass(), "moves", term3925);
        setField(term3899, term3899.getClass(), "guards", term3930);
        setField(term3899, term3899.getClass(), "moveList", term3935);
        setField(term3899, term3899.getClass(), "positions", term3939);
        setIntField(term3899, term3899.getClass(), "positionIndex", -1263114719);
        setBooleanElement(term3948, 0, true);
        setBooleanElement(term3948, 1, true);
        setElement(term3947, 0, term3948);
        setBooleanElement(term3951, 0, true);
        setBooleanElement(term3951, 1, true);
        setElement(term3947, 1, term3951);
        setField(term3899, term3899.getClass(), "canCastle", term3947);
        setLongField(term3899, term3899.getClass(), "zobristHash", -8400487765614892086L);
        setField(term3899, term3899.getClass(), "playerToMove", enum33);
        setBooleanField(term3899, term3899.getClass(), "isThreeFoldRepetition", true);
        setIntField(term3899, term3899.getClass(), "halfMoves", -894662986);
        setBooleanField(term3899, term3899.getClass(), "fiftyMoveDraw", true);
        setBooleanField(term3899, term3899.getClass(), "inCheck", true);
        setField(term3960, term3960.getClass(), "color", enum34);
        setIntField(term3961, term3961.getClass(), "row", 304775596);
        setIntField(term3961, term3961.getClass(), "col", -1347665717);
        setField(term3960, term3960.getClass(), "position", term3961);
        setField(term3960, term3960.getClass(), "pieceType", enum35);
        setField(term3959, term3959.getClass(), "piece", term3960);
        setIntField(term3967, term3967.getClass(), "row", -1888585309);
        setIntField(term3967, term3967.getClass(), "col", 683666002);
        setField(term3959, term3959.getClass(), "target", term3967);
        setBooleanField(term3959, term3959.getClass(), "captureMove", true);
        setIntField(term3971, term3971.getClass(), "row", 1596213415);
        setIntField(term3971, term3971.getClass(), "col", -268815336);
        setField(term3959, term3959.getClass(), "captureCell", term3971);
        setField(term3959, term3959.getClass(), "promoteTo", enum36);
        setIntField(term3959, term3959.getClass(), "id", -1210583429);
        setField(term3899, term3899.getClass(), "previousMove", term3959);
        setField(term3899, term3899.getClass(), "kings", term3984);
        term3985 = newInstance(Class.forName("commons.Piece"));
        Object term3986 = newInstance(Class.forName("game.Cell"));
        setField(term3985, term3985.getClass(), "color", enum33);
        setIntField(term3986, term3986.getClass(), "row", -663691365);
        setIntField(term3986, term3986.getClass(), "col", 339854490);
        setField(term3985, term3985.getClass(), "position", term3986);
        setField(term3985, term3985.getClass(), "pieceType", enum36);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("commons.Piece");
        Object[] args = new Object[1];
        args[0] = term3985;
        callMethod(klass, "getGuardList", argTypes, term3899, args);
    }

};


