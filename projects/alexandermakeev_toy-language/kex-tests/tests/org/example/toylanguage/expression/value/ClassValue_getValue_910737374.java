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

public class ClassValue_getValue_910737374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term430;

    public ClassValue_getValue_910737374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term432 = new HashMap();
        HashMap term441 = new HashMap();
        HashMap term448 = new HashMap();
        HashMap term454 = new HashMap();
        term430 = newInstance(Class.forName("org.example.toylanguage.expression.value.ClassValue"));
        Object term431 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term440 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term447 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term453 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        setField(term431, term431.getClass(), "variables", term432);
        setField(term440, term440.getClass(), "variables", term441);
        setField(term447, term447.getClass(), "variables", term448);
        setField(term453, term453.getClass(), "variables", null);
        setField(term453, term453.getClass(), "parent", null);
        setField(term447, term447.getClass(), "parent", term453);
        setField(term440, term440.getClass(), "parent", term447);
        setField(term431, term431.getClass(), "parent", term440);
        setField(term430, term430.getClass(), "memoryScope", term431);
        setField(term430, term430.getClass(), "relations", term454);
        setField(term430, term430.getClass(), "value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.value.ClassValue");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mLUZFTfjle";
        callMethod(klass, "getValue", argTypes, term430, args);
    }

};


