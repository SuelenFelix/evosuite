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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class WhileLoopStatement_postIncrement_16891355584 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112;

    public WhileLoopStatement_postIncrement_16891355584() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term113 = new ArrayList();
        ((ArrayList) term113).add((Object)null);
        ((ArrayList) term113).add((Object)null);
        ((ArrayList) term113).add((Object)null);
        ((ArrayList) term113).add((Object)null);
        Integer term117 = new Integer(-1922583790);
        term112 = newInstance(Class.forName("org.example.toylanguage.statement.loop.WhileLoopStatement"));
        setField(term112, term112.getClass(), "hasNext", null);
        setField(term112, term112.getClass(), "statements2Execute", term113);
        setField(term112, term112.getClass(), "rowNumber", term117);
        setField(term112, term112.getClass(), "blockName", "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.statement.loop.WhileLoopStatement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "postIncrement", argTypes, term112, args);
    }

};


