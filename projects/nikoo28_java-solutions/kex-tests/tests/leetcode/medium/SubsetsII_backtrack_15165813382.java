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
import java.util.LinkedList;
import java.lang.Integer;

public class SubsetsII_backtrack_15165813382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2864;
     Object term2865;
     Object term2868;
     Object term2871;
     Object term2881;

    public SubsetsII_backtrack_15165813382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2864 = newInstance(Class.forName("leetcode.medium.SubsetsII"));
        term2865 = new LinkedList();
        term2868 = new LinkedList();
        term2871 = (int[]) newIntArray(9);
        setIntElement(term2871, 0, -1541981599);
        setIntElement(term2871, 1, 1605456363);
        setIntElement(term2871, 2, 2059896693);
        setIntElement(term2871, 3, 2109912812);
        setIntElement(term2871, 4, 1841286431);
        setIntElement(term2871, 5, -1723168189);
        setIntElement(term2871, 6, -675283917);
        setIntElement(term2871, 7, -2093862988);
        setIntElement(term2871, 8, 1337828646);
        term2881 = new Integer(532666604);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.SubsetsII");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Array.newInstance(int.class, 0).getClass();
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term2865;
        args[1] = term2868;
        args[2] = term2871;
        args[3] = term2881;
        callMethod(klass, "backtrack", argTypes, term2864, args);
    }

};


