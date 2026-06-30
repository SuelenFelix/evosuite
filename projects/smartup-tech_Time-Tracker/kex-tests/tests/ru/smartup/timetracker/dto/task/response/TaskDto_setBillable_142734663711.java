package ru.smartup.timetracker.dto.task.response;

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
import static ru.smartup.timetracker.dto.task.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Boolean;

public class TaskDto_setBillable_142734663711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1199;
     Object term1222;

    public TaskDto_setBillable_142734663711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1199 = newInstance(Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto"));
        Object term1216 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1219 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term1199, term1199.getClass(), "id", -4502405999831680926L);
        setField(term1199, term1199.getClass(), "name", "hxCBltsObl");
        setIntField(term1199, term1199.getClass(), "projectId", -157887805);
        setBooleanField(term1199, term1199.getClass(), "billable", true);
        setBooleanField(term1199, term1199.getClass(), "isArchived", true);
        setIntField(term1216, term1216.getClass(), "nanos", 689000000);
        setLongField(term1216, term1216.getClass(), "fastTime", 1550688194000L);
        setField(term1216, term1216.getClass(), "cdate", null);
        setField(term1199, term1199.getClass(), "createdDate", term1216);
        setIntField(term1219, term1219.getClass(), "nanos", 131000000);
        setLongField(term1219, term1219.getClass(), "fastTime", 1804987287000L);
        setField(term1219, term1219.getClass(), "cdate", null);
        setField(term1199, term1199.getClass(), "lastModifiedDate", term1219);
        term1222 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1222;
        callMethod(klass, "setBillable", argTypes, term1199, args);
    }

};


