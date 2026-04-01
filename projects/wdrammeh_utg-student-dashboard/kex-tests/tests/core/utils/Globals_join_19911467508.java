package core.utils;

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
import static core.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Globals_join_19911467508 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172103;

    public Globals_join_19911467508() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172103 = (Object[]) newArray("java.lang.Object", 5);
        Object term172104 = newInstance(Class.forName("java.lang.Object"));
        Object term172105 = newInstance(Class.forName("java.lang.Object"));
        Object term172106 = newInstance(Class.forName("java.lang.Object"));
        Object term172107 = newInstance(Class.forName("java.lang.Object"));
        Object term172108 = newInstance(Class.forName("java.lang.Object"));
        setElement(term172103, 0, term172104);
        setElement(term172103, 1, term172105);
        setElement(term172103, 2, term172106);
        setElement(term172103, 3, term172107);
        setElement(term172103, 4, term172108);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.utils.Globals");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = "olYpqbolWL";
        args[1] = term172103;
        callMethod(klass, "join", argTypes, null, args);
    }

};


