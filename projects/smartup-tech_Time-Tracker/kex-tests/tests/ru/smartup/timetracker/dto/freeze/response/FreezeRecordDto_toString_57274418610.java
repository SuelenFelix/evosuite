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

public class FreezeRecordDto_toString_57274418610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5023;

    public FreezeRecordDto_toString_57274418610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5095 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term5094 = ((Class) term5095).getDeclaredField((String) "UN_FREEZE");
        ((Field) term5094).setAccessible(true);
        Object enum10 = ((Field) term5094).get((Object) null);
        term5023 = newInstance(Class.forName("ru.smartup.timetracker.dto.freeze.response.FreezeRecordDto"));
        Object term5024 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5041 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto"));
        Object term5092 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term5093 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term5024, term5024.getClass(), "year", 2026);
        setShortField(term5024, term5024.getClass(), "month", (short) 12);
        setShortField(term5024, term5024.getClass(), "day", (short) 13);
        setField(term5023, term5023.getClass(), "freezeDate", term5024);
        setField(term5023, term5023.getClass(), "status", enum10);
        setIntField(term5041, term5041.getClass(), "id", 1725571209);
        setField(term5041, term5041.getClass(), "firstName", "wSQxaModmm");
        setField(term5041, term5041.getClass(), "middleName", "UlajhuVLaP");
        setField(term5041, term5041.getClass(), "lastName", "gGSMzuGICf");
        setField(term5041, term5041.getClass(), "email", "hxCBltsObl");
        setBooleanField(term5041, term5041.getClass(), "isArchived", false);
        setField(term5092, term5092.getClass(), "elements", term5093);
        setField(term5041, term5041.getClass(), "roles", term5092);
        setField(term5023, term5023.getClass(), "employees", term5041);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.freeze.response.FreezeRecordDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5023, args);
    }

};


