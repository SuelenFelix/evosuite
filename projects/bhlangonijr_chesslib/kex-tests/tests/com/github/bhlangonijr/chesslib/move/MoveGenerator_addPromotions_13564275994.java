package com.github.bhlangonijr.chesslib.move;

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
import static com.github.bhlangonijr.chesslib.move.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.String;

public class MoveGenerator_addPromotions_13564275994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72001;
     Object enum267;
     Object enum268;
     Object enum269;

    public MoveGenerator_addPromotions_13564275994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term72104 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term72103 = ((Class) term72104).getDeclaredField((String) "C1");
        ((Field) term72103).setAccessible(true);
        Object enum261 = ((Field) term72103).get((Object) null);
        Class<? extends Object> term72307 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term72306 = ((Class) term72307).getDeclaredField((String) "C7");
        ((Field) term72306).setAccessible(true);
        Object enum262 = ((Field) term72306).get((Object) null);
        Class<? extends Object> term72510 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term72509 = ((Class) term72510).getDeclaredField((String) "WHITE_BISHOP");
        ((Field) term72509).setAccessible(true);
        Object enum263 = ((Field) term72509).get((Object) null);
        Object term72004 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term72004, term72004.getClass(), "from", enum261);
        setField(term72004, term72004.getClass(), "to", enum262);
        setField(term72004, term72004.getClass(), "promotion", enum263);
        setField(term72004, term72004.getClass(), "san", "tbcdzjIfER");
        Class<? extends Object> term72748 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term72747 = ((Class) term72748).getDeclaredField((String) "G2");
        ((Field) term72747).setAccessible(true);
        Object enum264 = ((Field) term72747).get((Object) null);
        Class<? extends Object> term72951 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term72950 = ((Class) term72951).getDeclaredField((String) "H8");
        ((Field) term72950).setAccessible(true);
        Object enum265 = ((Field) term72950).get((Object) null);
        Class<? extends Object> term73154 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term73153 = ((Class) term73154).getDeclaredField((String) "WHITE_BISHOP");
        ((Field) term73153).setAccessible(true);
        Object enum266 = ((Field) term73153).get((Object) null);
        Object term72033 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term72033, term72033.getClass(), "from", enum264);
        setField(term72033, term72033.getClass(), "to", enum265);
        setField(term72033, term72033.getClass(), "promotion", enum266);
        setField(term72033, term72033.getClass(), "san", "");
        Object term72042 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.Move"));
        setField(term72042, term72042.getClass(), "from", null);
        setField(term72042, term72042.getClass(), "to", null);
        setField(term72042, term72042.getClass(), "promotion", null);
        setField(term72042, term72042.getClass(), "san", null);
        term72001 = new LinkedList();
        ((LinkedList) term72001).add(term72004);
        ((LinkedList) term72001).add(term72033);
        ((LinkedList) term72001).add(term72042);
        ((LinkedList) term72001).add((Object)null);
        ((LinkedList) term72001).add((Object)null);
        ((LinkedList) term72001).add((Object)null);
        ((LinkedList) term72001).add((Object)null);
        ((LinkedList) term72001).add((Object)null);
        Class<? extends Object> term73382 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term73381 = ((Class) term73382).getDeclaredField((String) "WHITE");
        ((Field) term73381).setAccessible(true);
        enum267 = ((Field) term73381).get((Object) null);
        Class<? extends Object> term73584 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term73583 = ((Class) term73584).getDeclaredField((String) "F8");
        ((Field) term73583).setAccessible(true);
        enum268 = ((Field) term73583).get((Object) null);
        Class<? extends Object> term73787 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term73786 = ((Class) term73787).getDeclaredField((String) "G7");
        ((Field) term73786).setAccessible(true);
        enum269 = ((Field) term73786).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.move.MoveGenerator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.Side");
        argTypes[2] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        argTypes[3] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        Object[] args = new Object[4];
        args[0] = term72001;
        args[1] = enum267;
        args[2] = enum268;
        args[3] = enum269;
        callMethod(klass, "addPromotions", argTypes, null, args);
    }

};


