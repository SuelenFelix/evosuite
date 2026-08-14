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
import java.util.ArrayList;
import java.lang.Object;

public class ConditionStatement_addCase_11469134681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2147;
     Object term2167;

    public ConditionStatement_addCase_11469134681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2148 = new HashMap();
        Integer term2153 = new Integer(-112921587);
        term2147 = newInstance(Class.forName("org.example.toylanguage.statement.ConditionStatement"));
        setField(term2147, term2147.getClass(), "cases", term2148);
        setField(term2147, term2147.getClass(), "rowNumber", term2153);
        setField(term2147, term2147.getClass(), "blockName", "bWWfajKbEX");
        ArrayList term2168 = new ArrayList();
        ((ArrayList) term2168).add((Object)null);
        ((ArrayList) term2168).add((Object)null);
        ((ArrayList) term2168).add((Object)null);
        ((ArrayList) term2168).add((Object)null);
        ((ArrayList) term2168).add((Object)null);
        ((ArrayList) term2168).add((Object)null);
        Integer term2172 = new Integer(933028652);
        term2167 = newInstance(Class.forName("org.example.toylanguage.statement.CompositeStatement"));
        setField(term2167, term2167.getClass(), "statements2Execute", term2168);
        setField(term2167, term2167.getClass(), "rowNumber", term2172);
        setField(term2167, term2167.getClass(), "blockName", "cAPeiZHKGJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.statement.ConditionStatement");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.example.toylanguage.expression.Expression");
        argTypes[1] = Class.forName("org.example.toylanguage.statement.CompositeStatement");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2167;
        callMethod(klass, "addCase", argTypes, term2147, args);
    }

};


