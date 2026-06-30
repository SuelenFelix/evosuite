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
import java.lang.Integer;

public class SubmittedWorkDaysTableUnitDto_setEmployeeId_6651245418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27780;
     Object term27870;

    public SubmittedWorkDaysTableUnitDto_setEmployeeId_6651245418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term27808 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term27809 = newInstance(Class.forName("java.util.Date"));
        setLongField(term27809, term27809.getClass(), "fastTime", 1643824174710L);
        setField(term27809, term27809.getClass(), "cdate", null);
        setField(term27808, term27808.getClass(), "date", term27809);
        setFloatField(term27808, term27808.getClass(), "hours", 0.2114355F);
        Object term27812 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term27813 = newInstance(Class.forName("java.util.Date"));
        setLongField(term27813, term27813.getClass(), "fastTime", 1589287310419L);
        setField(term27813, term27813.getClass(), "cdate", null);
        setField(term27812, term27812.getClass(), "date", term27813);
        setFloatField(term27812, term27812.getClass(), "hours", 0.23823452F);
        Object term27816 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term27817 = newInstance(Class.forName("java.util.Date"));
        setLongField(term27817, term27817.getClass(), "fastTime", 1689828992084L);
        setField(term27817, term27817.getClass(), "cdate", null);
        setField(term27816, term27816.getClass(), "date", term27817);
        setFloatField(term27816, term27816.getClass(), "hours", 0.25258613F);
        Object term27820 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term27821 = newInstance(Class.forName("java.util.Date"));
        setLongField(term27821, term27821.getClass(), "fastTime", 1288596730763L);
        setField(term27821, term27821.getClass(), "cdate", null);
        setField(term27820, term27820.getClass(), "date", term27821);
        setFloatField(term27820, term27820.getClass(), "hours", 0.6037093F);
        ArrayList term27806 = new ArrayList();
        ((ArrayList) term27806).add(term27808);
        ((ArrayList) term27806).add(term27812);
        ((ArrayList) term27806).add(term27816);
        ((ArrayList) term27806).add(term27820);
        ArrayList term27833 = new ArrayList();
        ((ArrayList) term27833).add((Object)null);
        ((ArrayList) term27833).add((Object)null);
        Object term27828 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27828, term27828.getClass(), "projectId", -860131894);
        setField(term27828, term27828.getClass(), "projectName", "");
        setLongField(term27828, term27828.getClass(), "taskId", 7010148136855890340L);
        setField(term27828, term27828.getClass(), "taskName", "");
        setField(term27828, term27828.getClass(), "trackUnits", term27833);
        ArrayList term27841 = new ArrayList();
        ((ArrayList) term27841).add((Object)null);
        ((ArrayList) term27841).add((Object)null);
        ((ArrayList) term27841).add((Object)null);
        ((ArrayList) term27841).add((Object)null);
        ((ArrayList) term27841).add((Object)null);
        Object term27836 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27836, term27836.getClass(), "projectId", -1022990421);
        setField(term27836, term27836.getClass(), "projectName", "");
        setLongField(term27836, term27836.getClass(), "taskId", 3104349415269466587L);
        setField(term27836, term27836.getClass(), "taskName", "");
        setField(term27836, term27836.getClass(), "trackUnits", term27841);
        ArrayList term27849 = new ArrayList();
        ((ArrayList) term27849).add((Object)null);
        ((ArrayList) term27849).add((Object)null);
        ((ArrayList) term27849).add((Object)null);
        ((ArrayList) term27849).add((Object)null);
        Object term27844 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27844, term27844.getClass(), "projectId", 1045547089);
        setField(term27844, term27844.getClass(), "projectName", "");
        setLongField(term27844, term27844.getClass(), "taskId", -1750555031444556464L);
        setField(term27844, term27844.getClass(), "taskName", "");
        setField(term27844, term27844.getClass(), "trackUnits", term27849);
        ArrayList term27857 = new ArrayList();
        ((ArrayList) term27857).add((Object)null);
        ((ArrayList) term27857).add((Object)null);
        ((ArrayList) term27857).add((Object)null);
        ((ArrayList) term27857).add((Object)null);
        ((ArrayList) term27857).add((Object)null);
        ((ArrayList) term27857).add((Object)null);
        ((ArrayList) term27857).add((Object)null);
        Object term27852 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27852, term27852.getClass(), "projectId", -1122880881);
        setField(term27852, term27852.getClass(), "projectName", "");
        setLongField(term27852, term27852.getClass(), "taskId", -1528017371096319990L);
        setField(term27852, term27852.getClass(), "taskName", "");
        setField(term27852, term27852.getClass(), "trackUnits", term27857);
        ArrayList term27865 = new ArrayList();
        ((ArrayList) term27865).add((Object)null);
        ((ArrayList) term27865).add((Object)null);
        ((ArrayList) term27865).add((Object)null);
        ((ArrayList) term27865).add((Object)null);
        ((ArrayList) term27865).add((Object)null);
        ((ArrayList) term27865).add((Object)null);
        ((ArrayList) term27865).add((Object)null);
        Object term27860 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27860, term27860.getClass(), "projectId", -542712742);
        setField(term27860, term27860.getClass(), "projectName", "");
        setLongField(term27860, term27860.getClass(), "taskId", -1526328443223793465L);
        setField(term27860, term27860.getClass(), "taskName", "");
        setField(term27860, term27860.getClass(), "trackUnits", term27865);
        ArrayList term27826 = new ArrayList();
        ((ArrayList) term27826).add(term27828);
        ((ArrayList) term27826).add(term27836);
        ((ArrayList) term27826).add(term27844);
        ((ArrayList) term27826).add(term27852);
        ((ArrayList) term27826).add(term27860);
        term27780 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto"));
        setIntField(term27780, term27780.getClass(), "employeeId", -1146679443);
        setField(term27780, term27780.getClass(), "firstName", "rsumfoDNHa");
        setField(term27780, term27780.getClass(), "lastName", "ceCWHUTQUM");
        setField(term27780, term27780.getClass(), "summaryTrackUnits", term27806);
        setField(term27780, term27780.getClass(), "projectTrackUnits", term27826);
        term27870 = new Integer(-1254072822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term27870;
        callMethod(klass, "setEmployeeId", argTypes, term27780, args);
    }

};


