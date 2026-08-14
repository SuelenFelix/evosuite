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

public class MoveBackup_setHalfMoveCounter_74005681313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1333208;
     Object term1333474;

    public MoveBackup_setHalfMoveCounter_74005681313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1333210 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Class<? extends Object> term1333585 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1333584 = ((Class) term1333585).getDeclaredField((String) "BLACK");
        ((Field) term1333584).setAccessible(true);
        Object enum5102 = ((Field) term1333584).get((Object) null);
        Class<? extends Object> term1333787 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1333786 = ((Class) term1333787).getDeclaredField((String) "BLACK");
        ((Field) term1333786).setAccessible(true);
        Object enum5103 = ((Field) term1333786).get((Object) null);
        Class<? extends Object> term1333989 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1333988 = ((Class) term1333989).getDeclaredField((String) "C1");
        ((Field) term1333988).setAccessible(true);
        Object enum5104 = ((Field) term1333988).get((Object) null);
        Class<? extends Object> term1334192 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1334191 = ((Class) term1334192).getDeclaredField((String) "G1");
        ((Field) term1334191).setAccessible(true);
        Object enum5105 = ((Field) term1334191).get((Object) null);
        Integer term1333315 = new Integer(318591690);
        Integer term1333317 = new Integer(-165587447);
        Class<? extends Object> term1334395 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1334394 = ((Class) term1334395).getDeclaredField((String) "D6");
        ((Field) term1334394).setAccessible(true);
        Object enum5106 = ((Field) term1334394).get((Object) null);
        Class<? extends Object> term1334598 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1334597 = ((Class) term1334598).getDeclaredField((String) "NONE");
        ((Field) term1334597).setAccessible(true);
        Object enum5107 = ((Field) term1334597).get((Object) null);
        Class<? extends Object> term1334812 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1334811 = ((Class) term1334812).getDeclaredField((String) "A1");
        ((Field) term1334811).setAccessible(true);
        Object enum5108 = ((Field) term1334811).get((Object) null);
        Class<? extends Object> term1335015 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1335014 = ((Class) term1335015).getDeclaredField((String) "NONE");
        ((Field) term1335014).setAccessible(true);
        Object enum5109 = ((Field) term1335014).get((Object) null);
        Class<? extends Object> term1335229 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1335228 = ((Class) term1335229).getDeclaredField((String) "WHITE_ROOK");
        ((Field) term1335228).setAccessible(true);
        Object enum5110 = ((Field) term1335228).get((Object) null);
        Class<? extends Object> term1335451 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1335450 = ((Class) term1335451).getDeclaredField((String) "C4");
        ((Field) term1335450).setAccessible(true);
        Object enum5111 = ((Field) term1335450).get((Object) null);
        Class<? extends Object> term1335654 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1335653 = ((Class) term1335654).getDeclaredField((String) "BLACK_ROOK");
        ((Field) term1335653).setAccessible(true);
        Object enum5112 = ((Field) term1335653).get((Object) null);
        term1333208 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.MoveBackup"));
        Object term1333209 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term1333300 = (Object[]) newArray("com.github.bhlangonijr.chesslib.Side", 2);
        Object[] term1333301 = (Object[]) newArray("java.lang.Object", 2);
        Object term1333319 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        Object term1333365 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term1333209, term1333209.getClass(), "keyType", term1333210);
        setElement(term1333300, 0, enum5102);
        setElement(term1333300, 1, enum5103);
        setField(term1333209, term1333209.getClass(), "keyUniverse", term1333300);
        setField(term1333209, term1333209.getClass(), "vals", term1333301);
        setIntField(term1333209, term1333209.getClass(), "size", 0);
        setField(term1333209, term1333209.getClass(), "entrySet", null);
        setField(term1333209, term1333209.getClass(), "keySet", null);
        setField(term1333209, term1333209.getClass(), "values", null);
        setField(term1333208, term1333208.getClass(), "castleRight", term1333209);
        setField(term1333208, term1333208.getClass(), "sideToMove", enum5102);
        setField(term1333208, term1333208.getClass(), "enPassantTarget", enum5104);
        setField(term1333208, term1333208.getClass(), "enPassant", enum5105);
        setField(term1333208, term1333208.getClass(), "moveCounter", term1333315);
        setField(term1333208, term1333208.getClass(), "halfMoveCounter", term1333317);
        setField(term1333319, term1333319.getClass(), "from", enum5106);
        setField(term1333319, term1333319.getClass(), "to", enum5104);
        setField(term1333319, term1333319.getClass(), "promotion", enum5107);
        setField(term1333319, term1333319.getClass(), "san", "SUIYUFtCCe");
        setField(term1333208, term1333208.getClass(), "move", term1333319);
        setField(term1333365, term1333365.getClass(), "from", enum5108);
        setField(term1333365, term1333365.getClass(), "to", enum5106);
        setField(term1333365, term1333365.getClass(), "promotion", enum5109);
        setField(term1333365, term1333365.getClass(), "san", "eKCrPCkedw");
        setField(term1333208, term1333208.getClass(), "rookCastleMove", term1333365);
        setField(term1333208, term1333208.getClass(), "capturedPiece", enum5110);
        setField(term1333208, term1333208.getClass(), "capturedSquare", enum5111);
        setField(term1333208, term1333208.getClass(), "movingPiece", enum5112);
        setBooleanField(term1333208, term1333208.getClass(), "castleMove", true);
        setBooleanField(term1333208, term1333208.getClass(), "enPassantMove", false);
        setLongField(term1333208, term1333208.getClass(), "incrementalHashKey", 7848004402682338886L);
        setLongField(term1333208, term1333208.getClass(), "incrementalPolyglotKey", 8931772176819893873L);
        term1333474 = new Integer(-1347358701);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.MoveBackup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1333474;
        callMethod(klass, "setHalfMoveCounter", argTypes, term1333208, args);
    }

};


