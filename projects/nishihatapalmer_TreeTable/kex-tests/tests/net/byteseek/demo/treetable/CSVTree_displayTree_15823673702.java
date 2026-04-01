package net.byteseek.demo.treetable;

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
import static net.byteseek.demo.treetable.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CSVTree_displayTree_15823673702 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75;
     Object term83;

    public CSVTree_displayTree_15823673702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75 = newInstance(Class.forName("javax.swing.tree.DefaultMutableTreeNode"));
        Object term76 = newInstance(Class.forName("java.util.Vector"));
        Object[] term77 = (Object[]) newArray("java.lang.Object", 10);
        Object term81 = newInstance(Class.forName("java.lang.Object"));
        setField(term75, term75.getClass(), "parent", null);
        setField(term76, term76.getClass(), "elementData", term77);
        setIntField(term76, term76.getClass(), "elementCount", 3);
        setIntField(term76, term76.getClass(), "capacityIncrement", 0);
        setIntField(term76, term76.getClass(), "modCount", 3);
        setField(term75, term75.getClass(), "children", term76);
        setField(term75, term75.getClass(), "userObject", term81);
        setBooleanField(term75, term75.getClass(), "allowsChildren", true);
        term83 = (Object[]) newArray("java.lang.Object", 4);
        Object term84 = newInstance(Class.forName("java.lang.Object"));
        Object term85 = newInstance(Class.forName("java.lang.Object"));
        Object term86 = newInstance(Class.forName("java.lang.Object"));
        Object term87 = newInstance(Class.forName("java.lang.Object"));
        setElement(term83, 0, term84);
        setElement(term83, 1, term85);
        setElement(term83, 2, term86);
        setElement(term83, 3, term87);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.CSVTree");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("javax.swing.tree.DefaultMutableTreeNode");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term75;
        args[1] = term83;
        callMethod(klass, "displayTree", argTypes, null, args);
    }

};


