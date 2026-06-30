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

public class Action_getDate_14704574971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12818;

    public Action_getDate_14704574971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12819 = new Integer(597278769);
        Integer term12849 = new Integer(-1685132342);
        Integer term12851 = new Integer(-1456670397);
        term12818 = newInstance(Class.forName("com.iwamih31.Action"));
        Object term12821 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term12818, term12818.getClass(), "id", term12819);
        setIntField(term12821, term12821.getClass(), "year", 2012);
        setShortField(term12821, term12821.getClass(), "month", (short) 10);
        setShortField(term12821, term12821.getClass(), "day", (short) 1);
        setField(term12818, term12818.getClass(), "date", term12821);
        setField(term12818, term12818.getClass(), "subject", "RbVQXSpxXy");
        setField(term12818, term12818.getClass(), "apply", "YpJbIgJWWv");
        setField(term12818, term12818.getClass(), "income", term12849);
        setField(term12818, term12818.getClass(), "spending", term12851);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Action");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDate", argTypes, term12818, args);
    }

};


