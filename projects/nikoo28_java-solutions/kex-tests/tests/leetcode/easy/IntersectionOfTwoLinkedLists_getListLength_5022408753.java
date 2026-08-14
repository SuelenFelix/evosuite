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

public class IntersectionOfTwoLinkedLists_getListLength_5022408753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term770;
     Object term771;

    public IntersectionOfTwoLinkedLists_getListLength_5022408753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term770 = newInstance(Class.forName("leetcode.easy.IntersectionOfTwoLinkedLists"));
        term771 = newInstance(Class.forName("util.ListNode"));
        Object term773 = newInstance(Class.forName("util.ListNode"));
        Object term775 = newInstance(Class.forName("util.ListNode"));
        Object term777 = newInstance(Class.forName("util.ListNode"));
        Object term779 = newInstance(Class.forName("util.ListNode"));
        setIntField(term771, term771.getClass(), "val", -1945706126);
        setIntField(term773, term773.getClass(), "val", 1152356969);
        setIntField(term775, term775.getClass(), "val", -1667990367);
        setIntField(term777, term777.getClass(), "val", -1214628358);
        setIntField(term779, term779.getClass(), "val", 1102721075);
        setField(term779, term779.getClass(), "next", null);
        setField(term777, term777.getClass(), "next", term779);
        setField(term775, term775.getClass(), "next", term777);
        setField(term773, term773.getClass(), "next", term775);
        setField(term771, term771.getClass(), "next", term773);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.IntersectionOfTwoLinkedLists");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.ListNode");
        Object[] args = new Object[1];
        args[0] = term771;
        callMethod(klass, "getListLength", argTypes, term770, args);
    }

};


