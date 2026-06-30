package io.github.janlely.jparser.impl.regex;

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
import static io.github.janlely.jparser.impl.regex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class RParser_toString_106352310916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15331;

    public RParser_toString_106352310916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15345 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Field term15344 = ((Class) term15345).getDeclaredField((String) "PARSER");
        ((Field) term15344).setAccessible(true);
        Object enum50 = ((Field) term15344).get((Object) null);
        term15331 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser"));
        setField(term15331, term15331.getClass(), "type", enum50);
        setIntField(term15331, term15331.getClass(), "quoteId", -1786399638);
        setIntField(term15331, term15331.getClass(), "groupId", 2055867847);
        setField(term15331, term15331.getClass(), "parser", null);
        setField(term15331, term15331.getClass(), "func", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term15331, args);
    }

};


