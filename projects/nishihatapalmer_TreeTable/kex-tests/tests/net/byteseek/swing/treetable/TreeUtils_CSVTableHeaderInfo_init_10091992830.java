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
import java.lang.Object;
import java.lang.Integer;

public class TreeUtils_CSVTableHeaderInfo_init_10091992830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1693;
     Object term1699;
     Object term1701;

    public TreeUtils_CSVTableHeaderInfo_init_10091992830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1693 = (Object[]) newArray("java.lang.Object", 5);
        Object term1694 = newInstance(Class.forName("java.lang.Object"));
        Object term1695 = newInstance(Class.forName("java.lang.Object"));
        Object term1696 = newInstance(Class.forName("java.lang.Object"));
        Object term1697 = newInstance(Class.forName("java.lang.Object"));
        Object term1698 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1693, 0, term1694);
        setElement(term1693, 1, term1695);
        setElement(term1693, 2, term1696);
        setElement(term1693, 3, term1697);
        setElement(term1693, 4, term1698);
        term1699 = new Integer(-1048298087);
        term1701 = new Integer(292681826);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeUtils$CSVTableHeaderInfo");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term1693;
        args[1] = term1699;
        args[2] = term1701;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


