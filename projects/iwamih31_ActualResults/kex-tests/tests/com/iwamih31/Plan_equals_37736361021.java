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

public class Plan_equals_37736361021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34214;
     Object term34289;

    public Plan_equals_37736361021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term34215 = new Integer(1861318859);
        Integer term34217 = new Integer(1474524152);
        Integer term34263 = new Integer(568954359);
        term34214 = newInstance(Class.forName("com.iwamih31.Plan"));
        Object term34219 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34223 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term34214, term34214.getClass(), "id", term34215);
        setField(term34214, term34214.getClass(), "user_id", term34217);
        setIntField(term34219, term34219.getClass(), "year", 2020);
        setShortField(term34219, term34219.getClass(), "month", (short) 5);
        setShortField(term34219, term34219.getClass(), "day", (short) 17);
        setField(term34214, term34214.getClass(), "start_date", term34219);
        setIntField(term34223, term34223.getClass(), "year", 2010);
        setShortField(term34223, term34223.getClass(), "month", (short) 12);
        setShortField(term34223, term34223.getClass(), "day", (short) 2);
        setField(term34214, term34214.getClass(), "last_date", term34223);
        setField(term34214, term34214.getClass(), "day_of_week", "goqNSmXSSS");
        setField(term34214, term34214.getClass(), "subject", "AkViBLdqXM");
        setField(term34214, term34214.getClass(), "start_time", "UlxGFzEifL");
        setField(term34214, term34214.getClass(), "minutes", term34263);
        setField(term34214, term34214.getClass(), "items", "HilHTbDKDF");
        setField(term34214, term34214.getClass(), "note", "IaEqlVwmNS");
        term34289 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Plan");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term34289;
        callMethod(klass, "equals", argTypes, term34214, args);
    }

};


