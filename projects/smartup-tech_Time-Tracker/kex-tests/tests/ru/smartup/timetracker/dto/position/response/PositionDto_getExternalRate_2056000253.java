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

public class PositionDto_getExternalRate_2056000253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65;

    public PositionDto_getExternalRate_2056000253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65 = newInstance(Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto"));
        Object term81 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term84 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term65, term65.getClass(), "id", 1484323161);
        setField(term65, term65.getClass(), "name", "MuLcgQHgqz");
        setFloatField(term65, term65.getClass(), "externalRate", 0.3455959F);
        setBooleanField(term65, term65.getClass(), "isArchived", false);
        setIntField(term81, term81.getClass(), "nanos", 302000000);
        setLongField(term81, term81.getClass(), "fastTime", 1442628765000L);
        setField(term81, term81.getClass(), "cdate", null);
        setField(term65, term65.getClass(), "createdDate", term81);
        setIntField(term84, term84.getClass(), "nanos", 18000000);
        setLongField(term84, term84.getClass(), "fastTime", 1515879330000L);
        setField(term84, term84.getClass(), "cdate", null);
        setField(term65, term65.getClass(), "lastModifiedDate", term84);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExternalRate", argTypes, term65, args);
    }

};


