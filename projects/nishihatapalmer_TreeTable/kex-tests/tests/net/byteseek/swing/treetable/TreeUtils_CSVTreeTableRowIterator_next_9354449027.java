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

public class TreeUtils_CSVTreeTableRowIterator_next_9354449027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term311;

    public TreeUtils_CSVTreeTableRowIterator_next_9354449027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term311 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeUtils$CSVTreeTableRowIterator"));
        setField(term311, term311.getClass(), "line", null);
        setField(term311, term311.getClass(), "separatorChar", null);
        setIntField(term311, term311.getClass(), "idColumnIndex", 0);
        setIntField(term311, term311.getClass(), "parentIdColumnIndex", 0);
        setField(term311, term311.getClass(), "reader", null);
        setField(term311, term311.getClass(), "row", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeUtils$CSVTreeTableRowIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "next", argTypes, term311, args);
    }

};


