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

public class TreeUtils_CSVTableHeaderInfo_getIdColumnIndex_16957733032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1711;

    public TreeUtils_CSVTableHeaderInfo_getIdColumnIndex_16957733032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1711 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeUtils$CSVTableHeaderInfo"));
        Object[] term1712 = (Object[]) newArray("java.lang.Object", 1);
        Object term1713 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1712, 0, term1713);
        setField(term1711, term1711.getClass(), "headers", term1712);
        setIntField(term1711, term1711.getClass(), "idColumnIndex", 493620644);
        setIntField(term1711, term1711.getClass(), "parentIdColumnIndex", 1328271830);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeUtils$CSVTableHeaderInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIdColumnIndex", argTypes, term1711, args);
    }

};


