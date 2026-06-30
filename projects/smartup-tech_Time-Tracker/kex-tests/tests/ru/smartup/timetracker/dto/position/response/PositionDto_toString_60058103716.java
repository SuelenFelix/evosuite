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

public class PositionDto_toString_60058103716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term517;

    public PositionDto_toString_60058103716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term517 = newInstance(Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto"));
        Object term533 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term536 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term517, term517.getClass(), "id", -1685132342);
        setField(term517, term517.getClass(), "name", "ZiaGIbnzTs");
        setFloatField(term517, term517.getClass(), "externalRate", 0.6076495F);
        setBooleanField(term517, term517.getClass(), "isArchived", true);
        setIntField(term533, term533.getClass(), "nanos", 632000000);
        setLongField(term533, term533.getClass(), "fastTime", 1442359734000L);
        setField(term533, term533.getClass(), "cdate", null);
        setField(term517, term517.getClass(), "createdDate", term533);
        setIntField(term536, term536.getClass(), "nanos", 918000000);
        setLongField(term536, term536.getClass(), "fastTime", 1659983392000L);
        setField(term536, term536.getClass(), "cdate", null);
        setField(term517, term517.getClass(), "lastModifiedDate", term536);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term517, args);
    }

};


