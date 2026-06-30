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

public class Parser_8_parse_16733657441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15028;

    public Parser_8_parse_16733657441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15028 = newInstance(Class.forName("io.github.janlely.jparser.Parser$8"));
        setIntField(term15028, term15028.getClass(), "val$least", -1410220680);
        setField(term15028, term15028.getClass(), "val$parser", null);
        setIntField(term15028, term15028.getClass(), "val$most", 389427431);
        setBooleanField(term15028, term15028.getClass(), "val$greedy", true);
        setBooleanField(term15028, term15028.getClass(), "val$keepStopResult", true);
        setField(term15028, term15028.getClass(), "this$0", null);
        setBooleanField(term15028, term15028.getClass(), "ignore", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.Parser$8");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.janlely.jparser.IBuffer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "parse", argTypes, term15028, args);
    }

};


