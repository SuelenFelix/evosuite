package io.github.janlely.jparser.comb;

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
import static io.github.janlely.jparser.comb.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.util.LinkedList;
import java.lang.Object;

public class BacktraceParser_init_8912786634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term618;
     Object term620;

    public BacktraceParser_init_8912786634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term618 = new Boolean(true);
        term620 = new LinkedList();
        ((LinkedList) term620).add((Object)null);
        ((LinkedList) term620).add((Object)null);
        ((LinkedList) term620).add((Object)null);
        ((LinkedList) term620).add((Object)null);
        ((LinkedList) term620).add((Object)null);
        ((LinkedList) term620).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.comb.BacktraceParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("io.github.janlely.jparser.Parser");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = term618;
        args[1] = null;
        args[2] = term620;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


