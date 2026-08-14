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

public class MoveBackup_getIncrementalHashKey_154790582230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1385404;

    public MoveBackup_getIncrementalHashKey_154790582230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1385406 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Class<? extends Object> term1385791 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1385790 = ((Class) term1385791).getDeclaredField((String) "BLACK");
        ((Field) term1385790).setAccessible(true);
        Object enum5319 = ((Field) term1385790).get((Object) null);
        Class<? extends Object> term1385993 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1385992 = ((Class) term1385993).getDeclaredField((String) "BLACK");
        ((Field) term1385992).setAccessible(true);
        Object enum5320 = ((Field) term1385992).get((Object) null);
        Class<? extends Object> term1386195 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1386194 = ((Class) term1386195).getDeclaredField((String) "B2");
        ((Field) term1386194).setAccessible(true);
        Object enum5321 = ((Field) term1386194).get((Object) null);
        Class<? extends Object> term1386398 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1386397 = ((Class) term1386398).getDeclaredField((String) "E3");
        ((Field) term1386397).setAccessible(true);
        Object enum5322 = ((Field) term1386397).get((Object) null);
        Integer term1385511 = new Integer(1959097203);
        Integer term1385513 = new Integer(-209654048);
        Class<? extends Object> term1386601 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1386600 = ((Class) term1386601).getDeclaredField((String) "B5");
        ((Field) term1386600).setAccessible(true);
        Object enum5323 = ((Field) term1386600).get((Object) null);
        Class<? extends Object> term1386804 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1386803 = ((Class) term1386804).getDeclaredField((String) "E8");
        ((Field) term1386803).setAccessible(true);
        Object enum5324 = ((Field) term1386803).get((Object) null);
        Class<? extends Object> term1387007 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1387006 = ((Class) term1387007).getDeclaredField((String) "WHITE_KING");
        ((Field) term1387006).setAccessible(true);
        Object enum5325 = ((Field) term1387006).get((Object) null);
        Class<? extends Object> term1387239 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1387238 = ((Class) term1387239).getDeclaredField((String) "F5");
        ((Field) term1387238).setAccessible(true);
        Object enum5326 = ((Field) term1387238).get((Object) null);
        Class<? extends Object> term1387442 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1387441 = ((Class) term1387442).getDeclaredField((String) "A1");
        ((Field) term1387441).setAccessible(true);
        Object enum5327 = ((Field) term1387441).get((Object) null);
        Class<? extends Object> term1387645 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1387644 = ((Class) term1387645).getDeclaredField((String) "WHITE_BISHOP");
        ((Field) term1387644).setAccessible(true);
        Object enum5328 = ((Field) term1387644).get((Object) null);
        Class<? extends Object> term1387883 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1387882 = ((Class) term1387883).getDeclaredField((String) "WHITE_ROOK");
        ((Field) term1387882).setAccessible(true);
        Object enum5329 = ((Field) term1387882).get((Object) null);
        Class<? extends Object> term1388105 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1388104 = ((Class) term1388105).getDeclaredField((String) "C1");
        ((Field) term1388104).setAccessible(true);
        Object enum5330 = ((Field) term1388104).get((Object) null);
        Class<? extends Object> term1388308 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1388307 = ((Class) term1388308).getDeclaredField((String) "BLACK_ROOK");
        ((Field) term1388307).setAccessible(true);
        Object enum5331 = ((Field) term1388307).get((Object) null);
        term1385404 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.MoveBackup"));
        Object term1385405 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term1385496 = (Object[]) newArray("com.github.bhlangonijr.chesslib.Side", 2);
        Object[] term1385497 = (Object[]) newArray("java.lang.Object", 2);
        Object term1385515 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        Object term1385565 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term1385405, term1385405.getClass(), "keyType", term1385406);
        setElement(term1385496, 0, enum5319);
        setElement(term1385496, 1, enum5320);
        setField(term1385405, term1385405.getClass(), "keyUniverse", term1385496);
        setField(term1385405, term1385405.getClass(), "vals", term1385497);
        setIntField(term1385405, term1385405.getClass(), "size", 0);
        setField(term1385405, term1385405.getClass(), "entrySet", null);
        setField(term1385405, term1385405.getClass(), "keySet", null);
        setField(term1385405, term1385405.getClass(), "values", null);
        setField(term1385404, term1385404.getClass(), "castleRight", term1385405);
        setField(term1385404, term1385404.getClass(), "sideToMove", enum5319);
        setField(term1385404, term1385404.getClass(), "enPassantTarget", enum5321);
        setField(term1385404, term1385404.getClass(), "enPassant", enum5322);
        setField(term1385404, term1385404.getClass(), "moveCounter", term1385511);
        setField(term1385404, term1385404.getClass(), "halfMoveCounter", term1385513);
        setField(term1385515, term1385515.getClass(), "from", enum5323);
        setField(term1385515, term1385515.getClass(), "to", enum5324);
        setField(term1385515, term1385515.getClass(), "promotion", enum5325);
        setField(term1385515, term1385515.getClass(), "san", "UPVTXSXUNh");
        setField(term1385404, term1385404.getClass(), "move", term1385515);
        setField(term1385565, term1385565.getClass(), "from", enum5326);
        setField(term1385565, term1385565.getClass(), "to", enum5327);
        setField(term1385565, term1385565.getClass(), "promotion", enum5328);
        setField(term1385565, term1385565.getClass(), "san", "cjCXbXuiFn");
        setField(term1385404, term1385404.getClass(), "rookCastleMove", term1385565);
        setField(term1385404, term1385404.getClass(), "capturedPiece", enum5329);
        setField(term1385404, term1385404.getClass(), "capturedSquare", enum5330);
        setField(term1385404, term1385404.getClass(), "movingPiece", enum5331);
        setBooleanField(term1385404, term1385404.getClass(), "castleMove", true);
        setBooleanField(term1385404, term1385404.getClass(), "enPassantMove", true);
        setLongField(term1385404, term1385404.getClass(), "incrementalHashKey", -1413653349314156044L);
        setLongField(term1385404, term1385404.getClass(), "incrementalPolyglotKey", 742593745847006219L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.MoveBackup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIncrementalHashKey", argTypes, term1385404, args);
    }

};


