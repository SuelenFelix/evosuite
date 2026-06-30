package ru.smartup.timetracker.dto.approval.response;

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
import static ru.smartup.timetracker.dto.approval.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SubmittedWorkDaysForEmployeesDto_hashCode_174025726123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16814;

    public SubmittedWorkDaysForEmployeesDto_hashCode_174025726123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16814 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto"));
        Object term16840 = newInstance(Class.forName("java.util.Date"));
        setIntField(term16814, term16814.getClass(), "employeeId", -1772434990);
        setField(term16814, term16814.getClass(), "firstName", "MHGKyEnwKc");
        setField(term16814, term16814.getClass(), "lastName", "ShIELyuULw");
        setLongField(term16840, term16840.getClass(), "fastTime", 1450865259896L);
        setField(term16840, term16840.getClass(), "cdate", null);
        setField(term16814, term16814.getClass(), "trackUnitWorkDay", term16840);
        setIntField(term16814, term16814.getClass(), "projectId", -1845499264);
        setField(term16814, term16814.getClass(), "projectName", "IpQuOGMgmj");
        setLongField(term16814, term16814.getClass(), "trackUnitId", -8471550651709805183L);
        setLongField(term16814, term16814.getClass(), "taskId", -948292411727204525L);
        setField(term16814, term16814.getClass(), "taskName", "pJbnHTYrxn");
        setFloatField(term16814, term16814.getClass(), "trackUnitHours", 0.85665673F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term16814, args);
    }

};


