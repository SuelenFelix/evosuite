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

public class Plan_setDayofweek_193789947615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33352;

    public Plan_setDayofweek_193789947615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term33353 = new Integer(1596213415);
        Integer term33355 = new Integer(-268815336);
        Integer term33401 = new Integer(-1210583429);
        term33352 = newInstance(Class.forName("com.iwamih31.Plan"));
        Object term33357 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33361 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term33352, term33352.getClass(), "id", term33353);
        setField(term33352, term33352.getClass(), "user_id", term33355);
        setIntField(term33357, term33357.getClass(), "year", 2023);
        setShortField(term33357, term33357.getClass(), "month", (short) 7);
        setShortField(term33357, term33357.getClass(), "day", (short) 15);
        setField(term33352, term33352.getClass(), "start_date", term33357);
        setIntField(term33361, term33361.getClass(), "year", 2019);
        setShortField(term33361, term33361.getClass(), "month", (short) 10);
        setShortField(term33361, term33361.getClass(), "day", (short) 10);
        setField(term33352, term33352.getClass(), "last_date", term33361);
        setField(term33352, term33352.getClass(), "day_of_week", "tFMlYmPEBX");
        setField(term33352, term33352.getClass(), "subject", "ljkZxGNgjZ");
        setField(term33352, term33352.getClass(), "start_time", "hrFtgdcZKS");
        setField(term33352, term33352.getClass(), "minutes", term33401);
        setField(term33352, term33352.getClass(), "items", "ZhZJvpPaTU");
        setField(term33352, term33352.getClass(), "note", "NZwUsJxDLI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Plan");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wlusYBOfXW";
        callMethod(klass, "setDay_of_week", argTypes, term33352, args);
    }

};


