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

public class MoveBackup_getSideToMove_631845484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1306823;

    public MoveBackup_getSideToMove_631845484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1306825 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Class<? extends Object> term1307182 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1307181 = ((Class) term1307182).getDeclaredField((String) "BLACK");
        ((Field) term1307181).setAccessible(true);
        Object enum4992 = ((Field) term1307181).get((Object) null);
        Class<? extends Object> term1307384 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1307383 = ((Class) term1307384).getDeclaredField((String) "BLACK");
        ((Field) term1307383).setAccessible(true);
        Object enum4993 = ((Field) term1307383).get((Object) null);
        Class<? extends Object> term1307586 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1307585 = ((Class) term1307586).getDeclaredField((String) "NONE");
        ((Field) term1307585).setAccessible(true);
        Object enum4994 = ((Field) term1307585).get((Object) null);
        Class<? extends Object> term1307795 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1307794 = ((Class) term1307795).getDeclaredField((String) "G1");
        ((Field) term1307794).setAccessible(true);
        Object enum4995 = ((Field) term1307794).get((Object) null);
        Integer term1306932 = new Integer(114754804);
        Integer term1306934 = new Integer(1687361082);
        Class<? extends Object> term1307998 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1307997 = ((Class) term1307998).getDeclaredField((String) "A1");
        ((Field) term1307997).setAccessible(true);
        Object enum4996 = ((Field) term1307997).get((Object) null);
        Class<? extends Object> term1308201 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1308200 = ((Class) term1308201).getDeclaredField((String) "WHITE_QUEEN");
        ((Field) term1308200).setAccessible(true);
        Object enum4997 = ((Field) term1308200).get((Object) null);
        Class<? extends Object> term1308436 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1308435 = ((Class) term1308436).getDeclaredField((String) "F4");
        ((Field) term1308435).setAccessible(true);
        Object enum4998 = ((Field) term1308435).get((Object) null);
        Class<? extends Object> term1308639 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1308638 = ((Class) term1308639).getDeclaredField((String) "D8");
        ((Field) term1308638).setAccessible(true);
        Object enum4999 = ((Field) term1308638).get((Object) null);
        Class<? extends Object> term1308842 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1308841 = ((Class) term1308842).getDeclaredField((String) "BLACK_KNIGHT");
        ((Field) term1308841).setAccessible(true);
        Object enum5000 = ((Field) term1308841).get((Object) null);
        Class<? extends Object> term1309080 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1309079 = ((Class) term1309080).getDeclaredField((String) "A8");
        ((Field) term1309079).setAccessible(true);
        Object enum5001 = ((Field) term1309079).get((Object) null);
        Class<? extends Object> term1309283 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1309282 = ((Class) term1309283).getDeclaredField((String) "WHITE_QUEEN");
        ((Field) term1309282).setAccessible(true);
        Object enum5002 = ((Field) term1309282).get((Object) null);
        term1306823 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.MoveBackup"));
        Object term1306824 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term1306915 = (Object[]) newArray("com.github.bhlangonijr.chesslib.Side", 2);
        Object[] term1306916 = (Object[]) newArray("java.lang.Object", 2);
        Object term1306936 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        Object term1306981 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term1306824, term1306824.getClass(), "keyType", term1306825);
        setElement(term1306915, 0, enum4992);
        setElement(term1306915, 1, enum4993);
        setField(term1306824, term1306824.getClass(), "keyUniverse", term1306915);
        setField(term1306824, term1306824.getClass(), "vals", term1306916);
        setIntField(term1306824, term1306824.getClass(), "size", 0);
        setField(term1306824, term1306824.getClass(), "entrySet", null);
        setField(term1306824, term1306824.getClass(), "keySet", null);
        setField(term1306824, term1306824.getClass(), "values", null);
        setField(term1306823, term1306823.getClass(), "castleRight", term1306824);
        setField(term1306823, term1306823.getClass(), "sideToMove", enum4992);
        setField(term1306823, term1306823.getClass(), "enPassantTarget", enum4994);
        setField(term1306823, term1306823.getClass(), "enPassant", enum4995);
        setField(term1306823, term1306823.getClass(), "moveCounter", term1306932);
        setField(term1306823, term1306823.getClass(), "halfMoveCounter", term1306934);
        setField(term1306936, term1306936.getClass(), "from", enum4996);
        setField(term1306936, term1306936.getClass(), "to", enum4994);
        setField(term1306936, term1306936.getClass(), "promotion", enum4997);
        setField(term1306936, term1306936.getClass(), "san", "umsYdaPflb");
        setField(term1306823, term1306823.getClass(), "move", term1306936);
        setField(term1306981, term1306981.getClass(), "from", enum4998);
        setField(term1306981, term1306981.getClass(), "to", enum4999);
        setField(term1306981, term1306981.getClass(), "promotion", enum5000);
        setField(term1306981, term1306981.getClass(), "san", "CnNmpSyiBE");
        setField(term1306823, term1306823.getClass(), "rookCastleMove", term1306981);
        setField(term1306823, term1306823.getClass(), "capturedPiece", enum4997);
        setField(term1306823, term1306823.getClass(), "capturedSquare", enum5001);
        setField(term1306823, term1306823.getClass(), "movingPiece", enum5002);
        setBooleanField(term1306823, term1306823.getClass(), "castleMove", true);
        setBooleanField(term1306823, term1306823.getClass(), "enPassantMove", true);
        setLongField(term1306823, term1306823.getClass(), "incrementalHashKey", -8957441653116712448L);
        setLongField(term1306823, term1306823.getClass(), "incrementalPolyglotKey", -5761087225966065493L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.MoveBackup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSideToMove", argTypes, term1306823, args);
    }

};


