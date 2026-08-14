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
import java.lang.Boolean;

public class MoveBackup_setCastleMove_67926331427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1376484;
     Object term1376725;

    public MoveBackup_setCastleMove_67926331427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1376486 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Class<? extends Object> term1376836 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1376835 = ((Class) term1376836).getDeclaredField((String) "BLACK");
        ((Field) term1376835).setAccessible(true);
        Object enum5282 = ((Field) term1376835).get((Object) null);
        Class<? extends Object> term1377038 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1377037 = ((Class) term1377038).getDeclaredField((String) "WHITE");
        ((Field) term1377037).setAccessible(true);
        Object enum5283 = ((Field) term1377037).get((Object) null);
        Class<? extends Object> term1377240 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1377239 = ((Class) term1377240).getDeclaredField((String) "C4");
        ((Field) term1377239).setAccessible(true);
        Object enum5284 = ((Field) term1377239).get((Object) null);
        Class<? extends Object> term1377443 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1377442 = ((Class) term1377443).getDeclaredField((String) "H3");
        ((Field) term1377442).setAccessible(true);
        Object enum5285 = ((Field) term1377442).get((Object) null);
        Integer term1376591 = new Integer(-1111249833);
        Integer term1376593 = new Integer(-1692331299);
        Class<? extends Object> term1377646 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1377645 = ((Class) term1377646).getDeclaredField((String) "E8");
        ((Field) term1377645).setAccessible(true);
        Object enum5286 = ((Field) term1377645).get((Object) null);
        Class<? extends Object> term1377849 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1377848 = ((Class) term1377849).getDeclaredField((String) "G7");
        ((Field) term1377848).setAccessible(true);
        Object enum5287 = ((Field) term1377848).get((Object) null);
        Class<? extends Object> term1378052 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1378051 = ((Class) term1378052).getDeclaredField((String) "NONE");
        ((Field) term1378051).setAccessible(true);
        Object enum5288 = ((Field) term1378051).get((Object) null);
        Class<? extends Object> term1378266 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1378265 = ((Class) term1378266).getDeclaredField((String) "A3");
        ((Field) term1378265).setAccessible(true);
        Object enum5289 = ((Field) term1378265).get((Object) null);
        Class<? extends Object> term1378469 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1378468 = ((Class) term1378469).getDeclaredField((String) "WHITE_QUEEN");
        ((Field) term1378468).setAccessible(true);
        Object enum5290 = ((Field) term1378468).get((Object) null);
        Class<? extends Object> term1378704 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1378703 = ((Class) term1378704).getDeclaredField((String) "WHITE_PAWN");
        ((Field) term1378703).setAccessible(true);
        Object enum5291 = ((Field) term1378703).get((Object) null);
        Class<? extends Object> term1378926 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1378925 = ((Class) term1378926).getDeclaredField((String) "C3");
        ((Field) term1378925).setAccessible(true);
        Object enum5292 = ((Field) term1378925).get((Object) null);
        term1376484 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.MoveBackup"));
        Object term1376485 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term1376576 = (Object[]) newArray("com.github.bhlangonijr.chesslib.Side", 2);
        Object[] term1376577 = (Object[]) newArray("java.lang.Object", 2);
        Object term1376595 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        Object term1376637 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term1376485, term1376485.getClass(), "keyType", term1376486);
        setElement(term1376576, 0, enum5282);
        setElement(term1376576, 1, enum5283);
        setField(term1376485, term1376485.getClass(), "keyUniverse", term1376576);
        setField(term1376485, term1376485.getClass(), "vals", term1376577);
        setIntField(term1376485, term1376485.getClass(), "size", 0);
        setField(term1376485, term1376485.getClass(), "entrySet", null);
        setField(term1376485, term1376485.getClass(), "keySet", null);
        setField(term1376485, term1376485.getClass(), "values", null);
        setField(term1376484, term1376484.getClass(), "castleRight", term1376485);
        setField(term1376484, term1376484.getClass(), "sideToMove", enum5282);
        setField(term1376484, term1376484.getClass(), "enPassantTarget", enum5284);
        setField(term1376484, term1376484.getClass(), "enPassant", enum5285);
        setField(term1376484, term1376484.getClass(), "moveCounter", term1376591);
        setField(term1376484, term1376484.getClass(), "halfMoveCounter", term1376593);
        setField(term1376595, term1376595.getClass(), "from", enum5286);
        setField(term1376595, term1376595.getClass(), "to", enum5287);
        setField(term1376595, term1376595.getClass(), "promotion", enum5288);
        setField(term1376595, term1376595.getClass(), "san", "HdwopulXkf");
        setField(term1376484, term1376484.getClass(), "move", term1376595);
        setField(term1376637, term1376637.getClass(), "from", enum5284);
        setField(term1376637, term1376637.getClass(), "to", enum5289);
        setField(term1376637, term1376637.getClass(), "promotion", enum5290);
        setField(term1376637, term1376637.getClass(), "san", "FuCKfgAhpC");
        setField(term1376484, term1376484.getClass(), "rookCastleMove", term1376637);
        setField(term1376484, term1376484.getClass(), "capturedPiece", enum5291);
        setField(term1376484, term1376484.getClass(), "capturedSquare", enum5292);
        setField(term1376484, term1376484.getClass(), "movingPiece", enum5291);
        setBooleanField(term1376484, term1376484.getClass(), "castleMove", true);
        setBooleanField(term1376484, term1376484.getClass(), "enPassantMove", true);
        setLongField(term1376484, term1376484.getClass(), "incrementalHashKey", -8698230272673009418L);
        setLongField(term1376484, term1376484.getClass(), "incrementalPolyglotKey", -8792567429538693571L);
        term1376725 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.MoveBackup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1376725;
        callMethod(klass, "setCastleMove", argTypes, term1376484, args);
    }

};


