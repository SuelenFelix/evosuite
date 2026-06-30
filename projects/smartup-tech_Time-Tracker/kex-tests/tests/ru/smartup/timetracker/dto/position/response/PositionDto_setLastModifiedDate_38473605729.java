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

public class PositionDto_setLastModifiedDate_38473605729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term599;

    public PositionDto_setLastModifiedDate_38473605729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term599 = newInstance(Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto"));
        setIntField(term599, term599.getClass(), "id", 0);
        setField(term599, term599.getClass(), "name", null);
        setFloatField(term599, term599.getClass(), "externalRate", 0.0F);
        setBooleanField(term599, term599.getClass(), "isArchived", false);
        setField(term599, term599.getClass(), "createdDate", null);
        setField(term599, term599.getClass(), "lastModifiedDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastModifiedDate", argTypes, term599, args);
    }

};


