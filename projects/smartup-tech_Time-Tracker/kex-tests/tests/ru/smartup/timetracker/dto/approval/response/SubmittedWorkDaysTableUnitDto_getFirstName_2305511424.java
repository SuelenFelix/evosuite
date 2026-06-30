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

public class SubmittedWorkDaysTableUnitDto_getFirstName_2305511424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27344;

    public SubmittedWorkDaysTableUnitDto_getFirstName_2305511424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term27372 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term27373 = newInstance(Class.forName("java.util.Date"));
        setLongField(term27373, term27373.getClass(), "fastTime", 1818617156349L);
        setField(term27373, term27373.getClass(), "cdate", null);
        setField(term27372, term27372.getClass(), "date", term27373);
        setFloatField(term27372, term27372.getClass(), "hours", 0.4054746F);
        Object term27376 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term27377 = newInstance(Class.forName("java.util.Date"));
        setLongField(term27377, term27377.getClass(), "fastTime", 1560286398870L);
        setField(term27377, term27377.getClass(), "cdate", null);
        setField(term27376, term27376.getClass(), "date", term27377);
        setFloatField(term27376, term27376.getClass(), "hours", 0.5179319F);
        Object term27380 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term27381 = newInstance(Class.forName("java.util.Date"));
        setLongField(term27381, term27381.getClass(), "fastTime", 1791294437021L);
        setField(term27381, term27381.getClass(), "cdate", null);
        setField(term27380, term27380.getClass(), "date", term27381);
        setFloatField(term27380, term27380.getClass(), "hours", 0.73743176F);
        Object term27384 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term27385 = newInstance(Class.forName("java.util.Date"));
        setLongField(term27385, term27385.getClass(), "fastTime", 1407926618924L);
        setField(term27385, term27385.getClass(), "cdate", null);
        setField(term27384, term27384.getClass(), "date", term27385);
        setFloatField(term27384, term27384.getClass(), "hours", 0.25025773F);
        Object term27388 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term27389 = newInstance(Class.forName("java.util.Date"));
        setLongField(term27389, term27389.getClass(), "fastTime", 1536062261151L);
        setField(term27389, term27389.getClass(), "cdate", null);
        setField(term27388, term27388.getClass(), "date", term27389);
        setFloatField(term27388, term27388.getClass(), "hours", 0.96599394F);
        ArrayList term27370 = new ArrayList();
        ((ArrayList) term27370).add(term27372);
        ((ArrayList) term27370).add(term27376);
        ((ArrayList) term27370).add(term27380);
        ((ArrayList) term27370).add(term27384);
        ((ArrayList) term27370).add(term27388);
        ArrayList term27401 = new ArrayList();
        ((ArrayList) term27401).add((Object)null);
        ((ArrayList) term27401).add((Object)null);
        ((ArrayList) term27401).add((Object)null);
        Object term27396 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27396, term27396.getClass(), "projectId", -571169753);
        setField(term27396, term27396.getClass(), "projectName", "");
        setLongField(term27396, term27396.getClass(), "taskId", -3850323135468805420L);
        setField(term27396, term27396.getClass(), "taskName", "");
        setField(term27396, term27396.getClass(), "trackUnits", term27401);
        ArrayList term27409 = new ArrayList();
        ((ArrayList) term27409).add((Object)null);
        ((ArrayList) term27409).add((Object)null);
        ((ArrayList) term27409).add((Object)null);
        ((ArrayList) term27409).add((Object)null);
        Object term27404 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27404, term27404.getClass(), "projectId", 318591690);
        setField(term27404, term27404.getClass(), "projectName", "");
        setLongField(term27404, term27404.getClass(), "taskId", -6001151456088965547L);
        setField(term27404, term27404.getClass(), "taskName", "");
        setField(term27404, term27404.getClass(), "trackUnits", term27409);
        ArrayList term27394 = new ArrayList();
        ((ArrayList) term27394).add(term27396);
        ((ArrayList) term27394).add(term27404);
        term27344 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto"));
        setIntField(term27344, term27344.getClass(), "employeeId", -2104981311);
        setField(term27344, term27344.getClass(), "firstName", "fIZsWucfXz");
        setField(term27344, term27344.getClass(), "lastName", "IApvtmfhnq");
        setField(term27344, term27344.getClass(), "summaryTrackUnits", term27370);
        setField(term27344, term27344.getClass(), "projectTrackUnits", term27394);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term27344, args);
    }

};


