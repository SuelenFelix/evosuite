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

public class MoveBackup_isCastleMove_167200662826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1373392;

    public MoveBackup_isCastleMove_167200662826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1373394 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Class<? extends Object> term1373764 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1373763 = ((Class) term1373764).getDeclaredField((String) "BLACK");
        ((Field) term1373763).setAccessible(true);
        Object enum5269 = ((Field) term1373763).get((Object) null);
        Class<? extends Object> term1373966 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1373965 = ((Class) term1373966).getDeclaredField((String) "WHITE");
        ((Field) term1373965).setAccessible(true);
        Object enum5270 = ((Field) term1373965).get((Object) null);
        Class<? extends Object> term1374168 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1374167 = ((Class) term1374168).getDeclaredField((String) "H7");
        ((Field) term1374167).setAccessible(true);
        Object enum5271 = ((Field) term1374167).get((Object) null);
        Class<? extends Object> term1374371 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1374370 = ((Class) term1374371).getDeclaredField((String) "A2");
        ((Field) term1374370).setAccessible(true);
        Object enum5272 = ((Field) term1374370).get((Object) null);
        Integer term1373499 = new Integer(-542712742);
        Integer term1373501 = new Integer(-1254072822);
        Class<? extends Object> term1374574 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1374573 = ((Class) term1374574).getDeclaredField((String) "A7");
        ((Field) term1374573).setAccessible(true);
        Object enum5273 = ((Field) term1374573).get((Object) null);
        Class<? extends Object> term1374777 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1374776 = ((Class) term1374777).getDeclaredField((String) "C4");
        ((Field) term1374776).setAccessible(true);
        Object enum5274 = ((Field) term1374776).get((Object) null);
        Class<? extends Object> term1374980 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1374979 = ((Class) term1374980).getDeclaredField((String) "WHITE_BISHOP");
        ((Field) term1374979).setAccessible(true);
        Object enum5275 = ((Field) term1374979).get((Object) null);
        Class<? extends Object> term1375218 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1375217 = ((Class) term1375218).getDeclaredField((String) "C1");
        ((Field) term1375217).setAccessible(true);
        Object enum5276 = ((Field) term1375217).get((Object) null);
        Class<? extends Object> term1375421 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1375420 = ((Class) term1375421).getDeclaredField((String) "E7");
        ((Field) term1375420).setAccessible(true);
        Object enum5277 = ((Field) term1375420).get((Object) null);
        Class<? extends Object> term1375624 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1375623 = ((Class) term1375624).getDeclaredField((String) "WHITE_KING");
        ((Field) term1375623).setAccessible(true);
        Object enum5278 = ((Field) term1375623).get((Object) null);
        Class<? extends Object> term1375856 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1375855 = ((Class) term1375856).getDeclaredField((String) "WHITE_PAWN");
        ((Field) term1375855).setAccessible(true);
        Object enum5279 = ((Field) term1375855).get((Object) null);
        Class<? extends Object> term1376078 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1376077 = ((Class) term1376078).getDeclaredField((String) "H3");
        ((Field) term1376077).setAccessible(true);
        Object enum5280 = ((Field) term1376077).get((Object) null);
        Class<? extends Object> term1376281 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1376280 = ((Class) term1376281).getDeclaredField((String) "NONE");
        ((Field) term1376280).setAccessible(true);
        Object enum5281 = ((Field) term1376280).get((Object) null);
        term1373392 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.MoveBackup"));
        Object term1373393 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term1373484 = (Object[]) newArray("com.github.bhlangonijr.chesslib.Side", 2);
        Object[] term1373485 = (Object[]) newArray("java.lang.Object", 2);
        Object term1373503 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        Object term1373555 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term1373393, term1373393.getClass(), "keyType", term1373394);
        setElement(term1373484, 0, enum5269);
        setElement(term1373484, 1, enum5270);
        setField(term1373393, term1373393.getClass(), "keyUniverse", term1373484);
        setField(term1373393, term1373393.getClass(), "vals", term1373485);
        setIntField(term1373393, term1373393.getClass(), "size", 0);
        setField(term1373393, term1373393.getClass(), "entrySet", null);
        setField(term1373393, term1373393.getClass(), "keySet", null);
        setField(term1373393, term1373393.getClass(), "values", null);
        setField(term1373392, term1373392.getClass(), "castleRight", term1373393);
        setField(term1373392, term1373392.getClass(), "sideToMove", enum5270);
        setField(term1373392, term1373392.getClass(), "enPassantTarget", enum5271);
        setField(term1373392, term1373392.getClass(), "enPassant", enum5272);
        setField(term1373392, term1373392.getClass(), "moveCounter", term1373499);
        setField(term1373392, term1373392.getClass(), "halfMoveCounter", term1373501);
        setField(term1373503, term1373503.getClass(), "from", enum5273);
        setField(term1373503, term1373503.getClass(), "to", enum5274);
        setField(term1373503, term1373503.getClass(), "promotion", enum5275);
        setField(term1373503, term1373503.getClass(), "san", "tcaaotqgDF");
        setField(term1373392, term1373392.getClass(), "move", term1373503);
        setField(term1373555, term1373555.getClass(), "from", enum5276);
        setField(term1373555, term1373555.getClass(), "to", enum5277);
        setField(term1373555, term1373555.getClass(), "promotion", enum5278);
        setField(term1373555, term1373555.getClass(), "san", "bXInWdOeyi");
        setField(term1373392, term1373392.getClass(), "rookCastleMove", term1373555);
        setField(term1373392, term1373392.getClass(), "capturedPiece", enum5279);
        setField(term1373392, term1373392.getClass(), "capturedSquare", enum5280);
        setField(term1373392, term1373392.getClass(), "movingPiece", enum5281);
        setBooleanField(term1373392, term1373392.getClass(), "castleMove", false);
        setBooleanField(term1373392, term1373392.getClass(), "enPassantMove", true);
        setLongField(term1373392, term1373392.getClass(), "incrementalHashKey", 353705949229610067L);
        setLongField(term1373392, term1373392.getClass(), "incrementalPolyglotKey", 3288572082902580031L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.MoveBackup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isCastleMove", argTypes, term1373392, args);
    }

};


