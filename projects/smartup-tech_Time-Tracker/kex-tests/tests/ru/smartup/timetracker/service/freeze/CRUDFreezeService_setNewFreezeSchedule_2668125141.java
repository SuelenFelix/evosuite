package ru.smartup.timetracker.service.freeze;

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
import static ru.smartup.timetracker.service.freeze.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.util.HashSet;
import java.lang.Float;
import java.lang.String;

public class CRUDFreezeService_setNewFreezeSchedule_2668125141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7436;
     Object term7559;

    public CRUDFreezeService_setNewFreezeSchedule_2668125141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term7460 = new HashSet();
        Float term7464 = new Float(0.7633268F);
        Class<? extends Object> term7563 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term7562 = ((Class) term7563).getDeclaredField((String) "DELETING");
        ((Field) term7562).setAccessible(true);
        Object enum15 = ((Field) term7562).get((Object) null);
        Object term7439 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term7441 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7445 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term7454 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term7457 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term7461 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term7481 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term7484 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term7439, term7439.getClass(), "id", -282881827);
        setIntField(term7441, term7441.getClass(), "year", 2021);
        setShortField(term7441, term7441.getClass(), "month", (short) 8);
        setShortField(term7441, term7441.getClass(), "day", (short) 11);
        setField(term7439, term7439.getClass(), "freezeDate", term7441);
        setIntField(term7445, term7445.getClass(), "id", -1183353915);
        setField(term7445, term7445.getClass(), "firstName", "");
        setField(term7445, term7445.getClass(), "middleName", "");
        setField(term7445, term7445.getClass(), "lastName", "");
        setField(term7445, term7445.getClass(), "email", "");
        setField(term7445, term7445.getClass(), "passwordHash", "");
        setIntField(term7445, term7445.getClass(), "positionId", -420030135);
        setBooleanField(term7445, term7445.getClass(), "isArchived", true);
        setIntField(term7454, term7454.getClass(), "nanos", 189000000);
        setLongField(term7454, term7454.getClass(), "fastTime", 1619387974000L);
        setField(term7454, term7454.getClass(), "cdate", null);
        setField(term7445, term7445.getClass(), "createdDate", term7454);
        setIntField(term7457, term7457.getClass(), "nanos", 787000000);
        setLongField(term7457, term7457.getClass(), "fastTime", 1665109008000L);
        setField(term7457, term7457.getClass(), "cdate", null);
        setField(term7445, term7445.getClass(), "lastModifiedDate", term7457);
        setField(term7445, term7445.getClass(), "employeeRoles", term7460);
        setIntField(term7461, term7461.getClass(), "employeeId", 267763294);
        setIntField(term7461, term7461.getClass(), "projectId", -1497710478);
        setField(term7461, term7461.getClass(), "projectRoleId", null);
        setField(term7461, term7461.getClass(), "externalRate", term7464);
        setField(term7445, term7445.getClass(), "employeeProjectRole", term7461);
        setField(term7439, term7439.getClass(), "employee", term7445);
        setField(term7439, term7439.getClass(), "status", enum15);
        setField(term7439, term7439.getClass(), "info", "FjOiNAfBOc");
        setIntField(term7481, term7481.getClass(), "nanos", 909000000);
        setLongField(term7481, term7481.getClass(), "fastTime", 1379067035000L);
        setField(term7481, term7481.getClass(), "cdate", null);
        setField(term7439, term7439.getClass(), "createdDate", term7481);
        setIntField(term7484, term7484.getClass(), "nanos", 125000000);
        setLongField(term7484, term7484.getClass(), "fastTime", 1491490440000L);
        setField(term7484, term7484.getClass(), "cdate", null);
        setField(term7439, term7439.getClass(), "lastModifiedDate", term7484);
        Object term7488 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term7490 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7494 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term7499 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term7502 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term7488, term7488.getClass(), "id", 49950830);
        setIntField(term7490, term7490.getClass(), "year", 2014);
        setShortField(term7490, term7490.getClass(), "month", (short) 2);
        setShortField(term7490, term7490.getClass(), "day", (short) 23);
        setField(term7488, term7488.getClass(), "freezeDate", term7490);
        setIntField(term7494, term7494.getClass(), "id", -525257914);
        setField(term7494, term7494.getClass(), "firstName", null);
        setField(term7494, term7494.getClass(), "middleName", null);
        setField(term7494, term7494.getClass(), "lastName", null);
        setField(term7494, term7494.getClass(), "email", null);
        setField(term7494, term7494.getClass(), "passwordHash", null);
        setIntField(term7494, term7494.getClass(), "positionId", 147209682);
        setBooleanField(term7494, term7494.getClass(), "isArchived", true);
        setField(term7494, term7494.getClass(), "createdDate", null);
        setField(term7494, term7494.getClass(), "lastModifiedDate", null);
        setField(term7494, term7494.getClass(), "employeeRoles", null);
        setField(term7494, term7494.getClass(), "employeeProjectRole", null);
        setField(term7488, term7488.getClass(), "employee", term7494);
        setField(term7488, term7488.getClass(), "status", enum15);
        setField(term7488, term7488.getClass(), "info", "");
        setIntField(term7499, term7499.getClass(), "nanos", 256000000);
        setLongField(term7499, term7499.getClass(), "fastTime", 1841956160000L);
        setField(term7499, term7499.getClass(), "cdate", null);
        setField(term7488, term7488.getClass(), "createdDate", term7499);
        setIntField(term7502, term7502.getClass(), "nanos", 93000000);
        setLongField(term7502, term7502.getClass(), "fastTime", 1859212762000L);
        setField(term7502, term7502.getClass(), "cdate", null);
        setField(term7488, term7488.getClass(), "lastModifiedDate", term7502);
        Object term7506 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        setIntField(term7506, term7506.getClass(), "id", 1743683601);
        setField(term7506, term7506.getClass(), "freezeDate", null);
        setField(term7506, term7506.getClass(), "employee", null);
        setField(term7506, term7506.getClass(), "status", null);
        setField(term7506, term7506.getClass(), "info", null);
        setField(term7506, term7506.getClass(), "createdDate", null);
        setField(term7506, term7506.getClass(), "lastModifiedDate", null);
        term7436 = new LinkedList();
        ((LinkedList) term7436).add(term7439);
        ((LinkedList) term7436).add(term7488);
        ((LinkedList) term7436).add(term7506);
        ((LinkedList) term7436).add((Object)null);
        ((LinkedList) term7436).add((Object)null);
        term7559 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.CRUDFreezeService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term7436;
        args[1] = term7559;
        callMethod(klass, "setNewFreezeSchedule", argTypes, null, args);
    }

};


