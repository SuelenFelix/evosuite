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

public class Plan_hashCode_7132306523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34466;

    public Plan_hashCode_7132306523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term34467 = new Integer(480137250);
        Integer term34469 = new Integer(-341152642);
        Integer term34515 = new Integer(-2015854073);
        term34466 = newInstance(Class.forName("com.iwamih31.Plan"));
        Object term34471 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34475 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term34466, term34466.getClass(), "id", term34467);
        setField(term34466, term34466.getClass(), "user_id", term34469);
        setIntField(term34471, term34471.getClass(), "year", 2027);
        setShortField(term34471, term34471.getClass(), "month", (short) 8);
        setShortField(term34471, term34471.getClass(), "day", (short) 22);
        setField(term34466, term34466.getClass(), "start_date", term34471);
        setIntField(term34475, term34475.getClass(), "year", 2020);
        setShortField(term34475, term34475.getClass(), "month", (short) 10);
        setShortField(term34475, term34475.getClass(), "day", (short) 28);
        setField(term34466, term34466.getClass(), "last_date", term34475);
        setField(term34466, term34466.getClass(), "day_of_week", "WAljagiCzu");
        setField(term34466, term34466.getClass(), "subject", "XKMXfDZajw");
        setField(term34466, term34466.getClass(), "start_time", "avZoBQSrBy");
        setField(term34466, term34466.getClass(), "minutes", term34515);
        setField(term34466, term34466.getClass(), "items", "KIXGeHXdwi");
        setField(term34466, term34466.getClass(), "note", "tTfdvLMwEE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Plan");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term34466, args);
    }

};


