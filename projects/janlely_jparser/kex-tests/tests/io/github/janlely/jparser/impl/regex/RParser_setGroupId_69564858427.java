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
import java.lang.Integer;

public class RParser_setGroupId_69564858427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15677;
     Object term15680;

    public RParser_setGroupId_69564858427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15677 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser"));
        setField(term15677, term15677.getClass(), "type", null);
        setIntField(term15677, term15677.getClass(), "quoteId", 0);
        setIntField(term15677, term15677.getClass(), "groupId", 0);
        setField(term15677, term15677.getClass(), "parser", null);
        setField(term15677, term15677.getClass(), "func", null);
        term15680 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term15680;
        callMethod(klass, "setGroupId", argTypes, term15677, args);
    }

};


