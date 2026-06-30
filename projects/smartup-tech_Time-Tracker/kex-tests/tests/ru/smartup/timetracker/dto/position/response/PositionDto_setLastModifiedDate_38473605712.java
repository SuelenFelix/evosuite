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

public class PositionDto_setLastModifiedDate_38473605712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term384;
     Object term406;

    public PositionDto_setLastModifiedDate_38473605712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term384 = newInstance(Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto"));
        Object term400 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term403 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term384, term384.getClass(), "id", 1134449235);
        setField(term384, term384.getClass(), "name", "MxlszYVzRf");
        setFloatField(term384, term384.getClass(), "externalRate", 0.26413453F);
        setBooleanField(term384, term384.getClass(), "isArchived", false);
        setIntField(term400, term400.getClass(), "nanos", 937000000);
        setLongField(term400, term400.getClass(), "fastTime", 1744079265000L);
        setField(term400, term400.getClass(), "cdate", null);
        setField(term384, term384.getClass(), "createdDate", term400);
        setIntField(term403, term403.getClass(), "nanos", 385000000);
        setLongField(term403, term403.getClass(), "fastTime", 1347389761000L);
        setField(term403, term403.getClass(), "cdate", null);
        setField(term384, term384.getClass(), "lastModifiedDate", term403);
        term406 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term406, term406.getClass(), "nanos", 899000000);
        setLongField(term406, term406.getClass(), "fastTime", 1502147353000L);
        setField(term406, term406.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term406;
        callMethod(klass, "setLastModifiedDate", argTypes, term384, args);
    }

};


