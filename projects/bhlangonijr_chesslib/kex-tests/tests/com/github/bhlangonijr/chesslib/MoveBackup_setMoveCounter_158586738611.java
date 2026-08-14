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

public class MoveBackup_setMoveCounter_158586738611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1326966;
     Object term1327233;

    public MoveBackup_setMoveCounter_158586738611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1326968 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Class<? extends Object> term1327344 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1327343 = ((Class) term1327344).getDeclaredField((String) "BLACK");
        ((Field) term1327343).setAccessible(true);
        Object enum5076 = ((Field) term1327343).get((Object) null);
        Class<? extends Object> term1327546 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1327545 = ((Class) term1327546).getDeclaredField((String) "WHITE");
        ((Field) term1327545).setAccessible(true);
        Object enum5077 = ((Field) term1327545).get((Object) null);
        Class<? extends Object> term1327748 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1327747 = ((Class) term1327748).getDeclaredField((String) "H8");
        ((Field) term1327747).setAccessible(true);
        Object enum5078 = ((Field) term1327747).get((Object) null);
        Class<? extends Object> term1327951 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1327950 = ((Class) term1327951).getDeclaredField((String) "C1");
        ((Field) term1327950).setAccessible(true);
        Object enum5079 = ((Field) term1327950).get((Object) null);
        Integer term1327073 = new Integer(-1222614956);
        Integer term1327075 = new Integer(-1870495012);
        Class<? extends Object> term1328154 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1328153 = ((Class) term1328154).getDeclaredField((String) "G8");
        ((Field) term1328153).setAccessible(true);
        Object enum5080 = ((Field) term1328153).get((Object) null);
        Class<? extends Object> term1328357 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1328356 = ((Class) term1328357).getDeclaredField((String) "H2");
        ((Field) term1328356).setAccessible(true);
        Object enum5081 = ((Field) term1328356).get((Object) null);
        Class<? extends Object> term1328560 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1328559 = ((Class) term1328560).getDeclaredField((String) "NONE");
        ((Field) term1328559).setAccessible(true);
        Object enum5082 = ((Field) term1328559).get((Object) null);
        Class<? extends Object> term1328774 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1328773 = ((Class) term1328774).getDeclaredField((String) "G6");
        ((Field) term1328773).setAccessible(true);
        Object enum5083 = ((Field) term1328773).get((Object) null);
        Class<? extends Object> term1328977 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1328976 = ((Class) term1328977).getDeclaredField((String) "A2");
        ((Field) term1328976).setAccessible(true);
        Object enum5084 = ((Field) term1328976).get((Object) null);
        Class<? extends Object> term1329180 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1329179 = ((Class) term1329180).getDeclaredField((String) "BLACK_QUEEN");
        ((Field) term1329179).setAccessible(true);
        Object enum5085 = ((Field) term1329179).get((Object) null);
        Class<? extends Object> term1329415 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1329414 = ((Class) term1329415).getDeclaredField((String) "BLACK_ROOK");
        ((Field) term1329414).setAccessible(true);
        Object enum5086 = ((Field) term1329414).get((Object) null);
        Class<? extends Object> term1329637 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1329636 = ((Class) term1329637).getDeclaredField((String) "A6");
        ((Field) term1329636).setAccessible(true);
        Object enum5087 = ((Field) term1329636).get((Object) null);
        Class<? extends Object> term1329840 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1329839 = ((Class) term1329840).getDeclaredField((String) "WHITE_KNIGHT");
        ((Field) term1329839).setAccessible(true);
        Object enum5088 = ((Field) term1329839).get((Object) null);
        term1326966 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.MoveBackup"));
        Object term1326967 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term1327058 = (Object[]) newArray("com.github.bhlangonijr.chesslib.Side", 2);
        Object[] term1327059 = (Object[]) newArray("java.lang.Object", 2);
        Object term1327077 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        Object term1327119 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term1326967, term1326967.getClass(), "keyType", term1326968);
        setElement(term1327058, 0, enum5076);
        setElement(term1327058, 1, enum5077);
        setField(term1326967, term1326967.getClass(), "keyUniverse", term1327058);
        setField(term1326967, term1326967.getClass(), "vals", term1327059);
        setIntField(term1326967, term1326967.getClass(), "size", 0);
        setField(term1326967, term1326967.getClass(), "entrySet", null);
        setField(term1326967, term1326967.getClass(), "keySet", null);
        setField(term1326967, term1326967.getClass(), "values", null);
        setField(term1326966, term1326966.getClass(), "castleRight", term1326967);
        setField(term1326966, term1326966.getClass(), "sideToMove", enum5077);
        setField(term1326966, term1326966.getClass(), "enPassantTarget", enum5078);
        setField(term1326966, term1326966.getClass(), "enPassant", enum5079);
        setField(term1326966, term1326966.getClass(), "moveCounter", term1327073);
        setField(term1326966, term1326966.getClass(), "halfMoveCounter", term1327075);
        setField(term1327077, term1327077.getClass(), "from", enum5080);
        setField(term1327077, term1327077.getClass(), "to", enum5081);
        setField(term1327077, term1327077.getClass(), "promotion", enum5082);
        setField(term1327077, term1327077.getClass(), "san", "VclIptmKrF");
        setField(term1326966, term1326966.getClass(), "move", term1327077);
        setField(term1327119, term1327119.getClass(), "from", enum5083);
        setField(term1327119, term1327119.getClass(), "to", enum5084);
        setField(term1327119, term1327119.getClass(), "promotion", enum5085);
        setField(term1327119, term1327119.getClass(), "san", "wcTeSHCZwz");
        setField(term1326966, term1326966.getClass(), "rookCastleMove", term1327119);
        setField(term1326966, term1326966.getClass(), "capturedPiece", enum5086);
        setField(term1326966, term1326966.getClass(), "capturedSquare", enum5087);
        setField(term1326966, term1326966.getClass(), "movingPiece", enum5088);
        setBooleanField(term1326966, term1326966.getClass(), "castleMove", true);
        setBooleanField(term1326966, term1326966.getClass(), "enPassantMove", false);
        setLongField(term1326966, term1326966.getClass(), "incrementalHashKey", -6759247883224780481L);
        setLongField(term1326966, term1326966.getClass(), "incrementalPolyglotKey", -3724162247917461536L);
        term1327233 = new Integer(-1310015129);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.MoveBackup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1327233;
        callMethod(klass, "setMoveCounter", argTypes, term1326966, args);
    }

};


