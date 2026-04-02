package leetcode.easy;

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
import static leetcode.easy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ReorderDataInLogFiles_reorderLogFiles_9974126671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1661;
     Object term1662;

    public ReorderDataInLogFiles_reorderLogFiles_9974126671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1661 = newInstance(Class.forName("leetcode.easy.ReorderDataInLogFiles"));
        term1662 = (Object[]) newArray("java.lang.String", 5);
        setElement(term1662, 0, "Ghbwtircqb");
        setElement(term1662, 1, "xrwlQZdwCp");
        setElement(term1662, 2, "IDCWpPLRkE");
        setElement(term1662, 3, "nyiiPDVjAc");
        setElement(term1662, 4, "aKnKipADSo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.ReorderDataInLogFiles");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1662;
        callMethod(klass, "reorderLogFiles", argTypes, term1661, args);
    }

};


