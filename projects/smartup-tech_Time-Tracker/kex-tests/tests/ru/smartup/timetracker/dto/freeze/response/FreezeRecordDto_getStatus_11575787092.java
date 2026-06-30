package ru.smartup.timetracker.dto.freeze.response;

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
import static ru.smartup.timetracker.dto.freeze.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class FreezeRecordDto_getStatus_11575787092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term582;

    public FreezeRecordDto_getStatus_11575787092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term653 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term652 = ((Class) term653).getDeclaredField((String) "OUTDATED");
        ((Field) term652).setAccessible(true);
        Object enum1 = ((Field) term652).get((Object) null);
        term582 = newInstance(Class.forName("ru.smartup.timetracker.dto.freeze.response.FreezeRecordDto"));
        Object term583 = newInstance(Class.forName("java.time.LocalDate"));
        Object term599 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto"));
        Object term650 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term651 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term583, term583.getClass(), "year", 2016);
        setShortField(term583, term583.getClass(), "month", (short) 11);
        setShortField(term583, term583.getClass(), "day", (short) 29);
        setField(term582, term582.getClass(), "freezeDate", term583);
        setField(term582, term582.getClass(), "status", enum1);
        setIntField(term599, term599.getClass(), "id", 1162663216);
        setField(term599, term599.getClass(), "firstName", "jJCZpVmanW");
        setField(term599, term599.getClass(), "middleName", "EGtDIRbSSb");
        setField(term599, term599.getClass(), "lastName", "SzjVpOQTyS");
        setField(term599, term599.getClass(), "email", "MjGYSRKTNF");
        setBooleanField(term599, term599.getClass(), "isArchived", false);
        setField(term650, term650.getClass(), "elements", term651);
        setField(term599, term599.getClass(), "roles", term650);
        setField(term582, term582.getClass(), "employees", term599);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.freeze.response.FreezeRecordDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term582, args);
    }

};


