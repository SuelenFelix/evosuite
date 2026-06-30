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

public class SubmittedWorkDaysTableDto_setData_1721201885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18941;
     Object term19024;

    public SubmittedWorkDaysTableDto_setData_1721201885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19028 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term19027 = ((Class) term19028).getDeclaredField((String) "WEEKEND");
        ((Field) term19027).setAccessible(true);
        Object enum32 = ((Field) term19027).get((Object) null);
        Object term18944 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto"));
        Object term18945 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term18945, term18945.getClass(), "year", 2011);
        setShortField(term18945, term18945.getClass(), "month", (short) 5);
        setShortField(term18945, term18945.getClass(), "day", (short) 4);
        setField(term18944, term18944.getClass(), "date", term18945);
        setField(term18944, term18944.getClass(), "status", enum32);
        setFloatField(term18944, term18944.getClass(), "standardHours", 0.24259013F);
        Object term18952 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto"));
        Object term18953 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term18953, term18953.getClass(), "year", 2017);
        setShortField(term18953, term18953.getClass(), "month", (short) 3);
        setShortField(term18953, term18953.getClass(), "day", (short) 5);
        setField(term18952, term18952.getClass(), "date", term18953);
        setField(term18952, term18952.getClass(), "status", enum32);
        setFloatField(term18952, term18952.getClass(), "standardHours", 0.8598678F);
        Object term18958 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto"));
        Object term18959 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term18959, term18959.getClass(), "year", 2011);
        setShortField(term18959, term18959.getClass(), "month", (short) 7);
        setShortField(term18959, term18959.getClass(), "day", (short) 24);
        setField(term18958, term18958.getClass(), "date", term18959);
        setField(term18958, term18958.getClass(), "status", enum32);
        setFloatField(term18958, term18958.getClass(), "standardHours", 0.1544348F);
        Class<? extends Object> term19416 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term19415 = ((Class) term19416).getDeclaredField((String) "SHORTENED_DAY");
        ((Field) term19415).setAccessible(true);
        Object enum33 = ((Field) term19415).get((Object) null);
        Object term18964 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto"));
        Object term18965 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term18965, term18965.getClass(), "year", 2020);
        setShortField(term18965, term18965.getClass(), "month", (short) 7);
        setShortField(term18965, term18965.getClass(), "day", (short) 23);
        setField(term18964, term18964.getClass(), "date", term18965);
        setField(term18964, term18964.getClass(), "status", enum33);
        setFloatField(term18964, term18964.getClass(), "standardHours", 0.56109315F);
        Object term18972 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto"));
        Object term18973 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term18973, term18973.getClass(), "year", 2016);
        setShortField(term18973, term18973.getClass(), "month", (short) 5);
        setShortField(term18973, term18973.getClass(), "day", (short) 28);
        setField(term18972, term18972.getClass(), "date", term18973);
        setField(term18972, term18972.getClass(), "status", enum32);
        setFloatField(term18972, term18972.getClass(), "standardHours", 0.5187846F);
        ArrayList term18942 = new ArrayList();
        ((ArrayList) term18942).add(term18944);
        ((ArrayList) term18942).add(term18952);
        ((ArrayList) term18942).add(term18958);
        ((ArrayList) term18942).add(term18964);
        ((ArrayList) term18942).add(term18972);
        ArrayList term18986 = new ArrayList();
        ((ArrayList) term18986).add((Object)null);
        ((ArrayList) term18986).add((Object)null);
        ((ArrayList) term18986).add((Object)null);
        ArrayList term18989 = new ArrayList();
        ((ArrayList) term18989).add((Object)null);
        ((ArrayList) term18989).add((Object)null);
        ((ArrayList) term18989).add((Object)null);
        ((ArrayList) term18989).add((Object)null);
        ((ArrayList) term18989).add((Object)null);
        ((ArrayList) term18989).add((Object)null);
        ((ArrayList) term18989).add((Object)null);
        ((ArrayList) term18989).add((Object)null);
        Object term18982 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto"));
        setIntField(term18982, term18982.getClass(), "employeeId", -343325701);
        setField(term18982, term18982.getClass(), "firstName", "");
        setField(term18982, term18982.getClass(), "lastName", "");
        setField(term18982, term18982.getClass(), "summaryTrackUnits", term18986);
        setField(term18982, term18982.getClass(), "projectTrackUnits", term18989);
        ArrayList term18996 = new ArrayList();
        ((ArrayList) term18996).add((Object)null);
        ((ArrayList) term18996).add((Object)null);
        ((ArrayList) term18996).add((Object)null);
        ((ArrayList) term18996).add((Object)null);
        ((ArrayList) term18996).add((Object)null);
        ((ArrayList) term18996).add((Object)null);
        ((ArrayList) term18996).add((Object)null);
        ((ArrayList) term18996).add((Object)null);
        ArrayList term18999 = new ArrayList();
        ((ArrayList) term18999).add((Object)null);
        ((ArrayList) term18999).add((Object)null);
        ((ArrayList) term18999).add((Object)null);
        ((ArrayList) term18999).add((Object)null);
        ((ArrayList) term18999).add((Object)null);
        ((ArrayList) term18999).add((Object)null);
        ((ArrayList) term18999).add((Object)null);
        ((ArrayList) term18999).add((Object)null);
        ((ArrayList) term18999).add((Object)null);
        Object term18992 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto"));
        setIntField(term18992, term18992.getClass(), "employeeId", -1565502840);
        setField(term18992, term18992.getClass(), "firstName", "");
        setField(term18992, term18992.getClass(), "lastName", "");
        setField(term18992, term18992.getClass(), "summaryTrackUnits", term18996);
        setField(term18992, term18992.getClass(), "projectTrackUnits", term18999);
        ArrayList term19006 = new ArrayList();
        ((ArrayList) term19006).add((Object)null);
        ((ArrayList) term19006).add((Object)null);
        ((ArrayList) term19006).add((Object)null);
        ((ArrayList) term19006).add((Object)null);
        ((ArrayList) term19006).add((Object)null);
        ((ArrayList) term19006).add((Object)null);
        ArrayList term19009 = new ArrayList();
        ((ArrayList) term19009).add((Object)null);
        ((ArrayList) term19009).add((Object)null);
        ((ArrayList) term19009).add((Object)null);
        ((ArrayList) term19009).add((Object)null);
        ((ArrayList) term19009).add((Object)null);
        ((ArrayList) term19009).add((Object)null);
        ((ArrayList) term19009).add((Object)null);
        Object term19002 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto"));
        setIntField(term19002, term19002.getClass(), "employeeId", -25637976);
        setField(term19002, term19002.getClass(), "firstName", "");
        setField(term19002, term19002.getClass(), "lastName", "");
        setField(term19002, term19002.getClass(), "summaryTrackUnits", term19006);
        setField(term19002, term19002.getClass(), "projectTrackUnits", term19009);
        ArrayList term19016 = new ArrayList();
        ((ArrayList) term19016).add((Object)null);
        ((ArrayList) term19016).add((Object)null);
        ((ArrayList) term19016).add((Object)null);
        ((ArrayList) term19016).add((Object)null);
        ((ArrayList) term19016).add((Object)null);
        ((ArrayList) term19016).add((Object)null);
        ((ArrayList) term19016).add((Object)null);
        ArrayList term19019 = new ArrayList();
        ((ArrayList) term19019).add((Object)null);
        ((ArrayList) term19019).add((Object)null);
        ((ArrayList) term19019).add((Object)null);
        Object term19012 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto"));
        setIntField(term19012, term19012.getClass(), "employeeId", 1555897383);
        setField(term19012, term19012.getClass(), "firstName", "");
        setField(term19012, term19012.getClass(), "lastName", "");
        setField(term19012, term19012.getClass(), "summaryTrackUnits", term19016);
        setField(term19012, term19012.getClass(), "projectTrackUnits", term19019);
        ArrayList term18980 = new ArrayList();
        ((ArrayList) term18980).add(term18982);
        ((ArrayList) term18980).add(term18992);
        ((ArrayList) term18980).add(term19002);
        ((ArrayList) term18980).add(term19012);
        term18941 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableDto"));
        setField(term18941, term18941.getClass(), "days", term18942);
        setField(term18941, term18941.getClass(), "data", term18980);
        term19024 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term19024;
        callMethod(klass, "setData", argTypes, term18941, args);
    }

};


