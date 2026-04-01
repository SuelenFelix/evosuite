package org.example.toylanguage.statement.loop;

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
import static org.example.toylanguage.statement.loop.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class ForLoopStatement_postIncrement_19719784625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term395;

    public ForLoopStatement_postIncrement_19719784625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term409 = new ArrayList();
        ((ArrayList) term409).add((Object)null);
        ((ArrayList) term409).add((Object)null);
        ((ArrayList) term409).add((Object)null);
        ((ArrayList) term409).add((Object)null);
        ((ArrayList) term409).add((Object)null);
        ((ArrayList) term409).add((Object)null);
        Integer term413 = new Integer(1725571209);
        term395 = newInstance(Class.forName("org.example.toylanguage.statement.loop.ForLoopStatement"));
        Object term396 = newInstance(Class.forName("org.example.toylanguage.expression.VariableExpression"));
        setField(term396, term396.getClass(), "name", "aJlieCFVtF");
        setField(term395, term395.getClass(), "variable", term396);
        setField(term395, term395.getClass(), "lowerBound", null);
        setField(term395, term395.getClass(), "uppedBound", null);
        setField(term395, term395.getClass(), "step", null);
        setField(term395, term395.getClass(), "statements2Execute", term409);
        setField(term395, term395.getClass(), "rowNumber", term413);
        setField(term395, term395.getClass(), "blockName", "ZiaGIbnzTs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.statement.loop.ForLoopStatement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "postIncrement", argTypes, term395, args);
    }

};


