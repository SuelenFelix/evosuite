package leetcode.hard;

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
import static leetcode.hard.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class WordLadder_ladderLength_15734477011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252;
     Object term277;

    public WordLadder_ladderLength_15734477011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term252 = newInstance(Class.forName("leetcode.hard.WordLadder"));
        term277 = new LinkedList();
        ((LinkedList) term277).add("xxtlPwDYFs");
        ((LinkedList) term277).add("jJCZpVmanW");
        ((LinkedList) term277).add("");
        ((LinkedList) term277).add((Object)null);
        ((LinkedList) term277).add((Object)null);
        ((LinkedList) term277).add((Object)null);
        ((LinkedList) term277).add((Object)null);
        ((LinkedList) term277).add((Object)null);
        ((LinkedList) term277).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.hard.WordLadder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = "sjlJAEtRrb";
        args[1] = "MuLcgQHgqz";
        args[2] = term277;
        callMethod(klass, "ladderLength", argTypes, term252, args);
    }

};


