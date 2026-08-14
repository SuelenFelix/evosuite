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

public class MoveBackup_getCapturedPiece_91226124619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1352123;

    public MoveBackup_getCapturedPiece_91226124619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1352125 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Class<? extends Object> term1352476 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1352475 = ((Class) term1352476).getDeclaredField((String) "WHITE");
        ((Field) term1352475).setAccessible(true);
        Object enum5181 = ((Field) term1352475).get((Object) null);
        Class<? extends Object> term1352678 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1352677 = ((Class) term1352678).getDeclaredField((String) "WHITE");
        ((Field) term1352677).setAccessible(true);
        Object enum5182 = ((Field) term1352677).get((Object) null);
        Class<? extends Object> term1352880 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1352879 = ((Class) term1352880).getDeclaredField((String) "G6");
        ((Field) term1352879).setAccessible(true);
        Object enum5183 = ((Field) term1352879).get((Object) null);
        Class<? extends Object> term1353083 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1353082 = ((Class) term1353083).getDeclaredField((String) "E6");
        ((Field) term1353082).setAccessible(true);
        Object enum5184 = ((Field) term1353082).get((Object) null);
        Integer term1352230 = new Integer(982388293);
        Integer term1352232 = new Integer(-159494544);
        Class<? extends Object> term1353286 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1353285 = ((Class) term1353286).getDeclaredField((String) "B3");
        ((Field) term1353285).setAccessible(true);
        Object enum5185 = ((Field) term1353285).get((Object) null);
        Class<? extends Object> term1353489 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1353488 = ((Class) term1353489).getDeclaredField((String) "B7");
        ((Field) term1353488).setAccessible(true);
        Object enum5186 = ((Field) term1353488).get((Object) null);
        Class<? extends Object> term1353692 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1353691 = ((Class) term1353692).getDeclaredField((String) "BLACK_ROOK");
        ((Field) term1353691).setAccessible(true);
        Object enum5187 = ((Field) term1353691).get((Object) null);
        Class<? extends Object> term1353924 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1353923 = ((Class) term1353924).getDeclaredField((String) "E7");
        ((Field) term1353923).setAccessible(true);
        Object enum5188 = ((Field) term1353923).get((Object) null);
        Class<? extends Object> term1354127 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1354126 = ((Class) term1354127).getDeclaredField((String) "E5");
        ((Field) term1354126).setAccessible(true);
        Object enum5189 = ((Field) term1354126).get((Object) null);
        Class<? extends Object> term1354330 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1354329 = ((Class) term1354330).getDeclaredField((String) "BLACK_KNIGHT");
        ((Field) term1354329).setAccessible(true);
        Object enum5190 = ((Field) term1354329).get((Object) null);
        Class<? extends Object> term1354568 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1354567 = ((Class) term1354568).getDeclaredField((String) "WHITE_BISHOP");
        ((Field) term1354567).setAccessible(true);
        Object enum5191 = ((Field) term1354567).get((Object) null);
        Class<? extends Object> term1354796 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1354795 = ((Class) term1354796).getDeclaredField((String) "E3");
        ((Field) term1354795).setAccessible(true);
        Object enum5192 = ((Field) term1354795).get((Object) null);
        term1352123 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.MoveBackup"));
        Object term1352124 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term1352215 = (Object[]) newArray("com.github.bhlangonijr.chesslib.Side", 2);
        Object[] term1352216 = (Object[]) newArray("java.lang.Object", 2);
        Object term1352234 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        Object term1352286 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term1352124, term1352124.getClass(), "keyType", term1352125);
        setElement(term1352215, 0, enum5181);
        setElement(term1352215, 1, enum5182);
        setField(term1352124, term1352124.getClass(), "keyUniverse", term1352215);
        setField(term1352124, term1352124.getClass(), "vals", term1352216);
        setIntField(term1352124, term1352124.getClass(), "size", 0);
        setField(term1352124, term1352124.getClass(), "entrySet", null);
        setField(term1352124, term1352124.getClass(), "keySet", null);
        setField(term1352124, term1352124.getClass(), "values", null);
        setField(term1352123, term1352123.getClass(), "castleRight", term1352124);
        setField(term1352123, term1352123.getClass(), "sideToMove", enum5181);
        setField(term1352123, term1352123.getClass(), "enPassantTarget", enum5183);
        setField(term1352123, term1352123.getClass(), "enPassant", enum5184);
        setField(term1352123, term1352123.getClass(), "moveCounter", term1352230);
        setField(term1352123, term1352123.getClass(), "halfMoveCounter", term1352232);
        setField(term1352234, term1352234.getClass(), "from", enum5185);
        setField(term1352234, term1352234.getClass(), "to", enum5186);
        setField(term1352234, term1352234.getClass(), "promotion", enum5187);
        setField(term1352234, term1352234.getClass(), "san", "wzAFLFdaEQ");
        setField(term1352123, term1352123.getClass(), "move", term1352234);
        setField(term1352286, term1352286.getClass(), "from", enum5188);
        setField(term1352286, term1352286.getClass(), "to", enum5189);
        setField(term1352286, term1352286.getClass(), "promotion", enum5190);
        setField(term1352286, term1352286.getClass(), "san", "IcbBNUXJqX");
        setField(term1352123, term1352123.getClass(), "rookCastleMove", term1352286);
        setField(term1352123, term1352123.getClass(), "capturedPiece", enum5191);
        setField(term1352123, term1352123.getClass(), "capturedSquare", enum5192);
        setField(term1352123, term1352123.getClass(), "movingPiece", enum5187);
        setBooleanField(term1352123, term1352123.getClass(), "castleMove", false);
        setBooleanField(term1352123, term1352123.getClass(), "enPassantMove", false);
        setLongField(term1352123, term1352123.getClass(), "incrementalHashKey", -6314099457945626605L);
        setLongField(term1352123, term1352123.getClass(), "incrementalPolyglotKey", -8697239524885136781L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.MoveBackup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCapturedPiece", argTypes, term1352123, args);
    }

};


