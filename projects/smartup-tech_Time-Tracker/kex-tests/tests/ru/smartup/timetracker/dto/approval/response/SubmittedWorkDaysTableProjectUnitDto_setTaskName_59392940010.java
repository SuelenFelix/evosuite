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

public class SubmittedWorkDaysTableProjectUnitDto_setTaskName_59392940010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44628;

    public SubmittedWorkDaysTableProjectUnitDto_setTaskName_59392940010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term44657 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44659 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44657, term44657.getClass(), "trackUnitId", -4924950707540628022L);
        setLongField(term44659, term44659.getClass(), "fastTime", 1311560117361L);
        setField(term44659, term44659.getClass(), "cdate", null);
        setField(term44657, term44657.getClass(), "date", term44659);
        setFloatField(term44657, term44657.getClass(), "hours", 0.6467969F);
        Object term44662 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44664 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44662, term44662.getClass(), "trackUnitId", -4393710401270724527L);
        setLongField(term44664, term44664.getClass(), "fastTime", 1595517583842L);
        setField(term44664, term44664.getClass(), "cdate", null);
        setField(term44662, term44662.getClass(), "date", term44664);
        setFloatField(term44662, term44662.getClass(), "hours", 0.9090794F);
        Object term44667 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44669 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44667, term44667.getClass(), "trackUnitId", -4822736661741380518L);
        setLongField(term44669, term44669.getClass(), "fastTime", 1464421789888L);
        setField(term44669, term44669.getClass(), "cdate", null);
        setField(term44667, term44667.getClass(), "date", term44669);
        setFloatField(term44667, term44667.getClass(), "hours", 0.6117589F);
        Object term44672 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44674 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44672, term44672.getClass(), "trackUnitId", -5386201758403679145L);
        setLongField(term44674, term44674.getClass(), "fastTime", 1405279189488L);
        setField(term44674, term44674.getClass(), "cdate", null);
        setField(term44672, term44672.getClass(), "date", term44674);
        setFloatField(term44672, term44672.getClass(), "hours", 0.2599733F);
        Object term44677 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44679 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44677, term44677.getClass(), "trackUnitId", -7268507582722666254L);
        setLongField(term44679, term44679.getClass(), "fastTime", 1822704644050L);
        setField(term44679, term44679.getClass(), "cdate", null);
        setField(term44677, term44677.getClass(), "date", term44679);
        setFloatField(term44677, term44677.getClass(), "hours", 0.7806282F);
        Object term44682 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44684 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44682, term44682.getClass(), "trackUnitId", 5671808784468963649L);
        setLongField(term44684, term44684.getClass(), "fastTime", 1678177615298L);
        setField(term44684, term44684.getClass(), "cdate", null);
        setField(term44682, term44682.getClass(), "date", term44684);
        setFloatField(term44682, term44682.getClass(), "hours", 0.78148645F);
        Object term44687 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44689 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44687, term44687.getClass(), "trackUnitId", 2297097306706899827L);
        setLongField(term44689, term44689.getClass(), "fastTime", 1666076287186L);
        setField(term44689, term44689.getClass(), "cdate", null);
        setField(term44687, term44687.getClass(), "date", term44689);
        setFloatField(term44687, term44687.getClass(), "hours", 0.28933305F);
        ArrayList term44655 = new ArrayList();
        ((ArrayList) term44655).add(term44657);
        ((ArrayList) term44655).add(term44662);
        ((ArrayList) term44655).add(term44667);
        ((ArrayList) term44655).add(term44672);
        ((ArrayList) term44655).add(term44677);
        ((ArrayList) term44655).add(term44682);
        ((ArrayList) term44655).add(term44687);
        term44628 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term44628, term44628.getClass(), "projectId", 628918458);
        setField(term44628, term44628.getClass(), "projectName", "mNHyqmOAFy");
        setLongField(term44628, term44628.getClass(), "taskId", -6342139649364011743L);
        setField(term44628, term44628.getClass(), "taskName", "UxgSdhxPCH");
        setField(term44628, term44628.getClass(), "trackUnits", term44655);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DAujxZPHJC";
        callMethod(klass, "setTaskName", argTypes, term44628, args);
    }

};


