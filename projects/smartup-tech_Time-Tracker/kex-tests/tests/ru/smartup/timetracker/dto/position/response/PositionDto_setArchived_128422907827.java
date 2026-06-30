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
import java.lang.Boolean;

public class PositionDto_setArchived_128422907827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term589;
     Object term593;

    public PositionDto_setArchived_128422907827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term589 = newInstance(Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto"));
        setIntField(term589, term589.getClass(), "id", 0);
        setField(term589, term589.getClass(), "name", null);
        setFloatField(term589, term589.getClass(), "externalRate", 0.0F);
        setBooleanField(term589, term589.getClass(), "isArchived", false);
        setField(term589, term589.getClass(), "createdDate", null);
        setField(term589, term589.getClass(), "lastModifiedDate", null);
        term593 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term593;
        callMethod(klass, "setArchived", argTypes, term589, args);
    }

};


