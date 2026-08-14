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

public class SubmittedWorkDaysTableProjectUnitDto_equals_107960612512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44826;
     Object term44892;

    public SubmittedWorkDaysTableProjectUnitDto_equals_107960612512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term44855 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44857 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44855, term44855.getClass(), "trackUnitId", 148047808219672941L);
        setLongField(term44857, term44857.getClass(), "fastTime", 1362780563394L);
        setField(term44857, term44857.getClass(), "cdate", null);
        setField(term44855, term44855.getClass(), "date", term44857);
        setFloatField(term44855, term44855.getClass(), "hours", 0.26696402F);
        Object term44860 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44862 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44860, term44860.getClass(), "trackUnitId", 7489064039921396098L);
        setLongField(term44862, term44862.getClass(), "fastTime", 1853963979281L);
        setField(term44862, term44862.getClass(), "cdate", null);
        setField(term44860, term44860.getClass(), "date", term44862);
        setFloatField(term44860, term44860.getClass(), "hours", 0.54856896F);
        Object term44865 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44867 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44865, term44865.getClass(), "trackUnitId", 6843866297465638866L);
        setLongField(term44867, term44867.getClass(), "fastTime", 1795936337628L);
        setField(term44867, term44867.getClass(), "cdate", null);
        setField(term44865, term44865.getClass(), "date", term44867);
        setFloatField(term44865, term44865.getClass(), "hours", 0.6206213F);
        Object term44870 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44872 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44870, term44870.getClass(), "trackUnitId", -4023935540989049732L);
        setLongField(term44872, term44872.getClass(), "fastTime", 1802995433545L);
        setField(term44872, term44872.getClass(), "cdate", null);
        setField(term44870, term44870.getClass(), "date", term44872);
        setFloatField(term44870, term44870.getClass(), "hours", 0.9765248F);
        Object term44875 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44877 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44875, term44875.getClass(), "trackUnitId", 855932984568615096L);
        setLongField(term44877, term44877.getClass(), "fastTime", 1843214817357L);
        setField(term44877, term44877.getClass(), "cdate", null);
        setField(term44875, term44875.getClass(), "date", term44877);
        setFloatField(term44875, term44875.getClass(), "hours", 0.17890882F);
        Object term44880 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44882 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44880, term44880.getClass(), "trackUnitId", -1616722610139554082L);
        setLongField(term44882, term44882.getClass(), "fastTime", 1628695316832L);
        setField(term44882, term44882.getClass(), "cdate", null);
        setField(term44880, term44880.getClass(), "date", term44882);
        setFloatField(term44880, term44880.getClass(), "hours", 0.9184034F);
        Object term44885 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44887 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44885, term44885.getClass(), "trackUnitId", 7495904023107549024L);
        setLongField(term44887, term44887.getClass(), "fastTime", 1393200035243L);
        setField(term44887, term44887.getClass(), "cdate", null);
        setField(term44885, term44885.getClass(), "date", term44887);
        setFloatField(term44885, term44885.getClass(), "hours", 0.7326771F);
        ArrayList term44853 = new ArrayList();
        ((ArrayList) term44853).add(term44855);
        ((ArrayList) term44853).add(term44860);
        ((ArrayList) term44853).add(term44865);
        ((ArrayList) term44853).add(term44870);
        ((ArrayList) term44853).add(term44875);
        ((ArrayList) term44853).add(term44880);
        ((ArrayList) term44853).add(term44885);
        term44826 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term44826, term44826.getClass(), "projectId", 1041916673);
        setField(term44826, term44826.getClass(), "projectName", "GLbyDfbNZI");
        setLongField(term44826, term44826.getClass(), "taskId", -2255965562447970862L);
        setField(term44826, term44826.getClass(), "taskName", "oNLcCYDAsO");
        setField(term44826, term44826.getClass(), "trackUnits", term44853);
        term44892 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term44892;
        callMethod(klass, "equals", argTypes, term44826, args);
    }

};


