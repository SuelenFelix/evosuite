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
     Object term81410;
     Object term81411;
     Object term81412;

    public TreeUtils_TreeTableRow_init_12650823241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81410 = newInstance(Class.forName("java.lang.Object"));
        term81411 = newInstance(Class.forName("java.lang.Object"));
        term81412 = (Object[]) newArray("java.lang.Object", 9);
        Object term81413 = newInstance(Class.forName("java.lang.Object"));
        Object term81414 = newInstance(Class.forName("java.lang.Object"));
        Object term81415 = newInstance(Class.forName("java.lang.Object"));
        Object term81416 = newInstance(Class.forName("java.lang.Object"));
        Object term81417 = newInstance(Class.forName("java.lang.Object"));
        Object term81418 = newInstance(Class.forName("java.lang.Object"));
        Object term81419 = newInstance(Class.forName("java.lang.Object"));
        Object term81420 = newInstance(Class.forName("java.lang.Object"));
        Object term81421 = newInstance(Class.forName("java.lang.Object"));
        setElement(term81412, 0, term81413);
        setElement(term81412, 1, term81414);
        setElement(term81412, 2, term81415);
        setElement(term81412, 3, term81416);
        setElement(term81412, 4, term81417);
        setElement(term81412, 5, term81418);
        setElement(term81412, 6, term81419);
        setElement(term81412, 7, term81420);
        setElement(term81412, 8, term81421);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeUtils$TreeTableRow");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term81410;
        args[1] = term81411;
        args[2] = term81412;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


