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

public class TreeUtils_CSVTableHeaderInfo_getHeaders_10120689611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1703;

    public TreeUtils_CSVTableHeaderInfo_getHeaders_10120689611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1703 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeUtils$CSVTableHeaderInfo"));
        Object[] term1704 = (Object[]) newArray("java.lang.Object", 4);
        Object term1705 = newInstance(Class.forName("java.lang.Object"));
        Object term1706 = newInstance(Class.forName("java.lang.Object"));
        Object term1707 = newInstance(Class.forName("java.lang.Object"));
        Object term1708 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1704, 0, term1705);
        setElement(term1704, 1, term1706);
        setElement(term1704, 2, term1707);
        setElement(term1704, 3, term1708);
        setField(term1703, term1703.getClass(), "headers", term1704);
        setIntField(term1703, term1703.getClass(), "idColumnIndex", 458147407);
        setIntField(term1703, term1703.getClass(), "parentIdColumnIndex", -184153539);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeUtils$CSVTableHeaderInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHeaders", argTypes, term1703, args);
    }

};


