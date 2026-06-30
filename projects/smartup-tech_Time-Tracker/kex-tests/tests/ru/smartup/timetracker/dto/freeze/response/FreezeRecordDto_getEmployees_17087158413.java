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

public class FreezeRecordDto_getEmployees_17087158413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1068;

    public FreezeRecordDto_getEmployees_17087158413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1139 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term1138 = ((Class) term1139).getDeclaredField((String) "DELETING");
        ((Field) term1138).setAccessible(true);
        Object enum2 = ((Field) term1138).get((Object) null);
        term1068 = newInstance(Class.forName("ru.smartup.timetracker.dto.freeze.response.FreezeRecordDto"));
        Object term1069 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1085 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto"));
        Object term1136 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term1137 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term1069, term1069.getClass(), "year", 2021);
        setShortField(term1069, term1069.getClass(), "month", (short) 1);
        setShortField(term1069, term1069.getClass(), "day", (short) 18);
        setField(term1068, term1068.getClass(), "freezeDate", term1069);
        setField(term1068, term1068.getClass(), "status", enum2);
        setIntField(term1085, term1085.getClass(), "id", 1484323161);
        setField(term1085, term1085.getClass(), "firstName", "hRNSzYYIrc");
        setField(term1085, term1085.getClass(), "middleName", "RMFIsYGgne");
        setField(term1085, term1085.getClass(), "lastName", "NRdvgJlhkX");
        setField(term1085, term1085.getClass(), "email", "uuaPigETmJ");
        setBooleanField(term1085, term1085.getClass(), "isArchived", false);
        setField(term1136, term1136.getClass(), "elements", term1137);
        setField(term1085, term1085.getClass(), "roles", term1136);
        setField(term1068, term1068.getClass(), "employees", term1085);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.freeze.response.FreezeRecordDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployees", argTypes, term1068, args);
    }

};


