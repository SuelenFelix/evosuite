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

public class Plan_setSubject_137544794316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33499;

    public Plan_setSubject_137544794316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term33500 = new Integer(-663691365);
        Integer term33502 = new Integer(339854490);
        Integer term33548 = new Integer(-615654495);
        term33499 = newInstance(Class.forName("com.iwamih31.Plan"));
        Object term33504 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33508 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term33499, term33499.getClass(), "id", term33500);
        setField(term33499, term33499.getClass(), "user_id", term33502);
        setIntField(term33504, term33504.getClass(), "year", 2018);
        setShortField(term33504, term33504.getClass(), "month", (short) 7);
        setShortField(term33504, term33504.getClass(), "day", (short) 11);
        setField(term33499, term33499.getClass(), "start_date", term33504);
        setIntField(term33508, term33508.getClass(), "year", 2010);
        setShortField(term33508, term33508.getClass(), "month", (short) 1);
        setShortField(term33508, term33508.getClass(), "day", (short) 20);
        setField(term33499, term33499.getClass(), "last_date", term33508);
        setField(term33499, term33499.getClass(), "day_of_week", "HEWWLhfKIa");
        setField(term33499, term33499.getClass(), "subject", "mJJkYzNPob");
        setField(term33499, term33499.getClass(), "start_time", "mRDwekkZQg");
        setField(term33499, term33499.getClass(), "minutes", term33548);
        setField(term33499, term33499.getClass(), "items", "RIGChgqpTI");
        setField(term33499, term33499.getClass(), "note", "YCrgXnhgoK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Plan");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nQodIeQekM";
        callMethod(klass, "setSubject", argTypes, term33499, args);
    }

};


