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

public class PositionDto_equals_156002740213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term419;
     Object term441;

    public PositionDto_equals_156002740213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term419 = newInstance(Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto"));
        Object term435 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term438 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term419, term419.getClass(), "id", -883034806);
        setField(term419, term419.getClass(), "name", "LQFpaHEwXR");
        setFloatField(term419, term419.getClass(), "externalRate", 0.7944024F);
        setBooleanField(term419, term419.getClass(), "isArchived", true);
        setIntField(term435, term435.getClass(), "nanos", 759000000);
        setLongField(term435, term435.getClass(), "fastTime", 1630941844000L);
        setField(term435, term435.getClass(), "cdate", null);
        setField(term419, term419.getClass(), "createdDate", term435);
        setIntField(term438, term438.getClass(), "nanos", 956000000);
        setLongField(term438, term438.getClass(), "fastTime", 1739406992000L);
        setField(term438, term438.getClass(), "cdate", null);
        setField(term419, term419.getClass(), "lastModifiedDate", term438);
        term441 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term441;
        callMethod(klass, "equals", argTypes, term419, args);
    }

};


