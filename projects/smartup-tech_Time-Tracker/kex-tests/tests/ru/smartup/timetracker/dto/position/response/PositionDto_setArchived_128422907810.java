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
import java.lang.Boolean;

public class PositionDto_setArchived_128422907810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315;
     Object term337;

    public PositionDto_setArchived_128422907810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term315 = newInstance(Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto"));
        Object term331 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term334 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term315, term315.getClass(), "id", 1725571209);
        setField(term315, term315.getClass(), "name", "NRdvgJlhkX");
        setFloatField(term315, term315.getClass(), "externalRate", 0.40176582F);
        setBooleanField(term315, term315.getClass(), "isArchived", true);
        setIntField(term331, term331.getClass(), "nanos", 825000000);
        setLongField(term331, term331.getClass(), "fastTime", 1668558429000L);
        setField(term331, term331.getClass(), "cdate", null);
        setField(term315, term315.getClass(), "createdDate", term331);
        setIntField(term334, term334.getClass(), "nanos", 647000000);
        setLongField(term334, term334.getClass(), "fastTime", 1725111417000L);
        setField(term334, term334.getClass(), "cdate", null);
        setField(term315, term315.getClass(), "lastModifiedDate", term334);
        term337 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term337;
        callMethod(klass, "setArchived", argTypes, term315, args);
    }

};


