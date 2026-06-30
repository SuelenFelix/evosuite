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

public class SubmittedWorkDaysTableProjectUnitDto_setTaskName_5939294009 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14084;

    public SubmittedWorkDaysTableProjectUnitDto_setTaskName_5939294009() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term14113 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term14115 = newInstance(Class.forName("java.util.Date"));
        setLongField(term14113, term14113.getClass(), "trackUnitId", 1672578078364590450L);
        setLongField(term14115, term14115.getClass(), "fastTime", 1822704644050L);
        setField(term14115, term14115.getClass(), "cdate", null);
        setField(term14113, term14113.getClass(), "date", term14115);
        setFloatField(term14113, term14113.getClass(), "hours", 0.21723765F);
        Object term14118 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term14120 = newInstance(Class.forName("java.util.Date"));
        setLongField(term14118, term14118.getClass(), "trackUnitId", 4949335493504695457L);
        setLongField(term14120, term14120.getClass(), "fastTime", 1678177615298L);
        setField(term14120, term14120.getClass(), "cdate", null);
        setField(term14118, term14118.getClass(), "date", term14120);
        setFloatField(term14118, term14118.getClass(), "hours", 0.06688923F);
        Object term14123 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term14125 = newInstance(Class.forName("java.util.Date"));
        setLongField(term14123, term14123.getClass(), "trackUnitId", -5216789073301458893L);
        setLongField(term14125, term14125.getClass(), "fastTime", 1666076287186L);
        setField(term14125, term14125.getClass(), "cdate", null);
        setField(term14123, term14123.getClass(), "date", term14125);
        setFloatField(term14123, term14123.getClass(), "hours", 0.22417867F);
        Object term14128 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term14130 = newInstance(Class.forName("java.util.Date"));
        setLongField(term14128, term14128.getClass(), "trackUnitId", -1832940336320585644L);
        setLongField(term14130, term14130.getClass(), "fastTime", 1426018874434L);
        setField(term14130, term14130.getClass(), "cdate", null);
        setField(term14128, term14128.getClass(), "date", term14130);
        setFloatField(term14128, term14128.getClass(), "hours", 0.35872674F);
        Object term14133 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term14135 = newInstance(Class.forName("java.util.Date"));
        setLongField(term14133, term14133.getClass(), "trackUnitId", -8033714905181142681L);
        setLongField(term14135, term14135.getClass(), "fastTime", 1633004775487L);
        setField(term14135, term14135.getClass(), "cdate", null);
        setField(term14133, term14133.getClass(), "date", term14135);
        setFloatField(term14133, term14133.getClass(), "hours", 0.2946385F);
        Object term14138 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term14140 = newInstance(Class.forName("java.util.Date"));
        setLongField(term14138, term14138.getClass(), "trackUnitId", -9040825890007374809L);
        setLongField(term14140, term14140.getClass(), "fastTime", 1819191638549L);
        setField(term14140, term14140.getClass(), "cdate", null);
        setField(term14138, term14138.getClass(), "date", term14140);
        setFloatField(term14138, term14138.getClass(), "hours", 0.07802445F);
        Object term14143 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term14145 = newInstance(Class.forName("java.util.Date"));
        setLongField(term14143, term14143.getClass(), "trackUnitId", 1368340889161782793L);
        setLongField(term14145, term14145.getClass(), "fastTime", 1400691778698L);
        setField(term14145, term14145.getClass(), "cdate", null);
        setField(term14143, term14143.getClass(), "date", term14145);
        setFloatField(term14143, term14143.getClass(), "hours", 0.36114347F);
        ArrayList term14111 = new ArrayList();
        ((ArrayList) term14111).add(term14113);
        ((ArrayList) term14111).add(term14118);
        ((ArrayList) term14111).add(term14123);
        ((ArrayList) term14111).add(term14128);
        ((ArrayList) term14111).add(term14133);
        ((ArrayList) term14111).add(term14138);
        ((ArrayList) term14111).add(term14143);
        term14084 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term14084, term14084.getClass(), "projectId", -469968304);
        setField(term14084, term14084.getClass(), "projectName", "SdCKLMIYnX");
        setLongField(term14084, term14084.getClass(), "taskId", -8085190702504231560L);
        setField(term14084, term14084.getClass(), "taskName", "OJJtVNPyKZ");
        setField(term14084, term14084.getClass(), "trackUnits", term14111);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AKNapTAfmD";
        callMethod(klass, "setTaskName", argTypes, term14084, args);
    }

};


