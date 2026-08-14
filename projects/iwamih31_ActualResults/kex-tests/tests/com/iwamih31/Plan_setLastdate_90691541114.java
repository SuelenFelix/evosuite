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

public class Plan_setLastdate_90691541114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33223;
     Object term33298;

    public Plan_setLastdate_90691541114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term33224 = new Integer(-1347665717);
        Integer term33226 = new Integer(-1888585309);
        Integer term33272 = new Integer(683666002);
        term33223 = newInstance(Class.forName("com.iwamih31.Plan"));
        Object term33228 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33232 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term33223, term33223.getClass(), "id", term33224);
        setField(term33223, term33223.getClass(), "user_id", term33226);
        setIntField(term33228, term33228.getClass(), "year", 2017);
        setShortField(term33228, term33228.getClass(), "month", (short) 3);
        setShortField(term33228, term33228.getClass(), "day", (short) 31);
        setField(term33223, term33223.getClass(), "start_date", term33228);
        setIntField(term33232, term33232.getClass(), "year", 2010);
        setShortField(term33232, term33232.getClass(), "month", (short) 9);
        setShortField(term33232, term33232.getClass(), "day", (short) 28);
        setField(term33223, term33223.getClass(), "last_date", term33232);
        setField(term33223, term33223.getClass(), "day_of_week", "cpjqTCNflQ");
        setField(term33223, term33223.getClass(), "subject", "wiYGATEfmw");
        setField(term33223, term33223.getClass(), "start_time", "FiALSqneIg");
        setField(term33223, term33223.getClass(), "minutes", term33272);
        setField(term33223, term33223.getClass(), "items", "lGVACSQceQ");
        setField(term33223, term33223.getClass(), "note", "jpgWRbSvyQ");
        term33298 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term33298, term33298.getClass(), "year", 2022);
        setShortField(term33298, term33298.getClass(), "month", (short) 2);
        setShortField(term33298, term33298.getClass(), "day", (short) 4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Plan");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term33298;
        callMethod(klass, "setLast_date", argTypes, term33223, args);
    }

};


