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

public class TreeUtils_CSVTableHeaderInfo_getParentIdColumnIndex_7962245133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1716;

    public TreeUtils_CSVTableHeaderInfo_getParentIdColumnIndex_7962245133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1716 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeUtils$CSVTableHeaderInfo"));
        Object[] term1717 = (Object[]) newArray("java.lang.Object", 2);
        Object term1718 = newInstance(Class.forName("java.lang.Object"));
        Object term1719 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1717, 0, term1718);
        setElement(term1717, 1, term1719);
        setField(term1716, term1716.getClass(), "headers", term1717);
        setIntField(term1716, term1716.getClass(), "idColumnIndex", 1596070772);
        setIntField(term1716, term1716.getClass(), "parentIdColumnIndex", 97029295);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeUtils$CSVTableHeaderInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParentIdColumnIndex", argTypes, term1716, args);
    }

};


