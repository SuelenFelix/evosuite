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

public class SubmittedWorkDaysTableDto_getData_187951463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17195;

    public SubmittedWorkDaysTableDto_getData_187951463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17307 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term17306 = ((Class) term17307).getDeclaredField((String) "WORK_DAY");
        ((Field) term17306).setAccessible(true);
        Object enum28 = ((Field) term17306).get((Object) null);
        Object term17198 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto"));
        Object term17199 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term17199, term17199.getClass(), "year", 2012);
        setShortField(term17199, term17199.getClass(), "month", (short) 2);
        setShortField(term17199, term17199.getClass(), "day", (short) 19);
        setField(term17198, term17198.getClass(), "date", term17199);
        setField(term17198, term17198.getClass(), "status", enum28);
        setFloatField(term17198, term17198.getClass(), "standardHours", 0.5306474F);
        Class<? extends Object> term17698 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term17697 = ((Class) term17698).getDeclaredField((String) "WEEKEND");
        ((Field) term17697).setAccessible(true);
        Object enum29 = ((Field) term17697).get((Object) null);
        Object term17206 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto"));
        Object term17207 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term17207, term17207.getClass(), "year", 2012);
        setShortField(term17207, term17207.getClass(), "month", (short) 4);
        setShortField(term17207, term17207.getClass(), "day", (short) 19);
        setField(term17206, term17206.getClass(), "date", term17207);
        setField(term17206, term17206.getClass(), "status", enum29);
        setFloatField(term17206, term17206.getClass(), "standardHours", 0.12532318F);
        Object term17214 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto"));
        Object term17215 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term17215, term17215.getClass(), "year", 2017);
        setShortField(term17215, term17215.getClass(), "month", (short) 6);
        setShortField(term17215, term17215.getClass(), "day", (short) 7);
        setField(term17214, term17214.getClass(), "date", term17215);
        setField(term17214, term17214.getClass(), "status", enum28);
        setFloatField(term17214, term17214.getClass(), "standardHours", 0.022483587F);
        Object term17220 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto"));
        Object term17221 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term17221, term17221.getClass(), "year", 2023);
        setShortField(term17221, term17221.getClass(), "month", (short) 8);
        setShortField(term17221, term17221.getClass(), "day", (short) 12);
        setField(term17220, term17220.getClass(), "date", term17221);
        setField(term17220, term17220.getClass(), "status", enum29);
        setFloatField(term17220, term17220.getClass(), "standardHours", 0.9200632F);
        Class<? extends Object> term18086 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term18085 = ((Class) term18086).getDeclaredField((String) "WEEKEND");
        ((Field) term18085).setAccessible(true);
        Object enum30 = ((Field) term18085).get((Object) null);
        Object term17226 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto"));
        Object term17227 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term17227, term17227.getClass(), "year", 2015);
        setShortField(term17227, term17227.getClass(), "month", (short) 9);
        setShortField(term17227, term17227.getClass(), "day", (short) 15);
        setField(term17226, term17226.getClass(), "date", term17227);
        setField(term17226, term17226.getClass(), "status", enum30);
        setFloatField(term17226, term17226.getClass(), "standardHours", 0.025133014F);
        Object term17234 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto"));
        Object term17235 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term17235, term17235.getClass(), "year", 2022);
        setShortField(term17235, term17235.getClass(), "month", (short) 8);
        setShortField(term17235, term17235.getClass(), "day", (short) 8);
        setField(term17234, term17234.getClass(), "date", term17235);
        setField(term17234, term17234.getClass(), "status", enum28);
        setFloatField(term17234, term17234.getClass(), "standardHours", 0.5428452F);
        ArrayList term17196 = new ArrayList();
        ((ArrayList) term17196).add(term17198);
        ((ArrayList) term17196).add(term17206);
        ((ArrayList) term17196).add(term17214);
        ((ArrayList) term17196).add(term17220);
        ((ArrayList) term17196).add(term17226);
        ((ArrayList) term17196).add(term17234);
        ArrayList term17248 = new ArrayList();
        ((ArrayList) term17248).add((Object)null);
        ((ArrayList) term17248).add((Object)null);
        ((ArrayList) term17248).add((Object)null);
        ((ArrayList) term17248).add((Object)null);
        ((ArrayList) term17248).add((Object)null);
        ArrayList term17251 = new ArrayList();
        ((ArrayList) term17251).add((Object)null);
        ((ArrayList) term17251).add((Object)null);
        ((ArrayList) term17251).add((Object)null);
        Object term17244 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto"));
        setIntField(term17244, term17244.getClass(), "employeeId", -1210583429);
        setField(term17244, term17244.getClass(), "firstName", "");
        setField(term17244, term17244.getClass(), "lastName", "");
        setField(term17244, term17244.getClass(), "summaryTrackUnits", term17248);
        setField(term17244, term17244.getClass(), "projectTrackUnits", term17251);
        ArrayList term17258 = new ArrayList();
        ArrayList term17261 = new ArrayList();
        ((ArrayList) term17261).add((Object)null);
        ((ArrayList) term17261).add((Object)null);
        ((ArrayList) term17261).add((Object)null);
        ((ArrayList) term17261).add((Object)null);
        ((ArrayList) term17261).add((Object)null);
        ((ArrayList) term17261).add((Object)null);
        ((ArrayList) term17261).add((Object)null);
        ((ArrayList) term17261).add((Object)null);
        ((ArrayList) term17261).add((Object)null);
        Object term17254 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto"));
        setIntField(term17254, term17254.getClass(), "employeeId", -1476117762);
        setField(term17254, term17254.getClass(), "firstName", "");
        setField(term17254, term17254.getClass(), "lastName", "");
        setField(term17254, term17254.getClass(), "summaryTrackUnits", term17258);
        setField(term17254, term17254.getClass(), "projectTrackUnits", term17261);
        ArrayList term17242 = new ArrayList();
        ((ArrayList) term17242).add(term17244);
        ((ArrayList) term17242).add(term17254);
        term17195 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableDto"));
        setField(term17195, term17195.getClass(), "days", term17196);
        setField(term17195, term17195.getClass(), "data", term17242);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getData", argTypes, term17195, args);
    }

};


