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
     Object term767;

    public Globals_joinLines_7822553699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term767 = (Object[]) newArray("java.lang.Object", 6);
        Object term768 = newInstance(Class.forName("java.lang.Object"));
        Object term769 = newInstance(Class.forName("java.lang.Object"));
        Object term770 = newInstance(Class.forName("java.lang.Object"));
        Object term771 = newInstance(Class.forName("java.lang.Object"));
        Object term772 = newInstance(Class.forName("java.lang.Object"));
        Object term773 = newInstance(Class.forName("java.lang.Object"));
        setElement(term767, 0, term768);
        setElement(term767, 1, term769);
        setElement(term767, 2, term770);
        setElement(term767, 3, term771);
        setElement(term767, 4, term772);
        setElement(term767, 5, term773);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.utils.Globals");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = "MjGYSRKTNF";
        args[1] = term767;
        callMethod(klass, "joinLines", argTypes, null, args);
    }

};


