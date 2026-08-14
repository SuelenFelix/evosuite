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

public class TreeUtils_TreeTableRow_init_12650823241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80728;
     Object term80729;
     Object term80730;

    public TreeUtils_TreeTableRow_init_12650823241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80728 = newInstance(Class.forName("java.lang.Object"));
        term80729 = newInstance(Class.forName("java.lang.Object"));
        term80730 = (Object[]) newArray("java.lang.Object", 3);
        Object term80731 = newInstance(Class.forName("java.lang.Object"));
        Object term80732 = newInstance(Class.forName("java.lang.Object"));
        Object term80733 = newInstance(Class.forName("java.lang.Object"));
        setElement(term80730, 0, term80731);
        setElement(term80730, 1, term80732);
        setElement(term80730, 2, term80733);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeUtils$TreeTableRow");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term80728;
        args[1] = term80729;
        args[2] = term80730;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


