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

public class PositionDto_getLastModifiedDate_14994952896 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161;

    public PositionDto_getLastModifiedDate_14994952896() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term161 = newInstance(Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto"));
        Object term177 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term180 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term161, term161.getClass(), "id", -616727354);
        setField(term161, term161.getClass(), "name", "EGtDIRbSSb");
        setFloatField(term161, term161.getClass(), "externalRate", 0.8564069F);
        setBooleanField(term161, term161.getClass(), "isArchived", true);
        setIntField(term177, term177.getClass(), "nanos", 25000000);
        setLongField(term177, term177.getClass(), "fastTime", 1797192828000L);
        setField(term177, term177.getClass(), "cdate", null);
        setField(term161, term161.getClass(), "createdDate", term177);
        setIntField(term180, term180.getClass(), "nanos", 30000000);
        setLongField(term180, term180.getClass(), "fastTime", 1589447121000L);
        setField(term180, term180.getClass(), "cdate", null);
        setField(term161, term161.getClass(), "lastModifiedDate", term180);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastModifiedDate", argTypes, term161, args);
    }

};


