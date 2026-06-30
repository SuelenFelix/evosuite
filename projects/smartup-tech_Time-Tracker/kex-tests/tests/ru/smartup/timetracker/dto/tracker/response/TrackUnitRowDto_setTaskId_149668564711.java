package ru.smartup.timetracker.dto.tracker.response;

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
import static ru.smartup.timetracker.dto.tracker.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Long;

public class TrackUnitRowDto_setTaskId_149668564711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5166;
     Object term5259;

    public TrackUnitRowDto_setTaskId_149668564711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5197 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5199 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5197, term5197.getClass(), "id", -6723783499250797216L);
        setLongField(term5199, term5199.getClass(), "fastTime", 1466008719289L);
        setField(term5199, term5199.getClass(), "cdate", null);
        setField(term5197, term5197.getClass(), "workDay", term5199);
        setFloatField(term5197, term5197.getClass(), "hours", 0.97831506F);
        setBooleanField(term5197, term5197.getClass(), "blocked", true);
        setBooleanField(term5197, term5197.getClass(), "billable", false);
        setField(term5197, term5197.getClass(), "comment", "");
        setField(term5197, term5197.getClass(), "rejectReason", "");
        setBooleanField(term5197, term5197.getClass(), "rejected", true);
        Object term5207 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5209 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5207, term5207.getClass(), "id", 41775768178052008L);
        setLongField(term5209, term5209.getClass(), "fastTime", 1535838449065L);
        setField(term5209, term5209.getClass(), "cdate", null);
        setField(term5207, term5207.getClass(), "workDay", term5209);
        setFloatField(term5207, term5207.getClass(), "hours", 0.9737084F);
        setBooleanField(term5207, term5207.getClass(), "blocked", true);
        setBooleanField(term5207, term5207.getClass(), "billable", true);
        setField(term5207, term5207.getClass(), "comment", "");
        setField(term5207, term5207.getClass(), "rejectReason", "");
        setBooleanField(term5207, term5207.getClass(), "rejected", true);
        Object term5217 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5219 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5217, term5217.getClass(), "id", 6682528376118987775L);
        setLongField(term5219, term5219.getClass(), "fastTime", 1345923503543L);
        setField(term5219, term5219.getClass(), "cdate", null);
        setField(term5217, term5217.getClass(), "workDay", term5219);
        setFloatField(term5217, term5217.getClass(), "hours", 0.21723765F);
        setBooleanField(term5217, term5217.getClass(), "blocked", true);
        setBooleanField(term5217, term5217.getClass(), "billable", true);
        setField(term5217, term5217.getClass(), "comment", "");
        setField(term5217, term5217.getClass(), "rejectReason", "");
        setBooleanField(term5217, term5217.getClass(), "rejected", false);
        Object term5227 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5229 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5227, term5227.getClass(), "id", 682356318767179819L);
        setLongField(term5229, term5229.getClass(), "fastTime", 1838357779277L);
        setField(term5229, term5229.getClass(), "cdate", null);
        setField(term5227, term5227.getClass(), "workDay", term5229);
        setFloatField(term5227, term5227.getClass(), "hours", 0.06688923F);
        setBooleanField(term5227, term5227.getClass(), "blocked", true);
        setBooleanField(term5227, term5227.getClass(), "billable", true);
        setField(term5227, term5227.getClass(), "comment", "");
        setField(term5227, term5227.getClass(), "rejectReason", "");
        setBooleanField(term5227, term5227.getClass(), "rejected", false);
        Object term5237 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5239 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5237, term5237.getClass(), "id", -7291743527973326814L);
        setLongField(term5239, term5239.getClass(), "fastTime", 1332871705432L);
        setField(term5239, term5239.getClass(), "cdate", null);
        setField(term5237, term5237.getClass(), "workDay", term5239);
        setFloatField(term5237, term5237.getClass(), "hours", 0.22417867F);
        setBooleanField(term5237, term5237.getClass(), "blocked", false);
        setBooleanField(term5237, term5237.getClass(), "billable", true);
        setField(term5237, term5237.getClass(), "comment", "");
        setField(term5237, term5237.getClass(), "rejectReason", "");
        setBooleanField(term5237, term5237.getClass(), "rejected", false);
        Object term5247 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5249 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5247, term5247.getClass(), "id", -5963439350418910964L);
        setLongField(term5249, term5249.getClass(), "fastTime", 1597233967116L);
        setField(term5249, term5249.getClass(), "cdate", null);
        setField(term5247, term5247.getClass(), "workDay", term5249);
        setFloatField(term5247, term5247.getClass(), "hours", 0.35872674F);
        setBooleanField(term5247, term5247.getClass(), "blocked", false);
        setBooleanField(term5247, term5247.getClass(), "billable", true);
        setField(term5247, term5247.getClass(), "comment", "");
        setField(term5247, term5247.getClass(), "rejectReason", "");
        setBooleanField(term5247, term5247.getClass(), "rejected", true);
        ArrayList term5195 = new ArrayList();
        ((ArrayList) term5195).add(term5197);
        ((ArrayList) term5195).add(term5207);
        ((ArrayList) term5195).add(term5217);
        ((ArrayList) term5195).add(term5227);
        ((ArrayList) term5195).add(term5237);
        ((ArrayList) term5195).add(term5247);
        term5166 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term5166, term5166.getClass(), "employeeId", -2068769794);
        setIntField(term5166, term5166.getClass(), "projectId", -117576464);
        setField(term5166, term5166.getClass(), "projectName", "yVMkkQhvmN");
        setLongField(term5166, term5166.getClass(), "taskId", -5248475803419977214L);
        setField(term5166, term5166.getClass(), "taskName", "mvrkADEgpp");
        setBooleanField(term5166, term5166.getClass(), "observed", true);
        setField(term5166, term5166.getClass(), "units", term5195);
        term5259 = new Long(9013624480170062917L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term5259;
        callMethod(klass, "setTaskId", argTypes, term5166, args);
    }

};


