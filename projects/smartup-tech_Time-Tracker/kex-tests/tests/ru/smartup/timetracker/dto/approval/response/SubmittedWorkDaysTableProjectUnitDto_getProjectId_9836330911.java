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

public class SubmittedWorkDaysTableProjectUnitDto_getProjectId_9836330911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13495;

    public SubmittedWorkDaysTableProjectUnitDto_getProjectId_9836330911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13524 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term13526 = newInstance(Class.forName("java.util.Date"));
        setLongField(term13524, term13524.getClass(), "trackUnitId", -3838084482494604218L);
        setLongField(term13526, term13526.getClass(), "fastTime", 1797203628025L);
        setField(term13526, term13526.getClass(), "cdate", null);
        setField(term13524, term13524.getClass(), "date", term13526);
        setFloatField(term13524, term13524.getClass(), "hours", 0.7332741F);
        Object term13529 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term13531 = newInstance(Class.forName("java.util.Date"));
        setLongField(term13529, term13529.getClass(), "trackUnitId", 3892018155439224435L);
        setLongField(term13531, term13531.getClass(), "fastTime", 1589457921030L);
        setField(term13531, term13531.getClass(), "cdate", null);
        setField(term13529, term13529.getClass(), "date", term13531);
        setFloatField(term13529, term13529.getClass(), "hours", 0.15826964F);
        Object term13534 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term13536 = newInstance(Class.forName("java.util.Date"));
        setLongField(term13534, term13534.getClass(), "trackUnitId", 5953383087795962419L);
        setLongField(term13536, term13536.getClass(), "fastTime", 1745462962080L);
        setField(term13536, term13536.getClass(), "cdate", null);
        setField(term13534, term13534.getClass(), "date", term13536);
        setFloatField(term13534, term13534.getClass(), "hours", 0.45691717F);
        Object term13539 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term13541 = newInstance(Class.forName("java.util.Date"));
        setLongField(term13539, term13539.getClass(), "trackUnitId", 7994303628307559416L);
        setLongField(term13541, term13541.getClass(), "fastTime", 1349069753960L);
        setField(term13541, term13541.getClass(), "cdate", null);
        setField(term13539, term13539.getClass(), "date", term13541);
        setFloatField(term13539, term13539.getClass(), "hours", 0.17877543F);
        Object term13544 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term13546 = newInstance(Class.forName("java.util.Date"));
        setLongField(term13544, term13544.getClass(), "trackUnitId", 2443640364875054177L);
        setLongField(term13546, term13546.getClass(), "fastTime", 1706078172457L);
        setField(term13546, term13546.getClass(), "cdate", null);
        setField(term13544, term13544.getClass(), "date", term13546);
        setFloatField(term13544, term13544.getClass(), "hours", 0.8598297F);
        ArrayList term13522 = new ArrayList();
        ((ArrayList) term13522).add(term13524);
        ((ArrayList) term13522).add(term13529);
        ((ArrayList) term13522).add(term13534);
        ((ArrayList) term13522).add(term13539);
        ((ArrayList) term13522).add(term13544);
        term13495 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term13495, term13495.getClass(), "projectId", -1275173084);
        setField(term13495, term13495.getClass(), "projectName", "OEXDRUKcFl");
        setLongField(term13495, term13495.getClass(), "taskId", 3825396310311739952L);
        setField(term13495, term13495.getClass(), "taskName", "RYdKCNNMBR");
        setField(term13495, term13495.getClass(), "trackUnits", term13522);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectId", argTypes, term13495, args);
    }

};


