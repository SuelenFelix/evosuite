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

public class ClassExpression_getPropertiesExpressions_21208321096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21363;

    public ClassExpression_getPropertiesExpressions_21208321096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term21376 = new ArrayList();
        HashMap term21380 = new HashMap();
        term21363 = newInstance(Class.forName("org.example.toylanguage.expression.ClassExpression"));
        setField(term21363, term21363.getClass(), "name", "beAMpkroCQ");
        setField(term21363, term21363.getClass(), "propertiesExpressions", term21376);
        setField(term21363, term21363.getClass(), "relations", term21380);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.ClassExpression");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPropertiesExpressions", argTypes, term21363, args);
    }

};


