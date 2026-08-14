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
import java.lang.Object;
import java.util.HashMap;

public class ClassValue_getRelation_2499852621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284;

    public ClassValue_getRelation_2499852621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term286 = new HashMap();
        HashMap term295 = new HashMap();
        HashMap term302 = new HashMap();
        HashMap term308 = new HashMap();
        term284 = newInstance(Class.forName("org.example.toylanguage.expression.value.ClassValue"));
        Object term285 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term294 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term301 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term307 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        setField(term285, term285.getClass(), "variables", term286);
        setField(term294, term294.getClass(), "variables", term295);
        setField(term301, term301.getClass(), "variables", term302);
        setField(term307, term307.getClass(), "variables", null);
        setField(term307, term307.getClass(), "parent", null);
        setField(term301, term301.getClass(), "parent", term307);
        setField(term294, term294.getClass(), "parent", term301);
        setField(term285, term285.getClass(), "parent", term294);
        setField(term284, term284.getClass(), "memoryScope", term285);
        setField(term284, term284.getClass(), "relations", term308);
        setField(term284, term284.getClass(), "value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.value.ClassValue");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tPlsykYBqO";
        callMethod(klass, "getRelation", argTypes, term284, args);
    }

};


