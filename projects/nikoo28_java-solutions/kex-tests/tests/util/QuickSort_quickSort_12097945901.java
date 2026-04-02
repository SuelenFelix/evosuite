package util;

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
import static util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class QuickSort_quickSort_12097945901 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2675;
     Object term2683;
     Object term2685;

    public QuickSort_quickSort_12097945901() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2675 = (int[]) newIntArray(7);
        setIntElement(term2675, 0, 1292332296);
        setIntElement(term2675, 1, -1415256843);
        setIntElement(term2675, 2, 612177768);
        setIntElement(term2675, 3, -1626451656);
        setIntElement(term2675, 4, 173952451);
        setIntElement(term2675, 5, -1972033388);
        setIntElement(term2675, 6, -1005024758);
        term2683 = new Integer(2634669);
        term2685 = new Integer(-1912429941);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.QuickSort");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term2675;
        args[1] = term2683;
        args[2] = term2685;
        callMethod(klass, "quickSort", argTypes, null, args);
    }

};


