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
import java.lang.String;
import java.util.LinkedList;

public class SubmittedWorkDaysTableDto_setDays_1722864414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18473;
     Object term18550;

    public SubmittedWorkDaysTableDto_setDays_1722864414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18554 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term18553 = ((Class) term18554).getDeclaredField((String) "WEEKEND");
        ((Field) term18553).setAccessible(true);
        Object enum31 = ((Field) term18553).get((Object) null);
        Object term18476 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto"));
        Object term18477 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term18477, term18477.getClass(), "year", 2029);
        setShortField(term18477, term18477.getClass(), "month", (short) 6);
        setShortField(term18477, term18477.getClass(), "day", (short) 22);
        setField(term18476, term18476.getClass(), "date", term18477);
        setField(term18476, term18476.getClass(), "status", enum31);
        setFloatField(term18476, term18476.getClass(), "standardHours", 0.023032188F);
        ArrayList term18474 = new ArrayList();
        ((ArrayList) term18474).add(term18476);
        ArrayList term18492 = new ArrayList();
        ((ArrayList) term18492).add((Object)null);
        ArrayList term18495 = new ArrayList();
        ((ArrayList) term18495).add((Object)null);
        ((ArrayList) term18495).add((Object)null);
        ((ArrayList) term18495).add((Object)null);
        ((ArrayList) term18495).add((Object)null);
        ((ArrayList) term18495).add((Object)null);
        ((ArrayList) term18495).add((Object)null);
        ((ArrayList) term18495).add((Object)null);
        Object term18488 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto"));
        setIntField(term18488, term18488.getClass(), "employeeId", -1963434938);
        setField(term18488, term18488.getClass(), "firstName", "");
        setField(term18488, term18488.getClass(), "lastName", "");
        setField(term18488, term18488.getClass(), "summaryTrackUnits", term18492);
        setField(term18488, term18488.getClass(), "projectTrackUnits", term18495);
        ArrayList term18502 = new ArrayList();
        ArrayList term18505 = new ArrayList();
        ((ArrayList) term18505).add((Object)null);
        ((ArrayList) term18505).add((Object)null);
        ((ArrayList) term18505).add((Object)null);
        ((ArrayList) term18505).add((Object)null);
        ((ArrayList) term18505).add((Object)null);
        ((ArrayList) term18505).add((Object)null);
        ((ArrayList) term18505).add((Object)null);
        Object term18498 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto"));
        setIntField(term18498, term18498.getClass(), "employeeId", 53410913);
        setField(term18498, term18498.getClass(), "firstName", "");
        setField(term18498, term18498.getClass(), "lastName", "");
        setField(term18498, term18498.getClass(), "summaryTrackUnits", term18502);
        setField(term18498, term18498.getClass(), "projectTrackUnits", term18505);
        ArrayList term18512 = new ArrayList();
        ((ArrayList) term18512).add((Object)null);
        ((ArrayList) term18512).add((Object)null);
        ((ArrayList) term18512).add((Object)null);
        ((ArrayList) term18512).add((Object)null);
        ((ArrayList) term18512).add((Object)null);
        ((ArrayList) term18512).add((Object)null);
        ((ArrayList) term18512).add((Object)null);
        ((ArrayList) term18512).add((Object)null);
        ((ArrayList) term18512).add((Object)null);
        ArrayList term18515 = new ArrayList();
        ((ArrayList) term18515).add((Object)null);
        ((ArrayList) term18515).add((Object)null);
        ((ArrayList) term18515).add((Object)null);
        ((ArrayList) term18515).add((Object)null);
        Object term18508 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto"));
        setIntField(term18508, term18508.getClass(), "employeeId", -341152642);
        setField(term18508, term18508.getClass(), "firstName", "");
        setField(term18508, term18508.getClass(), "lastName", "");
        setField(term18508, term18508.getClass(), "summaryTrackUnits", term18512);
        setField(term18508, term18508.getClass(), "projectTrackUnits", term18515);
        ArrayList term18522 = new ArrayList();
        ((ArrayList) term18522).add((Object)null);
        ((ArrayList) term18522).add((Object)null);
        ((ArrayList) term18522).add((Object)null);
        ((ArrayList) term18522).add((Object)null);
        ((ArrayList) term18522).add((Object)null);
        ((ArrayList) term18522).add((Object)null);
        ((ArrayList) term18522).add((Object)null);
        ((ArrayList) term18522).add((Object)null);
        ArrayList term18525 = new ArrayList();
        Object term18518 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto"));
        setIntField(term18518, term18518.getClass(), "employeeId", -2015854073);
        setField(term18518, term18518.getClass(), "firstName", "");
        setField(term18518, term18518.getClass(), "lastName", "");
        setField(term18518, term18518.getClass(), "summaryTrackUnits", term18522);
        setField(term18518, term18518.getClass(), "projectTrackUnits", term18525);
        ArrayList term18532 = new ArrayList();
        ((ArrayList) term18532).add((Object)null);
        ((ArrayList) term18532).add((Object)null);
        ArrayList term18535 = new ArrayList();
        ((ArrayList) term18535).add((Object)null);
        ((ArrayList) term18535).add((Object)null);
        Object term18528 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto"));
        setIntField(term18528, term18528.getClass(), "employeeId", 538259104);
        setField(term18528, term18528.getClass(), "firstName", "");
        setField(term18528, term18528.getClass(), "lastName", "");
        setField(term18528, term18528.getClass(), "summaryTrackUnits", term18532);
        setField(term18528, term18528.getClass(), "projectTrackUnits", term18535);
        ArrayList term18542 = new ArrayList();
        ((ArrayList) term18542).add((Object)null);
        ((ArrayList) term18542).add((Object)null);
        ((ArrayList) term18542).add((Object)null);
        ((ArrayList) term18542).add((Object)null);
        ((ArrayList) term18542).add((Object)null);
        ((ArrayList) term18542).add((Object)null);
        ((ArrayList) term18542).add((Object)null);
        ((ArrayList) term18542).add((Object)null);
        ((ArrayList) term18542).add((Object)null);
        ArrayList term18545 = new ArrayList();
        ((ArrayList) term18545).add((Object)null);
        ((ArrayList) term18545).add((Object)null);
        ((ArrayList) term18545).add((Object)null);
        Object term18538 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto"));
        setIntField(term18538, term18538.getClass(), "employeeId", 96566506);
        setField(term18538, term18538.getClass(), "firstName", "");
        setField(term18538, term18538.getClass(), "lastName", "");
        setField(term18538, term18538.getClass(), "summaryTrackUnits", term18542);
        setField(term18538, term18538.getClass(), "projectTrackUnits", term18545);
        ArrayList term18486 = new ArrayList();
        ((ArrayList) term18486).add(term18488);
        ((ArrayList) term18486).add(term18498);
        ((ArrayList) term18486).add(term18508);
        ((ArrayList) term18486).add(term18518);
        ((ArrayList) term18486).add(term18528);
        ((ArrayList) term18486).add(term18538);
        term18473 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableDto"));
        setField(term18473, term18473.getClass(), "days", term18474);
        setField(term18473, term18473.getClass(), "data", term18486);
        term18550 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term18550;
        callMethod(klass, "setDays", argTypes, term18473, args);
    }

};


