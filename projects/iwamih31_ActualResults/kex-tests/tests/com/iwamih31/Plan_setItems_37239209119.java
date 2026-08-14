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

public class Plan_setItems_37239209119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33920;

    public Plan_setItems_37239209119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term33921 = new Integer(-893623680);
        Integer term33923 = new Integer(-1963434938);
        Integer term33969 = new Integer(906181092);
        term33920 = newInstance(Class.forName("com.iwamih31.Plan"));
        Object term33925 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33929 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term33920, term33920.getClass(), "id", term33921);
        setField(term33920, term33920.getClass(), "user_id", term33923);
        setIntField(term33925, term33925.getClass(), "year", 2020);
        setShortField(term33925, term33925.getClass(), "month", (short) 8);
        setShortField(term33925, term33925.getClass(), "day", (short) 14);
        setField(term33920, term33920.getClass(), "start_date", term33925);
        setIntField(term33929, term33929.getClass(), "year", 2012);
        setShortField(term33929, term33929.getClass(), "month", (short) 12);
        setShortField(term33929, term33929.getClass(), "day", (short) 5);
        setField(term33920, term33920.getClass(), "last_date", term33929);
        setField(term33920, term33920.getClass(), "day_of_week", "gDGZwlpOZx");
        setField(term33920, term33920.getClass(), "subject", "gkDpxkHPDg");
        setField(term33920, term33920.getClass(), "start_time", "pADwkrWiMW");
        setField(term33920, term33920.getClass(), "minutes", term33969);
        setField(term33920, term33920.getClass(), "items", "FDORDJuAXQ");
        setField(term33920, term33920.getClass(), "note", "yjqoDeLBLg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Plan");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DCepDqVwas";
        callMethod(klass, "setItems", argTypes, term33920, args);
    }

};


