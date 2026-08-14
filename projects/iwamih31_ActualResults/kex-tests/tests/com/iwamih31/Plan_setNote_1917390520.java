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

public class Plan_setNote_1917390520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34067;

    public Plan_setNote_1917390520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term34068 = new Integer(1045657203);
        Integer term34070 = new Integer(1386130016);
        Integer term34116 = new Integer(1072005683);
        term34067 = newInstance(Class.forName("com.iwamih31.Plan"));
        Object term34072 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34076 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term34067, term34067.getClass(), "id", term34068);
        setField(term34067, term34067.getClass(), "user_id", term34070);
        setIntField(term34072, term34072.getClass(), "year", 2014);
        setShortField(term34072, term34072.getClass(), "month", (short) 11);
        setShortField(term34072, term34072.getClass(), "day", (short) 8);
        setField(term34067, term34067.getClass(), "start_date", term34072);
        setIntField(term34076, term34076.getClass(), "year", 2013);
        setShortField(term34076, term34076.getClass(), "month", (short) 2);
        setShortField(term34076, term34076.getClass(), "day", (short) 2);
        setField(term34067, term34067.getClass(), "last_date", term34076);
        setField(term34067, term34067.getClass(), "day_of_week", "wKIBUlfNCx");
        setField(term34067, term34067.getClass(), "subject", "iGfMUWRvod");
        setField(term34067, term34067.getClass(), "start_time", "zUXaSvayQe");
        setField(term34067, term34067.getClass(), "minutes", term34116);
        setField(term34067, term34067.getClass(), "items", "bPVcnnQPSC");
        setField(term34067, term34067.getClass(), "note", "PQLyoEKWSa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Plan");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HOgkhttJZS";
        callMethod(klass, "setNote", argTypes, term34067, args);
    }

};


