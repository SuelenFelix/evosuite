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

public class TreeUtils_removeEntries_106569458118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369507;
     Object term369512;

    public TreeUtils_removeEntries_106569458118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369507 = (Object[]) newArray("java.lang.Object", 4);
        Object term369508 = newInstance(Class.forName("java.lang.Object"));
        Object term369509 = newInstance(Class.forName("java.lang.Object"));
        Object term369510 = newInstance(Class.forName("java.lang.Object"));
        Object term369511 = newInstance(Class.forName("java.lang.Object"));
        setElement(term369507, 0, term369508);
        setElement(term369507, 1, term369509);
        setElement(term369507, 2, term369510);
        setElement(term369507, 3, term369511);
        term369512 = (int[]) newIntArray(7);
        setIntElement(term369512, 0, 110611143);
        setIntElement(term369512, 1, 793381056);
        setIntElement(term369512, 2, 65007514);
        setIntElement(term369512, 3, 1731844126);
        setIntElement(term369512, 4, -861962061);
        setIntElement(term369512, 5, -1867124507);
        setIntElement(term369512, 6, 416116291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term369507;
        args[1] = term369512;
        callMethod(klass, "removeEntries", argTypes, null, args);
    }

};


