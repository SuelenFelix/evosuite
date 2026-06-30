package io.github.janlely.jparser;

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
import static io.github.janlely.jparser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Integer;

public class Result_init_196591527013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14606;
     Object term14630;
     Object term14632;

    public Result_init_196591527013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term14609 = newInstance(Class.forName("java.lang.Object"));
        Object term14611 = newInstance(Class.forName("java.lang.Object"));
        Object term14613 = newInstance(Class.forName("java.lang.Object"));
        term14606 = new LinkedList();
        ((LinkedList) term14606).add(term14609);
        ((LinkedList) term14606).add(term14611);
        ((LinkedList) term14606).add(term14613);
        ((LinkedList) term14606).add((Object)null);
        ((LinkedList) term14606).add((Object)null);
        term14630 = new Integer(663292551);
        term14632 = new Integer(-1885090354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.Result");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term14606;
        args[1] = "EAIAAStlTz";
        args[2] = term14630;
        args[3] = term14632;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


