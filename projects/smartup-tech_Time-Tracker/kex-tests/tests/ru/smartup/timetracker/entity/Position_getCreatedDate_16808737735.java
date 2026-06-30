package ru.smartup.timetracker.entity;

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
import static ru.smartup.timetracker.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Position_getCreatedDate_16808737735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108308;

    public Position_getCreatedDate_16808737735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108308 = newInstance(Class.forName("ru.smartup.timetracker.entity.Position"));
        Object term108324 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term108327 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term108308, term108308.getClass(), "id", 1349815364);
        setField(term108308, term108308.getClass(), "name", "XildIRoZHG");
        setFloatField(term108308, term108308.getClass(), "externalRate", 0.8823181F);
        setBooleanField(term108308, term108308.getClass(), "isArchived", false);
        setIntField(term108324, term108324.getClass(), "nanos", 939000000);
        setLongField(term108324, term108324.getClass(), "fastTime", 1862843811000L);
        setField(term108324, term108324.getClass(), "cdate", null);
        setField(term108308, term108308.getClass(), "createdDate", term108324);
        setIntField(term108327, term108327.getClass(), "nanos", 604000000);
        setLongField(term108327, term108327.getClass(), "fastTime", 1636350901000L);
        setField(term108327, term108327.getClass(), "cdate", null);
        setField(term108308, term108308.getClass(), "lastModifiedDate", term108327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Position");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedDate", argTypes, term108308, args);
    }

};


