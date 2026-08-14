package leetcode.medium;

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
import static leetcode.medium.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SearchA2DMatrixII_main_20214240612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term850;

    public SearchA2DMatrixII_main_20214240612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term850 = (Object[]) newArray("java.lang.String", 7);
        setElement(term850, 0, "SzjVpOQTyS");
        setElement(term850, 1, "MjGYSRKTNF");
        setElement(term850, 2, "hRNSzYYIrc");
        setElement(term850, 3, "RMFIsYGgne");
        setElement(term850, 4, "NRdvgJlhkX");
        setElement(term850, 5, "uuaPigETmJ");
        setElement(term850, 6, "MxlszYVzRf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.SearchA2DMatrixII");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term850;
        callMethod(klass, "main", argTypes, null, args);
    }

};


