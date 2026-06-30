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

public class Action_hashCode_168949879014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13589;

    public Action_hashCode_168949879014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13590 = new Integer(-184153539);
        Integer term13620 = new Integer(493620644);
        Integer term13622 = new Integer(1328271830);
        term13589 = newInstance(Class.forName("com.iwamih31.Action"));
        Object term13592 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term13589, term13589.getClass(), "id", term13590);
        setIntField(term13592, term13592.getClass(), "year", 2025);
        setShortField(term13592, term13592.getClass(), "month", (short) 2);
        setShortField(term13592, term13592.getClass(), "day", (short) 13);
        setField(term13589, term13589.getClass(), "date", term13592);
        setField(term13589, term13589.getClass(), "subject", "izPpKDErnQ");
        setField(term13589, term13589.getClass(), "apply", "NnpwZBUTvx");
        setField(term13589, term13589.getClass(), "income", term13620);
        setField(term13589, term13589.getClass(), "spending", term13622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Action");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term13589, args);
    }

};


