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
import java.lang.Integer;

public class PositionDto_setId_13979237937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193;
     Object term215;

    public PositionDto_setId_13979237937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193 = newInstance(Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto"));
        Object term209 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term212 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term193, term193.getClass(), "id", -1955890973);
        setField(term193, term193.getClass(), "name", "SzjVpOQTyS");
        setFloatField(term193, term193.getClass(), "externalRate", 0.5446086F);
        setBooleanField(term193, term193.getClass(), "isArchived", true);
        setIntField(term209, term209.getClass(), "nanos", 80000000);
        setLongField(term209, term209.getClass(), "fastTime", 1745452162000L);
        setField(term209, term209.getClass(), "cdate", null);
        setField(term193, term193.getClass(), "createdDate", term209);
        setIntField(term212, term212.getClass(), "nanos", 960000000);
        setLongField(term212, term212.getClass(), "fastTime", 1349058953000L);
        setField(term212, term212.getClass(), "cdate", null);
        setField(term193, term193.getClass(), "lastModifiedDate", term212);
        term215 = new Integer(-2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term215;
        callMethod(klass, "setId", argTypes, term193, args);
    }

};


