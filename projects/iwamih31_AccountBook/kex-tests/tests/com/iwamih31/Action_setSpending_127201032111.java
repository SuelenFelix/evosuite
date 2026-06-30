package com.iwamih31;

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
import static com.iwamih31.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Action_setSpending_127201032111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13420;
     Object term13455;

    public Action_setSpending_127201032111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13421 = new Integer(-1968847291);
        Integer term13451 = new Integer(579005622);
        Integer term13453 = new Integer(-14890619);
        term13420 = newInstance(Class.forName("com.iwamih31.Action"));
        Object term13423 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term13420, term13420.getClass(), "id", term13421);
        setIntField(term13423, term13423.getClass(), "year", 2012);
        setShortField(term13423, term13423.getClass(), "month", (short) 9);
        setShortField(term13423, term13423.getClass(), "day", (short) 11);
        setField(term13420, term13420.getClass(), "date", term13423);
        setField(term13420, term13420.getClass(), "subject", "tlzpzIjMib");
        setField(term13420, term13420.getClass(), "apply", "AZdLeSugwv");
        setField(term13420, term13420.getClass(), "income", term13451);
        setField(term13420, term13420.getClass(), "spending", term13453);
        term13455 = new Integer(1632125673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Action");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term13455;
        callMethod(klass, "setSpending", argTypes, term13420, args);
    }

};


