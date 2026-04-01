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

public class TreeUtils_TreeTableRow_setId_9979376553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81433;
     Object term81438;

    public TreeUtils_TreeTableRow_setId_9979376553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81433 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeUtils$TreeTableRow"));
        Object term81434 = newInstance(Class.forName("java.lang.Object"));
        Object term81435 = newInstance(Class.forName("java.lang.Object"));
        Object[] term81436 = (Object[]) newArray("java.lang.Object", 1);
        Object term81437 = newInstance(Class.forName("java.lang.Object"));
        setField(term81433, term81433.getClass(), "id", term81434);
        setField(term81433, term81433.getClass(), "parentId", term81435);
        setElement(term81436, 0, term81437);
        setField(term81433, term81433.getClass(), "otherColumns", term81436);
        term81438 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeUtils$TreeTableRow");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term81438;
        callMethod(klass, "setId", argTypes, term81433, args);
    }

};


