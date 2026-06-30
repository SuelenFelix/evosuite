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

public class FreezeRecordDto_setEmployees_6207058636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2946;
     Object term3019;

    public FreezeRecordDto_setEmployees_6207058636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3071 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term3070 = ((Class) term3071).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term3070).setAccessible(true);
        Object enum6 = ((Field) term3070).get((Object) null);
        term2946 = newInstance(Class.forName("ru.smartup.timetracker.dto.freeze.response.FreezeRecordDto"));
        Object term2947 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2966 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto"));
        Object term3017 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term3018 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term2947, term2947.getClass(), "year", 2015);
        setShortField(term2947, term2947.getClass(), "month", (short) 4);
        setShortField(term2947, term2947.getClass(), "day", (short) 14);
        setField(term2946, term2946.getClass(), "freezeDate", term2947);
        setField(term2946, term2946.getClass(), "status", enum6);
        setIntField(term2966, term2966.getClass(), "id", -616727354);
        setField(term2966, term2966.getClass(), "firstName", "hNxWaHcfhY");
        setField(term2966, term2966.getClass(), "middleName", "RkybSrpybU");
        setField(term2966, term2966.getClass(), "lastName", "xOEqzGAmDU");
        setField(term2966, term2966.getClass(), "email", "eZFUvlxvGV");
        setBooleanField(term2966, term2966.getClass(), "isArchived", true);
        setField(term3017, term3017.getClass(), "elements", term3018);
        setField(term2966, term2966.getClass(), "roles", term3017);
        setField(term2946, term2946.getClass(), "employees", term2966);
        term3019 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto"));
        setIntField(term3019, term3019.getClass(), "id", -1955890973);
        setField(term3019, term3019.getClass(), "firstName", "BYqFIqCKAV");
        setField(term3019, term3019.getClass(), "middleName", "vrQLuWIDJX");
        setField(term3019, term3019.getClass(), "lastName", "flxyYxBRtu");
        setField(term3019, term3019.getClass(), "email", "OclPbYPkcH");
        setBooleanField(term3019, term3019.getClass(), "isArchived", true);
        setField(term3019, term3019.getClass(), "roles", term3017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.freeze.response.FreezeRecordDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto");
        Object[] args = new Object[1];
        args[0] = term3019;
        callMethod(klass, "setEmployees", argTypes, term2946, args);
    }

};


