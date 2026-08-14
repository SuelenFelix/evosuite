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
import java.lang.Integer;

public class ReverseLinkedListII_reverseBetween_19686655223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1130;
     Object term1131;
     Object term1133;

    public ReverseLinkedListII_reverseBetween_19686655223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1130 = newInstance(Class.forName("leetcode.medium.ReverseLinkedListII"));
        term1131 = new Integer(0);
        term1133 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.ReverseLinkedListII");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("util.ListNode");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term1131;
        args[2] = term1133;
        callMethod(klass, "reverseBetween", argTypes, term1130, args);
    }

};


