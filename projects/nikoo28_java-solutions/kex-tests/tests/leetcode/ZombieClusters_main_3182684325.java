package leetcode;

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
import static leetcode.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ZombieClusters_main_3182684325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9714;

    public ZombieClusters_main_3182684325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9714 = (Object[]) newArray("java.lang.String", 8);
        setElement(term9714, 0, "GZdcJyZntS");
        setElement(term9714, 1, "OIHoJeysUi");
        setElement(term9714, 2, "WXMWFDGcLB");
        setElement(term9714, 3, "wKWbJssZuG");
        setElement(term9714, 4, "NzBMMhkhpT");
        setElement(term9714, 5, "qCpEbQDHdF");
        setElement(term9714, 6, "AHbZyFOmlo");
        setElement(term9714, 7, "TwfWVQGiIj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.ZombieClusters");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term9714;
        callMethod(klass, "main", argTypes, null, args);
    }

};


