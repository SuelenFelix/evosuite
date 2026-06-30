package ru.smartup.timetracker.dto.position.response;

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
import static ru.smartup.timetracker.dto.position.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PositionDto_getCreatedDate_15196097325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129;

    public PositionDto_getCreatedDate_15196097325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129 = newInstance(Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto"));
        Object term145 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term148 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term129, term129.getClass(), "id", -1922583790);
        setField(term129, term129.getClass(), "name", "jJCZpVmanW");
        setFloatField(term129, term129.getClass(), "externalRate", 0.5523636F);
        setBooleanField(term129, term129.getClass(), "isArchived", true);
        setIntField(term145, term145.getClass(), "nanos", 896000000);
        setLongField(term145, term145.getClass(), "fastTime", 1645823234000L);
        setField(term145, term145.getClass(), "cdate", null);
        setField(term129, term129.getClass(), "createdDate", term145);
        setIntField(term148, term148.getClass(), "nanos", 23000000);
        setLongField(term148, term148.getClass(), "fastTime", 1500710268000L);
        setField(term148, term148.getClass(), "cdate", null);
        setField(term129, term129.getClass(), "lastModifiedDate", term148);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedDate", argTypes, term129, args);
    }

};


