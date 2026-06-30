package ru.smartup.timetracker.entity;

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
import static ru.smartup.timetracker.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;
import java.lang.Float;
import java.lang.Integer;

public class FreezeRecord_successful_11982120541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43054;
     Object term43174;

    public FreezeRecord_successful_11982120541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term43131 = new HashMap();
        Set<Object> term43226 =  ((Map) term43131).keySet();
        HashSet term43130 = new HashSet((Collection<? extends Object>) term43226);
        Class<? extends Object> term43228 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term43227 = ((Class) term43228).getDeclaredField((String) "MANAGER");
        ((Field) term43227).setAccessible(true);
        Object enum101 = ((Field) term43227).get((Object) null);
        Float term43142 = new Float(0.80973893F);
        Class<? extends Object> term43566 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term43565 = ((Class) term43566).getDeclaredField((String) "OUTDATED");
        ((Field) term43565).setAccessible(true);
        Object enum102 = ((Field) term43565).get((Object) null);
        term43054 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term43056 = newInstance(Class.forName("java.time.LocalDate"));
        Object term43060 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term43124 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term43127 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term43136 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term43168 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term43171 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term43054, term43054.getClass(), "id", -1747406163);
        setIntField(term43056, term43056.getClass(), "year", 2016);
        setShortField(term43056, term43056.getClass(), "month", (short) 11);
        setShortField(term43056, term43056.getClass(), "day", (short) 29);
        setField(term43054, term43054.getClass(), "freezeDate", term43056);
        setIntField(term43060, term43060.getClass(), "id", 388157121);
        setField(term43060, term43060.getClass(), "firstName", "OqbwYQfvAe");
        setField(term43060, term43060.getClass(), "middleName", "tRxZafjqIx");
        setField(term43060, term43060.getClass(), "lastName", "DhjNLmRMCu");
        setField(term43060, term43060.getClass(), "email", "PgPzMSEjjX");
        setField(term43060, term43060.getClass(), "passwordHash", "wzsPSPcRdj");
        setIntField(term43060, term43060.getClass(), "positionId", 1684998508);
        setBooleanField(term43060, term43060.getClass(), "isArchived", false);
        setIntField(term43124, term43124.getClass(), "nanos", 233000000);
        setLongField(term43124, term43124.getClass(), "fastTime", 1316961637000L);
        setField(term43124, term43124.getClass(), "cdate", null);
        setField(term43060, term43060.getClass(), "createdDate", term43124);
        setIntField(term43127, term43127.getClass(), "nanos", 492000000);
        setLongField(term43127, term43127.getClass(), "fastTime", 1870018035000L);
        setField(term43127, term43127.getClass(), "cdate", null);
        setField(term43060, term43060.getClass(), "lastModifiedDate", term43127);
        setField(term43060, term43060.getClass(), "employeeRoles", term43130);
        setIntField(term43136, term43136.getClass(), "employeeId", -1476644457);
        setIntField(term43136, term43136.getClass(), "projectId", 1270666529);
        setField(term43136, term43136.getClass(), "projectRoleId", enum101);
        setField(term43136, term43136.getClass(), "externalRate", term43142);
        setField(term43060, term43060.getClass(), "employeeProjectRole", term43136);
        setField(term43054, term43054.getClass(), "employee", term43060);
        setField(term43054, term43054.getClass(), "status", enum102);
        setField(term43054, term43054.getClass(), "info", "kGMQdqJYyB");
        setIntField(term43168, term43168.getClass(), "nanos", 13000000);
        setLongField(term43168, term43168.getClass(), "fastTime", 1655658011000L);
        setField(term43168, term43168.getClass(), "cdate", null);
        setField(term43054, term43054.getClass(), "createdDate", term43168);
        setIntField(term43171, term43171.getClass(), "nanos", 958000000);
        setLongField(term43171, term43171.getClass(), "fastTime", 1319344284000L);
        setField(term43171, term43171.getClass(), "cdate", null);
        setField(term43054, term43054.getClass(), "lastModifiedDate", term43171);
        term43174 = new Integer(-1146679443);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term43174;
        callMethod(klass, "successful", argTypes, term43054, args);
    }

};


