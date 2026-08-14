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
import java.lang.Object;
import java.util.ArrayList;

public class PermutationsII_backtrack_13880057432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3499;
     Object term3500;
     Object term3520;
     Object term3524;
     Object term3531;

    public PermutationsII_backtrack_13880057432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3499 = newInstance(Class.forName("leetcode.medium.PermutationsII"));
        LinkedList term3503 = new LinkedList();
        LinkedList term3507 = new LinkedList();
        LinkedList term3511 = new LinkedList();
        term3500 = new LinkedList();
        ((LinkedList) term3500).add(term3503);
        ((LinkedList) term3500).add(term3507);
        ((LinkedList) term3500).add(term3511);
        ((LinkedList) term3500).add((Object)null);
        ((LinkedList) term3500).add((Object)null);
        term3520 = new ArrayList();
        term3524 = (int[]) newIntArray(6);
        setIntElement(term3524, 0, -1489991025);
        setIntElement(term3524, 1, -1542979444);
        setIntElement(term3524, 2, -1130401612);
        setIntElement(term3524, 3, -316771104);
        setIntElement(term3524, 4, -1374527319);
        setIntElement(term3524, 5, -1735276919);
        term3531 = (boolean[]) newBooleanArray(4);
        setBooleanElement(term3531, 3, true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.PermutationsII");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.util.ArrayList");
        argTypes[2] = Array.newInstance(int.class, 0).getClass();
        argTypes[3] = Array.newInstance(boolean.class, 0).getClass();
        Object[] args = new Object[4];
        args[0] = term3500;
        args[1] = term3520;
        args[2] = term3524;
        args[3] = term3531;
        callMethod(klass, "backtrack", argTypes, term3499, args);
    }

};


