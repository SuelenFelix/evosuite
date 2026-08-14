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

public class Plan_setStarttime_214453269517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33646;

    public Plan_setStarttime_214453269517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term33647 = new Integer(-1476117762);
        Integer term33649 = new Integer(-341962980);
        Integer term33695 = new Integer(1532716628);
        term33646 = newInstance(Class.forName("com.iwamih31.Plan"));
        Object term33651 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33655 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term33646, term33646.getClass(), "id", term33647);
        setField(term33646, term33646.getClass(), "user_id", term33649);
        setIntField(term33651, term33651.getClass(), "year", 2015);
        setShortField(term33651, term33651.getClass(), "month", (short) 12);
        setShortField(term33651, term33651.getClass(), "day", (short) 23);
        setField(term33646, term33646.getClass(), "start_date", term33651);
        setIntField(term33655, term33655.getClass(), "year", 2016);
        setShortField(term33655, term33655.getClass(), "month", (short) 7);
        setShortField(term33655, term33655.getClass(), "day", (short) 6);
        setField(term33646, term33646.getClass(), "last_date", term33655);
        setField(term33646, term33646.getClass(), "day_of_week", "YXORpHCDcd");
        setField(term33646, term33646.getClass(), "subject", "XzZbAcRADD");
        setField(term33646, term33646.getClass(), "start_time", "UqSNWSoTRy");
        setField(term33646, term33646.getClass(), "minutes", term33695);
        setField(term33646, term33646.getClass(), "items", "VesRqDfjMa");
        setField(term33646, term33646.getClass(), "note", "AQTTebOiZR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Plan");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mgeIhswNtk";
        callMethod(klass, "setStart_time", argTypes, term33646, args);
    }

};


