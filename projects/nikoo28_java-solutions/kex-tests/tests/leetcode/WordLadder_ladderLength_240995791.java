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
import java.util.LinkedList;
import java.lang.Object;

public class WordLadder_ladderLength_240995791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2357;
     Object term2382;

    public WordLadder_ladderLength_240995791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2357 = newInstance(Class.forName("leetcode.WordLadder"));
        term2382 = new LinkedList();
        ((LinkedList) term2382).add("bWWfajKbEX");
        ((LinkedList) term2382).add("cAPeiZHKGJ");
        ((LinkedList) term2382).add("");
        ((LinkedList) term2382).add((Object)null);
        ((LinkedList) term2382).add((Object)null);
        ((LinkedList) term2382).add((Object)null);
        ((LinkedList) term2382).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.WordLadder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = "VgZnGoIFwQ";
        args[1] = "jUbSRrkrYZ";
        args[2] = term2382;
        callMethod(klass, "ladderLength", argTypes, term2357, args);
    }

};


