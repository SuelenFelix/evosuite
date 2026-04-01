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

public class Globals_joinLines_120713488610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172150;

    public Globals_joinLines_120713488610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172150 = (Object[]) newArray("java.lang.Object", 9);
        Object term172151 = newInstance(Class.forName("java.lang.Object"));
        Object term172152 = newInstance(Class.forName("java.lang.Object"));
        Object term172153 = newInstance(Class.forName("java.lang.Object"));
        Object term172154 = newInstance(Class.forName("java.lang.Object"));
        Object term172155 = newInstance(Class.forName("java.lang.Object"));
        Object term172156 = newInstance(Class.forName("java.lang.Object"));
        Object term172157 = newInstance(Class.forName("java.lang.Object"));
        Object term172158 = newInstance(Class.forName("java.lang.Object"));
        Object term172159 = newInstance(Class.forName("java.lang.Object"));
        setElement(term172150, 0, term172151);
        setElement(term172150, 1, term172152);
        setElement(term172150, 2, term172153);
        setElement(term172150, 3, term172154);
        setElement(term172150, 4, term172155);
        setElement(term172150, 5, term172156);
        setElement(term172150, 6, term172157);
        setElement(term172150, 7, term172158);
        setElement(term172150, 8, term172159);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.utils.Globals");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term172150;
        callMethod(klass, "joinLines", argTypes, null, args);
    }

};


