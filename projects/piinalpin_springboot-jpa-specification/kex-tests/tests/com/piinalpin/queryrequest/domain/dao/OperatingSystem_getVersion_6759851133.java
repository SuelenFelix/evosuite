package com.piinalpin.queryrequest.domain.dao;

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
import static com.piinalpin.queryrequest.domain.dao.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;

public class OperatingSystem_getVersion_6759851133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term899;

    public OperatingSystem_getVersion_6759851133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term900 = new Long(-8885298608300233488L);
        Integer term948 = new Integer(-522618178);
        term899 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem"));
        Object term938 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term939 = newInstance(Class.forName("java.time.LocalDate"));
        Object term943 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term899, term899.getClass(), "id", term900);
        setField(term899, term899.getClass(), "name", "SbAoxhfrkn");
        setField(term899, term899.getClass(), "version", "kuTXqwMtDB");
        setField(term899, term899.getClass(), "kernel", "Ghbwtircqb");
        setIntField(term939, term939.getClass(), "year", 2018);
        setShortField(term939, term939.getClass(), "month", (short) 9);
        setShortField(term939, term939.getClass(), "day", (short) 28);
        setField(term938, term938.getClass(), "date", term939);
        setByteField(term943, term943.getClass(), "hour", (byte) 3);
        setByteField(term943, term943.getClass(), "minute", (byte) 37);
        setByteField(term943, term943.getClass(), "second", (byte) 46);
        setIntField(term943, term943.getClass(), "nano", 763326845);
        setField(term938, term938.getClass(), "time", term943);
        setField(term899, term899.getClass(), "releaseDate", term938);
        setField(term899, term899.getClass(), "usages", term948);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersion", argTypes, term899, args);
    }

};


