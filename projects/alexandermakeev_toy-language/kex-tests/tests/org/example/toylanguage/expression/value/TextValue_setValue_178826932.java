package org.example.toylanguage.expression.value;

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
import static org.example.toylanguage.expression.value.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class TextValue_setValue_178826932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106;
     Object term119;
     Object term121;

    public TextValue_setValue_178826932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106 = newInstance(Class.forName("org.example.toylanguage.expression.value.TextValue"));
        setField(term106, term106.getClass(), "value", "MuLcgQHgqz");
        term119 = new Integer(391863371);
        term121 = newInstance(Class.forName("org.example.toylanguage.expression.value.Value"));
        Object term122 = newInstance(Class.forName("java.lang.Object"));
        setField(term121, term121.getClass(), "value", term122);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.value.TextValue");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.example.toylanguage.expression.value.Value");
        Object[] args = new Object[2];
        args[0] = term119;
        args[1] = term121;
        callMethod(klass, "setValue", argTypes, term106, args);
    }

};


