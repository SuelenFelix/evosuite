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

public class SubmittedWorkDaysForEmployeesDto_getTrackUnitId_17373499907 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15176;

    public SubmittedWorkDaysForEmployeesDto_getTrackUnitId_17373499907() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15176 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto"));
        Object term15202 = newInstance(Class.forName("java.util.Date"));
        setIntField(term15176, term15176.getClass(), "employeeId", 458147407);
        setField(term15176, term15176.getClass(), "firstName", "OYbzXylRWW");
        setField(term15176, term15176.getClass(), "lastName", "DSNsTGYXDF");
        setLongField(term15202, term15202.getClass(), "fastTime", 1838357779277L);
        setField(term15202, term15202.getClass(), "cdate", null);
        setField(term15176, term15176.getClass(), "trackUnitWorkDay", term15202);
        setIntField(term15176, term15176.getClass(), "projectId", -184153539);
        setField(term15176, term15176.getClass(), "projectName", "sQvGcVjdEx");
        setLongField(term15176, term15176.getClass(), "trackUnitId", 7489064039921396098L);
        setLongField(term15176, term15176.getClass(), "taskId", 6843866297465638866L);
        setField(term15176, term15176.getClass(), "taskName", "rLHAoqXgPh");
        setFloatField(term15176, term15176.getClass(), "trackUnitHours", 0.5703112F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrackUnitId", argTypes, term15176, args);
    }

};


