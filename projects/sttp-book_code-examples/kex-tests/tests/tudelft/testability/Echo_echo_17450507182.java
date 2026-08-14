package tudelft.testability;

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
import static tudelft.testability.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Echo_echo_17450507182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100;
     Object term104;

    public Echo_echo_17450507182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100 = newInstance(Class.forName("tudelft.testability.Echo"));
        Object term103 = newInstance(Class.forName("tudelft.testability.SystemWrapper"));
        setField(term100, term100.getClass(), "result", "");
        setField(term100, term100.getClass(), "system", term103);
        term104 = (Object[]) newArray("java.lang.String", 9);
        setElement(term104, 0, "SzjVpOQTyS");
        setElement(term104, 1, "MjGYSRKTNF");
        setElement(term104, 2, "hRNSzYYIrc");
        setElement(term104, 3, "RMFIsYGgne");
        setElement(term104, 4, "NRdvgJlhkX");
        setElement(term104, 5, "uuaPigETmJ");
        setElement(term104, 6, "MxlszYVzRf");
        setElement(term104, 7, "LQFpaHEwXR");
        setElement(term104, 8, "oVcInYnLWB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tudelft.testability.Echo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term104;
        callMethod(klass, "echo", argTypes, term100, args);
    }

};


