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

public class FreezeRecordDto_equals_15321905517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3535;
     Object term3608;

    public FreezeRecordDto_equals_15321905517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3610 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term3609 = ((Class) term3610).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term3609).setAccessible(true);
        Object enum7 = ((Field) term3609).get((Object) null);
        term3535 = newInstance(Class.forName("ru.smartup.timetracker.dto.freeze.response.FreezeRecordDto"));
        Object term3536 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3555 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto"));
        Object term3606 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term3607 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term3536, term3536.getClass(), "year", 2017);
        setShortField(term3536, term3536.getClass(), "month", (short) 5);
        setShortField(term3536, term3536.getClass(), "day", (short) 21);
        setField(term3535, term3535.getClass(), "freezeDate", term3536);
        setField(term3535, term3535.getClass(), "status", enum7);
        setIntField(term3555, term3555.getClass(), "id", -2038273078);
        setField(term3555, term3555.getClass(), "firstName", "IoAlmYsBwc");
        setField(term3555, term3555.getClass(), "middleName", "TEParAifyi");
        setField(term3555, term3555.getClass(), "lastName", "OWDIEULEFu");
        setField(term3555, term3555.getClass(), "email", "dWRymuLBtr");
        setBooleanField(term3555, term3555.getClass(), "isArchived", true);
        setField(term3606, term3606.getClass(), "elements", term3607);
        setField(term3555, term3555.getClass(), "roles", term3606);
        setField(term3535, term3535.getClass(), "employees", term3555);
        term3608 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.freeze.response.FreezeRecordDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3608;
        callMethod(klass, "equals", argTypes, term3535, args);
    }

};


