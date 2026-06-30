package ru.smartup.timetracker.dto.project.response;

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
import static ru.smartup.timetracker.dto.project.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import java.lang.Float;

public class ProjectDetailDto_getLastModifiedDate_17239115924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13421;

    public ProjectDetailDto_getLastModifiedDate_17239115924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13533 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term13532 = ((Class) term13533).getDeclaredField((String) "EMPLOYEE");
        ((Field) term13532).setAccessible(true);
        Object enum31 = ((Field) term13532).get((Object) null);
        Float term13431 = new Float(0.7332741F);
        Object term13424 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term13424, term13424.getClass(), "id", -1048298087);
        setField(term13424, term13424.getClass(), "firstName", "");
        setField(term13424, term13424.getClass(), "middleName", "");
        setField(term13424, term13424.getClass(), "lastName", "");
        setField(term13424, term13424.getClass(), "projectRoleId", enum31);
        setField(term13424, term13424.getClass(), "externalRate", term13431);
        Class<? extends Object> term13874 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term13873 = ((Class) term13874).getDeclaredField((String) "EMPLOYEE");
        ((Field) term13873).setAccessible(true);
        Object enum32 = ((Field) term13873).get((Object) null);
        Float term13440 = new Float(0.15826964F);
        Object term13433 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term13433, term13433.getClass(), "id", 292681826);
        setField(term13433, term13433.getClass(), "firstName", "");
        setField(term13433, term13433.getClass(), "middleName", "");
        setField(term13433, term13433.getClass(), "lastName", "");
        setField(term13433, term13433.getClass(), "projectRoleId", enum32);
        setField(term13433, term13433.getClass(), "externalRate", term13440);
        Float term13447 = new Float(0.45691717F);
        Object term13442 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term13442, term13442.getClass(), "id", 458147407);
        setField(term13442, term13442.getClass(), "firstName", "");
        setField(term13442, term13442.getClass(), "middleName", "");
        setField(term13442, term13442.getClass(), "lastName", "");
        setField(term13442, term13442.getClass(), "projectRoleId", enum32);
        setField(term13442, term13442.getClass(), "externalRate", term13447);
        Float term13454 = new Float(0.17877543F);
        Object term13449 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term13449, term13449.getClass(), "id", -184153539);
        setField(term13449, term13449.getClass(), "firstName", "");
        setField(term13449, term13449.getClass(), "middleName", "");
        setField(term13449, term13449.getClass(), "lastName", "");
        setField(term13449, term13449.getClass(), "projectRoleId", enum32);
        setField(term13449, term13449.getClass(), "externalRate", term13454);
        Float term13461 = new Float(0.8598297F);
        Object term13456 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term13456, term13456.getClass(), "id", 493620644);
        setField(term13456, term13456.getClass(), "firstName", "");
        setField(term13456, term13456.getClass(), "middleName", "");
        setField(term13456, term13456.getClass(), "lastName", "");
        setField(term13456, term13456.getClass(), "projectRoleId", enum31);
        setField(term13456, term13456.getClass(), "externalRate", term13461);
        Float term13468 = new Float(0.96323884F);
        Object term13463 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term13463, term13463.getClass(), "id", 1328271830);
        setField(term13463, term13463.getClass(), "firstName", "");
        setField(term13463, term13463.getClass(), "middleName", "");
        setField(term13463, term13463.getClass(), "lastName", "");
        setField(term13463, term13463.getClass(), "projectRoleId", enum31);
        setField(term13463, term13463.getClass(), "externalRate", term13468);
        Float term13475 = new Float(0.43692183F);
        Object term13470 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term13470, term13470.getClass(), "id", 1596070772);
        setField(term13470, term13470.getClass(), "firstName", "");
        setField(term13470, term13470.getClass(), "middleName", "");
        setField(term13470, term13470.getClass(), "lastName", "");
        setField(term13470, term13470.getClass(), "projectRoleId", enum32);
        setField(term13470, term13470.getClass(), "externalRate", term13475);
        Float term13482 = new Float(0.80973893F);
        Object term13477 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term13477, term13477.getClass(), "id", 97029295);
        setField(term13477, term13477.getClass(), "firstName", "");
        setField(term13477, term13477.getClass(), "middleName", "");
        setField(term13477, term13477.getClass(), "lastName", "");
        setField(term13477, term13477.getClass(), "projectRoleId", enum31);
        setField(term13477, term13477.getClass(), "externalRate", term13482);
        Float term13489 = new Float(0.7633268F);
        Object term13484 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term13484, term13484.getClass(), "id", -1371869594);
        setField(term13484, term13484.getClass(), "firstName", "");
        setField(term13484, term13484.getClass(), "middleName", "");
        setField(term13484, term13484.getClass(), "lastName", "");
        setField(term13484, term13484.getClass(), "projectRoleId", enum31);
        setField(term13484, term13484.getClass(), "externalRate", term13489);
        ArrayList term13422 = new ArrayList();
        ((ArrayList) term13422).add(term13424);
        ((ArrayList) term13422).add(term13433);
        ((ArrayList) term13422).add(term13442);
        ((ArrayList) term13422).add(term13449);
        ((ArrayList) term13422).add(term13456);
        ((ArrayList) term13422).add(term13463);
        ((ArrayList) term13422).add(term13470);
        ((ArrayList) term13422).add(term13477);
        ((ArrayList) term13422).add(term13484);
        Object term13495 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term13495, term13495.getClass(), "id", 2486810210675247493L);
        setField(term13495, term13495.getClass(), "name", "");
        setBooleanField(term13495, term13495.getClass(), "billable", false);
        setBooleanField(term13495, term13495.getClass(), "isArchived", false);
        Object term13500 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term13500, term13500.getClass(), "id", 7009926388951271268L);
        setField(term13500, term13500.getClass(), "name", "");
        setBooleanField(term13500, term13500.getClass(), "billable", false);
        setBooleanField(term13500, term13500.getClass(), "isArchived", false);
        Object term13505 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term13505, term13505.getClass(), "id", -7672528020740371001L);
        setField(term13505, term13505.getClass(), "name", "");
        setBooleanField(term13505, term13505.getClass(), "billable", false);
        setBooleanField(term13505, term13505.getClass(), "isArchived", true);
        ArrayList term13493 = new ArrayList();
        ((ArrayList) term13493).add(term13495);
        ((ArrayList) term13493).add(term13500);
        ((ArrayList) term13493).add(term13505);
        term13421 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.ProjectDetailDto"));
        Object term13512 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term13515 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term13421, term13421.getClass(), "employees", term13422);
        setField(term13421, term13421.getClass(), "tasks", term13493);
        setIntField(term13512, term13512.getClass(), "nanos", 896000000);
        setLongField(term13512, term13512.getClass(), "fastTime", 1645823234000L);
        setField(term13512, term13512.getClass(), "cdate", null);
        setField(term13421, term13421.getClass(), "createdDate", term13512);
        setIntField(term13515, term13515.getClass(), "nanos", 23000000);
        setLongField(term13515, term13515.getClass(), "fastTime", 1500710268000L);
        setField(term13515, term13515.getClass(), "cdate", null);
        setField(term13421, term13421.getClass(), "lastModifiedDate", term13515);
        setIntField(term13421, term13421.getClass(), "id", -2095575670);
        setField(term13421, term13421.getClass(), "name", "PapWxkhEWe");
        setBooleanField(term13421, term13421.getClass(), "isArchived", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.ProjectDetailDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastModifiedDate", argTypes, term13421, args);
    }

};


