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

public class TreeUtils_TreeTableRow_setRowData_11183824607 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81462;
     Object term81467;

    public TreeUtils_TreeTableRow_setRowData_11183824607() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81462 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeUtils$TreeTableRow"));
        Object term81463 = newInstance(Class.forName("java.lang.Object"));
        Object term81464 = newInstance(Class.forName("java.lang.Object"));
        Object[] term81465 = (Object[]) newArray("java.lang.Object", 1);
        Object term81466 = newInstance(Class.forName("java.lang.Object"));
        setField(term81462, term81462.getClass(), "id", term81463);
        setField(term81462, term81462.getClass(), "parentId", term81464);
        setElement(term81465, 0, term81466);
        setField(term81462, term81462.getClass(), "otherColumns", term81465);
        term81467 = (Object[]) newArray("java.lang.Object", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeUtils$TreeTableRow");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term81467;
        callMethod(klass, "setRowData", argTypes, term81462, args);
    }

};


