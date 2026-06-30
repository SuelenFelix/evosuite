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

public class SubmittedWorkDaysForEmployeesDto_setLastName_65064005813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15776;

    public SubmittedWorkDaysForEmployeesDto_setLastName_65064005813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15776 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto"));
        Object term15802 = newInstance(Class.forName("java.util.Date"));
        setIntField(term15776, term15776.getClass(), "employeeId", 933028652);
        setField(term15776, term15776.getClass(), "firstName", "tRxZafjqIx");
        setField(term15776, term15776.getClass(), "lastName", "DhjNLmRMCu");
        setLongField(term15802, term15802.getClass(), "fastTime", 1597352397295L);
        setField(term15802, term15802.getClass(), "cdate", null);
        setField(term15776, term15776.getClass(), "trackUnitWorkDay", term15802);
        setIntField(term15776, term15776.getClass(), "projectId", 287287233);
        setField(term15776, term15776.getClass(), "projectName", "PgPzMSEjjX");
        setLongField(term15776, term15776.getClass(), "trackUnitId", -6587807377747738663L);
        setLongField(term15776, term15776.getClass(), "taskId", -6301101997917060727L);
        setField(term15776, term15776.getClass(), "taskName", "wzsPSPcRdj");
        setFloatField(term15776, term15776.getClass(), "trackUnitHours", 0.7059082F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kGMQdqJYyB";
        callMethod(klass, "setLastName", argTypes, term15776, args);
    }

};


