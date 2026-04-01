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

public class TreeUtils_TreeTableRow_getParentId_4774981174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81439;

    public TreeUtils_TreeTableRow_getParentId_4774981174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81439 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeUtils$TreeTableRow"));
        Object term81440 = newInstance(Class.forName("java.lang.Object"));
        Object term81441 = newInstance(Class.forName("java.lang.Object"));
        Object[] term81442 = (Object[]) newArray("java.lang.Object", 5);
        Object term81443 = newInstance(Class.forName("java.lang.Object"));
        Object term81444 = newInstance(Class.forName("java.lang.Object"));
        Object term81445 = newInstance(Class.forName("java.lang.Object"));
        Object term81446 = newInstance(Class.forName("java.lang.Object"));
        Object term81447 = newInstance(Class.forName("java.lang.Object"));
        setField(term81439, term81439.getClass(), "id", term81440);
        setField(term81439, term81439.getClass(), "parentId", term81441);
        setElement(term81442, 0, term81443);
        setElement(term81442, 1, term81444);
        setElement(term81442, 2, term81445);
        setElement(term81442, 3, term81446);
        setElement(term81442, 4, term81447);
        setField(term81439, term81439.getClass(), "otherColumns", term81442);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeUtils$TreeTableRow");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParentId", argTypes, term81439, args);
    }

};


