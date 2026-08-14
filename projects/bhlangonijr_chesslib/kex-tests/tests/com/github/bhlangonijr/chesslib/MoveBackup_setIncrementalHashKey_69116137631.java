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
import java.lang.Long;

public class MoveBackup_setIncrementalHashKey_69116137631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1388529;
     Object term1388804;

    public MoveBackup_setIncrementalHashKey_69116137631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1388531 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Class<? extends Object> term1388915 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1388914 = ((Class) term1388915).getDeclaredField((String) "BLACK");
        ((Field) term1388914).setAccessible(true);
        Object enum5332 = ((Field) term1388914).get((Object) null);
        Class<? extends Object> term1389117 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1389116 = ((Class) term1389117).getDeclaredField((String) "WHITE");
        ((Field) term1389116).setAccessible(true);
        Object enum5333 = ((Field) term1389116).get((Object) null);
        Class<? extends Object> term1389319 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1389318 = ((Class) term1389319).getDeclaredField((String) "D3");
        ((Field) term1389318).setAccessible(true);
        Object enum5334 = ((Field) term1389318).get((Object) null);
        Class<? extends Object> term1389522 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1389521 = ((Class) term1389522).getDeclaredField((String) "F6");
        ((Field) term1389521).setAccessible(true);
        Object enum5335 = ((Field) term1389521).get((Object) null);
        Integer term1388636 = new Integer(477625804);
        Integer term1388638 = new Integer(252575029);
        Class<? extends Object> term1389725 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1389724 = ((Class) term1389725).getDeclaredField((String) "C3");
        ((Field) term1389724).setAccessible(true);
        Object enum5336 = ((Field) term1389724).get((Object) null);
        Class<? extends Object> term1389928 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1389927 = ((Class) term1389928).getDeclaredField((String) "D7");
        ((Field) term1389927).setAccessible(true);
        Object enum5337 = ((Field) term1389927).get((Object) null);
        Class<? extends Object> term1390131 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1390130 = ((Class) term1390131).getDeclaredField((String) "BLACK_PAWN");
        ((Field) term1390130).setAccessible(true);
        Object enum5338 = ((Field) term1390130).get((Object) null);
        Class<? extends Object> term1390363 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1390362 = ((Class) term1390363).getDeclaredField((String) "NONE");
        ((Field) term1390362).setAccessible(true);
        Object enum5339 = ((Field) term1390362).get((Object) null);
        Class<? extends Object> term1390572 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1390571 = ((Class) term1390572).getDeclaredField((String) "E3");
        ((Field) term1390571).setAccessible(true);
        Object enum5340 = ((Field) term1390571).get((Object) null);
        Class<? extends Object> term1390775 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1390774 = ((Class) term1390775).getDeclaredField((String) "WHITE_KNIGHT");
        ((Field) term1390774).setAccessible(true);
        Object enum5341 = ((Field) term1390774).get((Object) null);
        Class<? extends Object> term1391013 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1391012 = ((Class) term1391013).getDeclaredField((String) "WHITE_KING");
        ((Field) term1391012).setAccessible(true);
        Object enum5342 = ((Field) term1391012).get((Object) null);
        Class<? extends Object> term1391235 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1391234 = ((Class) term1391235).getDeclaredField((String) "WHITE_ROOK");
        ((Field) term1391234).setAccessible(true);
        Object enum5343 = ((Field) term1391234).get((Object) null);
        term1388529 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.MoveBackup"));
        Object term1388530 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term1388621 = (Object[]) newArray("com.github.bhlangonijr.chesslib.Side", 2);
        Object[] term1388622 = (Object[]) newArray("java.lang.Object", 2);
        Object term1388640 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        Object term1388691 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term1388530, term1388530.getClass(), "keyType", term1388531);
        setElement(term1388621, 0, enum5332);
        setElement(term1388621, 1, enum5333);
        setField(term1388530, term1388530.getClass(), "keyUniverse", term1388621);
        setField(term1388530, term1388530.getClass(), "vals", term1388622);
        setIntField(term1388530, term1388530.getClass(), "size", 0);
        setField(term1388530, term1388530.getClass(), "entrySet", null);
        setField(term1388530, term1388530.getClass(), "keySet", null);
        setField(term1388530, term1388530.getClass(), "values", null);
        setField(term1388529, term1388529.getClass(), "castleRight", term1388530);
        setField(term1388529, term1388529.getClass(), "sideToMove", enum5333);
        setField(term1388529, term1388529.getClass(), "enPassantTarget", enum5334);
        setField(term1388529, term1388529.getClass(), "enPassant", enum5335);
        setField(term1388529, term1388529.getClass(), "moveCounter", term1388636);
        setField(term1388529, term1388529.getClass(), "halfMoveCounter", term1388638);
        setField(term1388640, term1388640.getClass(), "from", enum5336);
        setField(term1388640, term1388640.getClass(), "to", enum5337);
        setField(term1388640, term1388640.getClass(), "promotion", enum5338);
        setField(term1388640, term1388640.getClass(), "san", "fhdhDeWdoi");
        setField(term1388529, term1388529.getClass(), "move", term1388640);
        setField(term1388691, term1388691.getClass(), "from", enum5339);
        setField(term1388691, term1388691.getClass(), "to", enum5340);
        setField(term1388691, term1388691.getClass(), "promotion", enum5341);
        setField(term1388691, term1388691.getClass(), "san", "FqrcltWSUd");
        setField(term1388529, term1388529.getClass(), "rookCastleMove", term1388691);
        setField(term1388529, term1388529.getClass(), "capturedPiece", enum5342);
        setField(term1388529, term1388529.getClass(), "capturedSquare", enum5334);
        setField(term1388529, term1388529.getClass(), "movingPiece", enum5343);
        setBooleanField(term1388529, term1388529.getClass(), "castleMove", true);
        setBooleanField(term1388529, term1388529.getClass(), "enPassantMove", false);
        setLongField(term1388529, term1388529.getClass(), "incrementalHashKey", 6801904611028883308L);
        setLongField(term1388529, term1388529.getClass(), "incrementalPolyglotKey", -7717027128782374599L);
        term1388804 = new Long(4872921045907555824L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.MoveBackup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1388804;
        callMethod(klass, "setIncrementalHashKey", argTypes, term1388529, args);
    }

};


