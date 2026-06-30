package ru.smartup.timetracker.service.notification.notifierImpl;

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
import static ru.smartup.timetracker.service.notification.notifierImpl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;
import java.lang.Float;

public class DbNotifier_sendMessages_7108144341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1333;
     Object term1334;
     Object term1421;

    public DbNotifier_sendMessages_7108144341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1333 = newInstance(Class.forName("ru.smartup.timetracker.service.notification.notifierImpl.DbNotifier"));
        setField(term1333, term1333.getClass(), "noticeService", null);
        HashMap term1408 = new HashMap();
        Set<Object> term1513 =  ((Map) term1408).keySet();
        HashSet term1407 = new HashSet((Collection<? extends Object>) term1513);
        Class<? extends Object> term1515 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term1514 = ((Class) term1515).getDeclaredField((String) "MANAGER");
        ((Field) term1514).setAccessible(true);
        Object enum2 = ((Field) term1514).get((Object) null);
        Float term1418 = new Float(0.8564069F);
        Object term1337 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term1401 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1404 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1413 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term1337, term1337.getClass(), "id", -2068769794);
        setField(term1337, term1337.getClass(), "firstName", "flxyYxBRtu");
        setField(term1337, term1337.getClass(), "middleName", "OclPbYPkcH");
        setField(term1337, term1337.getClass(), "lastName", "IoAlmYsBwc");
        setField(term1337, term1337.getClass(), "email", "TEParAifyi");
        setField(term1337, term1337.getClass(), "passwordHash", "OWDIEULEFu");
        setIntField(term1337, term1337.getClass(), "positionId", -117576464);
        setBooleanField(term1337, term1337.getClass(), "isArchived", true);
        setIntField(term1401, term1401.getClass(), "nanos", 80000000);
        setLongField(term1401, term1401.getClass(), "fastTime", 1745452162000L);
        setField(term1401, term1401.getClass(), "cdate", null);
        setField(term1337, term1337.getClass(), "createdDate", term1401);
        setIntField(term1404, term1404.getClass(), "nanos", 960000000);
        setLongField(term1404, term1404.getClass(), "fastTime", 1349058953000L);
        setField(term1404, term1404.getClass(), "cdate", null);
        setField(term1337, term1337.getClass(), "lastModifiedDate", term1404);
        setField(term1337, term1337.getClass(), "employeeRoles", term1407);
        setIntField(term1413, term1413.getClass(), "employeeId", -1007160944);
        setIntField(term1413, term1413.getClass(), "projectId", 1135664017);
        setField(term1413, term1413.getClass(), "projectRoleId", enum2);
        setField(term1413, term1413.getClass(), "externalRate", term1418);
        setField(term1337, term1337.getClass(), "employeeProjectRole", term1413);
        term1334 = new LinkedList();
        ((LinkedList) term1334).add(term1337);
        Class<? extends Object> term1853 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term1852 = ((Class) term1853).getDeclaredField((String) "FREEZE_CANCEL");
        ((Field) term1852).setAccessible(true);
        Object enum3 = ((Field) term1852).get((Object) null);
        term1421 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term1453 = newInstance(Class.forName("java.lang.Object"));
        Object term1457 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1460 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term1421, term1421.getClass(), "id", 6375119433582206027L);
        setField(term1421, term1421.getClass(), "type", enum3);
        setIntField(term1421, term1421.getClass(), "employeeId", 590364439);
        setField(term1421, term1421.getClass(), "text", "dWRymuLBtr");
        setField(term1421, term1421.getClass(), "data", term1453);
        setBooleanField(term1421, term1421.getClass(), "read", false);
        setBooleanField(term1421, term1421.getClass(), "deleted", true);
        setIntField(term1421, term1421.getClass(), "createdBy", 865208305);
        setIntField(term1457, term1457.getClass(), "nanos", 457000000);
        setLongField(term1457, term1457.getClass(), "fastTime", 1706067372000L);
        setField(term1457, term1457.getClass(), "cdate", null);
        setField(term1421, term1421.getClass(), "createdDate", term1457);
        setIntField(term1460, term1460.getClass(), "nanos", 992000000);
        setLongField(term1460, term1460.getClass(), "fastTime", 1863620294000L);
        setField(term1460, term1460.getClass(), "cdate", null);
        setField(term1421, term1421.getClass(), "lastModifiedDate", term1460);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.notification.notifierImpl.DbNotifier");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("ru.smartup.timetracker.entity.Notice");
        Object[] args = new Object[2];
        args[0] = term1334;
        args[1] = term1421;
        callMethod(klass, "sendMessages", argTypes, term1333, args);
    }

};


