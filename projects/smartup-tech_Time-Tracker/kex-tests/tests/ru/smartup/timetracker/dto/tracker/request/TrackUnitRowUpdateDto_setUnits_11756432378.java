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
import java.util.LinkedList;

public class TrackUnitRowUpdateDto_setUnits_11756432378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term760;
     Object term810;

    public TrackUnitRowUpdateDto_setUnits_11756432378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term766 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term767 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term767, term767.getClass(), "fastTime", 1490956290070L);
        setField(term767, term767.getClass(), "cdate", null);
        setField(term766, term766.getClass(), "workDay", term767);
        setFloatField(term766, term766.getClass(), "hours", 0.7467328F);
        setField(term766, term766.getClass(), "comment", "");
        setBooleanField(term766, term766.getClass(), "billable", false);
        Object term772 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term773 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term773, term773.getClass(), "fastTime", 1285661498273L);
        setField(term773, term773.getClass(), "cdate", null);
        setField(term772, term772.getClass(), "workDay", term773);
        setFloatField(term772, term772.getClass(), "hours", 0.6436713F);
        setField(term772, term772.getClass(), "comment", "");
        setBooleanField(term772, term772.getClass(), "billable", true);
        Object term778 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term779 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term779, term779.getClass(), "fastTime", 1643981113575L);
        setField(term779, term779.getClass(), "cdate", null);
        setField(term778, term778.getClass(), "workDay", term779);
        setFloatField(term778, term778.getClass(), "hours", 0.89057696F);
        setField(term778, term778.getClass(), "comment", "");
        setBooleanField(term778, term778.getClass(), "billable", true);
        Object term784 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term785 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term785, term785.getClass(), "fastTime", 1689428810999L);
        setField(term785, term785.getClass(), "cdate", null);
        setField(term784, term784.getClass(), "workDay", term785);
        setFloatField(term784, term784.getClass(), "hours", 0.7332741F);
        setField(term784, term784.getClass(), "comment", "");
        setBooleanField(term784, term784.getClass(), "billable", true);
        Object term790 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term791 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term791, term791.getClass(), "fastTime", 1570714321079L);
        setField(term791, term791.getClass(), "cdate", null);
        setField(term790, term790.getClass(), "workDay", term791);
        setFloatField(term790, term790.getClass(), "hours", 0.15826964F);
        setField(term790, term790.getClass(), "comment", "");
        setBooleanField(term790, term790.getClass(), "billable", false);
        Object term796 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term797 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term797, term797.getClass(), "fastTime", 1531331402053L);
        setField(term797, term797.getClass(), "cdate", null);
        setField(term796, term796.getClass(), "workDay", term797);
        setFloatField(term796, term796.getClass(), "hours", 0.45691717F);
        setField(term796, term796.getClass(), "comment", "");
        setBooleanField(term796, term796.getClass(), "billable", true);
        Object term802 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term803 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term803, term803.getClass(), "fastTime", 1264037800343L);
        setField(term803, term803.getClass(), "cdate", null);
        setField(term802, term802.getClass(), "workDay", term803);
        setFloatField(term802, term802.getClass(), "hours", 0.17877543F);
        setField(term802, term802.getClass(), "comment", "");
        setBooleanField(term802, term802.getClass(), "billable", false);
        ArrayList term764 = new ArrayList();
        ((ArrayList) term764).add(term766);
        ((ArrayList) term764).add(term772);
        ((ArrayList) term764).add(term778);
        ((ArrayList) term764).add(term784);
        ((ArrayList) term764).add(term790);
        ((ArrayList) term764).add(term796);
        ((ArrayList) term764).add(term802);
        term760 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitRowUpdateDto"));
        setIntField(term760, term760.getClass(), "employeeId", -1456670397);
        setLongField(term760, term760.getClass(), "taskId", -7237588299778557629L);
        setBooleanField(term760, term760.getClass(), "observed", true);
        setField(term760, term760.getClass(), "units", term764);
        term810 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitRowUpdateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term810;
        callMethod(klass, "setUnits", argTypes, term760, args);
    }

};


