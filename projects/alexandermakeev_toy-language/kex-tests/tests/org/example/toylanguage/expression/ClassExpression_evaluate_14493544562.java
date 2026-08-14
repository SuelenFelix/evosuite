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
import java.util.HashMap;
import java.lang.Object;

public class ClassExpression_evaluate_14493544562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21152;
     Object term21179;

    public ClassExpression_evaluate_14493544562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term21165 = new ArrayList();
        HashMap term21169 = new HashMap();
        term21152 = newInstance(Class.forName("org.example.toylanguage.expression.ClassExpression"));
        setField(term21152, term21152.getClass(), "name", "DbiCVtPPCT");
        setField(term21152, term21152.getClass(), "propertiesExpressions", term21165);
        setField(term21152, term21152.getClass(), "relations", term21169);
        HashMap term21181 = new HashMap();
        HashMap term21190 = new HashMap();
        HashMap term21197 = new HashMap();
        HashMap term21203 = new HashMap();
        term21179 = newInstance(Class.forName("org.example.toylanguage.expression.value.ClassValue"));
        Object term21180 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term21189 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term21196 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term21202 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        setField(term21180, term21180.getClass(), "variables", term21181);
        setField(term21189, term21189.getClass(), "variables", term21190);
        setField(term21196, term21196.getClass(), "variables", term21197);
        setField(term21202, term21202.getClass(), "variables", null);
        setField(term21202, term21202.getClass(), "parent", null);
        setField(term21196, term21196.getClass(), "parent", term21202);
        setField(term21189, term21189.getClass(), "parent", term21196);
        setField(term21180, term21180.getClass(), "parent", term21189);
        setField(term21179, term21179.getClass(), "memoryScope", term21180);
        setField(term21179, term21179.getClass(), "relations", term21203);
        setField(term21179, term21179.getClass(), "value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.ClassExpression");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.example.toylanguage.expression.value.ClassValue");
        Object[] args = new Object[1];
        args[0] = term21179;
        callMethod(klass, "evaluate", argTypes, term21152, args);
    }

};


