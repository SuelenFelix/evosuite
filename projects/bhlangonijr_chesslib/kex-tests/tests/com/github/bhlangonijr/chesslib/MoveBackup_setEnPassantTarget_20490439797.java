package com.github.bhlangonijr.chesslib;

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
import static com.github.bhlangonijr.chesslib.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class MoveBackup_setEnPassantTarget_20490439797 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1315244;
     Object enum5029;

    public MoveBackup_setEnPassantTarget_20490439797() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1315246 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Class<? extends Object> term1315629 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1315628 = ((Class) term1315629).getDeclaredField((String) "BLACK");
        ((Field) term1315628).setAccessible(true);
        Object enum5027 = ((Field) term1315628).get((Object) null);
        Class<? extends Object> term1315831 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1315830 = ((Class) term1315831).getDeclaredField((String) "WHITE");
        ((Field) term1315830).setAccessible(true);
        Object enum5028 = ((Field) term1315830).get((Object) null);
        Class<? extends Object> term1316033 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1316032 = ((Class) term1316033).getDeclaredField((String) "C6");
        ((Field) term1316032).setAccessible(true);
        enum5029 = ((Field) term1316032).get((Object) null);
        Class<? extends Object> term1316236 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1316235 = ((Class) term1316236).getDeclaredField((String) "G7");
        ((Field) term1316235).setAccessible(true);
        Object enum5030 = ((Field) term1316235).get((Object) null);
        Integer term1315351 = new Integer(-1410220680);
        Integer term1315353 = new Integer(389427431);
        Class<? extends Object> term1316439 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1316438 = ((Class) term1316439).getDeclaredField((String) "E5");
        ((Field) term1316438).setAccessible(true);
        Object enum5031 = ((Field) term1316438).get((Object) null);
        Class<? extends Object> term1316642 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1316641 = ((Class) term1316642).getDeclaredField((String) "E7");
        ((Field) term1316641).setAccessible(true);
        Object enum5032 = ((Field) term1316641).get((Object) null);
        Class<? extends Object> term1316845 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1316844 = ((Class) term1316845).getDeclaredField((String) "NONE");
        ((Field) term1316844).setAccessible(true);
        Object enum5033 = ((Field) term1316844).get((Object) null);
        Class<? extends Object> term1317059 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1317058 = ((Class) term1317059).getDeclaredField((String) "H6");
        ((Field) term1317058).setAccessible(true);
        Object enum5034 = ((Field) term1317058).get((Object) null);
        Class<? extends Object> term1317262 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1317261 = ((Class) term1317262).getDeclaredField((String) "WHITE_KING");
        ((Field) term1317261).setAccessible(true);
        Object enum5035 = ((Field) term1317261).get((Object) null);
        Class<? extends Object> term1317494 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1317493 = ((Class) term1317494).getDeclaredField((String) "BLACK_KNIGHT");
        ((Field) term1317493).setAccessible(true);
        Object enum5036 = ((Field) term1317493).get((Object) null);
        Class<? extends Object> term1317722 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1317721 = ((Class) term1317722).getDeclaredField((String) "G4");
        ((Field) term1317721).setAccessible(true);
        Object enum5037 = ((Field) term1317721).get((Object) null);
        Class<? extends Object> term1317925 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1317924 = ((Class) term1317925).getDeclaredField((String) "BLACK_PAWN");
        ((Field) term1317924).setAccessible(true);
        Object enum5038 = ((Field) term1317924).get((Object) null);
        term1315244 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.MoveBackup"));
        Object term1315245 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term1315336 = (Object[]) newArray("com.github.bhlangonijr.chesslib.Side", 2);
        Object[] term1315337 = (Object[]) newArray("java.lang.Object", 2);
        Object term1315355 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        Object term1315407 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term1315245, term1315245.getClass(), "keyType", term1315246);
        setElement(term1315336, 0, enum5027);
        setElement(term1315336, 1, enum5028);
        setField(term1315245, term1315245.getClass(), "keyUniverse", term1315336);
        setField(term1315245, term1315245.getClass(), "vals", term1315337);
        setIntField(term1315245, term1315245.getClass(), "size", 0);
        setField(term1315245, term1315245.getClass(), "entrySet", null);
        setField(term1315245, term1315245.getClass(), "keySet", null);
        setField(term1315245, term1315245.getClass(), "values", null);
        setField(term1315244, term1315244.getClass(), "castleRight", term1315245);
        setField(term1315244, term1315244.getClass(), "sideToMove", enum5028);
        setField(term1315244, term1315244.getClass(), "enPassantTarget", enum5029);
        setField(term1315244, term1315244.getClass(), "enPassant", enum5030);
        setField(term1315244, term1315244.getClass(), "moveCounter", term1315351);
        setField(term1315244, term1315244.getClass(), "halfMoveCounter", term1315353);
        setField(term1315355, term1315355.getClass(), "from", enum5031);
        setField(term1315355, term1315355.getClass(), "to", enum5032);
        setField(term1315355, term1315355.getClass(), "promotion", enum5033);
        setField(term1315355, term1315355.getClass(), "san", "KyUmXHRrED");
        setField(term1315244, term1315244.getClass(), "move", term1315355);
        setField(term1315407, term1315407.getClass(), "from", enum5034);
        setField(term1315407, term1315407.getClass(), "to", enum5034);
        setField(term1315407, term1315407.getClass(), "promotion", enum5035);
        setField(term1315407, term1315407.getClass(), "san", "eOMBFVrNcf");
        setField(term1315244, term1315244.getClass(), "rookCastleMove", term1315407);
        setField(term1315244, term1315244.getClass(), "capturedPiece", enum5036);
        setField(term1315244, term1315244.getClass(), "capturedSquare", enum5037);
        setField(term1315244, term1315244.getClass(), "movingPiece", enum5038);
        setBooleanField(term1315244, term1315244.getClass(), "castleMove", true);
        setBooleanField(term1315244, term1315244.getClass(), "enPassantMove", false);
        setLongField(term1315244, term1315244.getClass(), "incrementalHashKey", 5498944509671266637L);
        setLongField(term1315244, term1315244.getClass(), "incrementalPolyglotKey", -6838909359433858599L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.MoveBackup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        Object[] args = new Object[1];
        args[0] = enum5029;
        callMethod(klass, "setEnPassantTarget", argTypes, term1315244, args);
    }

};


