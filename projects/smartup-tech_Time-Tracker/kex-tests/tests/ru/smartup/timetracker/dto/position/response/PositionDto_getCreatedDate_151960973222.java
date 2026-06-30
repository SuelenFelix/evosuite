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

public class PositionDto_getCreatedDate_151960973222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term565;

    public PositionDto_getCreatedDate_151960973222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term565 = newInstance(Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto"));
        setIntField(term565, term565.getClass(), "id", 0);
        setField(term565, term565.getClass(), "name", null);
        setFloatField(term565, term565.getClass(), "externalRate", 0.0F);
        setBooleanField(term565, term565.getClass(), "isArchived", false);
        setField(term565, term565.getClass(), "createdDate", null);
        setField(term565, term565.getClass(), "lastModifiedDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedDate", argTypes, term565, args);
    }

};


