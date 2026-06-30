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

public class SubmittedWorkDaysTableDto_canEqual_12093057077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21125;
     Object term21184;

    public SubmittedWorkDaysTableDto_canEqual_12093057077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21186 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term21185 = ((Class) term21186).getDeclaredField((String) "WEEKEND");
        ((Field) term21185).setAccessible(true);
        Object enum37 = ((Field) term21185).get((Object) null);
        Object term21128 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto"));
        Object term21129 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term21129, term21129.getClass(), "year", 2025);
        setShortField(term21129, term21129.getClass(), "month", (short) 11);
        setShortField(term21129, term21129.getClass(), "day", (short) 1);
        setField(term21128, term21128.getClass(), "date", term21129);
        setField(term21128, term21128.getClass(), "status", enum37);
        setFloatField(term21128, term21128.getClass(), "standardHours", 0.09037483F);
        Object term21136 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto"));
        Object term21137 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term21137, term21137.getClass(), "year", 2023);
        setShortField(term21137, term21137.getClass(), "month", (short) 9);
        setShortField(term21137, term21137.getClass(), "day", (short) 22);
        setField(term21136, term21136.getClass(), "date", term21137);
        setField(term21136, term21136.getClass(), "status", enum37);
        setFloatField(term21136, term21136.getClass(), "standardHours", 0.39231926F);
        Class<? extends Object> term21574 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term21573 = ((Class) term21574).getDeclaredField((String) "SHORTENED_DAY");
        ((Field) term21573).setAccessible(true);
        Object enum38 = ((Field) term21573).get((Object) null);
        Object term21142 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto"));
        Object term21143 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term21143, term21143.getClass(), "year", 2013);
        setShortField(term21143, term21143.getClass(), "month", (short) 3);
        setShortField(term21143, term21143.getClass(), "day", (short) 8);
        setField(term21142, term21142.getClass(), "date", term21143);
        setField(term21142, term21142.getClass(), "status", enum38);
        setFloatField(term21142, term21142.getClass(), "standardHours", 0.6561919F);
        Object term21150 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto"));
        Object term21151 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term21151, term21151.getClass(), "year", 2028);
        setShortField(term21151, term21151.getClass(), "month", (short) 9);
        setShortField(term21151, term21151.getClass(), "day", (short) 30);
        setField(term21150, term21150.getClass(), "date", term21151);
        setField(term21150, term21150.getClass(), "status", enum38);
        setFloatField(term21150, term21150.getClass(), "standardHours", 0.2958501F);
        Object term21156 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto"));
        Object term21157 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term21157, term21157.getClass(), "year", 2026);
        setShortField(term21157, term21157.getClass(), "month", (short) 11);
        setShortField(term21157, term21157.getClass(), "day", (short) 29);
        setField(term21156, term21156.getClass(), "date", term21157);
        setField(term21156, term21156.getClass(), "status", enum37);
        setFloatField(term21156, term21156.getClass(), "standardHours", 0.73301786F);
        Object term21162 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto"));
        Object term21163 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term21163, term21163.getClass(), "year", 2027);
        setShortField(term21163, term21163.getClass(), "month", (short) 2);
        setShortField(term21163, term21163.getClass(), "day", (short) 18);
        setField(term21162, term21162.getClass(), "date", term21163);
        setField(term21162, term21162.getClass(), "status", enum37);
        setFloatField(term21162, term21162.getClass(), "standardHours", 0.7997349F);
        ArrayList term21126 = new ArrayList();
        ((ArrayList) term21126).add(term21128);
        ((ArrayList) term21126).add(term21136);
        ((ArrayList) term21126).add(term21142);
        ((ArrayList) term21126).add(term21150);
        ((ArrayList) term21126).add(term21156);
        ((ArrayList) term21126).add(term21162);
        ArrayList term21176 = new ArrayList();
        ((ArrayList) term21176).add((Object)null);
        ArrayList term21179 = new ArrayList();
        ((ArrayList) term21179).add((Object)null);
        ((ArrayList) term21179).add((Object)null);
        ((ArrayList) term21179).add((Object)null);
        ((ArrayList) term21179).add((Object)null);
        ((ArrayList) term21179).add((Object)null);
        ((ArrayList) term21179).add((Object)null);
        Object term21172 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto"));
        setIntField(term21172, term21172.getClass(), "employeeId", -461771056);
        setField(term21172, term21172.getClass(), "firstName", "");
        setField(term21172, term21172.getClass(), "lastName", "");
        setField(term21172, term21172.getClass(), "summaryTrackUnits", term21176);
        setField(term21172, term21172.getClass(), "projectTrackUnits", term21179);
        ArrayList term21170 = new ArrayList();
        ((ArrayList) term21170).add(term21172);
        term21125 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableDto"));
        setField(term21125, term21125.getClass(), "days", term21126);
        setField(term21125, term21125.getClass(), "data", term21170);
        term21184 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term21184;
        callMethod(klass, "canEqual", argTypes, term21125, args);
    }

};


