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

public class Position_isArchived_11582107994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108276;

    public Position_isArchived_11582107994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108276 = newInstance(Class.forName("ru.smartup.timetracker.entity.Position"));
        Object term108292 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term108295 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term108276, term108276.getClass(), "id", -995785731);
        setField(term108276, term108276.getClass(), "name", "mdxcgZwsaP");
        setFloatField(term108276, term108276.getClass(), "externalRate", 0.5703112F);
        setBooleanField(term108276, term108276.getClass(), "isArchived", false);
        setIntField(term108292, term108292.getClass(), "nanos", 536000000);
        setLongField(term108292, term108292.getClass(), "fastTime", 1810891010000L);
        setField(term108292, term108292.getClass(), "cdate", null);
        setField(term108276, term108276.getClass(), "createdDate", term108292);
        setIntField(term108295, term108295.getClass(), "nanos", 295000000);
        setLongField(term108295, term108295.getClass(), "fastTime", 1865294281000L);
        setField(term108295, term108295.getClass(), "cdate", null);
        setField(term108276, term108276.getClass(), "lastModifiedDate", term108295);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Position");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isArchived", argTypes, term108276, args);
    }

};


