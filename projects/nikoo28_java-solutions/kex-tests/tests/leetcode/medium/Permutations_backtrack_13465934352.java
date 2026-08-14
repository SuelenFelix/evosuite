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
import java.lang.Object;
import java.util.ArrayList;

public class Permutations_backtrack_13465934352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3721;
     Object term3722;
     Object term3776;
     Object term3780;

    public Permutations_backtrack_13465934352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3721 = newInstance(Class.forName("leetcode.medium.Permutations"));
        Integer term3728 = new Integer(-117576464);
        Integer term3731 = new Integer(-1007160944);
        LinkedList term3725 = new LinkedList();
        ((LinkedList) term3725).add(term3728);
        ((LinkedList) term3725).add(term3731);
        Integer term3738 = new Integer(1135664017);
        LinkedList term3735 = new LinkedList();
        ((LinkedList) term3735).add(term3738);
        ((LinkedList) term3735).add((Object)null);
        ((LinkedList) term3735).add((Object)null);
        ((LinkedList) term3735).add((Object)null);
        ((LinkedList) term3735).add((Object)null);
        LinkedList term3745 = new LinkedList();
        term3722 = new LinkedList();
        ((LinkedList) term3722).add(term3725);
        ((LinkedList) term3722).add(term3735);
        ((LinkedList) term3722).add(term3745);
        ((LinkedList) term3722).add((Object)null);
        ((LinkedList) term3722).add((Object)null);
        ((LinkedList) term3722).add((Object)null);
        term3776 = new ArrayList();
        term3780 = (int[]) newIntArray(9);
        setIntElement(term3780, 0, 760218111);
        setIntElement(term3780, 1, -1986366126);
        setIntElement(term3780, 2, -1963228619);
        setIntElement(term3780, 3, -709868952);
        setIntElement(term3780, 4, 847207929);
        setIntElement(term3780, 5, -1665928103);
        setIntElement(term3780, 6, 1574458332);
        setIntElement(term3780, 7, -975856245);
        setIntElement(term3780, 8, -1023366103);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.Permutations");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.util.ArrayList");
        argTypes[2] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term3722;
        args[1] = term3776;
        args[2] = term3780;
        callMethod(klass, "backtrack", argTypes, term3721, args);
    }

};


