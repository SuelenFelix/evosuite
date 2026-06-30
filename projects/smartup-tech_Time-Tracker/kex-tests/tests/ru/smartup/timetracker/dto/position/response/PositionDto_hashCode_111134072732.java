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

public class PositionDto_hashCode_111134072732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term611;

    public PositionDto_hashCode_111134072732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term611 = newInstance(Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto"));
        setIntField(term611, term611.getClass(), "id", 0);
        setField(term611, term611.getClass(), "name", null);
        setFloatField(term611, term611.getClass(), "externalRate", 0.0F);
        setBooleanField(term611, term611.getClass(), "isArchived", false);
        setField(term611, term611.getClass(), "createdDate", null);
        setField(term611, term611.getClass(), "lastModifiedDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term611, args);
    }

};


