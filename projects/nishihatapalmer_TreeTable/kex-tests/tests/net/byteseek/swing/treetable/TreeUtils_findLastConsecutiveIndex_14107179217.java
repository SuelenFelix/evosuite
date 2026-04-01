package net.byteseek.swing.treetable;

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
import static net.byteseek.swing.treetable.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class TreeUtils_findLastConsecutiveIndex_14107179217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369486;
     Object term369488;

    public TreeUtils_findLastConsecutiveIndex_14107179217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369486 = new Integer(-1599482698);
        term369488 = (int[]) newIntArray(9);
        setIntElement(term369488, 0, -370600915);
        setIntElement(term369488, 1, -311572875);
        setIntElement(term369488, 2, 355595594);
        setIntElement(term369488, 3, 842697786);
        setIntElement(term369488, 4, 1685808201);
        setIntElement(term369488, 5, 1565114969);
        setIntElement(term369488, 6, 806831765);
        setIntElement(term369488, 7, -1445658721);
        setIntElement(term369488, 8, 872435483);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term369486;
        args[1] = term369488;
        callMethod(klass, "findLastConsecutiveIndex", argTypes, null, args);
    }

};


