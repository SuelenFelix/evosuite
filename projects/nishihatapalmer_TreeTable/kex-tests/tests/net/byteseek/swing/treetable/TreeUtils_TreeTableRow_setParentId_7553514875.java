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

public class TreeUtils_TreeTableRow_setParentId_7553514875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81448;
     Object term81454;

    public TreeUtils_TreeTableRow_setParentId_7553514875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81448 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeUtils$TreeTableRow"));
        Object term81449 = newInstance(Class.forName("java.lang.Object"));
        Object term81450 = newInstance(Class.forName("java.lang.Object"));
        Object[] term81451 = (Object[]) newArray("java.lang.Object", 2);
        Object term81452 = newInstance(Class.forName("java.lang.Object"));
        Object term81453 = newInstance(Class.forName("java.lang.Object"));
        setField(term81448, term81448.getClass(), "id", term81449);
        setField(term81448, term81448.getClass(), "parentId", term81450);
        setElement(term81451, 0, term81452);
        setElement(term81451, 1, term81453);
        setField(term81448, term81448.getClass(), "otherColumns", term81451);
        term81454 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeUtils$TreeTableRow");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term81454;
        callMethod(klass, "setParentId", argTypes, term81448, args);
    }

};


