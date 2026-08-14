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

public class MoveBackup_getMove_198745710814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1335875;

    public MoveBackup_getMove_198745710814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1335877 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Class<? extends Object> term1336267 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1336266 = ((Class) term1336267).getDeclaredField((String) "WHITE");
        ((Field) term1336266).setAccessible(true);
        Object enum5113 = ((Field) term1336266).get((Object) null);
        Class<? extends Object> term1336469 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1336468 = ((Class) term1336469).getDeclaredField((String) "WHITE");
        ((Field) term1336468).setAccessible(true);
        Object enum5114 = ((Field) term1336468).get((Object) null);
        Class<? extends Object> term1336671 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1336670 = ((Class) term1336671).getDeclaredField((String) "H6");
        ((Field) term1336670).setAccessible(true);
        Object enum5115 = ((Field) term1336670).get((Object) null);
        Class<? extends Object> term1336874 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1336873 = ((Class) term1336874).getDeclaredField((String) "H4");
        ((Field) term1336873).setAccessible(true);
        Object enum5116 = ((Field) term1336873).get((Object) null);
        Integer term1335982 = new Integer(806595993);
        Integer term1335984 = new Integer(548228925);
        Class<? extends Object> term1337077 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1337076 = ((Class) term1337077).getDeclaredField((String) "F5");
        ((Field) term1337076).setAccessible(true);
        Object enum5117 = ((Field) term1337076).get((Object) null);
        Class<? extends Object> term1337280 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1337279 = ((Class) term1337280).getDeclaredField((String) "F3");
        ((Field) term1337279).setAccessible(true);
        Object enum5118 = ((Field) term1337279).get((Object) null);
        Class<? extends Object> term1337483 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1337482 = ((Class) term1337483).getDeclaredField((String) "BLACK_KNIGHT");
        ((Field) term1337482).setAccessible(true);
        Object enum5119 = ((Field) term1337482).get((Object) null);
        Class<? extends Object> term1337721 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1337720 = ((Class) term1337721).getDeclaredField((String) "B1");
        ((Field) term1337720).setAccessible(true);
        Object enum5120 = ((Field) term1337720).get((Object) null);
        Class<? extends Object> term1337924 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1337923 = ((Class) term1337924).getDeclaredField((String) "D5");
        ((Field) term1337923).setAccessible(true);
        Object enum5121 = ((Field) term1337923).get((Object) null);
        Class<? extends Object> term1338127 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1338126 = ((Class) term1338127).getDeclaredField((String) "BLACK_QUEEN");
        ((Field) term1338126).setAccessible(true);
        Object enum5122 = ((Field) term1338126).get((Object) null);
        Class<? extends Object> term1338362 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1338361 = ((Class) term1338362).getDeclaredField((String) "BLACK_KNIGHT");
        ((Field) term1338361).setAccessible(true);
        Object enum5123 = ((Field) term1338361).get((Object) null);
        Class<? extends Object> term1338590 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1338589 = ((Class) term1338590).getDeclaredField((String) "H7");
        ((Field) term1338589).setAccessible(true);
        Object enum5124 = ((Field) term1338589).get((Object) null);
        Class<? extends Object> term1338793 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1338792 = ((Class) term1338793).getDeclaredField((String) "BLACK_QUEEN");
        ((Field) term1338792).setAccessible(true);
        Object enum5125 = ((Field) term1338792).get((Object) null);
        term1335875 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.MoveBackup"));
        Object term1335876 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term1335967 = (Object[]) newArray("com.github.bhlangonijr.chesslib.Side", 2);
        Object[] term1335968 = (Object[]) newArray("java.lang.Object", 2);
        Object term1335986 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        Object term1336037 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term1335876, term1335876.getClass(), "keyType", term1335877);
        setElement(term1335967, 0, enum5113);
        setElement(term1335967, 1, enum5114);
        setField(term1335876, term1335876.getClass(), "keyUniverse", term1335967);
        setField(term1335876, term1335876.getClass(), "vals", term1335968);
        setIntField(term1335876, term1335876.getClass(), "size", 0);
        setField(term1335876, term1335876.getClass(), "entrySet", null);
        setField(term1335876, term1335876.getClass(), "keySet", null);
        setField(term1335876, term1335876.getClass(), "values", null);
        setField(term1335875, term1335875.getClass(), "castleRight", term1335876);
        setField(term1335875, term1335875.getClass(), "sideToMove", enum5114);
        setField(term1335875, term1335875.getClass(), "enPassantTarget", enum5115);
        setField(term1335875, term1335875.getClass(), "enPassant", enum5116);
        setField(term1335875, term1335875.getClass(), "moveCounter", term1335982);
        setField(term1335875, term1335875.getClass(), "halfMoveCounter", term1335984);
        setField(term1335986, term1335986.getClass(), "from", enum5117);
        setField(term1335986, term1335986.getClass(), "to", enum5118);
        setField(term1335986, term1335986.getClass(), "promotion", enum5119);
        setField(term1335986, term1335986.getClass(), "san", "VAFSknHLsZ");
        setField(term1335875, term1335875.getClass(), "move", term1335986);
        setField(term1336037, term1336037.getClass(), "from", enum5120);
        setField(term1336037, term1336037.getClass(), "to", enum5121);
        setField(term1336037, term1336037.getClass(), "promotion", enum5122);
        setField(term1336037, term1336037.getClass(), "san", "MamzBtwhiz");
        setField(term1335875, term1335875.getClass(), "rookCastleMove", term1336037);
        setField(term1335875, term1335875.getClass(), "capturedPiece", enum5123);
        setField(term1335875, term1335875.getClass(), "capturedSquare", enum5124);
        setField(term1335875, term1335875.getClass(), "movingPiece", enum5125);
        setBooleanField(term1335875, term1335875.getClass(), "castleMove", false);
        setBooleanField(term1335875, term1335875.getClass(), "enPassantMove", false);
        setLongField(term1335875, term1335875.getClass(), "incrementalHashKey", -4370635295110591519L);
        setLongField(term1335875, term1335875.getClass(), "incrementalPolyglotKey", -1325109462577461208L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.MoveBackup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMove", argTypes, term1335875, args);
    }

};


