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

public class Globals_joinLines_7822553699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172131;

    public Globals_joinLines_7822553699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172131 = (Object[]) newArray("java.lang.Object", 8);
        Object term172132 = newInstance(Class.forName("java.lang.Object"));
        Object term172133 = newInstance(Class.forName("java.lang.Object"));
        Object term172134 = newInstance(Class.forName("java.lang.Object"));
        Object term172135 = newInstance(Class.forName("java.lang.Object"));
        Object term172136 = newInstance(Class.forName("java.lang.Object"));
        Object term172137 = newInstance(Class.forName("java.lang.Object"));
        Object term172138 = newInstance(Class.forName("java.lang.Object"));
        Object term172139 = newInstance(Class.forName("java.lang.Object"));
        setElement(term172131, 0, term172132);
        setElement(term172131, 1, term172133);
        setElement(term172131, 2, term172134);
        setElement(term172131, 3, term172135);
        setElement(term172131, 4, term172136);
        setElement(term172131, 5, term172137);
        setElement(term172131, 6, term172138);
        setElement(term172131, 7, term172139);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.utils.Globals");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = "MCMCjxXzjw";
        args[1] = term172131;
        callMethod(klass, "joinLines", argTypes, null, args);
    }

};


