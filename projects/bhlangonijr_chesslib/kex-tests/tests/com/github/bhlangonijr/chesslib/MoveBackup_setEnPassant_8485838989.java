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

public class MoveBackup_setEnPassant_8485838989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1320992;
     Object enum5064;

    public MoveBackup_setEnPassant_8485838989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1320994 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Class<? extends Object> term1321386 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1321385 = ((Class) term1321386).getDeclaredField((String) "WHITE");
        ((Field) term1321385).setAccessible(true);
        Object enum5051 = ((Field) term1321385).get((Object) null);
        Class<? extends Object> term1321588 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1321587 = ((Class) term1321588).getDeclaredField((String) "BLACK");
        ((Field) term1321587).setAccessible(true);
        Object enum5052 = ((Field) term1321587).get((Object) null);
        Class<? extends Object> term1321790 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1321789 = ((Class) term1321790).getDeclaredField((String) "H4");
        ((Field) term1321789).setAccessible(true);
        Object enum5053 = ((Field) term1321789).get((Object) null);
        Class<? extends Object> term1321993 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1321992 = ((Class) term1321993).getDeclaredField((String) "D2");
        ((Field) term1321992).setAccessible(true);
        Object enum5054 = ((Field) term1321992).get((Object) null);
        Integer term1321099 = new Integer(-1667990367);
        Integer term1321101 = new Integer(-1214628358);
        Class<? extends Object> term1322196 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1322195 = ((Class) term1322196).getDeclaredField((String) "H3");
        ((Field) term1322195).setAccessible(true);
        Object enum5055 = ((Field) term1322195).get((Object) null);
        Class<? extends Object> term1322399 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1322398 = ((Class) term1322399).getDeclaredField((String) "F5");
        ((Field) term1322398).setAccessible(true);
        Object enum5056 = ((Field) term1322398).get((Object) null);
        Class<? extends Object> term1322602 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1322601 = ((Class) term1322602).getDeclaredField((String) "WHITE_BISHOP");
        ((Field) term1322601).setAccessible(true);
        Object enum5057 = ((Field) term1322601).get((Object) null);
        Class<? extends Object> term1322840 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1322839 = ((Class) term1322840).getDeclaredField((String) "C7");
        ((Field) term1322839).setAccessible(true);
        Object enum5058 = ((Field) term1322839).get((Object) null);
        Class<? extends Object> term1323043 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1323042 = ((Class) term1323043).getDeclaredField((String) "B7");
        ((Field) term1323042).setAccessible(true);
        Object enum5059 = ((Field) term1323042).get((Object) null);
        Class<? extends Object> term1323246 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1323245 = ((Class) term1323246).getDeclaredField((String) "NONE");
        ((Field) term1323245).setAccessible(true);
        Object enum5060 = ((Field) term1323245).get((Object) null);
        Class<? extends Object> term1323460 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1323459 = ((Class) term1323460).getDeclaredField((String) "NONE");
        ((Field) term1323459).setAccessible(true);
        Object enum5061 = ((Field) term1323459).get((Object) null);
        Class<? extends Object> term1323664 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1323663 = ((Class) term1323664).getDeclaredField((String) "D4");
        ((Field) term1323663).setAccessible(true);
        Object enum5062 = ((Field) term1323663).get((Object) null);
        Class<? extends Object> term1323867 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1323866 = ((Class) term1323867).getDeclaredField((String) "BLACK_KNIGHT");
        ((Field) term1323866).setAccessible(true);
        Object enum5063 = ((Field) term1323866).get((Object) null);
        term1320992 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.MoveBackup"));
        Object term1320993 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term1321084 = (Object[]) newArray("com.github.bhlangonijr.chesslib.Side", 2);
        Object[] term1321085 = (Object[]) newArray("java.lang.Object", 2);
        Object term1321103 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        Object term1321153 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term1320993, term1320993.getClass(), "keyType", term1320994);
        setElement(term1321084, 0, enum5051);
        setElement(term1321084, 1, enum5052);
        setField(term1320993, term1320993.getClass(), "keyUniverse", term1321084);
        setField(term1320993, term1320993.getClass(), "vals", term1321085);
        setIntField(term1320993, term1320993.getClass(), "size", 0);
        setField(term1320993, term1320993.getClass(), "entrySet", null);
        setField(term1320993, term1320993.getClass(), "keySet", null);
        setField(term1320993, term1320993.getClass(), "values", null);
        setField(term1320992, term1320992.getClass(), "castleRight", term1320993);
        setField(term1320992, term1320992.getClass(), "sideToMove", enum5051);
        setField(term1320992, term1320992.getClass(), "enPassantTarget", enum5053);
        setField(term1320992, term1320992.getClass(), "enPassant", enum5054);
        setField(term1320992, term1320992.getClass(), "moveCounter", term1321099);
        setField(term1320992, term1320992.getClass(), "halfMoveCounter", term1321101);
        setField(term1321103, term1321103.getClass(), "from", enum5055);
        setField(term1321103, term1321103.getClass(), "to", enum5056);
        setField(term1321103, term1321103.getClass(), "promotion", enum5057);
        setField(term1321103, term1321103.getClass(), "san", "DQhxOWqEyi");
        setField(term1320992, term1320992.getClass(), "move", term1321103);
        setField(term1321153, term1321153.getClass(), "from", enum5058);
        setField(term1321153, term1321153.getClass(), "to", enum5059);
        setField(term1321153, term1321153.getClass(), "promotion", enum5060);
        setField(term1321153, term1321153.getClass(), "san", "dSszYGDwAk");
        setField(term1320992, term1320992.getClass(), "rookCastleMove", term1321153);
        setField(term1320992, term1320992.getClass(), "capturedPiece", enum5061);
        setField(term1320992, term1320992.getClass(), "capturedSquare", enum5062);
        setField(term1320992, term1320992.getClass(), "movingPiece", enum5063);
        setBooleanField(term1320992, term1320992.getClass(), "castleMove", true);
        setBooleanField(term1320992, term1320992.getClass(), "enPassantMove", true);
        setLongField(term1320992, term1320992.getClass(), "incrementalHashKey", -1486519351300660432L);
        setLongField(term1320992, term1320992.getClass(), "incrementalPolyglotKey", 4777103307547199454L);
        Class<? extends Object> term1324095 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1324094 = ((Class) term1324095).getDeclaredField((String) "D6");
        ((Field) term1324094).setAccessible(true);
        enum5064 = ((Field) term1324094).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.MoveBackup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        Object[] args = new Object[1];
        args[0] = enum5064;
        callMethod(klass, "setEnPassant", argTypes, term1320992, args);
    }

};


