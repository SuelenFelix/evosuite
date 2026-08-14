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
     Object term80758;

    public TreeUtils_TreeTableRow_getParentId_4774981174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80758 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeUtils$TreeTableRow"));
        Object term80759 = newInstance(Class.forName("java.lang.Object"));
        Object term80760 = newInstance(Class.forName("java.lang.Object"));
        Object[] term80761 = (Object[]) newArray("java.lang.Object", 2);
        Object term80762 = newInstance(Class.forName("java.lang.Object"));
        Object term80763 = newInstance(Class.forName("java.lang.Object"));
        setField(term80758, term80758.getClass(), "id", term80759);
        setField(term80758, term80758.getClass(), "parentId", term80760);
        setElement(term80761, 0, term80762);
        setElement(term80761, 1, term80763);
        setField(term80758, term80758.getClass(), "otherColumns", term80761);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeUtils$TreeTableRow");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParentId", argTypes, term80758, args);
    }

};


