package org.example.toylanguage.statement;

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
import static org.example.toylanguage.statement.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Integer;

public class ConditionStatement_execute_11896441172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2206;

    public ConditionStatement_execute_11896441172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2207 = new HashMap();
        Integer term2212 = new Integer(962840079);
        term2206 = newInstance(Class.forName("org.example.toylanguage.statement.ConditionStatement"));
        setField(term2206, term2206.getClass(), "cases", term2207);
        setField(term2206, term2206.getClass(), "rowNumber", term2212);
        setField(term2206, term2206.getClass(), "blockName", "PHvxnGHptP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.statement.ConditionStatement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "execute", argTypes, term2206, args);
    }

};


