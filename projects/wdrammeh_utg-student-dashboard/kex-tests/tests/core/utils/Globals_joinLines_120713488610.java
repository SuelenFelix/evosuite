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
     Object term784;

    public Globals_joinLines_120713488610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term784 = (Object[]) newArray("java.lang.Object", 7);
        Object term785 = newInstance(Class.forName("java.lang.Object"));
        Object term786 = newInstance(Class.forName("java.lang.Object"));
        Object term787 = newInstance(Class.forName("java.lang.Object"));
        Object term788 = newInstance(Class.forName("java.lang.Object"));
        Object term789 = newInstance(Class.forName("java.lang.Object"));
        Object term790 = newInstance(Class.forName("java.lang.Object"));
        Object term791 = newInstance(Class.forName("java.lang.Object"));
        setElement(term784, 0, term785);
        setElement(term784, 1, term786);
        setElement(term784, 2, term787);
        setElement(term784, 3, term788);
        setElement(term784, 4, term789);
        setElement(term784, 5, term790);
        setElement(term784, 6, term791);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.utils.Globals");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term784;
        callMethod(klass, "joinLines", argTypes, null, args);
    }

};


