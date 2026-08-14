package org.example.toylanguage.expression;

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
import static org.example.toylanguage.expression.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;

public class FunctionExpression_evaluate_6555872281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38;
     Object term55;

    public FunctionExpression_evaluate_6555872281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term51 = new ArrayList();
        ((ArrayList) term51).add((Object)null);
        ((ArrayList) term51).add((Object)null);
        ((ArrayList) term51).add((Object)null);
        ((ArrayList) term51).add((Object)null);
        term38 = newInstance(Class.forName("org.example.toylanguage.expression.FunctionExpression"));
        setField(term38, term38.getClass(), "name", "sjlJAEtRrb");
        setField(term38, term38.getClass(), "argumentExpressions", term51);
        HashMap term57 = new HashMap();
        HashMap term66 = new HashMap();
        HashMap term73 = new HashMap();
        HashMap term79 = new HashMap();
        term55 = newInstance(Class.forName("org.example.toylanguage.expression.value.ClassValue"));
        Object term56 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term65 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term72 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term78 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        setField(term56, term56.getClass(), "variables", term57);
        setField(term65, term65.getClass(), "variables", term66);
        setField(term72, term72.getClass(), "variables", term73);
        setField(term78, term78.getClass(), "variables", null);
        setField(term78, term78.getClass(), "parent", null);
        setField(term72, term72.getClass(), "parent", term78);
        setField(term65, term65.getClass(), "parent", term72);
        setField(term56, term56.getClass(), "parent", term65);
        setField(term55, term55.getClass(), "memoryScope", term56);
        setField(term55, term55.getClass(), "relations", term79);
        setField(term55, term55.getClass(), "value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.FunctionExpression");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.example.toylanguage.expression.value.ClassValue");
        Object[] args = new Object[1];
        args[0] = term55;
        callMethod(klass, "evaluate", argTypes, term38, args);
    }

};


