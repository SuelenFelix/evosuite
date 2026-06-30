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
import java.lang.Float;

public class PositionDto_setExternalRate_21001028779 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281;
     Object term303;

    public PositionDto_setExternalRate_21001028779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281 = newInstance(Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto"));
        Object term297 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term300 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term281, term281.getClass(), "id", -1339778481);
        setField(term281, term281.getClass(), "name", "RMFIsYGgne");
        setFloatField(term281, term281.getClass(), "externalRate", 0.2857073F);
        setBooleanField(term281, term281.getClass(), "isArchived", false);
        setIntField(term297, term297.getClass(), "nanos", 364000000);
        setLongField(term297, term297.getClass(), "fastTime", 1882628084000L);
        setField(term297, term297.getClass(), "cdate", null);
        setField(term281, term281.getClass(), "createdDate", term297);
        setIntField(term300, term300.getClass(), "nanos", 580000000);
        setLongField(term300, term300.getClass(), "fastTime", 1437746523000L);
        setField(term300, term300.getClass(), "cdate", null);
        setField(term281, term281.getClass(), "lastModifiedDate", term300);
        term303 = new Float(0.6880585F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term303;
        callMethod(klass, "setExternalRate", argTypes, term281, args);
    }

};


