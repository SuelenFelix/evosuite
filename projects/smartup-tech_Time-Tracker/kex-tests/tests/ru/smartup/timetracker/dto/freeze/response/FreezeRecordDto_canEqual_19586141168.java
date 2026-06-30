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

public class FreezeRecordDto_canEqual_19586141168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4034;
     Object term4107;

    public FreezeRecordDto_canEqual_19586141168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4109 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term4108 = ((Class) term4109).getDeclaredField((String) "INTERRUPTED");
        ((Field) term4108).setAccessible(true);
        Object enum8 = ((Field) term4108).get((Object) null);
        term4034 = newInstance(Class.forName("ru.smartup.timetracker.dto.freeze.response.FreezeRecordDto"));
        Object term4035 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4054 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto"));
        Object term4105 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term4106 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term4035, term4035.getClass(), "year", 2022);
        setShortField(term4035, term4035.getClass(), "month", (short) 2);
        setShortField(term4035, term4035.getClass(), "day", (short) 25);
        setField(term4034, term4034.getClass(), "freezeDate", term4035);
        setField(term4034, term4034.getClass(), "status", enum8);
        setIntField(term4054, term4054.getClass(), "id", 1227103734);
        setField(term4054, term4054.getClass(), "firstName", "AijpHYOFuy");
        setField(term4054, term4054.getClass(), "middleName", "SbAoxhfrkn");
        setField(term4054, term4054.getClass(), "lastName", "kuTXqwMtDB");
        setField(term4054, term4054.getClass(), "email", "Ghbwtircqb");
        setBooleanField(term4054, term4054.getClass(), "isArchived", false);
        setField(term4105, term4105.getClass(), "elements", term4106);
        setField(term4054, term4054.getClass(), "roles", term4105);
        setField(term4034, term4034.getClass(), "employees", term4054);
        term4107 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.freeze.response.FreezeRecordDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4107;
        callMethod(klass, "canEqual", argTypes, term4034, args);
    }

};


