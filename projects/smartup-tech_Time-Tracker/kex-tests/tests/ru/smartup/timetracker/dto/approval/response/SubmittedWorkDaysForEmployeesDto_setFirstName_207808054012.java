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

public class SubmittedWorkDaysForEmployeesDto_setFirstName_207808054012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15658;

    public SubmittedWorkDaysForEmployeesDto_setFirstName_207808054012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15658 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto"));
        Object term15684 = newInstance(Class.forName("java.util.Date"));
        setIntField(term15658, term15658.getClass(), "employeeId", -93135961);
        setField(term15658, term15658.getClass(), "firstName", "kNqaJKIATy");
        setField(term15658, term15658.getClass(), "lastName", "vKQukfbJUd");
        setLongField(term15684, term15684.getClass(), "fastTime", 1272776321768L);
        setField(term15684, term15684.getClass(), "cdate", null);
        setField(term15658, term15658.getClass(), "trackUnitWorkDay", term15684);
        setIntField(term15658, term15658.getClass(), "projectId", -112921587);
        setField(term15658, term15658.getClass(), "projectName", "lFRJFUMVbx");
        setLongField(term15658, term15658.getClass(), "trackUnitId", -2924531382671518368L);
        setLongField(term15658, term15658.getClass(), "taskId", -3948863953565024517L);
        setField(term15658, term15658.getClass(), "taskName", "sZdUNdggUW");
        setFloatField(term15658, term15658.getClass(), "trackUnitHours", 0.75913525F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OqbwYQfvAe";
        callMethod(klass, "setFirstName", argTypes, term15658, args);
    }

};


