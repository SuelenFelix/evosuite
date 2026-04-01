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

public class TreeTableModel_removeVisibleNodes_157999167164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99262;
     Object term99263;

    public TreeTableModel_removeVisibleNodes_157999167164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99262 = (int[]) newIntArray(0);
        term99263 = (Object[]) newArray("java.lang.Object", 6);
        Object term99264 = newInstance(Class.forName("java.lang.Object"));
        Object term99265 = newInstance(Class.forName("java.lang.Object"));
        Object term99266 = newInstance(Class.forName("java.lang.Object"));
        Object term99267 = newInstance(Class.forName("java.lang.Object"));
        Object term99268 = newInstance(Class.forName("java.lang.Object"));
        Object term99269 = newInstance(Class.forName("java.lang.Object"));
        setElement(term99263, 0, term99264);
        setElement(term99263, 1, term99265);
        setElement(term99263, 2, term99266);
        setElement(term99263, 3, term99267);
        setElement(term99263, 4, term99268);
        setElement(term99263, 5, term99269);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term99262;
        args[1] = term99263;
        callMethod(klass, "removeVisibleNodes", argTypes, null, args);
    }

};


