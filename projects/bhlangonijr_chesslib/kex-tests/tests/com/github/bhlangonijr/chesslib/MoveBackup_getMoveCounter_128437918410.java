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

public class MoveBackup_getMoveCounter_128437918410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1324297;

    public MoveBackup_getMoveCounter_128437918410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1324299 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Class<? extends Object> term1324664 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1324663 = ((Class) term1324664).getDeclaredField((String) "BLACK");
        ((Field) term1324663).setAccessible(true);
        Object enum5065 = ((Field) term1324663).get((Object) null);
        Class<? extends Object> term1324866 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1324865 = ((Class) term1324866).getDeclaredField((String) "BLACK");
        ((Field) term1324865).setAccessible(true);
        Object enum5066 = ((Field) term1324865).get((Object) null);
        Class<? extends Object> term1325068 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1325067 = ((Class) term1325068).getDeclaredField((String) "A5");
        ((Field) term1325067).setAccessible(true);
        Object enum5067 = ((Field) term1325067).get((Object) null);
        Class<? extends Object> term1325271 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1325270 = ((Class) term1325271).getDeclaredField((String) "B5");
        ((Field) term1325270).setAccessible(true);
        Object enum5068 = ((Field) term1325270).get((Object) null);
        Integer term1324404 = new Integer(1102721075);
        Integer term1324406 = new Integer(-426764678);
        Class<? extends Object> term1325474 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1325473 = ((Class) term1325474).getDeclaredField((String) "G2");
        ((Field) term1325473).setAccessible(true);
        Object enum5069 = ((Field) term1325473).get((Object) null);
        Class<? extends Object> term1325677 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1325676 = ((Class) term1325677).getDeclaredField((String) "C1");
        ((Field) term1325676).setAccessible(true);
        Object enum5070 = ((Field) term1325676).get((Object) null);
        Class<? extends Object> term1325880 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1325879 = ((Class) term1325880).getDeclaredField((String) "BLACK_BISHOP");
        ((Field) term1325879).setAccessible(true);
        Object enum5071 = ((Field) term1325879).get((Object) null);
        Class<? extends Object> term1326118 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1326117 = ((Class) term1326118).getDeclaredField((String) "C7");
        ((Field) term1326117).setAccessible(true);
        Object enum5072 = ((Field) term1326117).get((Object) null);
        Class<? extends Object> term1326321 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1326320 = ((Class) term1326321).getDeclaredField((String) "NONE");
        ((Field) term1326320).setAccessible(true);
        Object enum5073 = ((Field) term1326320).get((Object) null);
        Class<? extends Object> term1326535 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1326534 = ((Class) term1326535).getDeclaredField((String) "BLACK_KNIGHT");
        ((Field) term1326534).setAccessible(true);
        Object enum5074 = ((Field) term1326534).get((Object) null);
        Class<? extends Object> term1326763 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1326762 = ((Class) term1326763).getDeclaredField((String) "NONE");
        ((Field) term1326762).setAccessible(true);
        Object enum5075 = ((Field) term1326762).get((Object) null);
        term1324297 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.MoveBackup"));
        Object term1324298 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term1324389 = (Object[]) newArray("com.github.bhlangonijr.chesslib.Side", 2);
        Object[] term1324390 = (Object[]) newArray("java.lang.Object", 2);
        Object term1324408 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        Object term1324458 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term1324298, term1324298.getClass(), "keyType", term1324299);
        setElement(term1324389, 0, enum5065);
        setElement(term1324389, 1, enum5066);
        setField(term1324298, term1324298.getClass(), "keyUniverse", term1324389);
        setField(term1324298, term1324298.getClass(), "vals", term1324390);
        setIntField(term1324298, term1324298.getClass(), "size", 0);
        setField(term1324298, term1324298.getClass(), "entrySet", null);
        setField(term1324298, term1324298.getClass(), "keySet", null);
        setField(term1324298, term1324298.getClass(), "values", null);
        setField(term1324297, term1324297.getClass(), "castleRight", term1324298);
        setField(term1324297, term1324297.getClass(), "sideToMove", enum5065);
        setField(term1324297, term1324297.getClass(), "enPassantTarget", enum5067);
        setField(term1324297, term1324297.getClass(), "enPassant", enum5068);
        setField(term1324297, term1324297.getClass(), "moveCounter", term1324404);
        setField(term1324297, term1324297.getClass(), "halfMoveCounter", term1324406);
        setField(term1324408, term1324408.getClass(), "from", enum5069);
        setField(term1324408, term1324408.getClass(), "to", enum5070);
        setField(term1324408, term1324408.getClass(), "promotion", enum5071);
        setField(term1324408, term1324408.getClass(), "san", "gNeMyGSVIG");
        setField(term1324297, term1324297.getClass(), "move", term1324408);
        setField(term1324458, term1324458.getClass(), "from", enum5072);
        setField(term1324458, term1324458.getClass(), "to", enum5070);
        setField(term1324458, term1324458.getClass(), "promotion", enum5073);
        setField(term1324458, term1324458.getClass(), "san", "qxEkaqdKPG");
        setField(term1324297, term1324297.getClass(), "rookCastleMove", term1324458);
        setField(term1324297, term1324297.getClass(), "capturedPiece", enum5074);
        setField(term1324297, term1324297.getClass(), "capturedSquare", enum5069);
        setField(term1324297, term1324297.getClass(), "movingPiece", enum5075);
        setBooleanField(term1324297, term1324297.getClass(), "castleMove", false);
        setBooleanField(term1324297, term1324297.getClass(), "enPassantMove", true);
        setLongField(term1324297, term1324297.getClass(), "incrementalHashKey", 6462632207326555041L);
        setLongField(term1324297, term1324297.getClass(), "incrementalPolyglotKey", -3188913050877092148L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.MoveBackup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMoveCounter", argTypes, term1324297, args);
    }

};


