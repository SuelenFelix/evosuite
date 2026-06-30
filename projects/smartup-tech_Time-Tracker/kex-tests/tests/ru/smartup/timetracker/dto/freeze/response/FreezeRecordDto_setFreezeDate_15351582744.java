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

public class FreezeRecordDto_setFreezeDate_15351582744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1554;
     Object term1627;

    public FreezeRecordDto_setFreezeDate_15351582744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1632 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term1631 = ((Class) term1632).getDeclaredField((String) "INTERRUPTED");
        ((Field) term1631).setAccessible(true);
        Object enum3 = ((Field) term1631).get((Object) null);
        term1554 = newInstance(Class.forName("ru.smartup.timetracker.dto.freeze.response.FreezeRecordDto"));
        Object term1555 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1574 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto"));
        Object term1625 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term1626 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term1555, term1555.getClass(), "year", 2020);
        setShortField(term1555, term1555.getClass(), "month", (short) 11);
        setShortField(term1555, term1555.getClass(), "day", (short) 22);
        setField(term1554, term1554.getClass(), "freezeDate", term1555);
        setField(term1554, term1554.getClass(), "status", enum3);
        setIntField(term1574, term1574.getClass(), "id", 391863371);
        setField(term1574, term1574.getClass(), "firstName", "MxlszYVzRf");
        setField(term1574, term1574.getClass(), "middleName", "LQFpaHEwXR");
        setField(term1574, term1574.getClass(), "lastName", "oVcInYnLWB");
        setField(term1574, term1574.getClass(), "email", "aJlieCFVtF");
        setBooleanField(term1574, term1574.getClass(), "isArchived", false);
        setField(term1625, term1625.getClass(), "elements", term1626);
        setField(term1574, term1574.getClass(), "roles", term1625);
        setField(term1554, term1554.getClass(), "employees", term1574);
        term1627 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term1627, term1627.getClass(), "year", 2015);
        setShortField(term1627, term1627.getClass(), "month", (short) 9);
        setShortField(term1627, term1627.getClass(), "day", (short) 19);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.freeze.response.FreezeRecordDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term1627;
        callMethod(klass, "setFreezeDate", argTypes, term1554, args);
    }

};


