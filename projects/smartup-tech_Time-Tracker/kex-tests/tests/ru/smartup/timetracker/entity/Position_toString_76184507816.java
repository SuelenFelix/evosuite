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

public class Position_toString_76184507816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108696;

    public Position_toString_76184507816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108696 = newInstance(Class.forName("ru.smartup.timetracker.entity.Position"));
        Object term108712 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term108715 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term108696, term108696.getClass(), "id", 1010721666);
        setField(term108696, term108696.getClass(), "name", "aJQuCOCvZs");
        setFloatField(term108696, term108696.getClass(), "externalRate", 0.93741155F);
        setBooleanField(term108696, term108696.getClass(), "isArchived", false);
        setIntField(term108712, term108712.getClass(), "nanos", 293000000);
        setLongField(term108712, term108712.getClass(), "fastTime", 1662189563000L);
        setField(term108712, term108712.getClass(), "cdate", null);
        setField(term108696, term108696.getClass(), "createdDate", term108712);
        setIntField(term108715, term108715.getClass(), "nanos", 437000000);
        setLongField(term108715, term108715.getClass(), "fastTime", 1766034465000L);
        setField(term108715, term108715.getClass(), "cdate", null);
        setField(term108696, term108696.getClass(), "lastModifiedDate", term108715);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Position");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term108696, args);
    }

};


