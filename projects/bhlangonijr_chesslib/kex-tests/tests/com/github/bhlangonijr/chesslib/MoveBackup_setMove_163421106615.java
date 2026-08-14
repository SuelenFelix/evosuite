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

public class MoveBackup_setMove_163421106615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1339017;
     Object term1339272;

    public MoveBackup_setMove_163421106615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1339019 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Class<? extends Object> term1339406 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1339405 = ((Class) term1339406).getDeclaredField((String) "BLACK");
        ((Field) term1339405).setAccessible(true);
        Object enum5126 = ((Field) term1339405).get((Object) null);
        Class<? extends Object> term1339608 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1339607 = ((Class) term1339608).getDeclaredField((String) "BLACK");
        ((Field) term1339607).setAccessible(true);
        Object enum5127 = ((Field) term1339607).get((Object) null);
        Class<? extends Object> term1339810 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1339809 = ((Class) term1339810).getDeclaredField((String) "H6");
        ((Field) term1339809).setAccessible(true);
        Object enum5128 = ((Field) term1339809).get((Object) null);
        Class<? extends Object> term1340013 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1340012 = ((Class) term1340013).getDeclaredField((String) "B3");
        ((Field) term1340012).setAccessible(true);
        Object enum5129 = ((Field) term1340012).get((Object) null);
        Integer term1339124 = new Integer(-749861210);
        Integer term1339126 = new Integer(1694224101);
        Class<? extends Object> term1340216 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1340215 = ((Class) term1340216).getDeclaredField((String) "G6");
        ((Field) term1340215).setAccessible(true);
        Object enum5130 = ((Field) term1340215).get((Object) null);
        Class<? extends Object> term1340419 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1340418 = ((Class) term1340419).getDeclaredField((String) "C7");
        ((Field) term1340418).setAccessible(true);
        Object enum5131 = ((Field) term1340418).get((Object) null);
        Class<? extends Object> term1340622 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1340621 = ((Class) term1340622).getDeclaredField((String) "BLACK_ROOK");
        ((Field) term1340621).setAccessible(true);
        Object enum5132 = ((Field) term1340621).get((Object) null);
        Class<? extends Object> term1340854 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1340853 = ((Class) term1340854).getDeclaredField((String) "G4");
        ((Field) term1340853).setAccessible(true);
        Object enum5133 = ((Field) term1340853).get((Object) null);
        Class<? extends Object> term1341057 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1341056 = ((Class) term1341057).getDeclaredField((String) "E6");
        ((Field) term1341056).setAccessible(true);
        Object enum5134 = ((Field) term1341056).get((Object) null);
        Class<? extends Object> term1341260 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1341259 = ((Class) term1341260).getDeclaredField((String) "BLACK_PAWN");
        ((Field) term1341259).setAccessible(true);
        Object enum5135 = ((Field) term1341259).get((Object) null);
        Class<? extends Object> term1341492 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1341491 = ((Class) term1341492).getDeclaredField((String) "WHITE_KNIGHT");
        ((Field) term1341491).setAccessible(true);
        Object enum5136 = ((Field) term1341491).get((Object) null);
        Class<? extends Object> term1341720 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1341719 = ((Class) term1341720).getDeclaredField((String) "B5");
        ((Field) term1341719).setAccessible(true);
        Object enum5137 = ((Field) term1341719).get((Object) null);
        term1339017 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.MoveBackup"));
        Object term1339018 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term1339109 = (Object[]) newArray("com.github.bhlangonijr.chesslib.Side", 2);
        Object[] term1339110 = (Object[]) newArray("java.lang.Object", 2);
        Object term1339128 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        Object term1339180 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term1339018, term1339018.getClass(), "keyType", term1339019);
        setElement(term1339109, 0, enum5126);
        setElement(term1339109, 1, enum5127);
        setField(term1339018, term1339018.getClass(), "keyUniverse", term1339109);
        setField(term1339018, term1339018.getClass(), "vals", term1339110);
        setIntField(term1339018, term1339018.getClass(), "size", 0);
        setField(term1339018, term1339018.getClass(), "entrySet", null);
        setField(term1339018, term1339018.getClass(), "keySet", null);
        setField(term1339018, term1339018.getClass(), "values", null);
        setField(term1339017, term1339017.getClass(), "castleRight", term1339018);
        setField(term1339017, term1339017.getClass(), "sideToMove", enum5127);
        setField(term1339017, term1339017.getClass(), "enPassantTarget", enum5128);
        setField(term1339017, term1339017.getClass(), "enPassant", enum5129);
        setField(term1339017, term1339017.getClass(), "moveCounter", term1339124);
        setField(term1339017, term1339017.getClass(), "halfMoveCounter", term1339126);
        setField(term1339128, term1339128.getClass(), "from", enum5130);
        setField(term1339128, term1339128.getClass(), "to", enum5131);
        setField(term1339128, term1339128.getClass(), "promotion", enum5132);
        setField(term1339128, term1339128.getClass(), "san", "wVOypfVLsP");
        setField(term1339017, term1339017.getClass(), "move", term1339128);
        setField(term1339180, term1339180.getClass(), "from", enum5133);
        setField(term1339180, term1339180.getClass(), "to", enum5134);
        setField(term1339180, term1339180.getClass(), "promotion", enum5135);
        setField(term1339180, term1339180.getClass(), "san", "pEazBcUUWX");
        setField(term1339017, term1339017.getClass(), "rookCastleMove", term1339180);
        setField(term1339017, term1339017.getClass(), "capturedPiece", enum5136);
        setField(term1339017, term1339017.getClass(), "capturedSquare", enum5137);
        setField(term1339017, term1339017.getClass(), "movingPiece", enum5135);
        setBooleanField(term1339017, term1339017.getClass(), "castleMove", true);
        setBooleanField(term1339017, term1339017.getClass(), "enPassantMove", false);
        setLongField(term1339017, term1339017.getClass(), "incrementalHashKey", -7181112149072926893L);
        setLongField(term1339017, term1339017.getClass(), "incrementalPolyglotKey", -5850316381591949820L);
        Class<? extends Object> term1341923 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1341922 = ((Class) term1341923).getDeclaredField((String) "A3");
        ((Field) term1341922).setAccessible(true);
        Object enum5138 = ((Field) term1341922).get((Object) null);
        Class<? extends Object> term1342126 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1342125 = ((Class) term1342126).getDeclaredField((String) "A7");
        ((Field) term1342125).setAccessible(true);
        Object enum5139 = ((Field) term1342125).get((Object) null);
        term1339272 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term1339272, term1339272.getClass(), "from", enum5138);
        setField(term1339272, term1339272.getClass(), "to", enum5139);
        setField(term1339272, term1339272.getClass(), "promotion", enum5136);
        setField(term1339272, term1339272.getClass(), "san", "nlvRWrTxvz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.MoveBackup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.move.Move");
        Object[] args = new Object[1];
        args[0] = term1339272;
        callMethod(klass, "setMove", argTypes, term1339017, args);
    }

};


