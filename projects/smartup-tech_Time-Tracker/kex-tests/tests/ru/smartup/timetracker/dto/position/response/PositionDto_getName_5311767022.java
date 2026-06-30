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

public class PositionDto_getName_5311767022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33;

    public PositionDto_getName_5311767022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33 = newInstance(Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto"));
        Object term49 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term52 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term33, term33.getClass(), "id", 1162663216);
        setField(term33, term33.getClass(), "name", "sjlJAEtRrb");
        setFloatField(term33, term33.getClass(), "externalRate", 0.2707036F);
        setBooleanField(term33, term33.getClass(), "isArchived", false);
        setIntField(term49, term49.getClass(), "nanos", 830000000);
        setLongField(term49, term49.getClass(), "fastTime", 1610929382000L);
        setField(term49, term49.getClass(), "cdate", null);
        setField(term33, term33.getClass(), "createdDate", term49);
        setIntField(term52, term52.getClass(), "nanos", 837000000);
        setLongField(term52, term52.getClass(), "fastTime", 1606034835000L);
        setField(term52, term52.getClass(), "cdate", null);
        setField(term33, term33.getClass(), "lastModifiedDate", term52);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term33, args);
    }

};


