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

public class FreezeRecordDto_setStatus_19637442075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2056;
     Object enum5;

    public FreezeRecordDto_setStatus_19637442075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2143 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term2142 = ((Class) term2143).getDeclaredField((String) "INTERRUPTED");
        ((Field) term2142).setAccessible(true);
        Object enum4 = ((Field) term2142).get((Object) null);
        term2056 = newInstance(Class.forName("ru.smartup.timetracker.dto.freeze.response.FreezeRecordDto"));
        Object term2057 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2076 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto"));
        Object term2127 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term2128 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term2057, term2057.getClass(), "year", 2018);
        setShortField(term2057, term2057.getClass(), "month", (short) 1);
        setShortField(term2057, term2057.getClass(), "day", (short) 13);
        setField(term2056, term2056.getClass(), "freezeDate", term2057);
        setField(term2056, term2056.getClass(), "status", enum4);
        setIntField(term2076, term2076.getClass(), "id", -1922583790);
        setField(term2076, term2076.getClass(), "firstName", "ZiaGIbnzTs");
        setField(term2076, term2076.getClass(), "middleName", "tbcdzjIfER");
        setField(term2076, term2076.getClass(), "lastName", "HyxfbSQYBe");
        setField(term2076, term2076.getClass(), "email", "pCTimMblYc");
        setBooleanField(term2076, term2076.getClass(), "isArchived", true);
        setField(term2127, term2127.getClass(), "elements", term2128);
        setField(term2076, term2076.getClass(), "roles", term2127);
        setField(term2056, term2056.getClass(), "employees", term2076);
        Class<? extends Object> term2568 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term2567 = ((Class) term2568).getDeclaredField((String) "COMPLETED");
        ((Field) term2567).setAccessible(true);
        enum5 = ((Field) term2567).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.freeze.response.FreezeRecordDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Object[] args = new Object[1];
        args[0] = enum5;
        callMethod(klass, "setStatus", argTypes, term2056, args);
    }

};


