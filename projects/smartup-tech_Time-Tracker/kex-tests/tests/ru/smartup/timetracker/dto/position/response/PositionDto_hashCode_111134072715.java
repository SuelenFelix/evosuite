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

public class PositionDto_hashCode_111134072715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term485;

    public PositionDto_hashCode_111134072715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term485 = newInstance(Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto"));
        Object term501 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term504 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term485, term485.getClass(), "id", 597278769);
        setField(term485, term485.getClass(), "name", "aJlieCFVtF");
        setFloatField(term485, term485.getClass(), "externalRate", 0.13906479F);
        setBooleanField(term485, term485.getClass(), "isArchived", false);
        setIntField(term501, term501.getClass(), "nanos", 764000000);
        setLongField(term501, term501.getClass(), "fastTime", 1496849028000L);
        setField(term501, term501.getClass(), "cdate", null);
        setField(term485, term485.getClass(), "createdDate", term501);
        setIntField(term504, term504.getClass(), "nanos", 367000000);
        setLongField(term504, term504.getClass(), "fastTime", 1691857668000L);
        setField(term504, term504.getClass(), "cdate", null);
        setField(term485, term485.getClass(), "lastModifiedDate", term504);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term485, args);
    }

};


