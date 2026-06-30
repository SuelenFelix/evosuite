package ru.smartup.timetracker.pojo;

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
import static ru.smartup.timetracker.pojo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SubmittedWorkDaysForEmployees_getFirstName_20833226302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56083;

    public SubmittedWorkDaysForEmployees_getFirstName_20833226302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56083 = newInstance(Class.forName("ru.smartup.timetracker.pojo.SubmittedWorkDaysForEmployees"));
        Object term56109 = newInstance(Class.forName("java.util.Date"));
        setIntField(term56083, term56083.getClass(), "employeeId", 1358829571);
        setField(term56083, term56083.getClass(), "firstName", "fKhrQsJToZ");
        setField(term56083, term56083.getClass(), "lastName", "wsysQLGFnl");
        setLongField(term56109, term56109.getClass(), "fastTime", 1597421765774L);
        setField(term56109, term56109.getClass(), "cdate", null);
        setField(term56083, term56083.getClass(), "trackUnitWorkDay", term56109);
        setIntField(term56083, term56083.getClass(), "projectId", 991356662);
        setField(term56083, term56083.getClass(), "projectName", "ckQLZGFjMX");
        setLongField(term56083, term56083.getClass(), "trackUnitId", -1804015692891701666L);
        setLongField(term56083, term56083.getClass(), "taskId", -6432617521836576658L);
        setField(term56083, term56083.getClass(), "taskName", "qphdrqUtNx");
        setFloatField(term56083, term56083.getClass(), "trackUnitHours", 0.016047299F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.SubmittedWorkDaysForEmployees");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term56083, args);
    }

};


