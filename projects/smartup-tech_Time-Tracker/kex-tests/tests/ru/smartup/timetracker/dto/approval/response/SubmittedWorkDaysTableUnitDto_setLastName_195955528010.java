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
import java.util.ArrayList;
import java.lang.Object;

public class SubmittedWorkDaysTableUnitDto_setLastName_195955528010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28052;

    public SubmittedWorkDaysTableUnitDto_setLastName_195955528010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28080 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term28081 = newInstance(Class.forName("java.util.Date"));
        setLongField(term28081, term28081.getClass(), "fastTime", 1580485206758L);
        setField(term28081, term28081.getClass(), "cdate", null);
        setField(term28080, term28080.getClass(), "date", term28081);
        setFloatField(term28080, term28080.getClass(), "hours", 0.17829382F);
        ArrayList term28078 = new ArrayList();
        ((ArrayList) term28078).add(term28080);
        ArrayList term28093 = new ArrayList();
        ((ArrayList) term28093).add((Object)null);
        ((ArrayList) term28093).add((Object)null);
        ((ArrayList) term28093).add((Object)null);
        ((ArrayList) term28093).add((Object)null);
        ((ArrayList) term28093).add((Object)null);
        ((ArrayList) term28093).add((Object)null);
        ((ArrayList) term28093).add((Object)null);
        ((ArrayList) term28093).add((Object)null);
        ((ArrayList) term28093).add((Object)null);
        Object term28088 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term28088, term28088.getClass(), "projectId", 57189932);
        setField(term28088, term28088.getClass(), "projectName", "");
        setLongField(term28088, term28088.getClass(), "taskId", -6108006981756732593L);
        setField(term28088, term28088.getClass(), "taskName", "");
        setField(term28088, term28088.getClass(), "trackUnits", term28093);
        ArrayList term28086 = new ArrayList();
        ((ArrayList) term28086).add(term28088);
        term28052 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto"));
        setIntField(term28052, term28052.getClass(), "employeeId", 252575029);
        setField(term28052, term28052.getClass(), "firstName", "zHvfKaOstO");
        setField(term28052, term28052.getClass(), "lastName", "tOszriqETr");
        setField(term28052, term28052.getClass(), "summaryTrackUnits", term28078);
        setField(term28052, term28052.getClass(), "projectTrackUnits", term28086);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nrQjODRMLD";
        callMethod(klass, "setLastName", argTypes, term28052, args);
    }

};


