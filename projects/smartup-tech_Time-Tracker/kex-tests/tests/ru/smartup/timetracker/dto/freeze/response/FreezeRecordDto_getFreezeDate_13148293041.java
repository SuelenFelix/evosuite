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

public class FreezeRecordDto_getFreezeDate_13148293041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public FreezeRecordDto_getFreezeDate_13148293041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term164 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term163 = ((Class) term164).getDeclaredField((String) "UN_FREEZE");
        ((Field) term163).setAccessible(true);
        Object enum0 = ((Field) term163).get((Object) null);
        term1 = newInstance(Class.forName("ru.smartup.timetracker.dto.freeze.response.FreezeRecordDto"));
        Object term2 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto"));
        Object term70 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term71 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term2, term2.getClass(), "year", 2012);
        setShortField(term2, term2.getClass(), "month", (short) 8);
        setShortField(term2, term2.getClass(), "day", (short) 25);
        setField(term1, term1.getClass(), "freezeDate", term2);
        setField(term1, term1.getClass(), "status", enum0);
        setIntField(term19, term19.getClass(), "id", 568599855);
        setField(term19, term19.getClass(), "firstName", "PAEBtnZtTD");
        setField(term19, term19.getClass(), "middleName", "sjlJAEtRrb");
        setField(term19, term19.getClass(), "lastName", "MuLcgQHgqz");
        setField(term19, term19.getClass(), "email", "xxtlPwDYFs");
        setBooleanField(term19, term19.getClass(), "isArchived", false);
        setField(term70, term70.getClass(), "elements", term71);
        setField(term19, term19.getClass(), "roles", term70);
        setField(term1, term1.getClass(), "employees", term19);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.freeze.response.FreezeRecordDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFreezeDate", argTypes, term1, args);
    }

};


