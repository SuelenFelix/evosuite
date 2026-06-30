package ru.smartup.timetracker.dto.tracker.request;

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
import static ru.smartup.timetracker.dto.tracker.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class TrackUnitRowUpdateDto_canEqual_161182944910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term834;
     Object term890;

    public TrackUnitRowUpdateDto_canEqual_161182944910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term840 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term841 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term841, term841.getClass(), "fastTime", 1825608844992L);
        setField(term841, term841.getClass(), "cdate", null);
        setField(term840, term840.getClass(), "workDay", term841);
        setFloatField(term840, term840.getClass(), "hours", 0.43692183F);
        setField(term840, term840.getClass(), "comment", "");
        setBooleanField(term840, term840.getClass(), "billable", false);
        Object term846 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term847 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term847, term847.getClass(), "fastTime", 1465782799700L);
        setField(term847, term847.getClass(), "cdate", null);
        setField(term846, term846.getClass(), "workDay", term847);
        setFloatField(term846, term846.getClass(), "hours", 0.80973893F);
        setField(term846, term846.getClass(), "comment", "");
        setBooleanField(term846, term846.getClass(), "billable", false);
        Object term852 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term853 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term853, term853.getClass(), "fastTime", 1597421765774L);
        setField(term853, term853.getClass(), "cdate", null);
        setField(term852, term852.getClass(), "workDay", term853);
        setFloatField(term852, term852.getClass(), "hours", 0.7633268F);
        setField(term852, term852.getClass(), "comment", "");
        setBooleanField(term852, term852.getClass(), "billable", true);
        Object term858 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term859 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term859, term859.getClass(), "fastTime", 1354735325477L);
        setField(term859, term859.getClass(), "cdate", null);
        setField(term858, term858.getClass(), "workDay", term859);
        setFloatField(term858, term858.getClass(), "hours", 0.541592F);
        setField(term858, term858.getClass(), "comment", "");
        setBooleanField(term858, term858.getClass(), "billable", false);
        Object term864 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term865 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term865, term865.getClass(), "fastTime", 1415426053422L);
        setField(term865, term865.getClass(), "cdate", null);
        setField(term864, term864.getClass(), "workDay", term865);
        setFloatField(term864, term864.getClass(), "hours", 0.13481021F);
        setField(term864, term864.getClass(), "comment", "");
        setBooleanField(term864, term864.getClass(), "billable", false);
        Object term870 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term871 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term871, term871.getClass(), "fastTime", 1359786657069L);
        setField(term871, term871.getClass(), "cdate", null);
        setField(term870, term870.getClass(), "workDay", term871);
        setFloatField(term870, term870.getClass(), "hours", 0.996533F);
        setField(term870, term870.getClass(), "comment", "");
        setBooleanField(term870, term870.getClass(), "billable", false);
        Object term876 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term877 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term877, term877.getClass(), "fastTime", 1589746751309L);
        setField(term877, term877.getClass(), "cdate", null);
        setField(term876, term876.getClass(), "workDay", term877);
        setFloatField(term876, term876.getClass(), "hours", 0.38000882F);
        setField(term876, term876.getClass(), "comment", "");
        setBooleanField(term876, term876.getClass(), "billable", false);
        Object term882 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term883 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term883, term883.getClass(), "fastTime", 1291280367982L);
        setField(term883, term883.getClass(), "cdate", null);
        setField(term882, term882.getClass(), "workDay", term883);
        setFloatField(term882, term882.getClass(), "hours", 0.10577053F);
        setField(term882, term882.getClass(), "comment", "");
        setBooleanField(term882, term882.getClass(), "billable", true);
        ArrayList term838 = new ArrayList();
        ((ArrayList) term838).add(term840);
        ((ArrayList) term838).add(term846);
        ((ArrayList) term838).add(term852);
        ((ArrayList) term838).add(term858);
        ((ArrayList) term838).add(term864);
        ((ArrayList) term838).add(term870);
        ((ArrayList) term838).add(term876);
        ((ArrayList) term838).add(term882);
        term834 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitRowUpdateDto"));
        setIntField(term834, term834.getClass(), "employeeId", 1048535127);
        setLongField(term834, term834.getClass(), "taskId", -2813493605142626659L);
        setBooleanField(term834, term834.getClass(), "observed", true);
        setField(term834, term834.getClass(), "units", term838);
        term890 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitRowUpdateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term890;
        callMethod(klass, "canEqual", argTypes, term834, args);
    }

};


