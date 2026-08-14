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

public class Plan_setMinutes_78774101318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33793;
     Object term33868;

    public Plan_setMinutes_78774101318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term33794 = new Integer(-1801760683);
        Integer term33796 = new Integer(1141317871);
        Integer term33842 = new Integer(890669485);
        term33793 = newInstance(Class.forName("com.iwamih31.Plan"));
        Object term33798 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33802 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term33793, term33793.getClass(), "id", term33794);
        setField(term33793, term33793.getClass(), "user_id", term33796);
        setIntField(term33798, term33798.getClass(), "year", 2027);
        setShortField(term33798, term33798.getClass(), "month", (short) 11);
        setShortField(term33798, term33798.getClass(), "day", (short) 7);
        setField(term33793, term33793.getClass(), "start_date", term33798);
        setIntField(term33802, term33802.getClass(), "year", 2016);
        setShortField(term33802, term33802.getClass(), "month", (short) 6);
        setShortField(term33802, term33802.getClass(), "day", (short) 12);
        setField(term33793, term33793.getClass(), "last_date", term33802);
        setField(term33793, term33793.getClass(), "day_of_week", "QwKYpiVQlL");
        setField(term33793, term33793.getClass(), "subject", "kSGsHNQQoW");
        setField(term33793, term33793.getClass(), "start_time", "MWezlyjdaG");
        setField(term33793, term33793.getClass(), "minutes", term33842);
        setField(term33793, term33793.getClass(), "items", "drpBJuEKQG");
        setField(term33793, term33793.getClass(), "note", "GGpORnLrOW");
        term33868 = new Integer(691577392);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Plan");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term33868;
        callMethod(klass, "setMinutes", argTypes, term33793, args);
    }

};


