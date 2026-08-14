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

public class GenerateParantheses_backtrack_4849818972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2446;
     Object term2447;
     Object term2462;
     Object term2464;
     Object term2466;

    public GenerateParantheses_backtrack_4849818972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2446 = newInstance(Class.forName("leetcode.medium.GenerateParantheses"));
        term2447 = new LinkedList();
        term2462 = new Integer(-1397251956);
        term2464 = new Integer(-796934571);
        term2466 = new Integer(405295896);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.GenerateParantheses");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = term2447;
        args[1] = "flxyYxBRtu";
        args[2] = term2462;
        args[3] = term2464;
        args[4] = term2466;
        callMethod(klass, "backtrack", argTypes, term2446, args);
    }

};


